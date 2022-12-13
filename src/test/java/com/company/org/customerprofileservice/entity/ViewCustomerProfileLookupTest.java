package com.company.org.customerprofileservice.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class ViewCustomerProfileLookupTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ViewCustomerProfileLookup#ViewCustomerProfileLookup()}
     *   <li>{@link ViewCustomerProfileLookup#setId(ViewCustomerProfileLookupId)}
     *   <li>{@link ViewCustomerProfileLookup#getAccountNumber()}
     *   <li>{@link ViewCustomerProfileLookup#getCitizenshipCountry()}
     *   <li>{@link ViewCustomerProfileLookup#getId()}
     *   <li>{@link ViewCustomerProfileLookup#getMailingAddressLine1()}
     *   <li>{@link ViewCustomerProfileLookup#getMailingAddressLine2()}
     *   <li>{@link ViewCustomerProfileLookup#getMailingCity()}
     *   <li>{@link ViewCustomerProfileLookup#getMailingCountryName()}
     *   <li>{@link ViewCustomerProfileLookup#getMailingPostalCode()}
     *   <li>{@link ViewCustomerProfileLookup#getMailingStateProvinceName()}
     *   <li>{@link ViewCustomerProfileLookup#getPartyClientNumber()}
     *   <li>{@link ViewCustomerProfileLookup#getPartyEmailAddressText()}
     *   <li>{@link ViewCustomerProfileLookup#getPartyPhoneFullNumber()}
     *   <li>{@link ViewCustomerProfileLookup#getPassportNumber()}
     *   <li>{@link ViewCustomerProfileLookup#getPersonBirthDate()}
     *   <li>{@link ViewCustomerProfileLookup#getPersonEmployerName()}
     *   <li>{@link ViewCustomerProfileLookup#getPersonInformalName()}
     *   <li>{@link ViewCustomerProfileLookup#getPersonMiddleName()}
     *   <li>{@link ViewCustomerProfileLookup#getResidentialAddressLine1()}
     *   <li>{@link ViewCustomerProfileLookup#getResidentialAddressLine2()}
     *   <li>{@link ViewCustomerProfileLookup#getResidentialCity()}
     *   <li>{@link ViewCustomerProfileLookup#getResidentialCountryName()}
     *   <li>{@link ViewCustomerProfileLookup#getResidentialPostalCode()}
     *   <li>{@link ViewCustomerProfileLookup#getResidentialStateProvinceName()}
     * </ul>
     */
    @Test
    void testConstructor() {
        ViewCustomerProfileLookup actualViewCustomerProfileLookup = new ViewCustomerProfileLookup();
        ViewCustomerProfileLookupId viewCustomerProfileLookupId = new ViewCustomerProfileLookupId();
        actualViewCustomerProfileLookup.setId(viewCustomerProfileLookupId);
        assertNull(actualViewCustomerProfileLookup.getAccountNumber());
        assertNull(actualViewCustomerProfileLookup.getCitizenshipCountry());
        assertSame(viewCustomerProfileLookupId, actualViewCustomerProfileLookup.getId());
        assertNull(actualViewCustomerProfileLookup.getMailingAddressLine1());
        assertNull(actualViewCustomerProfileLookup.getMailingAddressLine2());
        assertNull(actualViewCustomerProfileLookup.getMailingCity());
        assertNull(actualViewCustomerProfileLookup.getMailingCountryName());
        assertNull(actualViewCustomerProfileLookup.getMailingPostalCode());
        assertNull(actualViewCustomerProfileLookup.getMailingStateProvinceName());
        assertNull(actualViewCustomerProfileLookup.getPartyClientNumber());
        assertNull(actualViewCustomerProfileLookup.getPartyEmailAddressText());
        assertNull(actualViewCustomerProfileLookup.getPartyPhoneFullNumber());
        assertNull(actualViewCustomerProfileLookup.getPassportNumber());
        assertNull(actualViewCustomerProfileLookup.getPersonBirthDate());
        assertNull(actualViewCustomerProfileLookup.getPersonEmployerName());
        assertNull(actualViewCustomerProfileLookup.getPersonInformalName());
        assertNull(actualViewCustomerProfileLookup.getPersonMiddleName());
        assertNull(actualViewCustomerProfileLookup.getResidentialAddressLine1());
        assertNull(actualViewCustomerProfileLookup.getResidentialAddressLine2());
        assertNull(actualViewCustomerProfileLookup.getResidentialCity());
        assertNull(actualViewCustomerProfileLookup.getResidentialCountryName());
        assertNull(actualViewCustomerProfileLookup.getResidentialPostalCode());
        assertNull(actualViewCustomerProfileLookup.getResidentialStateProvinceName());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ViewCustomerProfileLookup#ViewCustomerProfileLookup(ViewCustomerProfileLookupId)}
     *   <li>{@link ViewCustomerProfileLookup#setId(ViewCustomerProfileLookupId)}
     *   <li>{@link ViewCustomerProfileLookup#getAccountNumber()}
     *   <li>{@link ViewCustomerProfileLookup#getCitizenshipCountry()}
     *   <li>{@link ViewCustomerProfileLookup#getId()}
     *   <li>{@link ViewCustomerProfileLookup#getMailingAddressLine1()}
     *   <li>{@link ViewCustomerProfileLookup#getMailingAddressLine2()}
     *   <li>{@link ViewCustomerProfileLookup#getMailingCity()}
     *   <li>{@link ViewCustomerProfileLookup#getMailingCountryName()}
     *   <li>{@link ViewCustomerProfileLookup#getMailingPostalCode()}
     *   <li>{@link ViewCustomerProfileLookup#getMailingStateProvinceName()}
     *   <li>{@link ViewCustomerProfileLookup#getPartyClientNumber()}
     *   <li>{@link ViewCustomerProfileLookup#getPartyEmailAddressText()}
     *   <li>{@link ViewCustomerProfileLookup#getPartyPhoneFullNumber()}
     *   <li>{@link ViewCustomerProfileLookup#getPassportNumber()}
     *   <li>{@link ViewCustomerProfileLookup#getPersonBirthDate()}
     *   <li>{@link ViewCustomerProfileLookup#getPersonEmployerName()}
     *   <li>{@link ViewCustomerProfileLookup#getPersonInformalName()}
     *   <li>{@link ViewCustomerProfileLookup#getPersonMiddleName()}
     *   <li>{@link ViewCustomerProfileLookup#getResidentialAddressLine1()}
     *   <li>{@link ViewCustomerProfileLookup#getResidentialAddressLine2()}
     *   <li>{@link ViewCustomerProfileLookup#getResidentialCity()}
     *   <li>{@link ViewCustomerProfileLookup#getResidentialCountryName()}
     *   <li>{@link ViewCustomerProfileLookup#getResidentialPostalCode()}
     *   <li>{@link ViewCustomerProfileLookup#getResidentialStateProvinceName()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        ViewCustomerProfileLookupId viewCustomerProfileLookupId = new ViewCustomerProfileLookupId();
        ViewCustomerProfileLookup actualViewCustomerProfileLookup = new ViewCustomerProfileLookup(
                viewCustomerProfileLookupId);
        ViewCustomerProfileLookupId viewCustomerProfileLookupId1 = new ViewCustomerProfileLookupId();
        actualViewCustomerProfileLookup.setId(viewCustomerProfileLookupId1);
        assertNull(actualViewCustomerProfileLookup.getAccountNumber());
        assertNull(actualViewCustomerProfileLookup.getCitizenshipCountry());
        ViewCustomerProfileLookupId id = actualViewCustomerProfileLookup.getId();
        assertSame(viewCustomerProfileLookupId1, id);
        assertEquals(viewCustomerProfileLookupId, id);
        assertNull(actualViewCustomerProfileLookup.getMailingAddressLine1());
        assertNull(actualViewCustomerProfileLookup.getMailingAddressLine2());
        assertNull(actualViewCustomerProfileLookup.getMailingCity());
        assertNull(actualViewCustomerProfileLookup.getMailingCountryName());
        assertNull(actualViewCustomerProfileLookup.getMailingPostalCode());
        assertNull(actualViewCustomerProfileLookup.getMailingStateProvinceName());
        assertNull(actualViewCustomerProfileLookup.getPartyClientNumber());
        assertNull(actualViewCustomerProfileLookup.getPartyEmailAddressText());
        assertNull(actualViewCustomerProfileLookup.getPartyPhoneFullNumber());
        assertNull(actualViewCustomerProfileLookup.getPassportNumber());
        assertNull(actualViewCustomerProfileLookup.getPersonBirthDate());
        assertNull(actualViewCustomerProfileLookup.getPersonEmployerName());
        assertNull(actualViewCustomerProfileLookup.getPersonInformalName());
        assertNull(actualViewCustomerProfileLookup.getPersonMiddleName());
        assertNull(actualViewCustomerProfileLookup.getResidentialAddressLine1());
        assertNull(actualViewCustomerProfileLookup.getResidentialAddressLine2());
        assertNull(actualViewCustomerProfileLookup.getResidentialCity());
        assertNull(actualViewCustomerProfileLookup.getResidentialCountryName());
        assertNull(actualViewCustomerProfileLookup.getResidentialPostalCode());
        assertNull(actualViewCustomerProfileLookup.getResidentialStateProvinceName());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ViewCustomerProfileLookup#ViewCustomerProfileLookup(ViewCustomerProfileLookupId, String, String, String, String, String, String, String, String, String, String, String, String, String)}
     *   <li>{@link ViewCustomerProfileLookup#setId(ViewCustomerProfileLookupId)}
     *   <li>{@link ViewCustomerProfileLookup#getAccountNumber()}
     *   <li>{@link ViewCustomerProfileLookup#getCitizenshipCountry()}
     *   <li>{@link ViewCustomerProfileLookup#getId()}
     *   <li>{@link ViewCustomerProfileLookup#getMailingAddressLine1()}
     *   <li>{@link ViewCustomerProfileLookup#getMailingAddressLine2()}
     *   <li>{@link ViewCustomerProfileLookup#getMailingCity()}
     *   <li>{@link ViewCustomerProfileLookup#getMailingCountryName()}
     *   <li>{@link ViewCustomerProfileLookup#getMailingPostalCode()}
     *   <li>{@link ViewCustomerProfileLookup#getMailingStateProvinceName()}
     *   <li>{@link ViewCustomerProfileLookup#getPartyClientNumber()}
     *   <li>{@link ViewCustomerProfileLookup#getPartyEmailAddressText()}
     *   <li>{@link ViewCustomerProfileLookup#getPartyPhoneFullNumber()}
     *   <li>{@link ViewCustomerProfileLookup#getPassportNumber()}
     *   <li>{@link ViewCustomerProfileLookup#getPersonBirthDate()}
     *   <li>{@link ViewCustomerProfileLookup#getPersonEmployerName()}
     *   <li>{@link ViewCustomerProfileLookup#getPersonInformalName()}
     *   <li>{@link ViewCustomerProfileLookup#getPersonMiddleName()}
     *   <li>{@link ViewCustomerProfileLookup#getResidentialAddressLine1()}
     *   <li>{@link ViewCustomerProfileLookup#getResidentialAddressLine2()}
     *   <li>{@link ViewCustomerProfileLookup#getResidentialCity()}
     *   <li>{@link ViewCustomerProfileLookup#getResidentialCountryName()}
     *   <li>{@link ViewCustomerProfileLookup#getResidentialPostalCode()}
     *   <li>{@link ViewCustomerProfileLookup#getResidentialStateProvinceName()}
     * </ul>
     */
    @Test
    void testConstructor3() {
        ViewCustomerProfileLookupId viewCustomerProfileLookupId = new ViewCustomerProfileLookupId();
        ViewCustomerProfileLookup actualViewCustomerProfileLookup = new ViewCustomerProfileLookup(
                viewCustomerProfileLookupId, "GB", "42", "42 Main St", "Residential City", "Residential State Province Name",
                "GB", "42 Main St", "Mailing City", "Mailing State Province Name", "GB", "4105551212", "42 Main St", "42");
        ViewCustomerProfileLookupId viewCustomerProfileLookupId1 = new ViewCustomerProfileLookupId();
        actualViewCustomerProfileLookup.setId(viewCustomerProfileLookupId1);
        assertEquals("42", actualViewCustomerProfileLookup.getAccountNumber());
        assertEquals("GB", actualViewCustomerProfileLookup.getCitizenshipCountry());
        ViewCustomerProfileLookupId id = actualViewCustomerProfileLookup.getId();
        assertSame(viewCustomerProfileLookupId1, id);
        assertEquals(viewCustomerProfileLookupId, id);
        assertEquals("42 Main St", actualViewCustomerProfileLookup.getMailingAddressLine1());
        assertNull(actualViewCustomerProfileLookup.getMailingAddressLine2());
        assertEquals("Mailing City", actualViewCustomerProfileLookup.getMailingCity());
        assertEquals("GB", actualViewCustomerProfileLookup.getMailingCountryName());
        assertNull(actualViewCustomerProfileLookup.getMailingPostalCode());
        assertEquals("Mailing State Province Name", actualViewCustomerProfileLookup.getMailingStateProvinceName());
        assertEquals("42", actualViewCustomerProfileLookup.getPartyClientNumber());
        assertEquals("42 Main St", actualViewCustomerProfileLookup.getPartyEmailAddressText());
        assertEquals("4105551212", actualViewCustomerProfileLookup.getPartyPhoneFullNumber());
        assertNull(actualViewCustomerProfileLookup.getPassportNumber());
        assertNull(actualViewCustomerProfileLookup.getPersonBirthDate());
        assertNull(actualViewCustomerProfileLookup.getPersonEmployerName());
        assertNull(actualViewCustomerProfileLookup.getPersonInformalName());
        assertNull(actualViewCustomerProfileLookup.getPersonMiddleName());
        assertEquals("42 Main St", actualViewCustomerProfileLookup.getResidentialAddressLine1());
        assertNull(actualViewCustomerProfileLookup.getResidentialAddressLine2());
        assertEquals("Residential City", actualViewCustomerProfileLookup.getResidentialCity());
        assertEquals("GB", actualViewCustomerProfileLookup.getResidentialCountryName());
        assertNull(actualViewCustomerProfileLookup.getResidentialPostalCode());
        assertEquals("Residential State Province Name",
                actualViewCustomerProfileLookup.getResidentialStateProvinceName());
    }
}

