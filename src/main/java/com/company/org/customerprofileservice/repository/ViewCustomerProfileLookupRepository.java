package com.company.org.customerprofileservice.repository;

import com.company.org.customerprofileservice.entity.ViewCustomerProfileLookup;
import com.company.org.customerprofileservice.entity.ViewCustomerProfileLookupId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ViewCustomerProfileLookupRepository
        extends JpaRepository<ViewCustomerProfileLookup, ViewCustomerProfileLookupId> {

    List<ViewCustomerProfileLookup> findById_PersonFirstNameAndId_PersonLastNameAndId_Ssn(String personFirstName, String personLastName, String ssn);

    @Query("select v from ViewCustomerProfileLookup v " +
            "where v.id.personFirstName = ?1 and v.id.personLastName = ?2 and v.id.ssn = ?3")
    Optional<ViewCustomerProfileLookup> findPersonAttributes(String personFirstName, String personLastName, String ssn);
    //List<ViewCustomerProfileLookup> findPersonAttributes(String personFirstName, String personLastName, String ssn);

    Optional<ViewCustomerProfileLookup> findByPartyClientNumber(String partyClientNumber);
    //List<ViewCustomerProfileLookup> findByPartyClientNumber(String partyClientNumber);

    Optional<ViewCustomerProfileLookup> findByAccountNumber(String accountNumber);

    Optional<ViewCustomerProfileLookup> findPersonAttributesByPartyPhoneFullNumber(String partyPhoneFullNumber);
    //Iterable<Customer> findCustomerByFirstNameAndLastName(String firstName, String lastName);

    @Query("select v from ViewCustomerProfileLookup v " +
            "where v.id.personFirstName = ?1 and v.id.personLastName = ?2 and v.id.ssn = ?3 " +
            "and v.residentialAddressLine1 = ?4 and v.residentialCity = ?5 and v.residentialStateProvinceName = ?6 " +
            "and v.residentialPostalCode = ?7 and v.residentialCountryName = ?8 and v.passportNumber = ?9 " +
            "and v.partyPhoneFullNumber = ?10")
    Optional<ViewCustomerProfileLookup> findPersonAttributesExtended(String personFirstName, String personLastName, String ssn,
                                                                     String residentialAddressLine1, String residentialCity,
                                                                     String residentialStateProvinceName, String residentialPostalCode,
                                                                     String residentialCountryName, String passportNumber,
                                                                     String partyPhoneFullNumber);







}