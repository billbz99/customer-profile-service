package com.company.org.customerprofileservice.payload.response;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

class PartyIdentifierTest {
    /**
     * Method under test: {@link PartyIdentifier#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new PartyIdentifier()).canEqual("Other"));
    }

    /**
     * Method under test: {@link PartyIdentifier#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        PartyIdentifier partyIdentifier = new PartyIdentifier();
        assertTrue(partyIdentifier.canEqual(new PartyIdentifier()));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartyIdentifier#PartyIdentifier()}
     *   <li>{@link PartyIdentifier#setCrdbPartyIdentifier(String)}
     *   <li>{@link PartyIdentifier#setDriverLicense(DriverLicense)}
     *   <li>{@link PartyIdentifier#setPassport(Passport)}
     *   <li>{@link PartyIdentifier#setSocialSecurityNumber(String)}
     *   <li>{@link PartyIdentifier#setTaxIdentifierNumber(String)}
     *   <li>{@link PartyIdentifier#toString()}
     *   <li>{@link PartyIdentifier#getCrdbPartyIdentifier()}
     *   <li>{@link PartyIdentifier#getDriverLicense()}
     *   <li>{@link PartyIdentifier#getPassport()}
     *   <li>{@link PartyIdentifier#getSocialSecurityNumber()}
     *   <li>{@link PartyIdentifier#getTaxIdentifierNumber()}
     * </ul>
     */
    @Test
    void testConstructor() {
        PartyIdentifier actualPartyIdentifier = new PartyIdentifier();
        actualPartyIdentifier.setCrdbPartyIdentifier("42");
        DriverLicense driverLicense = new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01",
                "2020-03-01");

        actualPartyIdentifier.setDriverLicense(driverLicense);
        Passport passport = new Passport("JaneDoe", "GB", "42", "2020-03-01", "2020-03-01");

