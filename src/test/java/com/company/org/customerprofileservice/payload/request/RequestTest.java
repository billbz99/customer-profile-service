package com.company.org.customerprofileservice.payload.request;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

class RequestTest {
    /**
     * Method under test: {@link Request#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new Request()).canEqual("Other"));
    }

    /**
     * Method under test: {@link Request#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        Request request = new Request();
        assertTrue(request.canEqual(new Request()));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Request#Request()}
     *   <li>{@link Request#setMandatory(Mandatory)}
     *   <li>{@link Request#setOptional(Object)}
     *   <li>{@link Request#toString()}
     *   <li>{@link Request#getMandatory()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Request actualRequest = new Request();
        Mandatory mandatory = new Mandatory();
        actualRequest.setMandatory(mandatory);
        actualRequest.setOptional("Optional");
        String actualToStringResult = actualRequest.toString();
        assertSame(mandatory, actualRequest.getMandatory());
        assertEquals(
                "Request(mandatory=Mandatory(accountNumber=null, cardNumber=null, crdbPartyIdentifier=null, primaryPhoneNumber"
                        + "=null, firstName=null, lastName=null, socialSecurityNumber=null, passportNumber=null, residentialAddress"
                        + "=null), optional=Optional)",
                actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Request#Request(Mandatory, Object)}
     *   <li>{@link Request#setMandatory(Mandatory)}
     *   <li>{@link Request#setOptional(Object)}
     *   <li>{@link Request#toString()}
     *   <li>{@link Request#getMandatory()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Mandatory mandatory = new Mandatory();
        Request actualRequest = new Request(mandatory, "Optional");
        Mandatory mandatory1 = new Mandatory();
        actualRequest.setMandatory(mandatory1);
        actualRequest.setOptional("Optional");
        String actualToStringResult = actualRequest.toString();
        Mandatory mandatory2 = actualRequest.getMandatory();
        assertSame(mandatory1, mandatory2);
        assertEquals(mandatory, mandatory2);
        assertEquals(
                "Request(mandatory=Mandatory(accountNumber=null, cardNumber=null, crdbPartyIdentifier=null, primaryPhoneNumber"
                        + "=null, firstName=null, lastName=null, socialSecurityNumber=null, passportNumber=null, residentialAddress"
                        + "=null), optional=Optional)",
                actualToStringResult);
    }

    /**
     * Method under test: {@link Request#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(new Request(), null);
        assertNotEquals(new Request(), "Different type to Request");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Request#equals(Object)}
     *   <li>{@link Request#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        Request request = new Request();
        assertEquals(request, request);
        int expectedHashCodeResult = request.hashCode();
        assertEquals(expectedHashCodeResult, request.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Request#equals(Object)}
     *   <li>{@link Request#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        Request request = new Request();
        Request request1 = new Request();
        assertEquals(request, request1);
        int expectedHashCodeResult = request.hashCode();
        assertEquals(expectedHashCodeResult, request1.hashCode());
    }

    /**
     * Method under test: {@link Request#equals(Object)}
     */
    @Test
    void testEquals4() {
        Request request = new Request(new Mandatory(), "Optional");
        assertNotEquals(request, new Request());
    }

    /**
     * Method under test: {@link Request#equals(Object)}
     */
    @Test
    void testEquals5() {
        Request request = new Request();
        assertNotEquals(request, new Request(new Mandatory(), "Optional"));
    }

    /**
     * Method under test: {@link Request#equals(Object)}
     */
    @Test
    void testEquals6() {
        Request request = new Request();
        request.setOptional("Optional");
        assertNotEquals(request, new Request());
    }

    /**
     * Method under test: {@link Request#equals(Object)}
     */
    @Test
    void testEquals7() {
        Request request = new Request(mock(Mandatory.class), "Optional");
        assertNotEquals(request, new Request());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Request#equals(Object)}
     *   <li>{@link Request#hashCode()}
     * </ul>
     */
    @Test
    void testEquals8() {
        Request request = new Request(new Mandatory(), "Optional");
        Request request1 = new Request(new Mandatory(), "Optional");

        assertEquals(request, request1);
        int expectedHashCodeResult = request.hashCode();
        assertEquals(expectedHashCodeResult, request1.hashCode());
    }

    /**
     * Method under test: {@link Request#equals(Object)}
     */
    @Test
    void testEquals9() {
        Request request = new Request();

        Request request1 = new Request();
        request1.setOptional("Optional");
        assertNotEquals(request, request1);
    }

    /**
     * Method under test: {@link Request#equals(Object)}
     */
    @Test
    void testEquals10() {
        Request request = new Request();
        request.setOptional(new Request());
        assertNotEquals(request, new Request());
    }
}

