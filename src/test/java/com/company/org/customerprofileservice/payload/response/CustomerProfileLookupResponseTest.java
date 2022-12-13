package com.company.org.customerprofileservice.payload.response;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class CustomerProfileLookupResponseTest {
    /**
     * Method under test: {@link CustomerProfileLookupResponse#CustomerProfileLookupResponse(Payload)}
     */
    @Test
    void testConstructor() {
        CustomerProfileLookupResponse actualCustomerProfileLookupResponse = new CustomerProfileLookupResponse(
                new Payload());
        assertNull(actualCustomerProfileLookupResponse.getHeader());
        assertNull(actualCustomerProfileLookupResponse.getPayload());
    }
}

