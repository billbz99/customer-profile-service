package com.company.org.customerprofileservice.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FieldErrorMessageTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link FieldErrorMessage#FieldErrorMessage(String, String)}
     *   <li>{@link FieldErrorMessage#setErrorMessage(String)}
     *   <li>{@link FieldErrorMessage#setFieldName(String)}
     *   <li>{@link FieldErrorMessage#getErrorMessage()}
     *   <li>{@link FieldErrorMessage#getFieldName()}
     * </ul>
     */
    @Test
    void testConstructor() {
        FieldErrorMessage actualFieldErrorMessage = new FieldErrorMessage("Field Name", "An error occurred");
        actualFieldErrorMessage.setErrorMessage("An error occurred");
        actualFieldErrorMessage.setFieldName("Field Name");
        assertEquals("An error occurred", actualFieldErrorMessage.getErrorMessage());
        assertEquals("Field Name", actualFieldErrorMessage.getFieldName());
    }
}

