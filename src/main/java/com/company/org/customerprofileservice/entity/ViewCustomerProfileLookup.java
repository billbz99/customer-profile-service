package com.company.org.customerprofileservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Nationalized;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Mapping for DB view
 */
@Entity
@Builder
@AllArgsConstructor
@Immutable
@Table(name = "VW_CUSTOMER_PROFILE_LOOKUP")
public class ViewCustomerProfileLookup {
    @EmbeddedId
    private ViewCustomerProfileLookupId id;

    @Size(max = 255)
    @Column(name = "person_middle_name")
    private String personMiddleName;

    @Size(max = 255)
    @Column(name = "person_informal_name")
    private String personInformalName;

    @Size(max = 4000)
    @Nationalized
    @Column(name = "person_birth_date", length = 4000)
    private String personBirthDate;

    @Size(max = 50)
    @NotNull
    @Column(name = "citizenship_country", nullable = false, length = 50)
    private String citizenshipCountry;

    @Size(max = 255)
    @Column(name = "person_employer_name")
    private String personEmployerName;

    @Size(max = 50)
    @Column(name = "party_client_number")
    private String partyClientNumber;

    @Size(max = 255)
    @Column(name = "passport_number")
    private String passportNumber;

    @Size(max = 40)
    @NotNull
    @Column(name = "ResidentialAddressLine1", nullable = false, length = 40)
    private String residentialAddressLine1;

    @Size(max = 40)
    @Column(name = "ResidentialAddressLine2", length = 40)
    private String residentialAddressLine2;

    @Size(max = 40)
    @NotNull
    @Column(name = "ResidentialCity", nullable = false, length = 40)
    private String residentialCity;

    @Size(max = 50)
    @NotNull
    @Column(name = "ResidentialStateProvinceName", nullable = false, length = 50)
    private String residentialStateProvinceName;

    @Size(max = 13)
    @Column(name = "ResidentialPostalCode", length = 13)
    private String residentialPostalCode;

    @Size(max = 50)
    @NotNull
    @Column(name = "ResidentialCountryName", nullable = false, length = 50)
    private String residentialCountryName;

    @Size(max = 40)
    @NotNull
    @Column(name = "MailingAddressLine1", nullable = false, length = 40)
    private String mailingAddressLine1;

    @Size(max = 40)
    @Column(name = "MailingAddressLine2", length = 40)
    private String mailingAddressLine2;

    @Size(max = 40)
    @NotNull
    @Column(name = "MailingCity", nullable = false, length = 40)
    private String mailingCity;

    @Size(max = 50)
    @NotNull
    @Column(name = "MailingStateProvinceName", nullable = false, length = 50)
    private String mailingStateProvinceName;

    @Size(max = 13)
    @Column(name = "MailingPostalCode", length = 13)
    private String mailingPostalCode;

    @Size(max = 50)
    @NotNull
    @Column(name = "MailingCountryName", nullable = false, length = 50)
    private String mailingCountryName;

    @Size(max = 25)
    @NotNull
    @Column(name = "party_phone_full_number", nullable = false, length = 25)
    private String partyPhoneFullNumber;

    @Size(max = 100)
    @NotNull
    @Column(name = "party_email_address_text", nullable = false, length = 100)
    private String partyEmailAddressText;

    @Size(max = 19)
    @Column(name = "account_number")
    private String accountNumber;

    public ViewCustomerProfileLookupId getId() {
        return id;
    }

    public void setId(ViewCustomerProfileLookupId id) {
        this.id = id;
    }

    public String getPersonMiddleName() {
        return personMiddleName;
    }

    public String getPersonInformalName() {
        return personInformalName;
    }

    public String getPersonBirthDate() {
        return personBirthDate;
    }

    public String getCitizenshipCountry() {
        return citizenshipCountry;
    }

    public String getPersonEmployerName() {
        return personEmployerName;
    }

    public String getPartyClientNumber() {
        return partyClientNumber;
    }


    public String getPassportNumber() {
        return passportNumber;
    }

    public String getResidentialAddressLine1() {
        return residentialAddressLine1;
    }

    public String getResidentialAddressLine2() {
        return residentialAddressLine2;
    }

    public String getResidentialCity() {
        return residentialCity;
    }

    public String getResidentialStateProvinceName() {
        return residentialStateProvinceName;
    }

    public String getResidentialPostalCode() {
        return residentialPostalCode;
    }

    public String getResidentialCountryName() {
        return residentialCountryName;
    }

    public String getMailingAddressLine1() {
        return mailingAddressLine1;
    }

    public String getMailingAddressLine2() {
        return mailingAddressLine2;
    }

    public String getMailingCity() {
        return mailingCity;
    }

    public String getMailingStateProvinceName() {
        return mailingStateProvinceName;
    }

    public String getMailingPostalCode() {
        return mailingPostalCode;
    }

    public String getMailingCountryName() {
        return mailingCountryName;
    }

    public String getPartyPhoneFullNumber() {
        return partyPhoneFullNumber;
    }

    public String getPartyEmailAddressText() {
        return partyEmailAddressText;
    }

    public String getAccountNumber() { return accountNumber; }

    public ViewCustomerProfileLookup() {
    }

    public ViewCustomerProfileLookup(ViewCustomerProfileLookupId id) { this.id = id; }
    public ViewCustomerProfileLookup(ViewCustomerProfileLookupId id, String citizenshipCountry, String partyClientNumber, String residentialAddressLine1,
                                     String residentialCity, String residentialStateProvinceName, String residentialCountryName, String mailingAddressLine1,
                                     String mailingCity, String mailingStateProvinceName, String mailingCountryName, String partyPhoneFullNumber,
                                     String partyEmailAddressText, String accountNumber) {
        this.id = id;
        this.citizenshipCountry = citizenshipCountry;
        this.partyClientNumber = partyClientNumber;
        this.residentialAddressLine1 = residentialAddressLine1;
        this.residentialCity = residentialCity;
        this.residentialStateProvinceName = residentialStateProvinceName;
        this.residentialCountryName = residentialCountryName;
        this.mailingAddressLine1 = mailingAddressLine1;
        this.mailingCity = mailingCity;
        this.mailingStateProvinceName = mailingStateProvinceName;
        this.mailingCountryName = mailingCountryName;
        this.partyPhoneFullNumber = partyPhoneFullNumber;
        this.partyEmailAddressText = partyEmailAddressText;
        this.accountNumber = accountNumber;
    }
}