        actualPartyIdentifier.setPassport(passport);
        actualPartyIdentifier.setSocialSecurityNumber("42");
        actualPartyIdentifier.setTaxIdentifierNumber("42");
        String actualToStringResult = actualPartyIdentifier.toString();
        assertEquals("42", actualPartyIdentifier.getCrdbPartyIdentifier());
        assertSame(driverLicense, actualPartyIdentifier.getDriverLicense());
        assertSame(passport, actualPartyIdentifier.getPassport());
        assertEquals("42", actualPartyIdentifier.getSocialSecurityNumber());
        assertEquals("42", actualPartyIdentifier.getTaxIdentifierNumber());
        assertEquals(
                "PartyIdentifier(crdbPartyIdentifier=42, passport=Passport(issuingAuthority=JaneDoe, issuingCountry=GB,"
                        + " passportNumber=42, issueDate=2020-03-01, expirationDate=2020-03-01), socialSecurityNumber=42,"
                        + " taxIdentifierNumber=42, driverLicense=DriverLicense(issuingAuthority=JaneDoe, issuingCountry=GB,"
                        + " issuingStateProvince=Issuing State Province, licenseNumber=42, issueDate=2020-03-01, expirationDate"
                        + "=2020-03-01))",
                actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartyIdentifier#PartyIdentifier(String, Passport, String, String, DriverLicense)}
     *   <li>{@link PartyIdentifier#setCrdbPartyIdentifier(String)}
     *   <li>{@link PartyIdentifier#setDriverLicense(DriverLicense)}
     *   <li>{@link PartyIdentifier#setPassport(Passport)}
     *   <li>{@link PartyIdentifier#setSocialSecurityNumber(String)}
     *   <li>{@link PartyIdentifier#setTaxIdentifierNumber(String)}
     *   <li>{@link PartyIdentifier#toString()}
     *   <li>{@link PartyIdentifier#getCrdbPartyIdentifier()}
     *   <li>{@link PartyIdentifier#getDriverLicense()}
     *   <li>{@link PartyIdentifier#getPassport()}
     *   <li>{@link PartyIdentifier#getSocialSecurityNumber()}
     *   <li>{@link PartyIdentifier#getTaxIdentifierNumber()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Passport passport = new Passport("JaneDoe", "GB", "42", "2020-03-01", "2020-03-01");

        DriverLicense driverLicense = new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01",
                "2020-03-01");

        PartyIdentifier actualPartyIdentifier = new PartyIdentifier("42", passport, "42", "42", driverLicense);
        actualPartyIdentifier.setCrdbPartyIdentifier("42");
        DriverLicense driverLicense1 = new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01",
                "2020-03-01");

        actualPartyIdentifier.setDriverLicense(driverLicense1);
        Passport passport1 = new Passport("JaneDoe", "GB", "42", "2020-03-01", "2020-03-01");

        actualPartyIdentifier.setPassport(passport1);
        actualPartyIdentifier.setSocialSecurityNumber("42");
        actualPartyIdentifier.setTaxIdentifierNumber("42");
        String actualToStringResult = actualPartyIdentifier.toString();
        assertEquals("42", actualPartyIdentifier.getCrdbPartyIdentifier());
        DriverLicense driverLicense2 = actualPartyIdentifier.getDriverLicense();
        assertSame(driverLicense1, driverLicense2);
        assertEquals(driverLicense, driverLicense2);
        Passport passport2 = actualPartyIdentifier.getPassport();
        assertSame(passport1, passport2);
        assertEquals(passport, passport2);
        assertEquals("42", actualPartyIdentifier.getSocialSecurityNumber());
        assertEquals("42", actualPartyIdentifier.getTaxIdentifierNumber());
        assertEquals(
                "PartyIdentifier(crdbPartyIdentifier=42, passport=Passport(issuingAuthority=JaneDoe, issuingCountry=GB,"
                        + " passportNumber=42, issueDate=2020-03-01, expirationDate=2020-03-01), socialSecurityNumber=42,"
                        + " taxIdentifierNumber=42, driverLicense=DriverLicense(issuingAuthority=JaneDoe, issuingCountry=GB,"
                        + " issuingStateProvince=Issuing State Province, licenseNumber=42, issueDate=2020-03-01, expirationDate"
                        + "=2020-03-01))",
                actualToStringResult);
    }

    /**
     * Method under test: {@link PartyIdentifier#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(new PartyIdentifier(), null);
        assertNotEquals(new PartyIdentifier(), "Different type to PartyIdentifier");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartyIdentifier#equals(Object)}
     *   <li>{@link PartyIdentifier#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        PartyIdentifier partyIdentifier = new PartyIdentifier();
        assertEquals(partyIdentifier, partyIdentifier);
        int expectedHashCodeResult = partyIdentifier.hashCode();
        assertEquals(expectedHashCodeResult, partyIdentifier.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartyIdentifier#equals(Object)}
     *   <li>{@link PartyIdentifier#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        PartyIdentifier partyIdentifier = new PartyIdentifier();
        PartyIdentifier partyIdentifier1 = new PartyIdentifier();
        assertEquals(partyIdentifier, partyIdentifier1);
        int expectedHashCodeResult = partyIdentifier.hashCode();
        assertEquals(expectedHashCodeResult, partyIdentifier1.hashCode());
    }

    /**
     * Method under test: {@link PartyIdentifier#equals(Object)}
     */
    @Test
    void testEquals4() {
        Passport passport = new Passport("JaneDoe", "GB", "42", "2020-03-01", "2020-03-01");

        PartyIdentifier partyIdentifier = new PartyIdentifier("42", passport, "42", "42",
                new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01", "2020-03-01"));
        assertNotEquals(partyIdentifier, new PartyIdentifier());
    }

    /**
     * Method under test: {@link PartyIdentifier#equals(Object)}
     */
    @Test
    void testEquals5() {
        PartyIdentifier partyIdentifier = new PartyIdentifier();
        Passport passport = new Passport("JaneDoe", "GB", "42", "2020-03-01", "2020-03-01");

        assertNotEquals(partyIdentifier, new PartyIdentifier("42", passport, "42", "42",
                new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01", "2020-03-01")));
    }

    /**
     * Method under test: {@link PartyIdentifier#equals(Object)}
     */
    @Test
    void testEquals6() {
        PartyIdentifier partyIdentifier = new PartyIdentifier();
        partyIdentifier.setPassport(new Passport("JaneDoe", "GB", "42", "2020-03-01", "2020-03-01"));
        assertNotEquals(partyIdentifier, new PartyIdentifier());
    }

    /**
     * Method under test: {@link PartyIdentifier#equals(Object)}
     */
    @Test
    void testEquals7() {
        PartyIdentifier partyIdentifier = new PartyIdentifier();
        partyIdentifier.setSocialSecurityNumber("42");
        assertNotEquals(partyIdentifier, new PartyIdentifier());
    }

    /**
     * Method under test: {@link PartyIdentifier#equals(Object)}
     */
    @Test
    void testEquals8() {
        PartyIdentifier partyIdentifier = new PartyIdentifier();
        partyIdentifier.setTaxIdentifierNumber("42");
        assertNotEquals(partyIdentifier, new PartyIdentifier());
    }

    /**
     * Method under test: {@link PartyIdentifier#equals(Object)}
     */
    @Test
    void testEquals9() {
        PartyIdentifier partyIdentifier = new PartyIdentifier();
        partyIdentifier.setDriverLicense(
                new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01", "2020-03-01"));
        assertNotEquals(partyIdentifier, new PartyIdentifier());
    }

    /**
     * Method under test: {@link PartyIdentifier#equals(Object)}
     */
    @Test
    void testEquals10() {
        Passport passport = mock(Passport.class);
        PartyIdentifier partyIdentifier = new PartyIdentifier("42", passport, "42", "42",
                new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01", "2020-03-01"));
        assertNotEquals(partyIdentifier, new PartyIdentifier());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartyIdentifier#equals(Object)}
     *   <li>{@link PartyIdentifier#hashCode()}
     * </ul>
     */
    @Test
    void testEquals11() {
        Passport passport = new Passport("JaneDoe", "GB", "42", "2020-03-01", "2020-03-01");

        PartyIdentifier partyIdentifier = new PartyIdentifier("42", passport, "42", "42",
                new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01", "2020-03-01"));
        Passport passport1 = new Passport("JaneDoe", "GB", "42", "2020-03-01", "2020-03-01");

        PartyIdentifier partyIdentifier1 = new PartyIdentifier("42", passport1, "42", "42",
                new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01", "2020-03-01"));

        assertEquals(partyIdentifier, partyIdentifier1);
        int expectedHashCodeResult = partyIdentifier.hashCode();
        assertEquals(expectedHashCodeResult, partyIdentifier1.hashCode());
    }

    /**
     * Method under test: {@link PartyIdentifier#equals(Object)}
     */
    @Test
    void testEquals12() {
        PartyIdentifier partyIdentifier = new PartyIdentifier();

        PartyIdentifier partyIdentifier1 = new PartyIdentifier();
        partyIdentifier1.setPassport(new Passport("JaneDoe", "GB", "42", "2020-03-01", "2020-03-01"));
        assertNotEquals(partyIdentifier, partyIdentifier1);
    }

    /**
     * Method under test: {@link PartyIdentifier#equals(Object)}
     */
    @Test
    void testEquals13() {
        PartyIdentifier partyIdentifier = new PartyIdentifier();

        PartyIdentifier partyIdentifier1 = new PartyIdentifier();
        partyIdentifier1.setSocialSecurityNumber("42");
        assertNotEquals(partyIdentifier, partyIdentifier1);
    }

    /**
     * Method under test: {@link PartyIdentifier#equals(Object)}
     */
    @Test
    void testEquals14() {
        PartyIdentifier partyIdentifier = new PartyIdentifier();

        PartyIdentifier partyIdentifier1 = new PartyIdentifier();
        partyIdentifier1.setTaxIdentifierNumber("42");
        assertNotEquals(partyIdentifier, partyIdentifier1);
    }

    /**
     * Method under test: {@link PartyIdentifier#equals(Object)}
     */
    @Test
    void testEquals15() {
        PartyIdentifier partyIdentifier = new PartyIdentifier();

        PartyIdentifier partyIdentifier1 = new PartyIdentifier();
        partyIdentifier1.setDriverLicense(
                new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01", "2020-03-01"));
        assertNotEquals(partyIdentifier, partyIdentifier1);
    }

    /**
     * Method under test: {@link PartyIdentifier#equals(Object)}
     */
    @Test
    void testEquals16() {
        PartyIdentifier partyIdentifier = new PartyIdentifier();
        partyIdentifier.setPassport(mock(Passport.class));
        assertNotEquals(partyIdentifier, new PartyIdentifier());
    }
}

