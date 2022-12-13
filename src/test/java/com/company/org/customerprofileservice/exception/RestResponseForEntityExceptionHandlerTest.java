package com.company.org.customerprofileservice.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.company.org.customerprofileservice.models.ErrorResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

class RestResponseForEntityExceptionHandlerTest {
    /**
     * Method under test: {@link RestResponseForEntityExceptionHandler#handleProductServiceException(CustomerProfileServiceCustomException)}
     */
    @Test
    void testHandleProductServiceException() {
        RestResponseForEntityExceptionHandler restResponseForEntityExceptionHandler = new RestResponseForEntityExceptionHandler();
        ResponseEntity<ErrorResponse> actualHandleProductServiceExceptionResult = restResponseForEntityExceptionHandler
                .handleProductServiceException(
                        new CustomerProfileServiceCustomException("An error occurred", "An error occurred"));
        assertTrue(actualHandleProductServiceExceptionResult.hasBody());
        assertTrue(actualHandleProductServiceExceptionResult.getHeaders().isEmpty());
        assertEquals(HttpStatus.NOT_FOUND, actualHandleProductServiceExceptionResult.getStatusCode());
        ErrorResponse body = actualHandleProductServiceExceptionResult.getBody();
        assertEquals("An error occurred", body.getErrorMessage());
        assertEquals("An error occurred", body.getErrorCode());
    }

    /**
     * Method under test: {@link RestResponseForEntityExceptionHandler#handleProductServiceException(CustomerProfileServiceCustomException)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testHandleProductServiceException2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.company.org.customerprofileservice.exception.CustomerProfileServiceCustomException.getMessage()" because "exception" is null
        //       at com.company.org.customerprofileservice.exception.RestResponseForEntityExceptionHandler.handleProductServiceException(RestResponseForEntityExceptionHandler.java:16)
        //   See https://diff.blue/R013 to resolve this issue.

        (new RestResponseForEntityExceptionHandler()).handleProductServiceException(null);
    }
}

