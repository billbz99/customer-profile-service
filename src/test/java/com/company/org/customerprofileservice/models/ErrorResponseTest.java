package com.company.org.customerprofileservice.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ErrorResponseTest {
    /**
     * Method under test: {@link ErrorResponse#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new ErrorResponse("An error occurred", "An error occurred")).canEqual("Other"));
    }

    /**
     * Method under test: {@link ErrorResponse#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        ErrorResponse errorResponse = new ErrorResponse("An error occurred", "An error occurred");
        assertTrue(errorResponse.canEqual(new ErrorResponse("An error occurred", "An error occurred")));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ErrorResponse#ErrorResponse()}
     *   <li>{@link ErrorResponse#setErrorCode(String)}
     *   <li>{@link ErrorResponse#setErrorMessage(String)}
     *   <li>{@link ErrorResponse#toString()}
     *   <li>{@link ErrorResponse#getErrorCode()}
     *   <li>{@link ErrorResponse#getErrorMessage()}
     * </ul>
     */
    @Test
    void testConstructor() {
        ErrorResponse actualErrorResponse = new ErrorResponse();
        actualErrorResponse.setErrorCode("An error occurred");
        actualErrorResponse.setErrorMessage("An error occurred");
        String actualToStringResult = actualErrorResponse.toString();
        assertEquals("An error occurred", actualErrorResponse.getErrorCode());
        assertEquals("An error occurred", actualErrorResponse.getErrorMessage());
        assertEquals("ErrorResponse(errorMessage=An error occurred, errorCode=An error occurred)", actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ErrorResponse#ErrorResponse(String, String)}
     *   <li>{@link ErrorResponse#setErrorCode(String)}
     *   <li>{@link ErrorResponse#setErrorMessage(String)}
     *   <li>{@link ErrorResponse#toString()}
     *   <li>{@link ErrorResponse#getErrorCode()}
     *   <li>{@link ErrorResponse#getErrorMessage()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        ErrorResponse actualErrorResponse = new ErrorResponse("An error occurred", "An error occurred");
        actualErrorResponse.setErrorCode("An error occurred");
        actualErrorResponse.setErrorMessage("An error occurred");
        String actualToStringResult = actualErrorResponse.toString();
        assertEquals("An error occurred", actualErrorResponse.getErrorCode());
        assertEquals("An error occurred", actualErrorResponse.getErrorMessage());
        assertEquals("ErrorResponse(errorMessage=An error occurred, errorCode=An error occurred)", actualToStringResult);
    }

    /**
     * Method under test: {@link ErrorResponse#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(new ErrorResponse("An error occurred", "An error occurred"), null);
        assertNotEquals(new ErrorResponse("An error occurred", "An error occurred"), "Different type to ErrorResponse");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ErrorResponse#equals(Object)}
     *   <li>{@link ErrorResponse#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        ErrorResponse errorResponse = new ErrorResponse("An error occurred", "An error occurred");
        assertEquals(errorResponse, errorResponse);
        int expectedHashCodeResult = errorResponse.hashCode();
        assertEquals(expectedHashCodeResult, errorResponse.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ErrorResponse#equals(Object)}
     *   <li>{@link ErrorResponse#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        ErrorResponse errorResponse = new ErrorResponse("An error occurred", "An error occurred");
        ErrorResponse errorResponse1 = new ErrorResponse("An error occurred", "An error occurred");

        assertEquals(errorResponse, errorResponse1);
        int expectedHashCodeResult = errorResponse.hashCode();
        assertEquals(expectedHashCodeResult, errorResponse1.hashCode());
    }

    /**
     * Method under test: {@link ErrorResponse#equals(Object)}
     */
    @Test
    void testEquals4() {
        ErrorResponse errorResponse = new ErrorResponse("Error Message", "An error occurred");
        assertNotEquals(errorResponse, new ErrorResponse("An error occurred", "An error occurred"));
    }

    /**
     * Method under test: {@link ErrorResponse#equals(Object)}
     */
    @Test
    void testEquals5() {
        ErrorResponse errorResponse = new ErrorResponse(null, "An error occurred");
        assertNotEquals(errorResponse, new ErrorResponse("An error occurred", "An error occurred"));
    }

    /**
     * Method under test: {@link ErrorResponse#equals(Object)}
     */
    @Test
    void testEquals6() {
        ErrorResponse errorResponse = new ErrorResponse("An error occurred", "Error Code");
        assertNotEquals(errorResponse, new ErrorResponse("An error occurred", "An error occurred"));
    }

    /**
     * Method under test: {@link ErrorResponse#equals(Object)}
     */
    @Test
    void testEquals7() {
        ErrorResponse errorResponse = new ErrorResponse("An error occurred", null);
        assertNotEquals(errorResponse, new ErrorResponse("An error occurred", "An error occurred"));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ErrorResponse#equals(Object)}
     *   <li>{@link ErrorResponse#hashCode()}
     * </ul>
     */
    @Test
    void testEquals8() {
        ErrorResponse errorResponse = new ErrorResponse(null, "An error occurred");
        ErrorResponse errorResponse1 = new ErrorResponse(null, "An error occurred");

        assertEquals(errorResponse, errorResponse1);
        int expectedHashCodeResult = errorResponse.hashCode();
        assertEquals(expectedHashCodeResult, errorResponse1.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ErrorResponse#equals(Object)}
     *   <li>{@link ErrorResponse#hashCode()}
     * </ul>
     */
    @Test
    void testEquals9() {
        ErrorResponse errorResponse = new ErrorResponse("An error occurred", null);
        ErrorResponse errorResponse1 = new ErrorResponse("An error occurred", null);

        assertEquals(errorResponse, errorResponse1);
        int expectedHashCodeResult = errorResponse.hashCode();
        assertEquals(expectedHashCodeResult, errorResponse1.hashCode());
    }
}

