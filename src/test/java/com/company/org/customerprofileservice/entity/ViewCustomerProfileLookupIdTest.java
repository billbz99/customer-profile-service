package com.company.org.customerprofileservice.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class ViewCustomerProfileLookupIdTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ViewCustomerProfileLookupId#ViewCustomerProfileLookupId()}
     *   <li>{@link ViewCustomerProfileLookupId#getPersonFirstName()}
     *   <li>{@link ViewCustomerProfileLookupId#getPersonLastName()}
     *   <li>{@link ViewCustomerProfileLookupId#getSsn()}
     * </ul>
     */
    @Test
    void testConstructor() {
        ViewCustomerProfileLookupId actualViewCustomerProfileLookupId = new ViewCustomerProfileLookupId();
        assertNull(actualViewCustomerProfileLookupId.getPersonFirstName());
        assertNull(actualViewCustomerProfileLookupId.getPersonLastName());
        assertNull(actualViewCustomerProfileLookupId.getSsn());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ViewCustomerProfileLookupId#ViewCustomerProfileLookupId(String, String, String)}
     *   <li>{@link ViewCustomerProfileLookupId#getPersonFirstName()}
     *   <li>{@link ViewCustomerProfileLookupId#getPersonLastName()}
     *   <li>{@link ViewCustomerProfileLookupId#getSsn()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        ViewCustomerProfileLookupId actualViewCustomerProfileLookupId = new ViewCustomerProfileLookupId("Jane", "Doe",
                "123-45-678");

        assertEquals("Jane", actualViewCustomerProfileLookupId.getPersonFirstName());
        assertEquals("Doe", actualViewCustomerProfileLookupId.getPersonLastName());
        assertEquals("123-45-678", actualViewCustomerProfileLookupId.getSsn());
    }

    /**
     * Method under test: {@link ViewCustomerProfileLookupId#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(new ViewCustomerProfileLookupId(), null);
        assertNotEquals(new ViewCustomerProfileLookupId(), "Different type to ViewCustomerProfileLookupId");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ViewCustomerProfileLookupId#equals(Object)}
     *   <li>{@link ViewCustomerProfileLookupId#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        ViewCustomerProfileLookupId viewCustomerProfileLookupId = new ViewCustomerProfileLookupId();
        assertEquals(viewCustomerProfileLookupId, viewCustomerProfileLookupId);
        int expectedHashCodeResult = viewCustomerProfileLookupId.hashCode();
        assertEquals(expectedHashCodeResult, viewCustomerProfileLookupId.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ViewCustomerProfileLookupId#equals(Object)}
     *   <li>{@link ViewCustomerProfileLookupId#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        ViewCustomerProfileLookupId viewCustomerProfileLookupId = new ViewCustomerProfileLookupId();
        ViewCustomerProfileLookupId viewCustomerProfileLookupId1 = new ViewCustomerProfileLookupId();
        assertEquals(viewCustomerProfileLookupId, viewCustomerProfileLookupId1);
        int expectedHashCodeResult = viewCustomerProfileLookupId.hashCode();
        assertEquals(expectedHashCodeResult, viewCustomerProfileLookupId1.hashCode());
    }

    /**
     * Method under test: {@link ViewCustomerProfileLookupId#equals(Object)}
     */
    @Test
    void testEquals4() {
        ViewCustomerProfileLookupId viewCustomerProfileLookupId = new ViewCustomerProfileLookupId("Jane", "Doe",
                "123-45-678");
        assertNotEquals(viewCustomerProfileLookupId, new ViewCustomerProfileLookupId());
    }

    /**
     * Method under test: {@link ViewCustomerProfileLookupId#equals(Object)}
     */
    @Test
    void testEquals5() {
        ViewCustomerProfileLookupId viewCustomerProfileLookupId = new ViewCustomerProfileLookupId("Jane", null,
                "123-45-678");
        assertNotEquals(viewCustomerProfileLookupId, new ViewCustomerProfileLookupId());
    }

    /**
     * Method under test: {@link ViewCustomerProfileLookupId#equals(Object)}
     */
    @Test
    void testEquals6() {
        ViewCustomerProfileLookupId viewCustomerProfileLookupId = new ViewCustomerProfileLookupId(null, null,
                "123-45-678");
        assertNotEquals(viewCustomerProfileLookupId, new ViewCustomerProfileLookupId());
    }
}

