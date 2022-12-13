package com.company.org.customerprofileservice.service;

import com.company.org.customerprofileservice.entity.ViewCustomerProfileLookup;
import com.company.org.customerprofileservice.exception.CustomerProfileServiceCustomException;
import com.company.org.customerprofileservice.payload.request.CustomerProfileRequest;
import com.company.org.customerprofileservice.payload.request.Header;
import com.company.org.customerprofileservice.payload.response.*;
import com.company.org.customerprofileservice.repository.ViewCustomerProfileLookupRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;

@Service
@Slf4j
public class CustomerProfileServiceImpl implements CustomerProfileService {

    @Autowired
    private ViewCustomerProfileLookupRepository viewCustomerProfileLookupRepository;

    @Override
    public CustomerProfileLookupResponse processCustomerProfileRequest(CustomerProfileRequest customerProfileRequest) {

        Optional<CustomerProfileRequest> customerProfileRequestOptional = Optional.ofNullable(customerProfileRequest);
        if (!customerProfileRequestOptional.isPresent()) {
            log.error("Bad or missing request");
            throw new CustomerProfileServiceCustomException("Bad Request", "BAD_REQUEST");
        }

        if (!areAllFieldsSetInPayLoad(customerProfileRequest)) {
            log.error("Bad or missing fields required for input");
            throw new CustomerProfileServiceCustomException("Bad or missing fields required for input, payload", "BAD_REQUEST");
        }

        String action = customerProfileRequest.getPayload().getAction();
        log.info("Action called: {}", action);

        if (action.equals("getCustomerProfileByCrdbPartyIdentifier")) {

            final Optional<String> crdbPartyIdentifier = Optional.ofNullable(customerProfileRequest.getPayload().getRequest()
                    .getMandatory().getCrdbPartyIdentifier());
            if (!crdbPartyIdentifier.isPresent()) {
                log.error("Bad or missing CrdbPartyIdentifier");
                throw new CustomerProfileServiceCustomException("Missing CrdbPartyIdentifier", "BAD_REQUEST");
            }

            log.info("Get the customer profile for Party Identifier: {}", crdbPartyIdentifier);

            Optional<ViewCustomerProfileLookup> viewCustomerProfileLookup
                    = Optional.ofNullable(viewCustomerProfileLookupRepository.findByPartyClientNumber(crdbPartyIdentifier.get())
                    .orElseThrow(() -> {
                        log.info("Party Client number not found: {}", crdbPartyIdentifier);
                        return new CustomerProfileServiceCustomException("Customer profile with given party client number not found", "PARTY_CLIENT_NUMBER_NOT_FOUND");
                    }));
            return getCustomerProfileLookupResponse(viewCustomerProfileLookup, customerProfileRequest.getHeader());
        }

        if (action.equals("getCustomerProfileByAccountNumber")) {

            final Optional<String> accountNumber = Optional.ofNullable(customerProfileRequest.getPayload().getRequest()
                    .getMandatory().getAccountNumber());
            if (!accountNumber.isPresent()) {
                log.error("Bad or missing Account Number");
                throw new CustomerProfileServiceCustomException("Missing Account Number", "BAD_REQUEST");
            }

            log.info("Get the customer profile for account number: {}", accountNumber);

            Optional<ViewCustomerProfileLookup> viewCustomerProfileLookup
                    = Optional.ofNullable(viewCustomerProfileLookupRepository.findByAccountNumber(accountNumber.get())
                    .orElseThrow(() -> {
                        log.info("Account number not found: {}", accountNumber);
                        return new CustomerProfileServiceCustomException("Customer profile with given account number not found", "ACCOUNT_NOT_FOUND");
                    }));
            return getCustomerProfileLookupResponse(viewCustomerProfileLookup, customerProfileRequest.getHeader());
        }

        if (action.equals("getCustomerProfileByPrimaryPhoneNumber")) {

            final Optional<String> partyPhoneFullNumber = Optional.ofNullable(customerProfileRequest.getPayload().getRequest()
                    .getMandatory().getPrimaryPhoneNumber());
            if (!partyPhoneFullNumber.isPresent()) {
                log.error("Bad or missing Account Number");
                throw new CustomerProfileServiceCustomException("Missing Phone Number", "BAD_REQUEST");
            }

            log.info("Get the customer profile by party phone full number: {}", partyPhoneFullNumber);

            Optional<ViewCustomerProfileLookup> viewCustomerProfileLookup
                    = Optional.ofNullable(viewCustomerProfileLookupRepository.findPersonAttributesByPartyPhoneFullNumber(partyPhoneFullNumber.get())
                    .orElseThrow(() -> {
                        log.info("Party Phone Full Number not found: {}", partyPhoneFullNumber);
                        return new CustomerProfileServiceCustomException("Customer profile with given party phone full number not found", "PARTY_PHONE_FULL_NUMBER_NOT_FOUND");
                    }));
            return getCustomerProfileLookupResponse(viewCustomerProfileLookup, customerProfileRequest.getHeader());
        }

        if (action.equals("getCustomerProfile")) {

            if (!areAllFieldsSet(customerProfileRequest)) {
                log.error("Bad or missing required input");
                throw new CustomerProfileServiceCustomException("Bad or missing fields required for input", "BAD_REQUEST");
            }

            final Optional<String> personFirstName = Optional.ofNullable(customerProfileRequest.getPayload().getRequest().getMandatory().getFirstName());
            final Optional<String> personLastName = Optional.ofNullable(customerProfileRequest.getPayload().getRequest().getMandatory().getLastName());
            final Optional<String> ssn = Optional.ofNullable(customerProfileRequest.getPayload().getRequest().getMandatory().getSocialSecurityNumber());
            final Optional<String> residentialAddressLine1 = Optional.ofNullable(customerProfileRequest.getPayload().getRequest().getMandatory().getResidentialAddress().getAddressLine1());
            final Optional<String> residentialAddressLine2 = Optional.ofNullable(customerProfileRequest.getPayload().getRequest().getMandatory().getResidentialAddress().getAddressLine2());
            final Optional<String> residentialCity = Optional.ofNullable(customerProfileRequest.getPayload().getRequest().getMandatory().getResidentialAddress().getCity());
            final Optional<String> residentialStateProvinceName = Optional.ofNullable(customerProfileRequest.getPayload().getRequest().getMandatory().getResidentialAddress().getState());
            final Optional<String> residentialPostalCode = Optional.ofNullable(customerProfileRequest.getPayload().getRequest().getMandatory().getResidentialAddress().getPostalCode());
            final Optional<String> residentialCountryName = Optional.ofNullable(customerProfileRequest.getPayload().getRequest().getMandatory().getResidentialAddress().getCountryCode());
            final Optional<String> passPortNumber = Optional.ofNullable(customerProfileRequest.getPayload().getRequest().getMandatory().getPassportNumber());
            final Optional<String> primaryPhoneNumber = Optional.ofNullable(customerProfileRequest.getPayload().getRequest().getMandatory().getPrimaryPhoneNumber());

            String ssn_last_four = ssn.get().substring(ssn.get().length() - 4);

            log.info("Get the customer profile by First Name, Last Name and last four SSN");

            Optional<ViewCustomerProfileLookup> viewCustomerProfileLookup
                    = Optional.ofNullable(viewCustomerProfileLookupRepository.findPersonAttributesExtended(personFirstName.get(), personLastName.get(),
                            ssn_last_four, residentialAddressLine1.get(), residentialCity.get(), residentialStateProvinceName.get(), residentialPostalCode.get(),
                            residentialCountryName.get(), passPortNumber.get(), primaryPhoneNumber.get())
                    .orElseThrow(() -> {
                        log.info("Person not found with given FirstName: {} LastName: {} SSN Last four: {}", personFirstName, personLastName, ssn);
                        return new CustomerProfileServiceCustomException("Customer profile with given First Name, Last Name and last four SSN not found", "CUSTOMER_PROFILE_NOT_FOUND");
                    }));

            return getCustomerProfileLookupResponse(viewCustomerProfileLookup, customerProfileRequest.getHeader());

        }

        log.error("Action not found: {}", action);
        throw new CustomerProfileServiceCustomException("Bad Request, action not found", "BAD_REQUEST");
    }

