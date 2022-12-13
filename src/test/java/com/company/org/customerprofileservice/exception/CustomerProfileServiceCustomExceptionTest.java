package com.company.org.customerprofileservice.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class CustomerProfileServiceCustomExceptionTest {
    /**
     * Method under test: {@link CustomerProfileServiceCustomException#CustomerProfileServiceCustomException(String, String)}
     */
    @Test
    void testConstructor() {
        CustomerProfileServiceCustomException actualCustomerProfileServiceCustomException = new CustomerProfileServiceCustomException(
                "An error occurred", "An error occurred");

        assertNull(actualCustomerProfileServiceCustomException.getCause());
        assertEquals(0, actualCustomerProfileServiceCustomException.getSuppressed().length);
        assertEquals("An error occurred", actualCustomerProfileServiceCustomException.getMessage());
        assertEquals("An error occurred", actualCustomerProfileServiceCustomException.getLocalizedMessage());
        assertEquals("An error occurred", actualCustomerProfileServiceCustomException.getErrorCode());
    }
}

