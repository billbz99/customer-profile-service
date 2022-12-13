package com.company.org.customerprofileservice.payload.request;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class HeaderTest {
    /**
     * Method under test: {@link Header#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse(
                (new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42")).canEqual("Other"));
    }

    /**
     * Method under test: {@link Header#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        Header header = new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42");
        assertTrue(header.canEqual(new Header(3L, "42", 3L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42")));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Header#Header()}
     *   <li>{@link Header#setCorrelationID(long)}
     *   <li>{@link Header#setCreatedBy(String)}
     *   <li>{@link Header#setCreatedTimestamp(long)}
     *   <li>{@link Header#setEventId(String)}
     *   <li>{@link Header#setEventInstanceId(String)}
     *   <li>{@link Header#setRequestId(String)}
     *   <li>{@link Header#setRequestedBy(String)}
     *   <li>{@link Header#toString()}
     *   <li>{@link Header#getCorrelationID()}
     *   <li>{@link Header#getCreatedBy()}
     *   <li>{@link Header#getCreatedTimestamp()}
     *   <li>{@link Header#getEventId()}
     *   <li>{@link Header#getEventInstanceId()}
     *   <li>{@link Header#getRequestId()}
     *   <li>{@link Header#getRequestedBy()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Header actualHeader = new Header();
        actualHeader.setCorrelationID(1L);
        actualHeader.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        actualHeader.setCreatedTimestamp(1L);
        actualHeader.setEventId("42");
        actualHeader.setEventInstanceId("42");
        actualHeader.setRequestId("42");
        actualHeader.setRequestedBy("Requested By");
        String actualToStringResult = actualHeader.toString();
        assertEquals(1L, actualHeader.getCorrelationID());
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualHeader.getCreatedBy());
        assertEquals(1L, actualHeader.getCreatedTimestamp());
        assertEquals("42", actualHeader.getEventId());
        assertEquals("42", actualHeader.getEventInstanceId());
        assertEquals("42", actualHeader.getRequestId());
        assertEquals("Requested By", actualHeader.getRequestedBy());
        assertEquals("Header(correlationID=1, requestId=42, createdTimestamp=1, createdBy=Jan 1, 2020 8:00am GMT+0100,"
                + " requestedBy=Requested By, eventId=42, eventInstanceId=42)", actualToStringResult);
    }

    /**
     * Method under test: {@link Header#Header(long, String, long, String, String, String, String)}
     */
    @Test
    void testConstructor2() {
        Header actualHeader = new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42");

        assertEquals(1L, actualHeader.getCorrelationID());
        assertEquals("Requested By", actualHeader.getRequestedBy());
        assertEquals("42", actualHeader.getRequestId());
        assertEquals("42", actualHeader.getEventInstanceId());
        assertEquals("42", actualHeader.getEventId());
        assertEquals(1L, actualHeader.getCreatedTimestamp());
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualHeader.getCreatedBy());
    }

    /**
     * Method under test: {@link Header#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42"), null);
        assertNotEquals(new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42"),
                "Different type to Header");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Header#equals(Object)}
     *   <li>{@link Header#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        Header header = new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42");
        assertEquals(header, header);
        int expectedHashCodeResult = header.hashCode();
        assertEquals(expectedHashCodeResult, header.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Header#equals(Object)}
     *   <li>{@link Header#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        Header header = new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42");
        Header header1 = new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42");

        assertEquals(header, header1);
        int expectedHashCodeResult = header.hashCode();
        assertEquals(expectedHashCodeResult, header1.hashCode());
    }

    /**
     * Method under test: {@link Header#equals(Object)}
     */
    @Test
    void testEquals4() {
        Header header = new Header(3L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42");
        assertNotEquals(header, new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42"));
    }

    /**
     * Method under test: {@link Header#equals(Object)}
     */
    @Test
    void testEquals5() {
        Header header = new Header(1L, "Jan 1, 2020 8:00am GMT+0100", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By",
                "42", "42");
        assertNotEquals(header, new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42"));
    }

    /**
     * Method under test: {@link Header#equals(Object)}
     */
    @Test
    void testEquals6() {
        Header header = new Header(1L, null, 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42");
        assertNotEquals(header, new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42"));
    }

    /**
     * Method under test: {@link Header#equals(Object)}
     */
    @Test
    void testEquals7() {
        Header header = new Header(1L, "42", 3L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42");
        assertNotEquals(header, new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42"));
    }

    /**
     * Method under test: {@link Header#equals(Object)}
     */
    @Test
    void testEquals8() {
        Header header = new Header(1L, "42", 1L, "42", "Requested By", "42", "42");
        assertNotEquals(header, new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42"));
    }

    /**
     * Method under test: {@link Header#equals(Object)}
     */
    @Test
    void testEquals9() {
        Header header = new Header(1L, "42", 1L, null, "Requested By", "42", "42");
        assertNotEquals(header, new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42"));
    }

    /**
     * Method under test: {@link Header#equals(Object)}
     */
    @Test
    void testEquals10() {
        Header header = new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "42", "42", "42");
        assertNotEquals(header, new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42"));
    }

    /**
     * Method under test: {@link Header#equals(Object)}
     */
    @Test
    void testEquals11() {
        Header header = new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", null, "42", "42");
        assertNotEquals(header, new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42"));
    }

    /**
     * Method under test: {@link Header#equals(Object)}
     */
    @Test
    void testEquals12() {
        Header header = new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By",
                "Jan 1, 2020 8:00am GMT+0100", "42");
        assertNotEquals(header, new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42"));
    }

    /**
     * Method under test: {@link Header#equals(Object)}
     */
    @Test
    void testEquals13() {
        Header header = new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", null, "42");
        assertNotEquals(header, new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42"));
    }

    /**
     * Method under test: {@link Header#equals(Object)}
     */
    @Test
    void testEquals14() {
        Header header = new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42",
                "Jan 1, 2020 8:00am GMT+0100");
        assertNotEquals(header, new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42"));
    }

    /**
     * Method under test: {@link Header#equals(Object)}
     */
    @Test
    void testEquals15() {
        Header header = new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", null);
        assertNotEquals(header, new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42"));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Header#equals(Object)}
     *   <li>{@link Header#hashCode()}
     * </ul>
     */
    @Test
    void testEquals16() {
        Header header = new Header(1L, null, 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42");
        Header header1 = new Header(1L, null, 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42");

        assertEquals(header, header1);
        int expectedHashCodeResult = header.hashCode();
        assertEquals(expectedHashCodeResult, header1.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Header#equals(Object)}
     *   <li>{@link Header#hashCode()}
     * </ul>
     */
    @Test
    void testEquals17() {
        Header header = new Header(1L, "42", 1L, null, "Requested By", "42", "42");
        Header header1 = new Header(1L, "42", 1L, null, "Requested By", "42", "42");

        assertEquals(header, header1);
        int expectedHashCodeResult = header.hashCode();
        assertEquals(expectedHashCodeResult, header1.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Header#equals(Object)}
     *   <li>{@link Header#hashCode()}
     * </ul>
     */
    @Test
    void testEquals18() {
        Header header = new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", null, "42", "42");
        Header header1 = new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", null, "42", "42");

        assertEquals(header, header1);
        int expectedHashCodeResult = header.hashCode();
        assertEquals(expectedHashCodeResult, header1.hashCode());
    }
}

