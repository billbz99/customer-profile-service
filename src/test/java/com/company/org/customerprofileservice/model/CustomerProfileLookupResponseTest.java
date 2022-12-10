package com.company.org.customerprofileservice.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import com.company.org.customerprofileservice.payload.response.CustomerProfileLookupResponse;
import com.company.org.customerprofileservice.payload.response.Payload;
import org.junit.jupiter.api.Test;

class CustomerProfileLookupResponseTest {
    /**
     * Method under test: {@link CustomerProfileLookupResponse#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new CustomerProfileLookupResponse()).canEqual("Other"));
    }

    /**
     * Method under test: {@link CustomerProfileLookupResponse#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        CustomerProfileLookupResponse customerProfileLookupResponse = new CustomerProfileLookupResponse();
        assertTrue(customerProfileLookupResponse.canEqual(new CustomerProfileLookupResponse()));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link CustomerProfileLookupResponse#CustomerProfileLookupResponse()}
     *   <li>{@link CustomerProfileLookupResponse#setPayload(Payload)}
     *   <li>{@link CustomerProfileLookupResponse#toString()}
     *   <li>{@link CustomerProfileLookupResponse#getPayload()}
     * </ul>
     */
    @Test
    void testConstructor() {
        CustomerProfileLookupResponse actualCustomerProfileLookupResponse = new CustomerProfileLookupResponse();
        Payload payload = new Payload();
        actualCustomerProfileLookupResponse.setPayload(payload);
        String actualToStringResult = actualCustomerProfileLookupResponse.toString();
        assertSame(payload, actualCustomerProfileLookupResponse.getPayload());
        assertEquals("CustomerProfileLookupResponse(payload=Payload(customerProfiles=null))", actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link CustomerProfileLookupResponse#CustomerProfileLookupResponse(Payload)}
     *   <li>{@link CustomerProfileLookupResponse#setPayload(Payload)}
     *   <li>{@link CustomerProfileLookupResponse#toString()}
     *   <li>{@link CustomerProfileLookupResponse#getPayload()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Payload payload = new Payload();
        CustomerProfileLookupResponse actualCustomerProfileLookupResponse = new CustomerProfileLookupResponse(payload);
        Payload payload1 = new Payload();
        actualCustomerProfileLookupResponse.setPayload(payload1);
        String actualToStringResult = actualCustomerProfileLookupResponse.toString();
        Payload payload2 = actualCustomerProfileLookupResponse.getPayload();
        assertSame(payload1, payload2);
        assertEquals(payload, payload2);
        assertEquals("CustomerProfileLookupResponse(payload=Payload(customerProfiles=null))", actualToStringResult);
    }

    /**
     * Method under test: {@link CustomerProfileLookupResponse#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(new CustomerProfileLookupResponse(), null);
        assertNotEquals(new CustomerProfileLookupResponse(), "Different type to CustomerProfileLookupResponse");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link CustomerProfileLookupResponse#equals(Object)}
     *   <li>{@link CustomerProfileLookupResponse#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        CustomerProfileLookupResponse customerProfileLookupResponse = new CustomerProfileLookupResponse();
        assertEquals(customerProfileLookupResponse, customerProfileLookupResponse);
        int expectedHashCodeResult = customerProfileLookupResponse.hashCode();
        assertEquals(expectedHashCodeResult, customerProfileLookupResponse.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link CustomerProfileLookupResponse#equals(Object)}
     *   <li>{@link CustomerProfileLookupResponse#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        CustomerProfileLookupResponse customerProfileLookupResponse = new CustomerProfileLookupResponse();
        CustomerProfileLookupResponse customerProfileLookupResponse1 = new CustomerProfileLookupResponse();
        assertEquals(customerProfileLookupResponse, customerProfileLookupResponse1);
        int expectedHashCodeResult = customerProfileLookupResponse.hashCode();
        assertEquals(expectedHashCodeResult, customerProfileLookupResponse1.hashCode());
    }

    /**
     * Method under test: {@link CustomerProfileLookupResponse#equals(Object)}
     */
    @Test
    void testEquals4() {
        CustomerProfileLookupResponse customerProfileLookupResponse = new CustomerProfileLookupResponse(new Payload());
        assertNotEquals(customerProfileLookupResponse, new CustomerProfileLookupResponse());
    }

    /**
     * Method under test: {@link CustomerProfileLookupResponse#equals(Object)}
     */
    @Test
    void testEquals5() {
        CustomerProfileLookupResponse customerProfileLookupResponse = new CustomerProfileLookupResponse();
        assertNotEquals(customerProfileLookupResponse, new CustomerProfileLookupResponse(new Payload()));
    }

    /**
     * Method under test: {@link CustomerProfileLookupResponse#equals(Object)}
     */
    @Test
    void testEquals6() {
        CustomerProfileLookupResponse customerProfileLookupResponse = new CustomerProfileLookupResponse(
                mock(Payload.class));
        assertNotEquals(customerProfileLookupResponse, new CustomerProfileLookupResponse());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link CustomerProfileLookupResponse#equals(Object)}
     *   <li>{@link CustomerProfileLookupResponse#hashCode()}
     * </ul>
     */
    @Test
    void testEquals7() {
        CustomerProfileLookupResponse customerProfileLookupResponse = new CustomerProfileLookupResponse(new Payload());
        CustomerProfileLookupResponse customerProfileLookupResponse1 = new CustomerProfileLookupResponse(new Payload());
        assertEquals(customerProfileLookupResponse, customerProfileLookupResponse1);
        int expectedHashCodeResult = customerProfileLookupResponse.hashCode();
        assertEquals(expectedHashCodeResult, customerProfileLookupResponse1.hashCode());
    }
}

