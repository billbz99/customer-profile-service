package com.company.org.customerprofileservice.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ErrorMessageTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ErrorMessage#ErrorMessage(String, String)}
     *   <li>{@link ErrorMessage#setErrorMessage(String)}
     *   <li>{@link ErrorMessage#setStatus(String)}
     *   <li>{@link ErrorMessage#getErrorMessage()}
     *   <li>{@link ErrorMessage#getStatus()}
     * </ul>
     */
    @Test
    void testConstructor() {
        ErrorMessage actualErrorMessage = new ErrorMessage("An error occurred", "Status");
        actualErrorMessage.setErrorMessage("An error occurred");
        actualErrorMessage.setStatus("Status");
        assertEquals("An error occurred", actualErrorMessage.getErrorMessage());
        assertEquals("Status", actualErrorMessage.getStatus());
    }
}