    private boolean areAllFieldsSetInPayLoad(CustomerProfileRequest customerProfileRequest) {
        return Optional.ofNullable(customerProfileRequest)
                .filter( c -> Objects.nonNull(customerProfileRequest.getPayload()))
                .filter( c -> Objects.nonNull(customerProfileRequest.getPayload().getAction()))
                .filter( c -> Objects.nonNull(customerProfileRequest.getPayload().getRequest()))
                .filter( c -> Objects.nonNull(customerProfileRequest.getPayload().getRequest().getMandatory()))
                .isPresent();
    }
    private boolean areAllFieldsSet(CustomerProfileRequest customerProfileRequest) {
        return Optional.ofNullable(customerProfileRequest)
                .filter( c -> Objects.nonNull(customerProfileRequest.getPayload().getRequest().getMandatory().getFirstName()))
                .filter( c -> Objects.nonNull(customerProfileRequest.getPayload().getRequest().getMandatory().getLastName()))
                .filter( c -> Objects.nonNull(customerProfileRequest.getPayload().getRequest().getMandatory().getSocialSecurityNumber()))
                .filter( c -> Objects.nonNull(customerProfileRequest.getPayload().getRequest().getMandatory().getPassportNumber()))
                .filter( c -> Objects.nonNull(customerProfileRequest.getPayload().getRequest().getMandatory().getPrimaryPhoneNumber()))
                .filter( c -> Objects.nonNull(customerProfileRequest.getPayload().getRequest().getMandatory().getResidentialAddress()))
                .filter( c -> Objects.nonNull(customerProfileRequest.getPayload().getRequest().getMandatory().getResidentialAddress().getAddressLine1()))
                .filter( c -> Objects.nonNull(customerProfileRequest.getPayload().getRequest().getMandatory().getResidentialAddress().getCity()))
                .filter( c -> Objects.nonNull(customerProfileRequest.getPayload().getRequest().getMandatory().getResidentialAddress().getState()))
                .filter( c -> Objects.nonNull(customerProfileRequest.getPayload().getRequest().getMandatory().getResidentialAddress().getPostalCode()))
                .filter( c -> Objects.nonNull(customerProfileRequest.getPayload().getRequest().getMandatory().getResidentialAddress().getCountryCode()))
                .isPresent();
    }

