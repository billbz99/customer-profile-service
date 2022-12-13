package com.company.org.customerprofileservice.payload.response;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class MailingAddressTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link MailingAddress#MailingAddress()}
     *   <li>{@link MailingAddress#setAddressLine1(String)}
     *   <li>{@link MailingAddress#setAddressLine2(String)}
     *   <li>{@link MailingAddress#setCity(String)}
     *   <li>{@link MailingAddress#setCountryCode(String)}
     *   <li>{@link MailingAddress#setPostalCode(String)}
     *   <li>{@link MailingAddress#setState(String)}
     *   <li>{@link MailingAddress#toString()}
     *   <li>{@link MailingAddress#getAddressLine1()}
     *   <li>{@link MailingAddress#getAddressLine2()}
     *   <li>{@link MailingAddress#getCity()}
     *   <li>{@link MailingAddress#getCountryCode()}
     *   <li>{@link MailingAddress#getPostalCode()}
     *   <li>{@link MailingAddress#getState()}
     * </ul>
     */
    @Test
    void testConstructor() {
        MailingAddress actualMailingAddress = new MailingAddress();
        actualMailingAddress.setAddressLine1("42 Main St");
        actualMailingAddress.setAddressLine2("42 Main St");
        actualMailingAddress.setCity("Oxford");
        actualMailingAddress.setCountryCode("GB");
        actualMailingAddress.setPostalCode("Postal Code");
        actualMailingAddress.setState("MD");
        String actualToStringResult = actualMailingAddress.toString();
        assertEquals("42 Main St", actualMailingAddress.getAddressLine1());
        assertEquals("42 Main St", actualMailingAddress.getAddressLine2());
        assertEquals("Oxford", actualMailingAddress.getCity());
        assertEquals("GB", actualMailingAddress.getCountryCode());
        assertEquals("Postal Code", actualMailingAddress.getPostalCode());
        assertEquals("MD", actualMailingAddress.getState());
        assertEquals(
                "MailingAddress(addressLine1=42 Main St, addressLine2=42 Main St, city=Oxford, state=MD, postalCode=Postal"
                        + " Code, countryCode=GB)",
                actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link MailingAddress#MailingAddress(String, String, String, String, String, String)}
     *   <li>{@link MailingAddress#setAddressLine1(String)}
     *   <li>{@link MailingAddress#setAddressLine2(String)}
     *   <li>{@link MailingAddress#setCity(String)}
     *   <li>{@link MailingAddress#setCountryCode(String)}
     *   <li>{@link MailingAddress#setPostalCode(String)}
     *   <li>{@link MailingAddress#setState(String)}
     *   <li>{@link MailingAddress#toString()}
     *   <li>{@link MailingAddress#getAddressLine1()}
     *   <li>{@link MailingAddress#getAddressLine2()}
     *   <li>{@link MailingAddress#getCity()}
     *   <li>{@link MailingAddress#getCountryCode()}
     *   <li>{@link MailingAddress#getPostalCode()}
     *   <li>{@link MailingAddress#getState()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        MailingAddress actualMailingAddress = new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD",
                "Postal Code", "GB");
        actualMailingAddress.setAddressLine1("42 Main St");
        actualMailingAddress.setAddressLine2("42 Main St");
        actualMailingAddress.setCity("Oxford");
        actualMailingAddress.setCountryCode("GB");
        actualMailingAddress.setPostalCode("Postal Code");
        actualMailingAddress.setState("MD");
        String actualToStringResult = actualMailingAddress.toString();
        assertEquals("42 Main St", actualMailingAddress.getAddressLine1());
        assertEquals("42 Main St", actualMailingAddress.getAddressLine2());
        assertEquals("Oxford", actualMailingAddress.getCity());
        assertEquals("GB", actualMailingAddress.getCountryCode());
        assertEquals("Postal Code", actualMailingAddress.getPostalCode());
        assertEquals("MD", actualMailingAddress.getState());
        assertEquals(
                "MailingAddress(addressLine1=42 Main St, addressLine2=42 Main St, city=Oxford, state=MD, postalCode=Postal"
                        + " Code, countryCode=GB)",
                actualToStringResult);
    }

    /**
     * Method under test: {@link MailingAddress#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"), null);
        assertNotEquals(new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"),
                "Different type to MailingAddress");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link MailingAddress#equals(Object)}
     *   <li>{@link MailingAddress#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        MailingAddress mailingAddress = new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code",
                "GB");
        assertEquals(mailingAddress, mailingAddress);
        int expectedHashCodeResult = mailingAddress.hashCode();
        assertEquals(expectedHashCodeResult, mailingAddress.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link MailingAddress#equals(Object)}
     *   <li>{@link MailingAddress#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        MailingAddress mailingAddress = new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code",
                "GB");
        MailingAddress mailingAddress1 = new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code",
                "GB");

        assertEquals(mailingAddress, mailingAddress1);
        int expectedHashCodeResult = mailingAddress.hashCode();
        assertEquals(expectedHashCodeResult, mailingAddress1.hashCode());
    }

    /**
     * Method under test: {@link MailingAddress#equals(Object)}
     */
    @Test
    void testEquals4() {
        MailingAddress mailingAddress = new MailingAddress("Oxford", "42 Main St", "Oxford", "MD", "Postal Code", "GB");
        assertNotEquals(mailingAddress,
                new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
    }

    /**
     * Method under test: {@link MailingAddress#equals(Object)}
     */
    @Test
    void testEquals5() {
        MailingAddress mailingAddress = new MailingAddress(null, "42 Main St", "Oxford", "MD", "Postal Code", "GB");
        assertNotEquals(mailingAddress,
                new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
    }

    /**
     * Method under test: {@link MailingAddress#equals(Object)}
     */
    @Test
    void testEquals6() {
        MailingAddress mailingAddress = new MailingAddress("42 Main St", "Oxford", "Oxford", "MD", "Postal Code", "GB");
        assertNotEquals(mailingAddress,
                new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
    }

    /**
     * Method under test: {@link MailingAddress#equals(Object)}
     */
    @Test
    void testEquals7() {
        MailingAddress mailingAddress = new MailingAddress("42 Main St", null, "Oxford", "MD", "Postal Code", "GB");
        assertNotEquals(mailingAddress,
                new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
    }

    /**
     * Method under test: {@link MailingAddress#equals(Object)}
     */
    @Test
    void testEquals8() {
        MailingAddress mailingAddress = new MailingAddress("42 Main St", "42 Main St", "42 Main St", "MD", "Postal Code",
                "GB");
        assertNotEquals(mailingAddress,
                new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
    }

    /**
     * Method under test: {@link MailingAddress#equals(Object)}
     */
    @Test
    void testEquals9() {
        MailingAddress mailingAddress = new MailingAddress("42 Main St", "42 Main St", null, "MD", "Postal Code", "GB");
        assertNotEquals(mailingAddress,
                new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
    }

    /**
     * Method under test: {@link MailingAddress#equals(Object)}
     */
    @Test
    void testEquals10() {
        MailingAddress mailingAddress = new MailingAddress("42 Main St", "42 Main St", "Oxford", "42 Main St",
                "Postal Code", "GB");
        assertNotEquals(mailingAddress,
                new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
    }

    /**
     * Method under test: {@link MailingAddress#equals(Object)}
     */
    @Test
    void testEquals11() {
        MailingAddress mailingAddress = new MailingAddress("42 Main St", "42 Main St", "Oxford", null, "Postal Code",
                "GB");
        assertNotEquals(mailingAddress,
                new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
    }

    /**
     * Method under test: {@link MailingAddress#equals(Object)}
     */
    @Test
    void testEquals12() {
        MailingAddress mailingAddress = new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "42 Main St",
                "GB");
        assertNotEquals(mailingAddress,
                new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
    }

    /**
     * Method under test: {@link MailingAddress#equals(Object)}
     */
    @Test
    void testEquals13() {
        MailingAddress mailingAddress = new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", null, "GB");
        assertNotEquals(mailingAddress,
                new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
    }

    /**
     * Method under test: {@link MailingAddress#equals(Object)}
     */
    @Test
    void testEquals14() {
        MailingAddress mailingAddress = new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code",
                "GBR");
        assertNotEquals(mailingAddress,
                new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
    }

    /**
     * Method under test: {@link MailingAddress#equals(Object)}
     */
    @Test
    void testEquals15() {
        MailingAddress mailingAddress = new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code",
                null);
        assertNotEquals(mailingAddress,
                new MailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link MailingAddress#equals(Object)}
     *   <li>{@link MailingAddress#hashCode()}
     * </ul>
     */
    @Test
    void testEquals16() {
        MailingAddress mailingAddress = new MailingAddress(null, "42 Main St", "Oxford", "MD", "Postal Code", "GB");
        MailingAddress mailingAddress1 = new MailingAddress(null, "42 Main St", "Oxford", "MD", "Postal Code", "GB");

        assertEquals(mailingAddress, mailingAddress1);
        int expectedHashCodeResult = mailingAddress.hashCode();
        assertEquals(expectedHashCodeResult, mailingAddress1.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link MailingAddress#equals(Object)}
     *   <li>{@link MailingAddress#hashCode()}
     * </ul>
     */
    @Test
    void testEquals17() {
        MailingAddress mailingAddress = new MailingAddress("42 Main St", null, "Oxford", "MD", "Postal Code", "GB");
        MailingAddress mailingAddress1 = new MailingAddress("42 Main St", null, "Oxford", "MD", "Postal Code", "GB");

        assertEquals(mailingAddress, mailingAddress1);
        int expectedHashCodeResult = mailingAddress.hashCode();
        assertEquals(expectedHashCodeResult, mailingAddress1.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link MailingAddress#equals(Object)}
     *   <li>{@link MailingAddress#hashCode()}
     * </ul>
     */
    @Test
    void testEquals18() {
        MailingAddress mailingAddress = new MailingAddress("42 Main St", "42 Main St", null, "MD", "Postal Code", "GB");
        MailingAddress mailingAddress1 = new MailingAddress("42 Main St", "42 Main St", null, "MD", "Postal Code", "GB");

        assertEquals(mailingAddress, mailingAddress1);
        int expectedHashCodeResult = mailingAddress.hashCode();
        assertEquals(expectedHashCodeResult, mailingAddress1.hashCode());
    }
}

