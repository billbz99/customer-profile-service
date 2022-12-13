package com.company.org.customerprofileservice.payload.response;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class EmployerMailingAddressTest {
    /**
     * Method under test: {@link EmployerMailingAddress#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"))
                .canEqual("Other"));
    }

    /**
     * Method under test: {@link EmployerMailingAddress#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        EmployerMailingAddress employerMailingAddress = new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford",
                "MD", "Postal Code", "GB");
        assertTrue(employerMailingAddress
                .canEqual(new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB")));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link EmployerMailingAddress#EmployerMailingAddress()}
     *   <li>{@link EmployerMailingAddress#setAddressLine1(String)}
     *   <li>{@link EmployerMailingAddress#setAddressLine2(String)}
     *   <li>{@link EmployerMailingAddress#setCity(String)}
     *   <li>{@link EmployerMailingAddress#setCountryCode(String)}
     *   <li>{@link EmployerMailingAddress#setPostalCode(String)}
     *   <li>{@link EmployerMailingAddress#setState(String)}
     *   <li>{@link EmployerMailingAddress#toString()}
     *   <li>{@link EmployerMailingAddress#getAddressLine1()}
     *   <li>{@link EmployerMailingAddress#getAddressLine2()}
     *   <li>{@link EmployerMailingAddress#getCity()}
     *   <li>{@link EmployerMailingAddress#getCountryCode()}
     *   <li>{@link EmployerMailingAddress#getPostalCode()}
     *   <li>{@link EmployerMailingAddress#getState()}
     * </ul>
     */
    @Test
    void testConstructor() {
        EmployerMailingAddress actualEmployerMailingAddress = new EmployerMailingAddress();
        actualEmployerMailingAddress.setAddressLine1("42 Main St");
        actualEmployerMailingAddress.setAddressLine2("42 Main St");
        actualEmployerMailingAddress.setCity("Oxford");
        actualEmployerMailingAddress.setCountryCode("GB");
        actualEmployerMailingAddress.setPostalCode("Postal Code");
        actualEmployerMailingAddress.setState("MD");
        String actualToStringResult = actualEmployerMailingAddress.toString();
        assertEquals("42 Main St", actualEmployerMailingAddress.getAddressLine1());
        assertEquals("42 Main St", actualEmployerMailingAddress.getAddressLine2());
        assertEquals("Oxford", actualEmployerMailingAddress.getCity());
        assertEquals("GB", actualEmployerMailingAddress.getCountryCode());
        assertEquals("Postal Code", actualEmployerMailingAddress.getPostalCode());
        assertEquals("MD", actualEmployerMailingAddress.getState());
        assertEquals("EmployerMailingAddress(addressLine1=42 Main St, addressLine2=42 Main St, city=Oxford, state=MD,"
                + " postalCode=Postal Code, countryCode=GB)", actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link EmployerMailingAddress#EmployerMailingAddress(String, String, String, String, String, String)}
     *   <li>{@link EmployerMailingAddress#setAddressLine1(String)}
     *   <li>{@link EmployerMailingAddress#setAddressLine2(String)}
     *   <li>{@link EmployerMailingAddress#setCity(String)}
     *   <li>{@link EmployerMailingAddress#setCountryCode(String)}
     *   <li>{@link EmployerMailingAddress#setPostalCode(String)}
     *   <li>{@link EmployerMailingAddress#setState(String)}
     *   <li>{@link EmployerMailingAddress#toString()}
     *   <li>{@link EmployerMailingAddress#getAddressLine1()}
     *   <li>{@link EmployerMailingAddress#getAddressLine2()}
     *   <li>{@link EmployerMailingAddress#getCity()}
     *   <li>{@link EmployerMailingAddress#getCountryCode()}
     *   <li>{@link EmployerMailingAddress#getPostalCode()}
     *   <li>{@link EmployerMailingAddress#getState()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        EmployerMailingAddress actualEmployerMailingAddress = new EmployerMailingAddress("42 Main St", "42 Main St",
                "Oxford", "MD", "Postal Code", "GB");
        actualEmployerMailingAddress.setAddressLine1("42 Main St");
        actualEmployerMailingAddress.setAddressLine2("42 Main St");
        actualEmployerMailingAddress.setCity("Oxford");
        actualEmployerMailingAddress.setCountryCode("GB");
        actualEmployerMailingAddress.setPostalCode("Postal Code");
        actualEmployerMailingAddress.setState("MD");
        String actualToStringResult = actualEmployerMailingAddress.toString();
        assertEquals("42 Main St", actualEmployerMailingAddress.getAddressLine1());
        assertEquals("42 Main St", actualEmployerMailingAddress.getAddressLine2());
        assertEquals("Oxford", actualEmployerMailingAddress.getCity());
        assertEquals("GB", actualEmployerMailingAddress.getCountryCode());
        assertEquals("Postal Code", actualEmployerMailingAddress.getPostalCode());
        assertEquals("MD", actualEmployerMailingAddress.getState());
        assertEquals("EmployerMailingAddress(addressLine1=42 Main St, addressLine2=42 Main St, city=Oxford, state=MD,"
                + " postalCode=Postal Code, countryCode=GB)", actualToStringResult);
    }

    /**
     * Method under test: {@link EmployerMailingAddress#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"),
                null);
        assertNotEquals(new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"),
                "Different type to EmployerMailingAddress");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link EmployerMailingAddress#equals(Object)}
     *   <li>{@link EmployerMailingAddress#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        EmployerMailingAddress employerMailingAddress = new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford",
                "MD", "Postal Code", "GB");
        assertEquals(employerMailingAddress, employerMailingAddress);
        int expectedHashCodeResult = employerMailingAddress.hashCode();
        assertEquals(expectedHashCodeResult, employerMailingAddress.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link EmployerMailingAddress#equals(Object)}
     *   <li>{@link EmployerMailingAddress#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        EmployerMailingAddress employerMailingAddress = new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford",
                "MD", "Postal Code", "GB");
        EmployerMailingAddress employerMailingAddress1 = new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford",
                "MD", "Postal Code", "GB");

        assertEquals(employerMailingAddress, employerMailingAddress1);
        int expectedHashCodeResult = employerMailingAddress.hashCode();
        assertEquals(expectedHashCodeResult, employerMailingAddress1.hashCode());
    }

    /**
     * Method under test: {@link EmployerMailingAddress#equals(Object)}
     */
    @Test
    void testEquals4() {
        EmployerMailingAddress employerMailingAddress = new EmployerMailingAddress("Oxford", "42 Main St", "Oxford", "MD",
                "Postal Code", "GB");
        assertNotEquals(employerMailingAddress,
                new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
    }

    /**
     * Method under test: {@link EmployerMailingAddress#equals(Object)}
     */
    @Test
    void testEquals5() {
        EmployerMailingAddress employerMailingAddress = new EmployerMailingAddress(null, "42 Main St", "Oxford", "MD",
                "Postal Code", "GB");
        assertNotEquals(employerMailingAddress,
                new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
    }

    /**
     * Method under test: {@link EmployerMailingAddress#equals(Object)}
     */
    @Test
    void testEquals6() {
        EmployerMailingAddress employerMailingAddress = new EmployerMailingAddress("42 Main St", "Oxford", "Oxford", "MD",
                "Postal Code", "GB");
        assertNotEquals(employerMailingAddress,
                new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
    }

    /**
     * Method under test: {@link EmployerMailingAddress#equals(Object)}
     */
    @Test
    void testEquals7() {
        EmployerMailingAddress employerMailingAddress = new EmployerMailingAddress("42 Main St", null, "Oxford", "MD",
                "Postal Code", "GB");
        assertNotEquals(employerMailingAddress,
                new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
    }

    /**
     * Method under test: {@link EmployerMailingAddress#equals(Object)}
     */
    @Test
    void testEquals8() {
        EmployerMailingAddress employerMailingAddress = new EmployerMailingAddress("42 Main St", "42 Main St",
                "42 Main St", "MD", "Postal Code", "GB");
        assertNotEquals(employerMailingAddress,
                new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
    }

    /**
     * Method under test: {@link EmployerMailingAddress#equals(Object)}
     */
    @Test
    void testEquals9() {
        EmployerMailingAddress employerMailingAddress = new EmployerMailingAddress("42 Main St", "42 Main St", null, "MD",
                "Postal Code", "GB");
        assertNotEquals(employerMailingAddress,
                new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
    }

    /**
     * Method under test: {@link EmployerMailingAddress#equals(Object)}
     */
    @Test
    void testEquals10() {
        EmployerMailingAddress employerMailingAddress = new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford",
                "42 Main St", "Postal Code", "GB");
        assertNotEquals(employerMailingAddress,
                new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
    }

    /**
     * Method under test: {@link EmployerMailingAddress#equals(Object)}
     */
    @Test
    void testEquals11() {
        EmployerMailingAddress employerMailingAddress = new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford",
                null, "Postal Code", "GB");
        assertNotEquals(employerMailingAddress,
                new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
    }

    /**
     * Method under test: {@link EmployerMailingAddress#equals(Object)}
     */
    @Test
    void testEquals12() {
        EmployerMailingAddress employerMailingAddress = new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford",
                "MD", "42 Main St", "GB");
        assertNotEquals(employerMailingAddress,
                new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
    }

    /**
     * Method under test: {@link EmployerMailingAddress#equals(Object)}
     */
    @Test
    void testEquals13() {
        EmployerMailingAddress employerMailingAddress = new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford",
                "MD", null, "GB");
        assertNotEquals(employerMailingAddress,
                new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
    }

    /**
     * Method under test: {@link EmployerMailingAddress#equals(Object)}
     */
    @Test
    void testEquals14() {
        EmployerMailingAddress employerMailingAddress = new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford",
                "MD", "Postal Code", "GBR");
        assertNotEquals(employerMailingAddress,
                new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
    }

    /**
     * Method under test: {@link EmployerMailingAddress#equals(Object)}
     */
    @Test
    void testEquals15() {
        EmployerMailingAddress employerMailingAddress = new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford",
                "MD", "Postal Code", null);
        assertNotEquals(employerMailingAddress,
                new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link EmployerMailingAddress#equals(Object)}
     *   <li>{@link EmployerMailingAddress#hashCode()}
     * </ul>
     */
    @Test
    void testEquals16() {
        EmployerMailingAddress employerMailingAddress = new EmployerMailingAddress(null, "42 Main St", "Oxford", "MD",
                "Postal Code", "GB");
        EmployerMailingAddress employerMailingAddress1 = new EmployerMailingAddress(null, "42 Main St", "Oxford", "MD",
                "Postal Code", "GB");

        assertEquals(employerMailingAddress, employerMailingAddress1);
        int expectedHashCodeResult = employerMailingAddress.hashCode();
        assertEquals(expectedHashCodeResult, employerMailingAddress1.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link EmployerMailingAddress#equals(Object)}
     *   <li>{@link EmployerMailingAddress#hashCode()}
     * </ul>
     */
    @Test
    void testEquals17() {
        EmployerMailingAddress employerMailingAddress = new EmployerMailingAddress("42 Main St", null, "Oxford", "MD",
                "Postal Code", "GB");
        EmployerMailingAddress employerMailingAddress1 = new EmployerMailingAddress("42 Main St", null, "Oxford", "MD",
                "Postal Code", "GB");

        assertEquals(employerMailingAddress, employerMailingAddress1);
        int expectedHashCodeResult = employerMailingAddress.hashCode();
        assertEquals(expectedHashCodeResult, employerMailingAddress1.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link EmployerMailingAddress#equals(Object)}
     *   <li>{@link EmployerMailingAddress#hashCode()}
     * </ul>
     */
    @Test
    void testEquals18() {
        EmployerMailingAddress employerMailingAddress = new EmployerMailingAddress("42 Main St", "42 Main St", null, "MD",
                "Postal Code", "GB");
        EmployerMailingAddress employerMailingAddress1 = new EmployerMailingAddress("42 Main St", "42 Main St", null,
                "MD", "Postal Code", "GB");

        assertEquals(employerMailingAddress, employerMailingAddress1);
        int expectedHashCodeResult = employerMailingAddress.hashCode();
        assertEquals(expectedHashCodeResult, employerMailingAddress1.hashCode());
    }
}

