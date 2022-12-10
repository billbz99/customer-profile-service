package com.company.org.customerprofileservice.service;

import com.company.org.customerprofileservice.payload.response.CustomerProfileLookupResponse;
import com.company.org.customerprofileservice.payload.request.CustomerProfileRequest;

public interface CustomerProfileService {

    CustomerProfileLookupResponse findCustomerProfileByAccountNumber(String accountNumber);

    CustomerProfileLookupResponse findCustomerProfileByAccountNumberNew(CustomerProfileRequest customerProfileRequest);

    CustomerProfileLookupResponse findCustomerProfileByPartyClientNumber(String partyClientNumber);

    CustomerProfileLookupResponse findCustomerProfileByPartyPhoneFullNumber(String partyPhoneFullNumber);

    CustomerProfileLookupResponse findCustomerProfileByFirstNameLastNameLastNameSSNLastFour(
            String personFirstName,
            String personLastName,
            String ssn
    );

    CustomerProfileLookupResponse processCustomerProfileRequest(CustomerProfileRequest customerProfileRequest);
}
