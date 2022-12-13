package com.company.org.customerprofileservice.payload.request;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

class CustomerProfileRequestTest {
    /**
     * Method under test: {@link CustomerProfileRequest#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new CustomerProfileRequest()).canEqual("Other"));
    }

    /**
     * Method under test: {@link CustomerProfileRequest#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        CustomerProfileRequest customerProfileRequest = new CustomerProfileRequest();
        assertTrue(customerProfileRequest.canEqual(new CustomerProfileRequest()));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link CustomerProfileRequest#CustomerProfileRequest()}
     *   <li>{@link CustomerProfileRequest#setAccountNumber(String)}
     *   <li>{@link CustomerProfileRequest#setCardNumber(String)}
     *   <li>{@link CustomerProfileRequest#setCrdbPartyIdentifier(String)}
     *   <li>{@link CustomerProfileRequest#setHeader(Header)}
     *   <li>{@link CustomerProfileRequest#setPayload(PayLoad)}
     *   <li>{@link CustomerProfileRequest#toString()}
     *   <li>{@link CustomerProfileRequest#getAccountNumber()}
     *   <li>{@link CustomerProfileRequest#getCardNumber()}
     *   <li>{@link CustomerProfileRequest#getCrdbPartyIdentifier()}
     *   <li>{@link CustomerProfileRequest#getHeader()}
     *   <li>{@link CustomerProfileRequest#getPayload()}
     * </ul>
     */
    @Test
    void testConstructor() {
        CustomerProfileRequest actualCustomerProfileRequest = new CustomerProfileRequest();
        actualCustomerProfileRequest.setAccountNumber("42");
        actualCustomerProfileRequest.setCardNumber("42");
        actualCustomerProfileRequest.setCrdbPartyIdentifier("42");
        Header header = new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42");

        actualCustomerProfileRequest.setHeader(header);
        PayLoad payLoad = new PayLoad();
        actualCustomerProfileRequest.setPayload(payLoad);
        String actualToStringResult = actualCustomerProfileRequest.toString();
        assertEquals("42", actualCustomerProfileRequest.getAccountNumber());
        assertEquals("42", actualCustomerProfileRequest.getCardNumber());
        assertEquals("42", actualCustomerProfileRequest.getCrdbPartyIdentifier());
        assertSame(header, actualCustomerProfileRequest.getHeader());
        assertSame(payLoad, actualCustomerProfileRequest.getPayload());
        assertEquals(
                "CustomerProfileRequest(crdbPartyIdentifier=42, accountNumber=42, cardNumber=42, header=Header(correlationID"
                        + "=1, requestId=42, createdTimestamp=1, createdBy=Jan 1, 2020 8:00am GMT+0100, requestedBy=Requested By,"
                        + " eventId=42, eventInstanceId=42), payload=PayLoad(action=null, request=null))",
                actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link CustomerProfileRequest#CustomerProfileRequest(String, String, String, Header, PayLoad)}
     *   <li>{@link CustomerProfileRequest#setAccountNumber(String)}
     *   <li>{@link CustomerProfileRequest#setCardNumber(String)}
     *   <li>{@link CustomerProfileRequest#setCrdbPartyIdentifier(String)}
     *   <li>{@link CustomerProfileRequest#setHeader(Header)}
     *   <li>{@link CustomerProfileRequest#setPayload(PayLoad)}
     *   <li>{@link CustomerProfileRequest#toString()}
     *   <li>{@link CustomerProfileRequest#getAccountNumber()}
     *   <li>{@link CustomerProfileRequest#getCardNumber()}
     *   <li>{@link CustomerProfileRequest#getCrdbPartyIdentifier()}
     *   <li>{@link CustomerProfileRequest#getHeader()}
     *   <li>{@link CustomerProfileRequest#getPayload()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Header header = new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42");

        PayLoad payLoad = new PayLoad();
        CustomerProfileRequest actualCustomerProfileRequest = new CustomerProfileRequest("42", "42", "42", header,
                payLoad);
        actualCustomerProfileRequest.setAccountNumber("42");
        actualCustomerProfileRequest.setCardNumber("42");
        actualCustomerProfileRequest.setCrdbPartyIdentifier("42");
        Header header1 = new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42");

        actualCustomerProfileRequest.setHeader(header1);
        PayLoad payLoad1 = new PayLoad();
        actualCustomerProfileRequest.setPayload(payLoad1);
        String actualToStringResult = actualCustomerProfileRequest.toString();
        assertEquals("42", actualCustomerProfileRequest.getAccountNumber());
        assertEquals("42", actualCustomerProfileRequest.getCardNumber());
        assertEquals("42", actualCustomerProfileRequest.getCrdbPartyIdentifier());
        Header header2 = actualCustomerProfileRequest.getHeader();
        assertSame(header1, header2);
        assertEquals(header, header2);
        PayLoad payload = actualCustomerProfileRequest.getPayload();
        assertSame(payLoad1, payload);
        assertEquals(payLoad, payload);
        assertEquals(
                "CustomerProfileRequest(crdbPartyIdentifier=42, accountNumber=42, cardNumber=42, header=Header(correlationID"
                        + "=1, requestId=42, createdTimestamp=1, createdBy=Jan 1, 2020 8:00am GMT+0100, requestedBy=Requested By,"
                        + " eventId=42, eventInstanceId=42), payload=PayLoad(action=null, request=null))",
                actualToStringResult);
    }

    /**
     * Method under test: {@link CustomerProfileRequest#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(new CustomerProfileRequest(), null);
        assertNotEquals(new CustomerProfileRequest(), "Different type to CustomerProfileRequest");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link CustomerProfileRequest#equals(Object)}
     *   <li>{@link CustomerProfileRequest#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        CustomerProfileRequest customerProfileRequest = new CustomerProfileRequest();
        assertEquals(customerProfileRequest, customerProfileRequest);
        int expectedHashCodeResult = customerProfileRequest.hashCode();
        assertEquals(expectedHashCodeResult, customerProfileRequest.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link CustomerProfileRequest#equals(Object)}
     *   <li>{@link CustomerProfileRequest#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        CustomerProfileRequest customerProfileRequest = new CustomerProfileRequest();
        CustomerProfileRequest customerProfileRequest1 = new CustomerProfileRequest();
        assertEquals(customerProfileRequest, customerProfileRequest1);
        int expectedHashCodeResult = customerProfileRequest.hashCode();
        assertEquals(expectedHashCodeResult, customerProfileRequest1.hashCode());
    }

    /**
     * Method under test: {@link CustomerProfileRequest#equals(Object)}
     */
    @Test
    void testEquals4() {
        Header header = new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42");

        CustomerProfileRequest customerProfileRequest = new CustomerProfileRequest("42", "42", "42", header,
                new PayLoad());
        assertNotEquals(customerProfileRequest, new CustomerProfileRequest());
    }

    /**
     * Method under test: {@link CustomerProfileRequest#equals(Object)}
     */
    @Test
    void testEquals5() {
        CustomerProfileRequest customerProfileRequest = new CustomerProfileRequest();
        Header header = new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42");

        assertNotEquals(customerProfileRequest, new CustomerProfileRequest("42", "42", "42", header, new PayLoad()));
    }

    /**
     * Method under test: {@link CustomerProfileRequest#equals(Object)}
     */
    @Test
    void testEquals6() {
        CustomerProfileRequest customerProfileRequest = new CustomerProfileRequest();
        customerProfileRequest.setAccountNumber("42");
        assertNotEquals(customerProfileRequest, new CustomerProfileRequest());
    }

    /**
     * Method under test: {@link CustomerProfileRequest#equals(Object)}
     */
    @Test
    void testEquals7() {
        CustomerProfileRequest customerProfileRequest = new CustomerProfileRequest();
        customerProfileRequest.setCardNumber("42");
        assertNotEquals(customerProfileRequest, new CustomerProfileRequest());
    }

    /**
     * Method under test: {@link CustomerProfileRequest#equals(Object)}
     */
    @Test
    void testEquals8() {
        CustomerProfileRequest customerProfileRequest = new CustomerProfileRequest();
        customerProfileRequest
                .setHeader(new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42"));
        assertNotEquals(customerProfileRequest, new CustomerProfileRequest());
    }

    /**
     * Method under test: {@link CustomerProfileRequest#equals(Object)}
     */
    @Test
    void testEquals9() {
        CustomerProfileRequest customerProfileRequest = new CustomerProfileRequest();
        customerProfileRequest.setPayload(new PayLoad());
        assertNotEquals(customerProfileRequest, new CustomerProfileRequest());
    }

    /**
     * Method under test: {@link CustomerProfileRequest#equals(Object)}
     */
    @Test
    void testEquals10() {
        Header header = mock(Header.class);
        CustomerProfileRequest customerProfileRequest = new CustomerProfileRequest("42", "42", "42", header,
                new PayLoad());
        assertNotEquals(customerProfileRequest, new CustomerProfileRequest());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link CustomerProfileRequest#equals(Object)}
     *   <li>{@link CustomerProfileRequest#hashCode()}
     * </ul>
     */
    @Test
    void testEquals11() {
        Header header = new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42");

        CustomerProfileRequest customerProfileRequest = new CustomerProfileRequest("42", "42", "42", header,
                new PayLoad());
        Header header1 = new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42");

        CustomerProfileRequest customerProfileRequest1 = new CustomerProfileRequest("42", "42", "42", header1,
                new PayLoad());

        assertEquals(customerProfileRequest, customerProfileRequest1);
        int expectedHashCodeResult = customerProfileRequest.hashCode();
        assertEquals(expectedHashCodeResult, customerProfileRequest1.hashCode());
    }

    /**
     * Method under test: {@link CustomerProfileRequest#equals(Object)}
     */
    @Test
    void testEquals12() {
        CustomerProfileRequest customerProfileRequest = new CustomerProfileRequest();

        CustomerProfileRequest customerProfileRequest1 = new CustomerProfileRequest();
        customerProfileRequest1.setAccountNumber("42");
        assertNotEquals(customerProfileRequest, customerProfileRequest1);
    }

    /**
     * Method under test: {@link CustomerProfileRequest#equals(Object)}
     */
    @Test
    void testEquals13() {
        CustomerProfileRequest customerProfileRequest = new CustomerProfileRequest();

        CustomerProfileRequest customerProfileRequest1 = new CustomerProfileRequest();
        customerProfileRequest1.setCardNumber("42");
        assertNotEquals(customerProfileRequest, customerProfileRequest1);
    }

    /**
     * Method under test: {@link CustomerProfileRequest#equals(Object)}
     */
    @Test
    void testEquals14() {
        CustomerProfileRequest customerProfileRequest = new CustomerProfileRequest();

        CustomerProfileRequest customerProfileRequest1 = new CustomerProfileRequest();
        customerProfileRequest1
                .setHeader(new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42"));
        assertNotEquals(customerProfileRequest, customerProfileRequest1);
    }

    /**
     * Method under test: {@link CustomerProfileRequest#equals(Object)}
     */
    @Test
    void testEquals15() {
        CustomerProfileRequest customerProfileRequest = new CustomerProfileRequest();

        CustomerProfileRequest customerProfileRequest1 = new CustomerProfileRequest();
        customerProfileRequest1.setPayload(new PayLoad());
        assertNotEquals(customerProfileRequest, customerProfileRequest1);
    }

    /**
     * Method under test: {@link CustomerProfileRequest#equals(Object)}
     */
    @Test
    void testEquals16() {
        CustomerProfileRequest customerProfileRequest = new CustomerProfileRequest();
        customerProfileRequest.setHeader(mock(Header.class));
        assertNotEquals(customerProfileRequest, new CustomerProfileRequest());
    }
}

