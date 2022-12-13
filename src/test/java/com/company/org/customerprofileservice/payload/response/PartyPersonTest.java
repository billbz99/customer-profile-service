package com.company.org.customerprofileservice.payload.response;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PartyPersonTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartyPerson#PartyPerson()}
     *   <li>{@link PartyPerson#setBirthDate(String)}
     *   <li>{@link PartyPerson#setCitizenshipCountry(String)}
     *   <li>{@link PartyPerson#setClassificationCode(String)}
     *   <li>{@link PartyPerson#setDeceasedFlag(String)}
     *   <li>{@link PartyPerson#setFirstName(String)}
     *   <li>{@link PartyPerson#setInformalName(String)}
     *   <li>{@link PartyPerson#setLastName(String)}
     *   <li>{@link PartyPerson#setLastUpdateDate(String)}
     *   <li>{@link PartyPerson#setMaidenName(String)}
     *   <li>{@link PartyPerson#setMiddleInitial(String)}
     *   <li>{@link PartyPerson#setMiddleName(String)}
     *   <li>{@link PartyPerson#setPartyUniqueIdentifier(String)}
     *   <li>{@link PartyPerson#setPreferredLanguage(ArrayList)}
     *   <li>{@link PartyPerson#setPrefixName(String)}
     *   <li>{@link PartyPerson#setSuffixName(String)}
     *   <li>{@link PartyPerson#toString()}
     *   <li>{@link PartyPerson#getBirthDate()}
     *   <li>{@link PartyPerson#getCitizenshipCountry()}
     *   <li>{@link PartyPerson#getClassificationCode()}
     *   <li>{@link PartyPerson#getDeceasedFlag()}
     *   <li>{@link PartyPerson#getFirstName()}
     *   <li>{@link PartyPerson#getInformalName()}
     *   <li>{@link PartyPerson#getLastName()}
     *   <li>{@link PartyPerson#getLastUpdateDate()}
     *   <li>{@link PartyPerson#getMaidenName()}
     *   <li>{@link PartyPerson#getMiddleInitial()}
     *   <li>{@link PartyPerson#getMiddleName()}
     *   <li>{@link PartyPerson#getPartyUniqueIdentifier()}
     *   <li>{@link PartyPerson#getPreferredLanguage()}
     *   <li>{@link PartyPerson#getPrefixName()}
     *   <li>{@link PartyPerson#getSuffixName()}
     * </ul>
     */
    @Test
    void testConstructor() {
        PartyPerson actualPartyPerson = new PartyPerson();
        actualPartyPerson.setBirthDate("2020-03-01");
        actualPartyPerson.setCitizenshipCountry("GB");
        actualPartyPerson.setClassificationCode("Classification Code");
        actualPartyPerson.setDeceasedFlag("Deceased Flag");
        actualPartyPerson.setFirstName("Jane");
        actualPartyPerson.setInformalName("Informal Name");
        actualPartyPerson.setLastName("Doe");
        actualPartyPerson.setLastUpdateDate("2020-03-01");
        actualPartyPerson.setMaidenName("Maiden Name");
        actualPartyPerson.setMiddleInitial("Middle Initial");
        actualPartyPerson.setMiddleName("Middle Name");
        actualPartyPerson.setPartyUniqueIdentifier("42");
        ArrayList<String> stringList = new ArrayList<>();
        actualPartyPerson.setPreferredLanguage(stringList);
        actualPartyPerson.setPrefixName("Prefix Name");
        actualPartyPerson.setSuffixName("Suffix Name");
        String actualToStringResult = actualPartyPerson.toString();
        assertEquals("2020-03-01", actualPartyPerson.getBirthDate());
        assertEquals("GB", actualPartyPerson.getCitizenshipCountry());
        assertEquals("Classification Code", actualPartyPerson.getClassificationCode());
        assertEquals("Deceased Flag", actualPartyPerson.getDeceasedFlag());
        assertEquals("Jane", actualPartyPerson.getFirstName());
        assertEquals("Informal Name", actualPartyPerson.getInformalName());
        assertEquals("Doe", actualPartyPerson.getLastName());
        assertEquals("2020-03-01", actualPartyPerson.getLastUpdateDate());
        assertEquals("Maiden Name", actualPartyPerson.getMaidenName());
        assertEquals("Middle Initial", actualPartyPerson.getMiddleInitial());
        assertEquals("Middle Name", actualPartyPerson.getMiddleName());
        assertEquals("42", actualPartyPerson.getPartyUniqueIdentifier());
        assertSame(stringList, actualPartyPerson.getPreferredLanguage());
        assertEquals("Prefix Name", actualPartyPerson.getPrefixName());
        assertEquals("Suffix Name", actualPartyPerson.getSuffixName());
        assertEquals(
                "PartyPerson(partyUniqueIdentifier=42, prefixName=Prefix Name, firstName=Jane, middleName=Middle Name,"
                        + " middleInitial=Middle Initial, lastName=Doe, suffixName=Suffix Name, maidenName=Maiden Name,"
                        + " informalName=Informal Name, birthDate=2020-03-01, deceasedFlag=Deceased Flag, citizenshipCountry=GB,"
                        + " lastUpdateDate=2020-03-01, classificationCode=Classification Code, preferredLanguage=[])",
                actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartyPerson#PartyPerson(String, String, String, String, String, String, String, String, String, String, String, String, String, String, ArrayList)}
     *   <li>{@link PartyPerson#setBirthDate(String)}
     *   <li>{@link PartyPerson#setCitizenshipCountry(String)}
     *   <li>{@link PartyPerson#setClassificationCode(String)}
     *   <li>{@link PartyPerson#setDeceasedFlag(String)}
     *   <li>{@link PartyPerson#setFirstName(String)}
     *   <li>{@link PartyPerson#setInformalName(String)}
     *   <li>{@link PartyPerson#setLastName(String)}
     *   <li>{@link PartyPerson#setLastUpdateDate(String)}
     *   <li>{@link PartyPerson#setMaidenName(String)}
     *   <li>{@link PartyPerson#setMiddleInitial(String)}
     *   <li>{@link PartyPerson#setMiddleName(String)}
     *   <li>{@link PartyPerson#setPartyUniqueIdentifier(String)}
     *   <li>{@link PartyPerson#setPreferredLanguage(ArrayList)}
     *   <li>{@link PartyPerson#setPrefixName(String)}
     *   <li>{@link PartyPerson#setSuffixName(String)}
     *   <li>{@link PartyPerson#toString()}
     *   <li>{@link PartyPerson#getBirthDate()}
     *   <li>{@link PartyPerson#getCitizenshipCountry()}
     *   <li>{@link PartyPerson#getClassificationCode()}
     *   <li>{@link PartyPerson#getDeceasedFlag()}
     *   <li>{@link PartyPerson#getFirstName()}
     *   <li>{@link PartyPerson#getInformalName()}
     *   <li>{@link PartyPerson#getLastName()}
     *   <li>{@link PartyPerson#getLastUpdateDate()}
     *   <li>{@link PartyPerson#getMaidenName()}
     *   <li>{@link PartyPerson#getMiddleInitial()}
     *   <li>{@link PartyPerson#getMiddleName()}
     *   <li>{@link PartyPerson#getPartyUniqueIdentifier()}
     *   <li>{@link PartyPerson#getPreferredLanguage()}
     *   <li>{@link PartyPerson#getPrefixName()}
     *   <li>{@link PartyPerson#getSuffixName()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        ArrayList<String> stringList = new ArrayList<>();
        PartyPerson actualPartyPerson = new PartyPerson("42", "Prefix Name", "Jane", "Middle Name", "Middle Initial",
                "Doe", "Suffix Name", "Maiden Name", "Informal Name", "2020-03-01", "Deceased Flag", "GB", "2020-03-01",
                "Classification Code", stringList);
        actualPartyPerson.setBirthDate("2020-03-01");
        actualPartyPerson.setCitizenshipCountry("GB");
        actualPartyPerson.setClassificationCode("Classification Code");
        actualPartyPerson.setDeceasedFlag("Deceased Flag");
        actualPartyPerson.setFirstName("Jane");
        actualPartyPerson.setInformalName("Informal Name");
        actualPartyPerson.setLastName("Doe");
        actualPartyPerson.setLastUpdateDate("2020-03-01");
        actualPartyPerson.setMaidenName("Maiden Name");
        actualPartyPerson.setMiddleInitial("Middle Initial");
        actualPartyPerson.setMiddleName("Middle Name");
        actualPartyPerson.setPartyUniqueIdentifier("42");
        ArrayList<String> stringList1 = new ArrayList<>();
        actualPartyPerson.setPreferredLanguage(stringList1);
        actualPartyPerson.setPrefixName("Prefix Name");
        actualPartyPerson.setSuffixName("Suffix Name");
        String actualToStringResult = actualPartyPerson.toString();
        assertEquals("2020-03-01", actualPartyPerson.getBirthDate());
        assertEquals("GB", actualPartyPerson.getCitizenshipCountry());
        assertEquals("Classification Code", actualPartyPerson.getClassificationCode());
        assertEquals("Deceased Flag", actualPartyPerson.getDeceasedFlag());
        assertEquals("Jane", actualPartyPerson.getFirstName());
        assertEquals("Informal Name", actualPartyPerson.getInformalName());
        assertEquals("Doe", actualPartyPerson.getLastName());
        assertEquals("2020-03-01", actualPartyPerson.getLastUpdateDate());
        assertEquals("Maiden Name", actualPartyPerson.getMaidenName());
        assertEquals("Middle Initial", actualPartyPerson.getMiddleInitial());
        assertEquals("Middle Name", actualPartyPerson.getMiddleName());
        assertEquals("42", actualPartyPerson.getPartyUniqueIdentifier());
        ArrayList<String> preferredLanguage = actualPartyPerson.getPreferredLanguage();
        assertSame(stringList1, preferredLanguage);
        assertEquals(stringList, preferredLanguage);
        assertEquals("Prefix Name", actualPartyPerson.getPrefixName());
        assertEquals("Suffix Name", actualPartyPerson.getSuffixName());
        assertEquals(
                "PartyPerson(partyUniqueIdentifier=42, prefixName=Prefix Name, firstName=Jane, middleName=Middle Name,"
                        + " middleInitial=Middle Initial, lastName=Doe, suffixName=Suffix Name, maidenName=Maiden Name,"
                        + " informalName=Informal Name, birthDate=2020-03-01, deceasedFlag=Deceased Flag, citizenshipCountry=GB,"
                        + " lastUpdateDate=2020-03-01, classificationCode=Classification Code, preferredLanguage=[])",
                actualToStringResult);
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(new PartyPerson(), null);
        assertNotEquals(new PartyPerson(), "Different type to PartyPerson");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartyPerson#equals(Object)}
     *   <li>{@link PartyPerson#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        PartyPerson partyPerson = new PartyPerson();
        assertEquals(partyPerson, partyPerson);
        int expectedHashCodeResult = partyPerson.hashCode();
        assertEquals(expectedHashCodeResult, partyPerson.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartyPerson#equals(Object)}
     *   <li>{@link PartyPerson#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        PartyPerson partyPerson = new PartyPerson();
        PartyPerson partyPerson1 = new PartyPerson();
        assertEquals(partyPerson, partyPerson1);
        int expectedHashCodeResult = partyPerson.hashCode();
        assertEquals(expectedHashCodeResult, partyPerson1.hashCode());
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals4() {
        PartyPerson partyPerson = new PartyPerson("42", "Prefix Name", "Jane", "Middle Name", "Middle Initial", "Doe",
                "Suffix Name", "Maiden Name", "Informal Name", "2020-03-01", "Deceased Flag", "GB", "2020-03-01",
                "Classification Code", new ArrayList<>());
        assertNotEquals(partyPerson, new PartyPerson());
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals5() {
        PartyPerson partyPerson = new PartyPerson();
        assertNotEquals(partyPerson,
                new PartyPerson("42", "Prefix Name", "Jane", "Middle Name", "Middle Initial", "Doe", "Suffix Name",
                        "Maiden Name", "Informal Name", "2020-03-01", "Deceased Flag", "GB", "2020-03-01", "Classification Code",
                        new ArrayList<>()));
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals6() {
        PartyPerson partyPerson = new PartyPerson();
        partyPerson.setPrefixName("Prefix Name");
        assertNotEquals(partyPerson, new PartyPerson());
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals7() {
        PartyPerson partyPerson = new PartyPerson();
        partyPerson.setFirstName("Jane");
        assertNotEquals(partyPerson, new PartyPerson());
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals8() {
        PartyPerson partyPerson = new PartyPerson();
        partyPerson.setMiddleName("Middle Name");
        assertNotEquals(partyPerson, new PartyPerson());
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals9() {
        PartyPerson partyPerson = new PartyPerson();
        partyPerson.setMiddleInitial("Middle Initial");
        assertNotEquals(partyPerson, new PartyPerson());
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals10() {
        PartyPerson partyPerson = new PartyPerson();
        partyPerson.setLastName("Doe");
        assertNotEquals(partyPerson, new PartyPerson());
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals11() {
        PartyPerson partyPerson = new PartyPerson();
        partyPerson.setSuffixName("Suffix Name");
        assertNotEquals(partyPerson, new PartyPerson());
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals12() {
        PartyPerson partyPerson = new PartyPerson();
        partyPerson.setMaidenName("Maiden Name");
        assertNotEquals(partyPerson, new PartyPerson());
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals13() {
        PartyPerson partyPerson = new PartyPerson();
        partyPerson.setInformalName("Informal Name");
        assertNotEquals(partyPerson, new PartyPerson());
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals14() {
        PartyPerson partyPerson = new PartyPerson();
        partyPerson.setBirthDate("2020-03-01");
        assertNotEquals(partyPerson, new PartyPerson());
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals15() {
        PartyPerson partyPerson = new PartyPerson();
        partyPerson.setDeceasedFlag("Deceased Flag");
        assertNotEquals(partyPerson, new PartyPerson());
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals16() {
        PartyPerson partyPerson = new PartyPerson();
        partyPerson.setCitizenshipCountry("GB");
        assertNotEquals(partyPerson, new PartyPerson());
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals17() {
        PartyPerson partyPerson = new PartyPerson();
        partyPerson.setLastUpdateDate("2020-03-01");
        assertNotEquals(partyPerson, new PartyPerson());
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals18() {
        PartyPerson partyPerson = new PartyPerson();
        partyPerson.setClassificationCode("Classification Code");
        assertNotEquals(partyPerson, new PartyPerson());
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals19() {
        PartyPerson partyPerson = new PartyPerson();
        partyPerson.setPreferredLanguage(new ArrayList<>());
        assertNotEquals(partyPerson, new PartyPerson());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartyPerson#equals(Object)}
     *   <li>{@link PartyPerson#hashCode()}
     * </ul>
     */
    @Test
    void testEquals20() {
        PartyPerson partyPerson = new PartyPerson("42", "Prefix Name", "Jane", "Middle Name", "Middle Initial", "Doe",
                "Suffix Name", "Maiden Name", "Informal Name", "2020-03-01", "Deceased Flag", "GB", "2020-03-01",
                "Classification Code", new ArrayList<>());
        PartyPerson partyPerson1 = new PartyPerson("42", "Prefix Name", "Jane", "Middle Name", "Middle Initial", "Doe",
                "Suffix Name", "Maiden Name", "Informal Name", "2020-03-01", "Deceased Flag", "GB", "2020-03-01",
                "Classification Code", new ArrayList<>());

        assertEquals(partyPerson, partyPerson1);
        int expectedHashCodeResult = partyPerson.hashCode();
        assertEquals(expectedHashCodeResult, partyPerson1.hashCode());
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals21() {
        PartyPerson partyPerson = new PartyPerson();

        PartyPerson partyPerson1 = new PartyPerson();
        partyPerson1.setPrefixName("Prefix Name");
        assertNotEquals(partyPerson, partyPerson1);
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals22() {
        PartyPerson partyPerson = new PartyPerson();

        PartyPerson partyPerson1 = new PartyPerson();
        partyPerson1.setFirstName("Jane");
        assertNotEquals(partyPerson, partyPerson1);
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals23() {
        PartyPerson partyPerson = new PartyPerson();

        PartyPerson partyPerson1 = new PartyPerson();
        partyPerson1.setMiddleName("Middle Name");
        assertNotEquals(partyPerson, partyPerson1);
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals24() {
        PartyPerson partyPerson = new PartyPerson();

        PartyPerson partyPerson1 = new PartyPerson();
        partyPerson1.setMiddleInitial("Middle Initial");
        assertNotEquals(partyPerson, partyPerson1);
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals25() {
        PartyPerson partyPerson = new PartyPerson();

        PartyPerson partyPerson1 = new PartyPerson();
        partyPerson1.setLastName("Doe");
        assertNotEquals(partyPerson, partyPerson1);
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals26() {
        PartyPerson partyPerson = new PartyPerson();

        PartyPerson partyPerson1 = new PartyPerson();
        partyPerson1.setSuffixName("Suffix Name");
        assertNotEquals(partyPerson, partyPerson1);
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals27() {
        PartyPerson partyPerson = new PartyPerson();

        PartyPerson partyPerson1 = new PartyPerson();
        partyPerson1.setMaidenName("Maiden Name");
        assertNotEquals(partyPerson, partyPerson1);
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals28() {
        PartyPerson partyPerson = new PartyPerson();

        PartyPerson partyPerson1 = new PartyPerson();
        partyPerson1.setInformalName("Informal Name");
        assertNotEquals(partyPerson, partyPerson1);
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals29() {
        PartyPerson partyPerson = new PartyPerson();

        PartyPerson partyPerson1 = new PartyPerson();
        partyPerson1.setBirthDate("2020-03-01");
        assertNotEquals(partyPerson, partyPerson1);
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals30() {
        PartyPerson partyPerson = new PartyPerson();

        PartyPerson partyPerson1 = new PartyPerson();
        partyPerson1.setDeceasedFlag("Deceased Flag");
        assertNotEquals(partyPerson, partyPerson1);
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals31() {
        PartyPerson partyPerson = new PartyPerson();

        PartyPerson partyPerson1 = new PartyPerson();
        partyPerson1.setCitizenshipCountry("GB");
        assertNotEquals(partyPerson, partyPerson1);
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals32() {
        PartyPerson partyPerson = new PartyPerson();

        PartyPerson partyPerson1 = new PartyPerson();
        partyPerson1.setLastUpdateDate("2020-03-01");
        assertNotEquals(partyPerson, partyPerson1);
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals33() {
        PartyPerson partyPerson = new PartyPerson();

        PartyPerson partyPerson1 = new PartyPerson();
        partyPerson1.setClassificationCode("Classification Code");
        assertNotEquals(partyPerson, partyPerson1);
    }

    /**
     * Method under test: {@link PartyPerson#equals(Object)}
     */
    @Test
    void testEquals34() {
        PartyPerson partyPerson = new PartyPerson();

        PartyPerson partyPerson1 = new PartyPerson();
        partyPerson1.setPreferredLanguage(new ArrayList<>());
        assertNotEquals(partyPerson, partyPerson1);
    }
}

