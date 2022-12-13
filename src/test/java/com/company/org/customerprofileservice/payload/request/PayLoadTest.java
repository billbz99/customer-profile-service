package com.company.org.customerprofileservice.payload.request;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

class PayLoadTest {
    /**
     * Method under test: {@link PayLoad#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new PayLoad()).canEqual("Other"));
    }

    /**
     * Method under test: {@link PayLoad#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        PayLoad payLoad = new PayLoad();
        assertTrue(payLoad.canEqual(new PayLoad()));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PayLoad#PayLoad()}
     *   <li>{@link PayLoad#setAction(String)}
     *   <li>{@link PayLoad#setRequest(Request)}
     *   <li>{@link PayLoad#toString()}
     *   <li>{@link PayLoad#getAction()}
     *   <li>{@link PayLoad#getRequest()}
     * </ul>
     */
    @Test
    void testConstructor() {
        PayLoad actualPayLoad = new PayLoad();
        actualPayLoad.setAction("Action");
        Request request = new Request();
        actualPayLoad.setRequest(request);
        String actualToStringResult = actualPayLoad.toString();
        assertEquals("Action", actualPayLoad.getAction());
        assertSame(request, actualPayLoad.getRequest());
        assertEquals("PayLoad(action=Action, request=Request(mandatory=null, optional=null))", actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PayLoad#PayLoad(String, Request)}
     *   <li>{@link PayLoad#setAction(String)}
     *   <li>{@link PayLoad#setRequest(Request)}
     *   <li>{@link PayLoad#toString()}
     *   <li>{@link PayLoad#getAction()}
     *   <li>{@link PayLoad#getRequest()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Request request = new Request();
        PayLoad actualPayLoad = new PayLoad("Action", request);
        actualPayLoad.setAction("Action");
        Request request1 = new Request();
        actualPayLoad.setRequest(request1);
        String actualToStringResult = actualPayLoad.toString();
        assertEquals("Action", actualPayLoad.getAction());
        Request request2 = actualPayLoad.getRequest();
        assertSame(request1, request2);
        assertEquals(request, request2);
        assertEquals("PayLoad(action=Action, request=Request(mandatory=null, optional=null))", actualToStringResult);
    }

    /**
     * Method under test: {@link PayLoad#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(new PayLoad(), null);
        assertNotEquals(new PayLoad(), "Different type to PayLoad");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PayLoad#equals(Object)}
     *   <li>{@link PayLoad#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        PayLoad payLoad = new PayLoad();
        assertEquals(payLoad, payLoad);
        int expectedHashCodeResult = payLoad.hashCode();
        assertEquals(expectedHashCodeResult, payLoad.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PayLoad#equals(Object)}
     *   <li>{@link PayLoad#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        PayLoad payLoad = new PayLoad();
        PayLoad payLoad1 = new PayLoad();
        assertEquals(payLoad, payLoad1);
        int expectedHashCodeResult = payLoad.hashCode();
        assertEquals(expectedHashCodeResult, payLoad1.hashCode());
    }

    /**
     * Method under test: {@link PayLoad#equals(Object)}
     */
    @Test
    void testEquals4() {
        PayLoad payLoad = new PayLoad("Action", new Request());
        assertNotEquals(payLoad, new PayLoad());
    }

    /**
     * Method under test: {@link PayLoad#equals(Object)}
     */
    @Test
    void testEquals5() {
        PayLoad payLoad = new PayLoad();
        assertNotEquals(payLoad, new PayLoad("Action", new Request()));
    }

    /**
     * Method under test: {@link PayLoad#equals(Object)}
     */
    @Test
    void testEquals6() {
        PayLoad payLoad = new PayLoad();
        payLoad.setRequest(new Request());
        assertNotEquals(payLoad, new PayLoad());
    }

    /**
     * Method under test: {@link PayLoad#equals(Object)}
     */
    @Test
    void testEquals7() {
        PayLoad payLoad = new PayLoad("Action", mock(Request.class));
        assertNotEquals(payLoad, new PayLoad());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PayLoad#equals(Object)}
     *   <li>{@link PayLoad#hashCode()}
     * </ul>
     */
    @Test
    void testEquals8() {
        PayLoad payLoad = new PayLoad("Action", new Request());
        PayLoad payLoad1 = new PayLoad("Action", new Request());

        assertEquals(payLoad, payLoad1);
        int expectedHashCodeResult = payLoad.hashCode();
        assertEquals(expectedHashCodeResult, payLoad1.hashCode());
    }

    /**
     * Method under test: {@link PayLoad#equals(Object)}
     */
    @Test
    void testEquals9() {
        PayLoad payLoad = new PayLoad();

        PayLoad payLoad1 = new PayLoad();
        payLoad1.setRequest(new Request());
        assertNotEquals(payLoad, payLoad1);
    }

    /**
     * Method under test: {@link PayLoad#equals(Object)}
     */
    @Test
    void testEquals10() {
        PayLoad payLoad = new PayLoad();
        payLoad.setRequest(mock(Request.class));
        assertNotEquals(payLoad, new PayLoad());
    }
}

