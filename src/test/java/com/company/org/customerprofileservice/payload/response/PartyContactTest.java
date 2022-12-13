package com.company.org.customerprofileservice.payload.response;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

class PartyContactTest {
    /**
     * Method under test: {@link PartyContact#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new PartyContact()).canEqual("Other"));
    }

    /**
     * Method under test: {@link PartyContact#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        PartyContact partyContact = new PartyContact();
        assertTrue(partyContact.canEqual(new PartyContact()));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartyContact#PartyContact()}
     *   <li>{@link PartyContact#setMailingAddress(MailingAddress)}
     *   <li>{@link PartyContact#setPrimaryEmailAddress(String)}
     *   <li>{@link PartyContact#setPrimaryPhoneNumber(String)}
     *   <li>{@link PartyContact#setResidentialAddress(ResidentialAddress)}
     *   <li>{@link PartyContact#setSecondaryPhoneNumber(String)}
     *   <li>{@link PartyContact#toString()}
     *   <li>{@link PartyContact#getMailingAddress()}
     *   <li>{@link PartyContact#getPrimaryEmailAddress()}
     *   <li>{@link PartyContact#getPrimaryPhoneNumber()}
     *   <li>{@link PartyContact#getResidentialAddress()}
     *   <li>{@link PartyContact#getSecondaryPhoneNumber()}
     * </ul>
     */
    @Test
    void testConstructor() {
        PartyContact actualPartyContact = new PartyContact();
        MailingAddress mailingAddress = new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB");

        actualPartyContact.setMailingAddress(mailingAddress);
        actualPartyContact.setPrimaryEmailAddress("42 Main St");
        actualPartyContact.setPrimaryPhoneNumber("4105551212");
        ResidentialAddress residentialAddress = new ResidentialAddress("42 Main St", "42 Main St", "Oxford", "MD",
                "Postal Code", "GB");

        actualPartyContact.setResidentialAddress(residentialAddress);
        actualPartyContact.setSecondaryPhoneNumber("4105551212");
        String actualToStringResult = actualPartyContact.toString();
        assertSame(mailingAddress, actualPartyContact.getMailingAddress());
        assertEquals("42 Main St", actualPartyContact.getPrimaryEmailAddress());
        assertEquals("4105551212", actualPartyContact.getPrimaryPhoneNumber());
        assertSame(residentialAddress, actualPartyContact.getResidentialAddress());
        assertEquals("4105551212", actualPartyContact.getSecondaryPhoneNumber());
        assertEquals("PartyContact(primaryPhoneNumber=4105551212, secondaryPhoneNumber=4105551212, primaryEmailAddress=42"
                + " Main St, residentialAddress=ResidentialAddress(addressLine1=42 Main St, addressLine2=42 Main St,"
                + " city=Oxford, state=MD, postalCode=Postal Code, countryCode=GB), mailingAddress=MailingAddress"
                + "(addressLine1=42 Main St, addressLine2=42 Main St, city=Oxford, state=MD, postalCode=Postal Code,"
                + " countryCode=GB))", actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartyContact#PartyContact(String, String, String, ResidentialAddress, MailingAddress)}
     *   <li>{@link PartyContact#setMailingAddress(MailingAddress)}
     *   <li>{@link PartyContact#setPrimaryEmailAddress(String)}
     *   <li>{@link PartyContact#setPrimaryPhoneNumber(String)}
     *   <li>{@link PartyContact#setResidentialAddress(ResidentialAddress)}
     *   <li>{@link PartyContact#setSecondaryPhoneNumber(String)}
     *   <li>{@link PartyContact#toString()}
     *   <li>{@link PartyContact#getMailingAddress()}
     *   <li>{@link PartyContact#getPrimaryEmailAddress()}
     *   <li>{@link PartyContact#getPrimaryPhoneNumber()}
     *   <li>{@link PartyContact#getResidentialAddress()}
     *   <li>{@link PartyContact#getSecondaryPhoneNumber()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        ResidentialAddress residentialAddress = new ResidentialAddress("42 Main St", "42 Main St", "Oxford", "MD",
                "Postal Code", "GB");

        MailingAddress mailingAddress = new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code",
                "GB");

        PartyContact actualPartyContact = new PartyContact("4105551212", "4105551212", "42 Main St", residentialAddress,
                mailingAddress);
        MailingAddress mailingAddress1 = new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code",
                "GB");

        actualPartyContact.setMailingAddress(mailingAddress1);
        actualPartyContact.setPrimaryEmailAddress("42 Main St");
        actualPartyContact.setPrimaryPhoneNumber("4105551212");
        ResidentialAddress residentialAddress1 = new ResidentialAddress("42 Main St", "42 Main St", "Oxford", "MD",
                "Postal Code", "GB");

        actualPartyContact.setResidentialAddress(residentialAddress1);
        actualPartyContact.setSecondaryPhoneNumber("4105551212");
        String actualToStringResult = actualPartyContact.toString();
        MailingAddress mailingAddress2 = actualPartyContact.getMailingAddress();
        assertSame(mailingAddress1, mailingAddress2);
        assertEquals(mailingAddress, mailingAddress2);
        assertEquals("42 Main St", actualPartyContact.getPrimaryEmailAddress());
        assertEquals("4105551212", actualPartyContact.getPrimaryPhoneNumber());
        ResidentialAddress residentialAddress2 = actualPartyContact.getResidentialAddress();
        assertSame(residentialAddress1, residentialAddress2);
        assertEquals(residentialAddress, residentialAddress2);
        assertEquals("4105551212", actualPartyContact.getSecondaryPhoneNumber());
        assertEquals("PartyContact(primaryPhoneNumber=4105551212, secondaryPhoneNumber=4105551212, primaryEmailAddress=42"
                + " Main St, residentialAddress=ResidentialAddress(addressLine1=42 Main St, addressLine2=42 Main St,"
                + " city=Oxford, state=MD, postalCode=Postal Code, countryCode=GB), mailingAddress=MailingAddress"
                + "(addressLine1=42 Main St, addressLine2=42 Main St, city=Oxford, state=MD, postalCode=Postal Code,"
                + " countryCode=GB))", actualToStringResult);
    }

    /**
     * Method under test: {@link PartyContact#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(new PartyContact(), null);
        assertNotEquals(new PartyContact(), "Different type to PartyContact");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartyContact#equals(Object)}
     *   <li>{@link PartyContact#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        PartyContact partyContact = new PartyContact();
        assertEquals(partyContact, partyContact);
        int expectedHashCodeResult = partyContact.hashCode();
        assertEquals(expectedHashCodeResult, partyContact.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartyContact#equals(Object)}
     *   <li>{@link PartyContact#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        PartyContact partyContact = new PartyContact();
        PartyContact partyContact1 = new PartyContact();
        assertEquals(partyContact, partyContact1);
        int expectedHashCodeResult = partyContact.hashCode();
        assertEquals(expectedHashCodeResult, partyContact1.hashCode());
    }

    /**
     * Method under test: {@link PartyContact#equals(Object)}
     */
    @Test
    void testEquals4() {
        ResidentialAddress residentialAddress = new ResidentialAddress("42 Main St", "42 Main St", "Oxford", "MD",
                "Postal Code", "GB");

        PartyContact partyContact = new PartyContact("4105551212", "4105551212", "42 Main St", residentialAddress,
                new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
        assertNotEquals(partyContact, new PartyContact());
    }

    /**
     * Method under test: {@link PartyContact#equals(Object)}
     */
    @Test
    void testEquals5() {
        PartyContact partyContact = new PartyContact();
        ResidentialAddress residentialAddress = new ResidentialAddress("42 Main St", "42 Main St", "Oxford", "MD",
                "Postal Code", "GB");

        assertNotEquals(partyContact, new PartyContact("4105551212", "4105551212", "42 Main St", residentialAddress,
                new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB")));
    }

    /**
     * Method under test: {@link PartyContact#equals(Object)}
     */
    @Test
    void testEquals6() {
        PartyContact partyContact = new PartyContact();
        partyContact.setSecondaryPhoneNumber("4105551212");
        assertNotEquals(partyContact, new PartyContact());
    }

    /**
     * Method under test: {@link PartyContact#equals(Object)}
     */
    @Test
    void testEquals7() {
        PartyContact partyContact = new PartyContact();
        partyContact.setPrimaryEmailAddress("42 Main St");
        assertNotEquals(partyContact, new PartyContact());
    }

    /**
     * Method under test: {@link PartyContact#equals(Object)}
     */
    @Test
    void testEquals8() {
        PartyContact partyContact = new PartyContact();
        partyContact.setResidentialAddress(
                new ResidentialAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
        assertNotEquals(partyContact, new PartyContact());
    }

    /**
     * Method under test: {@link PartyContact#equals(Object)}
     */
    @Test
    void testEquals9() {
        PartyContact partyContact = new PartyContact();
        partyContact
                .setMailingAddress(new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
        assertNotEquals(partyContact, new PartyContact());
    }

    /**
     * Method under test: {@link PartyContact#equals(Object)}
     */
    @Test
    void testEquals10() {
        ResidentialAddress residentialAddress = mock(ResidentialAddress.class);
        PartyContact partyContact = new PartyContact("4105551212", "4105551212", "42 Main St", residentialAddress,
                new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
        assertNotEquals(partyContact, new PartyContact());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartyContact#equals(Object)}
     *   <li>{@link PartyContact#hashCode()}
     * </ul>
     */
    @Test
    void testEquals11() {
        ResidentialAddress residentialAddress = new ResidentialAddress("42 Main St", "42 Main St", "Oxford", "MD",
                "Postal Code", "GB");

        PartyContact partyContact = new PartyContact("4105551212", "4105551212", "42 Main St", residentialAddress,
                new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
        ResidentialAddress residentialAddress1 = new ResidentialAddress("42 Main St", "42 Main St", "Oxford", "MD",
                "Postal Code", "GB");

        PartyContact partyContact1 = new PartyContact("4105551212", "4105551212", "42 Main St", residentialAddress1,
                new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));

        assertEquals(partyContact, partyContact1);
        int expectedHashCodeResult = partyContact.hashCode();
        assertEquals(expectedHashCodeResult, partyContact1.hashCode());
    }

    /**
     * Method under test: {@link PartyContact#equals(Object)}
     */
    @Test
    void testEquals12() {
        PartyContact partyContact = new PartyContact();

        PartyContact partyContact1 = new PartyContact();
        partyContact1.setSecondaryPhoneNumber("4105551212");
        assertNotEquals(partyContact, partyContact1);
    }

    /**
     * Method under test: {@link PartyContact#equals(Object)}
     */
    @Test
    void testEquals13() {
        PartyContact partyContact = new PartyContact();

        PartyContact partyContact1 = new PartyContact();
        partyContact1.setPrimaryEmailAddress("42 Main St");
        assertNotEquals(partyContact, partyContact1);
    }

    /**
     * Method under test: {@link PartyContact#equals(Object)}
     */
    @Test
    void testEquals14() {
        PartyContact partyContact = new PartyContact();

        PartyContact partyContact1 = new PartyContact();
        partyContact1.setResidentialAddress(
                new ResidentialAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
        assertNotEquals(partyContact, partyContact1);
    }

    /**
     * Method under test: {@link PartyContact#equals(Object)}
     */
    @Test
    void testEquals15() {
        PartyContact partyContact = new PartyContact();

        PartyContact partyContact1 = new PartyContact();
        partyContact1
                .setMailingAddress(new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
        assertNotEquals(partyContact, partyContact1);
    }

    /**
     * Method under test: {@link PartyContact#equals(Object)}
     */
    @Test
    void testEquals16() {
        PartyContact partyContact = new PartyContact();
        partyContact.setResidentialAddress(mock(ResidentialAddress.class));
        assertNotEquals(partyContact, new PartyContact());
    }
}

