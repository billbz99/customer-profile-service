package com.company.org.customerprofileservice.payload.response;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DriverLicenseTest {
    /**
     * Method under test: {@link DriverLicense#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01", "2020-03-01"))
                .canEqual("Other"));
    }

    /**
     * Method under test: {@link DriverLicense#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        DriverLicense driverLicense = new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01",
                "2020-03-01");
        assertTrue(driverLicense
                .canEqual(new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01", "2020-03-01")));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link DriverLicense#DriverLicense()}
     *   <li>{@link DriverLicense#setExpirationDate(String)}
     *   <li>{@link DriverLicense#setIssueDate(String)}
     *   <li>{@link DriverLicense#setIssuingAuthority(String)}
     *   <li>{@link DriverLicense#setIssuingCountry(String)}
     *   <li>{@link DriverLicense#setIssuingStateProvince(String)}
     *   <li>{@link DriverLicense#setLicenseNumber(String)}
     *   <li>{@link DriverLicense#toString()}
     *   <li>{@link DriverLicense#getExpirationDate()}
     *   <li>{@link DriverLicense#getIssueDate()}
     *   <li>{@link DriverLicense#getIssuingAuthority()}
     *   <li>{@link DriverLicense#getIssuingCountry()}
     *   <li>{@link DriverLicense#getIssuingStateProvince()}
     *   <li>{@link DriverLicense#getLicenseNumber()}
     * </ul>
     */
    @Test
    void testConstructor() {
        DriverLicense actualDriverLicense = new DriverLicense();
        actualDriverLicense.setExpirationDate("2020-03-01");
        actualDriverLicense.setIssueDate("2020-03-01");
        actualDriverLicense.setIssuingAuthority("JaneDoe");
        actualDriverLicense.setIssuingCountry("GB");
        actualDriverLicense.setIssuingStateProvince("Issuing State Province");
        actualDriverLicense.setLicenseNumber("42");
        String actualToStringResult = actualDriverLicense.toString();
        assertEquals("2020-03-01", actualDriverLicense.getExpirationDate());
        assertEquals("2020-03-01", actualDriverLicense.getIssueDate());
        assertEquals("JaneDoe", actualDriverLicense.getIssuingAuthority());
        assertEquals("GB", actualDriverLicense.getIssuingCountry());
        assertEquals("Issuing State Province", actualDriverLicense.getIssuingStateProvince());
        assertEquals("42", actualDriverLicense.getLicenseNumber());
        assertEquals(
                "DriverLicense(issuingAuthority=JaneDoe, issuingCountry=GB, issuingStateProvince=Issuing State Province,"
                        + " licenseNumber=42, issueDate=2020-03-01, expirationDate=2020-03-01)",
                actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link DriverLicense#DriverLicense(String, String, String, String, String, String)}
     *   <li>{@link DriverLicense#setExpirationDate(String)}
     *   <li>{@link DriverLicense#setIssueDate(String)}
     *   <li>{@link DriverLicense#setIssuingAuthority(String)}
     *   <li>{@link DriverLicense#setIssuingCountry(String)}
     *   <li>{@link DriverLicense#setIssuingStateProvince(String)}
     *   <li>{@link DriverLicense#setLicenseNumber(String)}
     *   <li>{@link DriverLicense#toString()}
     *   <li>{@link DriverLicense#getExpirationDate()}
     *   <li>{@link DriverLicense#getIssueDate()}
     *   <li>{@link DriverLicense#getIssuingAuthority()}
     *   <li>{@link DriverLicense#getIssuingCountry()}
     *   <li>{@link DriverLicense#getIssuingStateProvince()}
     *   <li>{@link DriverLicense#getLicenseNumber()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        DriverLicense actualDriverLicense = new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42",
                "2020-03-01", "2020-03-01");
        actualDriverLicense.setExpirationDate("2020-03-01");
        actualDriverLicense.setIssueDate("2020-03-01");
        actualDriverLicense.setIssuingAuthority("JaneDoe");
        actualDriverLicense.setIssuingCountry("GB");
        actualDriverLicense.setIssuingStateProvince("Issuing State Province");
        actualDriverLicense.setLicenseNumber("42");
        String actualToStringResult = actualDriverLicense.toString();
        assertEquals("2020-03-01", actualDriverLicense.getExpirationDate());
        assertEquals("2020-03-01", actualDriverLicense.getIssueDate());
        assertEquals("JaneDoe", actualDriverLicense.getIssuingAuthority());
        assertEquals("GB", actualDriverLicense.getIssuingCountry());
        assertEquals("Issuing State Province", actualDriverLicense.getIssuingStateProvince());
        assertEquals("42", actualDriverLicense.getLicenseNumber());
        assertEquals(
                "DriverLicense(issuingAuthority=JaneDoe, issuingCountry=GB, issuingStateProvince=Issuing State Province,"
                        + " licenseNumber=42, issueDate=2020-03-01, expirationDate=2020-03-01)",
                actualToStringResult);
    }

    /**
     * Method under test: {@link DriverLicense#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01", "2020-03-01"),
                null);
        assertNotEquals(new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01", "2020-03-01"),
                "Different type to DriverLicense");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link DriverLicense#equals(Object)}
     *   <li>{@link DriverLicense#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        DriverLicense driverLicense = new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01",
                "2020-03-01");
        assertEquals(driverLicense, driverLicense);
        int expectedHashCodeResult = driverLicense.hashCode();
        assertEquals(expectedHashCodeResult, driverLicense.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link DriverLicense#equals(Object)}
     *   <li>{@link DriverLicense#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        DriverLicense driverLicense = new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01",
                "2020-03-01");
        DriverLicense driverLicense1 = new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01",
                "2020-03-01");

        assertEquals(driverLicense, driverLicense1);
        int expectedHashCodeResult = driverLicense.hashCode();
        assertEquals(expectedHashCodeResult, driverLicense1.hashCode());
    }

    /**
     * Method under test: {@link DriverLicense#equals(Object)}
     */
    @Test
    void testEquals4() {
        DriverLicense driverLicense = new DriverLicense("GB", "GB", "Issuing State Province", "42", "2020-03-01",
                "2020-03-01");
        assertNotEquals(driverLicense,
                new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01", "2020-03-01"));
    }

    /**
     * Method under test: {@link DriverLicense#equals(Object)}
     */
    @Test
    void testEquals5() {
        DriverLicense driverLicense = new DriverLicense(null, "GB", "Issuing State Province", "42", "2020-03-01",
                "2020-03-01");
        assertNotEquals(driverLicense,
                new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01", "2020-03-01"));
    }

    /**
     * Method under test: {@link DriverLicense#equals(Object)}
     */
    @Test
    void testEquals6() {
        DriverLicense driverLicense = new DriverLicense("JaneDoe", "GBR", "Issuing State Province", "42", "2020-03-01",
                "2020-03-01");
        assertNotEquals(driverLicense,
                new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01", "2020-03-01"));
    }

    /**
     * Method under test: {@link DriverLicense#equals(Object)}
     */
    @Test
    void testEquals7() {
        DriverLicense driverLicense = new DriverLicense("JaneDoe", null, "Issuing State Province", "42", "2020-03-01",
                "2020-03-01");
        assertNotEquals(driverLicense,
                new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01", "2020-03-01"));
    }

    /**
     * Method under test: {@link DriverLicense#equals(Object)}
     */
    @Test
    void testEquals8() {
        DriverLicense driverLicense = new DriverLicense("JaneDoe", "GB", "JaneDoe", "42", "2020-03-01", "2020-03-01");
        assertNotEquals(driverLicense,
                new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01", "2020-03-01"));
    }

    /**
     * Method under test: {@link DriverLicense#equals(Object)}
     */
    @Test
    void testEquals9() {
        DriverLicense driverLicense = new DriverLicense("JaneDoe", "GB", null, "42", "2020-03-01", "2020-03-01");
        assertNotEquals(driverLicense,
                new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01", "2020-03-01"));
    }

    /**
     * Method under test: {@link DriverLicense#equals(Object)}
     */
    @Test
    void testEquals10() {
        DriverLicense driverLicense = new DriverLicense("JaneDoe", "GB", "Issuing State Province", "JaneDoe",
                "2020-03-01", "2020-03-01");
        assertNotEquals(driverLicense,
                new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01", "2020-03-01"));
    }

    /**
     * Method under test: {@link DriverLicense#equals(Object)}
     */
    @Test
    void testEquals11() {
        DriverLicense driverLicense = new DriverLicense("JaneDoe", "GB", "Issuing State Province", null, "2020-03-01",
                "2020-03-01");
        assertNotEquals(driverLicense,
                new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01", "2020-03-01"));
    }

    /**
     * Method under test: {@link DriverLicense#equals(Object)}
     */
    @Test
    void testEquals12() {
        DriverLicense driverLicense = new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020/03/01",
                "2020-03-01");
        assertNotEquals(driverLicense,
                new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01", "2020-03-01"));
    }

    /**
     * Method under test: {@link DriverLicense#equals(Object)}
     */
    @Test
    void testEquals13() {
        DriverLicense driverLicense = new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", null,
                "2020-03-01");
        assertNotEquals(driverLicense,
                new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01", "2020-03-01"));
    }

    /**
     * Method under test: {@link DriverLicense#equals(Object)}
     */
    @Test
    void testEquals14() {
        DriverLicense driverLicense = new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01",
                "2020/03/01");
        assertNotEquals(driverLicense,
                new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01", "2020-03-01"));
    }

    /**
     * Method under test: {@link DriverLicense#equals(Object)}
     */
    @Test
    void testEquals15() {
        DriverLicense driverLicense = new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01",
                null);
        assertNotEquals(driverLicense,
                new DriverLicense("JaneDoe", "GB", "Issuing State Province", "42", "2020-03-01", "2020-03-01"));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link DriverLicense#equals(Object)}
     *   <li>{@link DriverLicense#hashCode()}
     * </ul>
     */
    @Test
    void testEquals16() {
        DriverLicense driverLicense = new DriverLicense(null, "GB", "Issuing State Province", "42", "2020-03-01",
                "2020-03-01");
        DriverLicense driverLicense1 = new DriverLicense(null, "GB", "Issuing State Province", "42", "2020-03-01",
                "2020-03-01");

        assertEquals(driverLicense, driverLicense1);
        int expectedHashCodeResult = driverLicense.hashCode();
        assertEquals(expectedHashCodeResult, driverLicense1.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link DriverLicense#equals(Object)}
     *   <li>{@link DriverLicense#hashCode()}
     * </ul>
     */
    @Test
    void testEquals17() {
        DriverLicense driverLicense = new DriverLicense("JaneDoe", null, "Issuing State Province", "42", "2020-03-01",
                "2020-03-01");
        DriverLicense driverLicense1 = new DriverLicense("JaneDoe", null, "Issuing State Province", "42", "2020-03-01",
                "2020-03-01");

        assertEquals(driverLicense, driverLicense1);
        int expectedHashCodeResult = driverLicense.hashCode();
        assertEquals(expectedHashCodeResult, driverLicense1.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link DriverLicense#equals(Object)}
     *   <li>{@link DriverLicense#hashCode()}
     * </ul>
     */
    @Test
    void testEquals18() {
        DriverLicense driverLicense = new DriverLicense("JaneDoe", "GB", null, "42", "2020-03-01", "2020-03-01");
        DriverLicense driverLicense1 = new DriverLicense("JaneDoe", "GB", null, "42", "2020-03-01", "2020-03-01");

        assertEquals(driverLicense, driverLicense1);
        int expectedHashCodeResult = driverLicense.hashCode();
        assertEquals(expectedHashCodeResult, driverLicense1.hashCode());
    }
}