    private static CustomerProfileLookupResponse getCustomerProfileLookupResponse(Optional<ViewCustomerProfileLookup> viewCustomerProfileLookup, Header header) {
        CustomerProfileLookupResponse customerProfileLookupResponse
                = new CustomerProfileLookupResponse();

        customerProfileLookupResponse.setHeader(header);

        CustomerProfile customerProfile = new CustomerProfile();
        PartyFinance partyFinance = new PartyFinance();
        partyFinance.setAnnualIncomeUSD("");
        partyFinance.setLiquidNetWorthAmountUSD("");
        partyFinance.setWealthNotInUSAFlag("");
        partyFinance.setWealthNotInUSACountry("");
        partyFinance.setLiquidNetWorthAmountUSD("");
        ArrayList<String> sourceOfWealth = new ArrayList<>();
        partyFinance.setSourceOfWealth(sourceOfWealth);
        customerProfile.setPartyFinance(partyFinance);
        PartyEmployment partyEmployment = new PartyEmployment();
        partyEmployment.setEmployerName("");
        partyEmployment.setEmploymentStatus("");
        partyEmployment.setEmploymentType("");
        partyEmployment.setIndustry("");
            EmployerMailingAddress employerMailingAddress = new EmployerMailingAddress();
            employerMailingAddress.setAddressLine1("");
            employerMailingAddress.setAddressLine2("");
            employerMailingAddress.setCity("");
            employerMailingAddress.setState("");
            employerMailingAddress.setPostalCode("");
            employerMailingAddress.setCountryCode("");
        partyEmployment.setEmployerMailingAddress(employerMailingAddress);
        partyEmployment.setOccupation("");
        partyEmployment.setIndustry("");
        partyEmployment.setSubIndustry("");
        partyEmployment.setIsRestrictedIndustryFlag("");
        partyEmployment.setIsSensitiveIndustryFlag("");
        customerProfile.setPartyEmployment(partyEmployment);


        PartyContact partyContact = new PartyContact();
        partyContact.setPrimaryPhoneNumber(viewCustomerProfileLookup.get().getPartyPhoneFullNumber());
        partyContact.setSecondaryPhoneNumber("");
        partyContact.setPrimaryEmailAddress(viewCustomerProfileLookup.get().getPartyEmailAddressText());
        ResidentialAddress residentialAddress = new ResidentialAddress();
        residentialAddress.setAddressLine1(viewCustomerProfileLookup.get().getResidentialAddressLine1());
        //residentialAddress. setAddressLine2(viewCustomerProfileLookup.get().getResidentialAddressLine2())

        String addressLine2Residential = viewCustomerProfileLookup.get().getResidentialAddressLine2() ;
        String result;
        if (addressLine2Residential == null || addressLine2Residential.length() == 0) {
            result = "";
        } else {
            result = addressLine2Residential;
        }
        residentialAddress.setAddressLine2(result) ;

        residentialAddress.setCity(viewCustomerProfileLookup.get().getResidentialCity());
        residentialAddress.setState(viewCustomerProfileLookup.get().getResidentialStateProvinceName());
        residentialAddress.setPostalCode(viewCustomerProfileLookup.get().getResidentialPostalCode());
        residentialAddress.setCountryCode(viewCustomerProfileLookup.get().getResidentialCountryName());
        partyContact.setResidentialAddress(residentialAddress);

        MailingAddress mailingAddress = new MailingAddress();
        mailingAddress.setAddressLine1(viewCustomerProfileLookup.get().getMailingAddressLine1());
        //mailingAddress.setAddressLine2(viewCustomerProfileLookup.get().getMailingAddressLine2());

        String addressLine2Mailing = viewCustomerProfileLookup.get().getMailingAddressLine2();
        if (addressLine2Mailing == null || addressLine2Mailing.length() == 0) {
            result = "";
        } else {
            result = addressLine2Mailing;
        }
        mailingAddress.setAddressLine2(result);
        mailingAddress.setCity(viewCustomerProfileLookup.get().getMailingCity());
        mailingAddress.setState(viewCustomerProfileLookup.get().getMailingStateProvinceName());
        mailingAddress.setPostalCode(viewCustomerProfileLookup.get() .getMailingPostalCode());
        mailingAddress.setCountryCode(viewCustomerProfileLookup.get().getMailingCountryName());
        partyContact.setMailingAddress(mailingAddress);
        customerProfile.setPartyContact(partyContact);

        PartyIdentifier partyIdentifier = new PartyIdentifier();
        partyIdentifier.setSocialSecurityNumber(viewCustomerProfileLookup.get() .getId() .getSsn());
        Passport passport = new Passport();

        passport.setPassportNumber(viewCustomerProfileLookup.get().getPassportNumber());
        passport.setIssueDate("");
        passport.setExpirationDate("");
        passport.setIssuingCountry("");
        passport. setIssuingAuthority("");
        partyIdentifier.setPassport(passport);
        DriverLicense driverLicense= new DriverLicense();
        driverLicense.setExpirationDate("");
        driverLicense.setIssueDate("");
        driverLicense.setLicenseNumber("");
        driverLicense.setIssuingCountry("");
        driverLicense.setIssuingAuthority("");
        driverLicense.setIssuingStateProvince("");
        partyIdentifier.setDriverLicense(driverLicense);
        partyIdentifier.setCrdbPartyIdentifier(viewCustomerProfileLookup.get().getPartyClientNumber());

        partyIdentifier.setTaxIdentifierNumber("");
        customerProfile.setPartyIdentifier(partyIdentifier);

        PartyPerson partyPerson = new PartyPerson();
        partyPerson.setPartyUniqueIdentifier(""); // not in view
        partyPerson.setPrefixName(""); // not in view
        partyPerson.setMiddleName(""); // not in view
        partyPerson.setMiddleInitial(""); // not in view
        partyPerson.setSuffixName(""); // not in view
        partyPerson.setMaidenName(""); // not in view
        partyPerson.setDeceasedFlag("N"); // add it to view
        partyPerson.setLastUpdateDate(""); // not in view
        partyPerson.setClassificationCode(""); // not in view
        partyPerson.setFirstName(viewCustomerProfileLookup.get().getId().getPersonFirstName());
        partyPerson.setLastName(viewCustomerProfileLookup.get().getId().getPersonLastName());
        partyPerson.setInformalName(viewCustomerProfileLookup.get().getPersonInformalName());
        partyPerson.setBirthDate(viewCustomerProfileLookup.get().getPersonBirthDate());
        partyPerson.setCitizenshipCountry(viewCustomerProfileLookup.get().getCitizenshipCountry());

        ArrayList<String> preferredLanguage = new ArrayList<>();
        partyPerson.setPreferredLanguage(preferredLanguage);
        customerProfile.setPartyPerson(partyPerson);

        Payload payload = new Payload();
        ArrayList<CustomerProfile> customerProfiles = new ArrayList<>();
        customerProfiles.add(customerProfile);
        payload.setCustomerProfiles(customerProfiles);
        customerProfileLookupResponse.setPayload(payload);

        //customerProfilesLookupResponse.setCustomerProfile(customerProfile);

        return customerProfileLookupResponse;
    }
}
