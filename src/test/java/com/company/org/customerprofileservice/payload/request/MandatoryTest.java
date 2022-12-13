package com.company.org.customerprofileservice.payload.request;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import com.company.org.customerprofileservice.payload.response.ResidentialAddress;
import org.junit.jupiter.api.Test;

class MandatoryTest {
    /**
     * Method under test: {@link Mandatory#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new Mandatory()).canEqual("Other"));
    }

    /**
     * Method under test: {@link Mandatory#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        Mandatory mandatory = new Mandatory();
        assertTrue(mandatory.canEqual(new Mandatory()));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Mandatory#Mandatory()}
     *   <li>{@link Mandatory#setAccountNumber(String)}
     *   <li>{@link Mandatory#setCardNumber(String)}
     *   <li>{@link Mandatory#setCrdbPartyIdentifier(String)}
     *   <li>{@link Mandatory#setFirstName(String)}
     *   <li>{@link Mandatory#setLastName(String)}
     *   <li>{@link Mandatory#setPassportNumber(String)}
     *   <li>{@link Mandatory#setPrimaryPhoneNumber(String)}
     *   <li>{@link Mandatory#setResidentialAddress(ResidentialAddress)}
     *   <li>{@link Mandatory#setSocialSecurityNumber(String)}
     *   <li>{@link Mandatory#toString()}
     *   <li>{@link Mandatory#getAccountNumber()}
     *   <li>{@link Mandatory#getCardNumber()}
     *   <li>{@link Mandatory#getCrdbPartyIdentifier()}
     *   <li>{@link Mandatory#getFirstName()}
     *   <li>{@link Mandatory#getLastName()}
     *   <li>{@link Mandatory#getPassportNumber()}
     *   <li>{@link Mandatory#getPrimaryPhoneNumber()}
     *   <li>{@link Mandatory#getResidentialAddress()}
     *   <li>{@link Mandatory#getSocialSecurityNumber()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Mandatory actualMandatory = new Mandatory();
        actualMandatory.setAccountNumber("42");
        actualMandatory.setCardNumber("42");
        actualMandatory.setCrdbPartyIdentifier("42");
        actualMandatory.setFirstName("Jane");
        actualMandatory.setLastName("Doe");
        actualMandatory.setPassportNumber("42");
        actualMandatory.setPrimaryPhoneNumber("4105551212");
        ResidentialAddress residentialAddress = new ResidentialAddress("42 Main St", "42 Main St", "Oxford", "MD",
                "Postal Code", "GB");

        actualMandatory.setResidentialAddress(residentialAddress);
        actualMandatory.setSocialSecurityNumber("42");
        String actualToStringResult = actualMandatory.toString();
        assertEquals("42", actualMandatory.getAccountNumber());
        assertEquals("42", actualMandatory.getCardNumber());
        assertEquals("42", actualMandatory.getCrdbPartyIdentifier());
        assertEquals("Jane", actualMandatory.getFirstName());
        assertEquals("Doe", actualMandatory.getLastName());
        assertEquals("42", actualMandatory.getPassportNumber());
        assertEquals("4105551212", actualMandatory.getPrimaryPhoneNumber());
        assertSame(residentialAddress, actualMandatory.getResidentialAddress());
        assertEquals("42", actualMandatory.getSocialSecurityNumber());
        assertEquals("Mandatory(accountNumber=42, cardNumber=42, crdbPartyIdentifier=42, primaryPhoneNumber=4105551212,"
                + " firstName=Jane, lastName=Doe, socialSecurityNumber=42, passportNumber=42, residentialAddress"
                + "=ResidentialAddress(addressLine1=42 Main St, addressLine2=42 Main St, city=Oxford, state=MD,"
                + " postalCode=Postal Code, countryCode=GB))", actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Mandatory#Mandatory(String, String, String, String, String, String, String, String, ResidentialAddress)}
     *   <li>{@link Mandatory#setAccountNumber(String)}
     *   <li>{@link Mandatory#setCardNumber(String)}
     *   <li>{@link Mandatory#setCrdbPartyIdentifier(String)}
     *   <li>{@link Mandatory#setFirstName(String)}
     *   <li>{@link Mandatory#setLastName(String)}
     *   <li>{@link Mandatory#setPassportNumber(String)}
     *   <li>{@link Mandatory#setPrimaryPhoneNumber(String)}
     *   <li>{@link Mandatory#setResidentialAddress(ResidentialAddress)}
     *   <li>{@link Mandatory#setSocialSecurityNumber(String)}
     *   <li>{@link Mandatory#toString()}
     *   <li>{@link Mandatory#getAccountNumber()}
     *   <li>{@link Mandatory#getCardNumber()}
     *   <li>{@link Mandatory#getCrdbPartyIdentifier()}
     *   <li>{@link Mandatory#getFirstName()}
     *   <li>{@link Mandatory#getLastName()}
     *   <li>{@link Mandatory#getPassportNumber()}
     *   <li>{@link Mandatory#getPrimaryPhoneNumber()}
     *   <li>{@link Mandatory#getResidentialAddress()}
     *   <li>{@link Mandatory#getSocialSecurityNumber()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        ResidentialAddress residentialAddress = new ResidentialAddress("42 Main St", "42 Main St", "Oxford", "MD",
                "Postal Code", "GB");

        Mandatory actualMandatory = new Mandatory("42", "42", "42", "4105551212", "Jane", "Doe", "42", "42",
                residentialAddress);
        actualMandatory.setAccountNumber("42");
        actualMandatory.setCardNumber("42");
        actualMandatory.setCrdbPartyIdentifier("42");
        actualMandatory.setFirstName("Jane");
        actualMandatory.setLastName("Doe");
        actualMandatory.setPassportNumber("42");
        actualMandatory.setPrimaryPhoneNumber("4105551212");
        ResidentialAddress residentialAddress1 = new ResidentialAddress("42 Main St", "42 Main St", "Oxford", "MD",
                "Postal Code", "GB");

        actualMandatory.setResidentialAddress(residentialAddress1);
        actualMandatory.setSocialSecurityNumber("42");
        String actualToStringResult = actualMandatory.toString();
        assertEquals("42", actualMandatory.getAccountNumber());
        assertEquals("42", actualMandatory.getCardNumber());
        assertEquals("42", actualMandatory.getCrdbPartyIdentifier());
        assertEquals("Jane", actualMandatory.getFirstName());
        assertEquals("Doe", actualMandatory.getLastName());
        assertEquals("42", actualMandatory.getPassportNumber());
        assertEquals("4105551212", actualMandatory.getPrimaryPhoneNumber());
        ResidentialAddress residentialAddress2 = actualMandatory.getResidentialAddress();
        assertSame(residentialAddress1, residentialAddress2);
        assertEquals(residentialAddress, residentialAddress2);
        assertEquals("42", actualMandatory.getSocialSecurityNumber());
        assertEquals("Mandatory(accountNumber=42, cardNumber=42, crdbPartyIdentifier=42, primaryPhoneNumber=4105551212,"
                + " firstName=Jane, lastName=Doe, socialSecurityNumber=42, passportNumber=42, residentialAddress"
                + "=ResidentialAddress(addressLine1=42 Main St, addressLine2=42 Main St, city=Oxford, state=MD,"
                + " postalCode=Postal Code, countryCode=GB))", actualToStringResult);
    }

    /**
     * Method under test: {@link Mandatory#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(new Mandatory(), null);
        assertNotEquals(new Mandatory(), "Different type to Mandatory");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Mandatory#equals(Object)}
     *   <li>{@link Mandatory#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        Mandatory mandatory = new Mandatory();
        assertEquals(mandatory, mandatory);
        int expectedHashCodeResult = mandatory.hashCode();
        assertEquals(expectedHashCodeResult, mandatory.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Mandatory#equals(Object)}
     *   <li>{@link Mandatory#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        Mandatory mandatory = new Mandatory();
        Mandatory mandatory1 = new Mandatory();
        assertEquals(mandatory, mandatory1);
        int expectedHashCodeResult = mandatory.hashCode();
        assertEquals(expectedHashCodeResult, mandatory1.hashCode());
    }

    /**
     * Method under test: {@link Mandatory#equals(Object)}
     */
    @Test
    void testEquals4() {
        Mandatory mandatory = new Mandatory("42", "42", "42", "4105551212", "Jane", "Doe", "42", "42",
                new ResidentialAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
        assertNotEquals(mandatory, new Mandatory());
    }

    /**
     * Method under test: {@link Mandatory#equals(Object)}
     */
    @Test
    void testEquals5() {
        Mandatory mandatory = new Mandatory();
        assertNotEquals(mandatory, new Mandatory("42", "42", "42", "4105551212", "Jane", "Doe", "42", "42",
                new ResidentialAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB")));
    }

    /**
     * Method under test: {@link Mandatory#equals(Object)}
     */
    @Test
    void testEquals6() {
        Mandatory mandatory = new Mandatory();
        mandatory.setCardNumber("42");
        assertNotEquals(mandatory, new Mandatory());
    }

    /**
     * Method under test: {@link Mandatory#equals(Object)}
     */
    @Test
    void testEquals7() {
        Mandatory mandatory = new Mandatory();
        mandatory.setCrdbPartyIdentifier("42");
        assertNotEquals(mandatory, new Mandatory());
    }

    /**
     * Method under test: {@link Mandatory#equals(Object)}
     */
    @Test
    void testEquals8() {
        Mandatory mandatory = new Mandatory();
        mandatory.setPrimaryPhoneNumber("4105551212");
        assertNotEquals(mandatory, new Mandatory());
    }

    /**
     * Method under test: {@link Mandatory#equals(Object)}
     */
    @Test
    void testEquals9() {
        Mandatory mandatory = new Mandatory();
        mandatory.setFirstName("Jane");
        assertNotEquals(mandatory, new Mandatory());
    }

    /**
     * Method under test: {@link Mandatory#equals(Object)}
     */
    @Test
    void testEquals10() {
        Mandatory mandatory = new Mandatory();
        mandatory.setLastName("Doe");
        assertNotEquals(mandatory, new Mandatory());
    }

    /**
     * Method under test: {@link Mandatory#equals(Object)}
     */
    @Test
    void testEquals11() {
        Mandatory mandatory = new Mandatory();
        mandatory.setSocialSecurityNumber("42");
        assertNotEquals(mandatory, new Mandatory());
    }

    /**
     * Method under test: {@link Mandatory#equals(Object)}
     */
    @Test
    void testEquals12() {
        Mandatory mandatory = new Mandatory();
        mandatory.setPassportNumber("42");
        assertNotEquals(mandatory, new Mandatory());
    }

    /**
     * Method under test: {@link Mandatory#equals(Object)}
     */
    @Test
    void testEquals13() {
        Mandatory mandatory = new Mandatory();
        mandatory.setResidentialAddress(
                new ResidentialAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
        assertNotEquals(mandatory, new Mandatory());
    }

    /**
     * Method under test: {@link Mandatory#equals(Object)}
     */
    @Test
    void testEquals14() {
        Mandatory mandatory = new Mandatory("42", "42", "42", "4105551212", "Jane", "Doe", "42", "42",
                mock(ResidentialAddress.class));
        assertNotEquals(mandatory, new Mandatory());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Mandatory#equals(Object)}
     *   <li>{@link Mandatory#hashCode()}
     * </ul>
     */
    @Test
    void testEquals15() {
        Mandatory mandatory = new Mandatory("42", "42", "42", "4105551212", "Jane", "Doe", "42", "42",
                new ResidentialAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
        Mandatory mandatory1 = new Mandatory("42", "42", "42", "4105551212", "Jane", "Doe", "42", "42",
                new ResidentialAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));

        assertEquals(mandatory, mandatory1);
        int expectedHashCodeResult = mandatory.hashCode();
        assertEquals(expectedHashCodeResult, mandatory1.hashCode());
    }

    /**
     * Method under test: {@link Mandatory#equals(Object)}
     */
    @Test
    void testEquals16() {
        Mandatory mandatory = new Mandatory();

        Mandatory mandatory1 = new Mandatory();
        mandatory1.setCardNumber("42");
        assertNotEquals(mandatory, mandatory1);
    }

    /**
     * Method under test: {@link Mandatory#equals(Object)}
     */
    @Test
    void testEquals17() {
        Mandatory mandatory = new Mandatory();

        Mandatory mandatory1 = new Mandatory();
        mandatory1.setCrdbPartyIdentifier("42");
        assertNotEquals(mandatory, mandatory1);
    }

    /**
     * Method under test: {@link Mandatory#equals(Object)}
     */
    @Test
    void testEquals18() {
        Mandatory mandatory = new Mandatory();

        Mandatory mandatory1 = new Mandatory();
        mandatory1.setPrimaryPhoneNumber("4105551212");
        assertNotEquals(mandatory, mandatory1);
    }

    /**
     * Method under test: {@link Mandatory#equals(Object)}
     */
    @Test
    void testEquals19() {
        Mandatory mandatory = new Mandatory();

        Mandatory mandatory1 = new Mandatory();
        mandatory1.setFirstName("Jane");
        assertNotEquals(mandatory, mandatory1);
    }

    /**
     * Method under test: {@link Mandatory#equals(Object)}
     */
    @Test
    void testEquals20() {
        Mandatory mandatory = new Mandatory();

        Mandatory mandatory1 = new Mandatory();
        mandatory1.setLastName("Doe");
        assertNotEquals(mandatory, mandatory1);
    }

    /**
     * Method under test: {@link Mandatory#equals(Object)}
     */
    @Test
    void testEquals21() {
        Mandatory mandatory = new Mandatory();

        Mandatory mandatory1 = new Mandatory();
        mandatory1.setSocialSecurityNumber("42");
        assertNotEquals(mandatory, mandatory1);
    }

    /**
     * Method under test: {@link Mandatory#equals(Object)}
     */
    @Test
    void testEquals22() {
        Mandatory mandatory = new Mandatory();

        Mandatory mandatory1 = new Mandatory();
        mandatory1.setPassportNumber("42");
        assertNotEquals(mandatory, mandatory1);
    }

    /**
     * Method under test: {@link Mandatory#equals(Object)}
     */
    @Test
    void testEquals23() {
        Mandatory mandatory = new Mandatory();

        Mandatory mandatory1 = new Mandatory();
        mandatory1.setResidentialAddress(
                new ResidentialAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
        assertNotEquals(mandatory, mandatory1);
    }

    /**
     * Method under test: {@link Mandatory#equals(Object)}
     */
    @Test
    void testEquals24() {
        Mandatory mandatory = new Mandatory();
        mandatory.setResidentialAddress(mock(ResidentialAddress.class));
        assertNotEquals(mandatory, new Mandatory());
    }
}

