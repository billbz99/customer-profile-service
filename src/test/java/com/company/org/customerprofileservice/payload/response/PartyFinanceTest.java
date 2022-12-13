package com.company.org.customerprofileservice.payload.response;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PartyFinanceTest {
    /**
     * Method under test: {@link PartyFinance#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new PartyFinance()).canEqual("Other"));
    }

    /**
     * Method under test: {@link PartyFinance#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        PartyFinance partyFinance = new PartyFinance();
        assertTrue(partyFinance.canEqual(new PartyFinance()));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartyFinance#PartyFinance()}
     *   <li>{@link PartyFinance#setAnnualIncomeUSD(String)}
     *   <li>{@link PartyFinance#setLiquidNetWorthAmountUSD(String)}
     *   <li>{@link PartyFinance#setSourceOfWealth(ArrayList)}
     *   <li>{@link PartyFinance#setWealthNotInUSACountry(String)}
     *   <li>{@link PartyFinance#setWealthNotInUSAFlag(String)}
     *   <li>{@link PartyFinance#toString()}
     *   <li>{@link PartyFinance#getAnnualIncomeUSD()}
     *   <li>{@link PartyFinance#getLiquidNetWorthAmountUSD()}
     *   <li>{@link PartyFinance#getSourceOfWealth()}
     *   <li>{@link PartyFinance#getWealthNotInUSACountry()}
     *   <li>{@link PartyFinance#getWealthNotInUSAFlag()}
     * </ul>
     */
    @Test
    void testConstructor() {
        PartyFinance actualPartyFinance = new PartyFinance();
        actualPartyFinance.setAnnualIncomeUSD("Annual Income USD");
        actualPartyFinance.setLiquidNetWorthAmountUSD("1234");
        ArrayList<String> stringList = new ArrayList<>();
        actualPartyFinance.setSourceOfWealth(stringList);
        actualPartyFinance.setWealthNotInUSACountry("GB");
        actualPartyFinance.setWealthNotInUSAFlag("Wealth Not In USAFlag");
        String actualToStringResult = actualPartyFinance.toString();
        assertEquals("Annual Income USD", actualPartyFinance.getAnnualIncomeUSD());
        assertEquals("1234", actualPartyFinance.getLiquidNetWorthAmountUSD());
        assertSame(stringList, actualPartyFinance.getSourceOfWealth());
        assertEquals("GB", actualPartyFinance.getWealthNotInUSACountry());
        assertEquals("Wealth Not In USAFlag", actualPartyFinance.getWealthNotInUSAFlag());
        assertEquals("PartyFinance(sourceOfWealth=[], annualIncomeUSD=Annual Income USD, liquidNetWorthAmountUSD=1234,"
                + " wealthNotInUSAFlag=Wealth Not In USAFlag, wealthNotInUSACountry=GB)", actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartyFinance#PartyFinance(ArrayList, String, String, String, String)}
     *   <li>{@link PartyFinance#setAnnualIncomeUSD(String)}
     *   <li>{@link PartyFinance#setLiquidNetWorthAmountUSD(String)}
     *   <li>{@link PartyFinance#setSourceOfWealth(ArrayList)}
     *   <li>{@link PartyFinance#setWealthNotInUSACountry(String)}
     *   <li>{@link PartyFinance#setWealthNotInUSAFlag(String)}
     *   <li>{@link PartyFinance#toString()}
     *   <li>{@link PartyFinance#getAnnualIncomeUSD()}
     *   <li>{@link PartyFinance#getLiquidNetWorthAmountUSD()}
     *   <li>{@link PartyFinance#getSourceOfWealth()}
     *   <li>{@link PartyFinance#getWealthNotInUSACountry()}
     *   <li>{@link PartyFinance#getWealthNotInUSAFlag()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        ArrayList<String> stringList = new ArrayList<>();
        PartyFinance actualPartyFinance = new PartyFinance(stringList, "Annual Income USD", "1234",
                "Wealth Not In USAFlag", "GB");
        actualPartyFinance.setAnnualIncomeUSD("Annual Income USD");
        actualPartyFinance.setLiquidNetWorthAmountUSD("1234");
        ArrayList<String> stringList1 = new ArrayList<>();
        actualPartyFinance.setSourceOfWealth(stringList1);
        actualPartyFinance.setWealthNotInUSACountry("GB");
        actualPartyFinance.setWealthNotInUSAFlag("Wealth Not In USAFlag");
        String actualToStringResult = actualPartyFinance.toString();
        assertEquals("Annual Income USD", actualPartyFinance.getAnnualIncomeUSD());
        assertEquals("1234", actualPartyFinance.getLiquidNetWorthAmountUSD());
        ArrayList<String> sourceOfWealth = actualPartyFinance.getSourceOfWealth();
        assertSame(stringList1, sourceOfWealth);
        assertEquals(stringList, sourceOfWealth);
        assertEquals("GB", actualPartyFinance.getWealthNotInUSACountry());
        assertEquals("Wealth Not In USAFlag", actualPartyFinance.getWealthNotInUSAFlag());
        assertEquals("PartyFinance(sourceOfWealth=[], annualIncomeUSD=Annual Income USD, liquidNetWorthAmountUSD=1234,"
                + " wealthNotInUSAFlag=Wealth Not In USAFlag, wealthNotInUSACountry=GB)", actualToStringResult);
    }

    /**
     * Method under test: {@link PartyFinance#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(new PartyFinance(), null);
        assertNotEquals(new PartyFinance(), "Different type to PartyFinance");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartyFinance#equals(Object)}
     *   <li>{@link PartyFinance#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        PartyFinance partyFinance = new PartyFinance();
        assertEquals(partyFinance, partyFinance);
        int expectedHashCodeResult = partyFinance.hashCode();
        assertEquals(expectedHashCodeResult, partyFinance.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartyFinance#equals(Object)}
     *   <li>{@link PartyFinance#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        PartyFinance partyFinance = new PartyFinance();
        PartyFinance partyFinance1 = new PartyFinance();
        assertEquals(partyFinance, partyFinance1);
        int expectedHashCodeResult = partyFinance.hashCode();
        assertEquals(expectedHashCodeResult, partyFinance1.hashCode());
    }

    /**
     * Method under test: {@link PartyFinance#equals(Object)}
     */
    @Test
    void testEquals4() {
        PartyFinance partyFinance = new PartyFinance(new ArrayList<>(), "Annual Income USD", "1234",
                "Wealth Not In USAFlag", "GB");
        assertNotEquals(partyFinance, new PartyFinance());
    }

    /**
     * Method under test: {@link PartyFinance#equals(Object)}
     */
    @Test
    void testEquals5() {
        PartyFinance partyFinance = new PartyFinance();
        assertNotEquals(partyFinance,
                new PartyFinance(new ArrayList<>(), "Annual Income USD", "1234", "Wealth Not In USAFlag", "GB"));
    }

    /**
     * Method under test: {@link PartyFinance#equals(Object)}
     */
    @Test
    void testEquals6() {
        PartyFinance partyFinance = new PartyFinance();
        partyFinance.setAnnualIncomeUSD("Annual Income USD");
        assertNotEquals(partyFinance, new PartyFinance());
    }

    /**
     * Method under test: {@link PartyFinance#equals(Object)}
     */
    @Test
    void testEquals7() {
        PartyFinance partyFinance = new PartyFinance();
        partyFinance.setLiquidNetWorthAmountUSD("1234");
        assertNotEquals(partyFinance, new PartyFinance());
    }

    /**
     * Method under test: {@link PartyFinance#equals(Object)}
     */
    @Test
    void testEquals8() {
        PartyFinance partyFinance = new PartyFinance();
        partyFinance.setWealthNotInUSAFlag("Wealth Not In USAFlag");
        assertNotEquals(partyFinance, new PartyFinance());
    }

    /**
     * Method under test: {@link PartyFinance#equals(Object)}
     */
    @Test
    void testEquals9() {
        PartyFinance partyFinance = new PartyFinance();
        partyFinance.setWealthNotInUSACountry("GB");
        assertNotEquals(partyFinance, new PartyFinance());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartyFinance#equals(Object)}
     *   <li>{@link PartyFinance#hashCode()}
     * </ul>
     */
    @Test
    void testEquals10() {
        PartyFinance partyFinance = new PartyFinance(new ArrayList<>(), "Annual Income USD", "1234",
                "Wealth Not In USAFlag", "GB");
        PartyFinance partyFinance1 = new PartyFinance(new ArrayList<>(), "Annual Income USD", "1234",
                "Wealth Not In USAFlag", "GB");

        assertEquals(partyFinance, partyFinance1);
        int expectedHashCodeResult = partyFinance.hashCode();
        assertEquals(expectedHashCodeResult, partyFinance1.hashCode());
    }

    /**
     * Method under test: {@link PartyFinance#equals(Object)}
     */
    @Test
    void testEquals11() {
        PartyFinance partyFinance = new PartyFinance();

        PartyFinance partyFinance1 = new PartyFinance();
        partyFinance1.setAnnualIncomeUSD("Annual Income USD");
        assertNotEquals(partyFinance, partyFinance1);
    }

    /**
     * Method under test: {@link PartyFinance#equals(Object)}
     */
    @Test
    void testEquals12() {
        PartyFinance partyFinance = new PartyFinance();

        PartyFinance partyFinance1 = new PartyFinance();
        partyFinance1.setLiquidNetWorthAmountUSD("1234");
        assertNotEquals(partyFinance, partyFinance1);
    }

    /**
     * Method under test: {@link PartyFinance#equals(Object)}
     */
    @Test
    void testEquals13() {
        PartyFinance partyFinance = new PartyFinance();

        PartyFinance partyFinance1 = new PartyFinance();
        partyFinance1.setWealthNotInUSAFlag("Wealth Not In USAFlag");
        assertNotEquals(partyFinance, partyFinance1);
    }

    /**
     * Method under test: {@link PartyFinance#equals(Object)}
     */
    @Test
    void testEquals14() {
        PartyFinance partyFinance = new PartyFinance();

        PartyFinance partyFinance1 = new PartyFinance();
        partyFinance1.setWealthNotInUSACountry("GB");
        assertNotEquals(partyFinance, partyFinance1);
    }
}

