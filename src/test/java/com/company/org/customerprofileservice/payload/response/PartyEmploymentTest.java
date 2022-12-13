package com.company.org.customerprofileservice.payload.response;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

class PartyEmploymentTest {
    /**
     * Method under test: {@link PartyEmployment#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new PartyEmployment()).canEqual("Other"));
    }

    /**
     * Method under test: {@link PartyEmployment#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        PartyEmployment partyEmployment = new PartyEmployment();
        assertTrue(partyEmployment.canEqual(new PartyEmployment()));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartyEmployment#PartyEmployment()}
     *   <li>{@link PartyEmployment#setEmployerMailingAddress(EmployerMailingAddress)}
     *   <li>{@link PartyEmployment#setEmployerName(String)}
     *   <li>{@link PartyEmployment#setEmploymentStatus(String)}
     *   <li>{@link PartyEmployment#setEmploymentType(String)}
     *   <li>{@link PartyEmployment#setIndustry(String)}
     *   <li>{@link PartyEmployment#setIsRestrictedIndustryFlag(String)}
     *   <li>{@link PartyEmployment#setIsSensitiveIndustryFlag(String)}
     *   <li>{@link PartyEmployment#setOccupation(String)}
     *   <li>{@link PartyEmployment#setSubIndustry(String)}
     *   <li>{@link PartyEmployment#toString()}
     *   <li>{@link PartyEmployment#getEmployerMailingAddress()}
     *   <li>{@link PartyEmployment#getEmployerName()}
     *   <li>{@link PartyEmployment#getEmploymentStatus()}
     *   <li>{@link PartyEmployment#getEmploymentType()}
     *   <li>{@link PartyEmployment#getIndustry()}
     *   <li>{@link PartyEmployment#getIsRestrictedIndustryFlag()}
     *   <li>{@link PartyEmployment#getIsSensitiveIndustryFlag()}
     *   <li>{@link PartyEmployment#getOccupation()}
     *   <li>{@link PartyEmployment#getSubIndustry()}
     * </ul>
     */
    @Test
    void testConstructor() {
        PartyEmployment actualPartyEmployment = new PartyEmployment();
        EmployerMailingAddress employerMailingAddress = new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford",
                "MD", "Postal Code", "GB");

        actualPartyEmployment.setEmployerMailingAddress(employerMailingAddress);
        actualPartyEmployment.setEmployerName("Employer Name");
        actualPartyEmployment.setEmploymentStatus("Employment Status");
        actualPartyEmployment.setEmploymentType("Employment Type");
        actualPartyEmployment.setIndustry("Industry");
        actualPartyEmployment.setIsRestrictedIndustryFlag("Is Restricted Industry Flag");
        actualPartyEmployment.setIsSensitiveIndustryFlag("Is Sensitive Industry Flag");
        actualPartyEmployment.setOccupation("Occupation");
        actualPartyEmployment.setSubIndustry("Sub Industry");
        String actualToStringResult = actualPartyEmployment.toString();
        assertSame(employerMailingAddress, actualPartyEmployment.getEmployerMailingAddress());
        assertEquals("Employer Name", actualPartyEmployment.getEmployerName());
        assertEquals("Employment Status", actualPartyEmployment.getEmploymentStatus());
        assertEquals("Employment Type", actualPartyEmployment.getEmploymentType());
        assertEquals("Industry", actualPartyEmployment.getIndustry());
        assertEquals("Is Restricted Industry Flag", actualPartyEmployment.getIsRestrictedIndustryFlag());
        assertEquals("Is Sensitive Industry Flag", actualPartyEmployment.getIsSensitiveIndustryFlag());
        assertEquals("Occupation", actualPartyEmployment.getOccupation());
        assertEquals("Sub Industry", actualPartyEmployment.getSubIndustry());
        assertEquals(
                "PartyEmployment(employmentStatus=Employment Status, employmentType=Employment Type, employerName=Employer"
                        + " Name, isRestrictedIndustryFlag=Is Restricted Industry Flag, isSensitiveIndustryFlag=Is Sensitive"
                        + " Industry Flag, industry=Industry, subIndustry=Sub Industry, occupation=Occupation, employerMailingAddress"
                        + "=EmployerMailingAddress(addressLine1=42 Main St, addressLine2=42 Main St, city=Oxford, state=MD,"
                        + " postalCode=Postal Code, countryCode=GB))",
                actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartyEmployment#PartyEmployment(String, String, String, String, String, String, String, String, EmployerMailingAddress)}
     *   <li>{@link PartyEmployment#setEmployerMailingAddress(EmployerMailingAddress)}
     *   <li>{@link PartyEmployment#setEmployerName(String)}
     *   <li>{@link PartyEmployment#setEmploymentStatus(String)}
     *   <li>{@link PartyEmployment#setEmploymentType(String)}
     *   <li>{@link PartyEmployment#setIndustry(String)}
     *   <li>{@link PartyEmployment#setIsRestrictedIndustryFlag(String)}
     *   <li>{@link PartyEmployment#setIsSensitiveIndustryFlag(String)}
     *   <li>{@link PartyEmployment#setOccupation(String)}
     *   <li>{@link PartyEmployment#setSubIndustry(String)}
     *   <li>{@link PartyEmployment#toString()}
     *   <li>{@link PartyEmployment#getEmployerMailingAddress()}
     *   <li>{@link PartyEmployment#getEmployerName()}
     *   <li>{@link PartyEmployment#getEmploymentStatus()}
     *   <li>{@link PartyEmployment#getEmploymentType()}
     *   <li>{@link PartyEmployment#getIndustry()}
     *   <li>{@link PartyEmployment#getIsRestrictedIndustryFlag()}
     *   <li>{@link PartyEmployment#getIsSensitiveIndustryFlag()}
     *   <li>{@link PartyEmployment#getOccupation()}
     *   <li>{@link PartyEmployment#getSubIndustry()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        EmployerMailingAddress employerMailingAddress = new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford",
                "MD", "Postal Code", "GB");

        PartyEmployment actualPartyEmployment = new PartyEmployment("Employment Status", "Employment Type",
                "Employer Name", "Is Restricted Industry Flag", "Is Sensitive Industry Flag", "Industry", "Sub Industry",
                "Occupation", employerMailingAddress);
        EmployerMailingAddress employerMailingAddress1 = new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford",
                "MD", "Postal Code", "GB");

        actualPartyEmployment.setEmployerMailingAddress(employerMailingAddress1);
        actualPartyEmployment.setEmployerName("Employer Name");
        actualPartyEmployment.setEmploymentStatus("Employment Status");
        actualPartyEmployment.setEmploymentType("Employment Type");
        actualPartyEmployment.setIndustry("Industry");
        actualPartyEmployment.setIsRestrictedIndustryFlag("Is Restricted Industry Flag");
        actualPartyEmployment.setIsSensitiveIndustryFlag("Is Sensitive Industry Flag");
        actualPartyEmployment.setOccupation("Occupation");
        actualPartyEmployment.setSubIndustry("Sub Industry");
        String actualToStringResult = actualPartyEmployment.toString();
        EmployerMailingAddress employerMailingAddress2 = actualPartyEmployment.getEmployerMailingAddress();
        assertSame(employerMailingAddress1, employerMailingAddress2);
        assertEquals(employerMailingAddress, employerMailingAddress2);
        assertEquals("Employer Name", actualPartyEmployment.getEmployerName());
        assertEquals("Employment Status", actualPartyEmployment.getEmploymentStatus());
        assertEquals("Employment Type", actualPartyEmployment.getEmploymentType());
        assertEquals("Industry", actualPartyEmployment.getIndustry());
        assertEquals("Is Restricted Industry Flag", actualPartyEmployment.getIsRestrictedIndustryFlag());
        assertEquals("Is Sensitive Industry Flag", actualPartyEmployment.getIsSensitiveIndustryFlag());
        assertEquals("Occupation", actualPartyEmployment.getOccupation());
        assertEquals("Sub Industry", actualPartyEmployment.getSubIndustry());
        assertEquals(
                "PartyEmployment(employmentStatus=Employment Status, employmentType=Employment Type, employerName=Employer"
                        + " Name, isRestrictedIndustryFlag=Is Restricted Industry Flag, isSensitiveIndustryFlag=Is Sensitive"
                        + " Industry Flag, industry=Industry, subIndustry=Sub Industry, occupation=Occupation, employerMailingAddress"
                        + "=EmployerMailingAddress(addressLine1=42 Main St, addressLine2=42 Main St, city=Oxford, state=MD,"
                        + " postalCode=Postal Code, countryCode=GB))",
                actualToStringResult);
    }

    /**
     * Method under test: {@link PartyEmployment#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(new PartyEmployment(), null);
        assertNotEquals(new PartyEmployment(), "Different type to PartyEmployment");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartyEmployment#equals(Object)}
     *   <li>{@link PartyEmployment#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        PartyEmployment partyEmployment = new PartyEmployment();
        assertEquals(partyEmployment, partyEmployment);
        int expectedHashCodeResult = partyEmployment.hashCode();
        assertEquals(expectedHashCodeResult, partyEmployment.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartyEmployment#equals(Object)}
     *   <li>{@link PartyEmployment#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        PartyEmployment partyEmployment = new PartyEmployment();
        PartyEmployment partyEmployment1 = new PartyEmployment();
        assertEquals(partyEmployment, partyEmployment1);
        int expectedHashCodeResult = partyEmployment.hashCode();
        assertEquals(expectedHashCodeResult, partyEmployment1.hashCode());
    }

    /**
     * Method under test: {@link PartyEmployment#equals(Object)}
     */
    @Test
    void testEquals4() {
        PartyEmployment partyEmployment = new PartyEmployment("Employment Status", "Employment Type", "Employer Name",
                "Is Restricted Industry Flag", "Is Sensitive Industry Flag", "Industry", "Sub Industry", "Occupation",
                new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
        assertNotEquals(partyEmployment, new PartyEmployment());
    }

    /**
     * Method under test: {@link PartyEmployment#equals(Object)}
     */
    @Test
    void testEquals5() {
        PartyEmployment partyEmployment = new PartyEmployment();
        assertNotEquals(partyEmployment,
                new PartyEmployment("Employment Status", "Employment Type", "Employer Name", "Is Restricted Industry Flag",
                        "Is Sensitive Industry Flag", "Industry", "Sub Industry", "Occupation",
                        new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB")));
    }

    /**
     * Method under test: {@link PartyEmployment#equals(Object)}
     */
    @Test
    void testEquals6() {
        PartyEmployment partyEmployment = new PartyEmployment();
        partyEmployment.setEmploymentType("Employment Type");
        assertNotEquals(partyEmployment, new PartyEmployment());
    }

    /**
     * Method under test: {@link PartyEmployment#equals(Object)}
     */
    @Test
    void testEquals7() {
        PartyEmployment partyEmployment = new PartyEmployment();
        partyEmployment.setEmployerName("Employer Name");
        assertNotEquals(partyEmployment, new PartyEmployment());
    }

    /**
     * Method under test: {@link PartyEmployment#equals(Object)}
     */
    @Test
    void testEquals8() {
        PartyEmployment partyEmployment = new PartyEmployment();
        partyEmployment.setIsRestrictedIndustryFlag("Is Restricted Industry Flag");
        assertNotEquals(partyEmployment, new PartyEmployment());
    }

    /**
     * Method under test: {@link PartyEmployment#equals(Object)}
     */
    @Test
    void testEquals9() {
        PartyEmployment partyEmployment = new PartyEmployment();
        partyEmployment.setIsSensitiveIndustryFlag("Is Sensitive Industry Flag");
        assertNotEquals(partyEmployment, new PartyEmployment());
    }

    /**
     * Method under test: {@link PartyEmployment#equals(Object)}
     */
    @Test
    void testEquals10() {
        PartyEmployment partyEmployment = new PartyEmployment();
        partyEmployment.setIndustry("Industry");
        assertNotEquals(partyEmployment, new PartyEmployment());
    }

    /**
     * Method under test: {@link PartyEmployment#equals(Object)}
     */
    @Test
    void testEquals11() {
        PartyEmployment partyEmployment = new PartyEmployment();
        partyEmployment.setSubIndustry("Sub Industry");
        assertNotEquals(partyEmployment, new PartyEmployment());
    }

    /**
     * Method under test: {@link PartyEmployment#equals(Object)}
     */
    @Test
    void testEquals12() {
        PartyEmployment partyEmployment = new PartyEmployment();
        partyEmployment.setOccupation("Occupation");
        assertNotEquals(partyEmployment, new PartyEmployment());
    }

    /**
     * Method under test: {@link PartyEmployment#equals(Object)}
     */
    @Test
    void testEquals13() {
        PartyEmployment partyEmployment = new PartyEmployment();
        partyEmployment.setEmployerMailingAddress(
                new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
        assertNotEquals(partyEmployment, new PartyEmployment());
    }

    /**
     * Method under test: {@link PartyEmployment#equals(Object)}
     */
    @Test
    void testEquals14() {
        PartyEmployment partyEmployment = new PartyEmployment("Employment Status", "Employment Type", "Employer Name",
                "Is Restricted Industry Flag", "Is Sensitive Industry Flag", "Industry", "Sub Industry", "Occupation",
                mock(EmployerMailingAddress.class));
        assertNotEquals(partyEmployment, new PartyEmployment());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PartyEmployment#equals(Object)}
     *   <li>{@link PartyEmployment#hashCode()}
     * </ul>
     */
    @Test
    void testEquals15() {
        PartyEmployment partyEmployment = new PartyEmployment("Employment Status", "Employment Type", "Employer Name",
                "Is Restricted Industry Flag", "Is Sensitive Industry Flag", "Industry", "Sub Industry", "Occupation",
                new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
        PartyEmployment partyEmployment1 = new PartyEmployment("Employment Status", "Employment Type", "Employer Name",
                "Is Restricted Industry Flag", "Is Sensitive Industry Flag", "Industry", "Sub Industry", "Occupation",
                new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));

        assertEquals(partyEmployment, partyEmployment1);
        int expectedHashCodeResult = partyEmployment.hashCode();
        assertEquals(expectedHashCodeResult, partyEmployment1.hashCode());
    }

    /**
     * Method under test: {@link PartyEmployment#equals(Object)}
     */
    @Test
    void testEquals16() {
        PartyEmployment partyEmployment = new PartyEmployment();

        PartyEmployment partyEmployment1 = new PartyEmployment();
        partyEmployment1.setEmploymentType("Employment Type");
        assertNotEquals(partyEmployment, partyEmployment1);
    }

    /**
     * Method under test: {@link PartyEmployment#equals(Object)}
     */
    @Test
    void testEquals17() {
        PartyEmployment partyEmployment = new PartyEmployment();

        PartyEmployment partyEmployment1 = new PartyEmployment();
        partyEmployment1.setEmployerName("Employer Name");
        assertNotEquals(partyEmployment, partyEmployment1);
    }

    /**
     * Method under test: {@link PartyEmployment#equals(Object)}
     */
    @Test
    void testEquals18() {
        PartyEmployment partyEmployment = new PartyEmployment();

        PartyEmployment partyEmployment1 = new PartyEmployment();
        partyEmployment1.setIsRestrictedIndustryFlag("Is Restricted Industry Flag");
        assertNotEquals(partyEmployment, partyEmployment1);
    }

    /**
     * Method under test: {@link PartyEmployment#equals(Object)}
     */
    @Test
    void testEquals19() {
        PartyEmployment partyEmployment = new PartyEmployment();

        PartyEmployment partyEmployment1 = new PartyEmployment();
        partyEmployment1.setIsSensitiveIndustryFlag("Is Sensitive Industry Flag");
        assertNotEquals(partyEmployment, partyEmployment1);
    }

    /**
     * Method under test: {@link PartyEmployment#equals(Object)}
     */
    @Test
    void testEquals20() {
        PartyEmployment partyEmployment = new PartyEmployment();

        PartyEmployment partyEmployment1 = new PartyEmployment();
        partyEmployment1.setIndustry("Industry");
        assertNotEquals(partyEmployment, partyEmployment1);
    }

    /**
     * Method under test: {@link PartyEmployment#equals(Object)}
     */
    @Test
    void testEquals21() {
        PartyEmployment partyEmployment = new PartyEmployment();

        PartyEmployment partyEmployment1 = new PartyEmployment();
        partyEmployment1.setSubIndustry("Sub Industry");
        assertNotEquals(partyEmployment, partyEmployment1);
    }

    /**
     * Method under test: {@link PartyEmployment#equals(Object)}
     */
    @Test
    void testEquals22() {
        PartyEmployment partyEmployment = new PartyEmployment();

        PartyEmployment partyEmployment1 = new PartyEmployment();
        partyEmployment1.setOccupation("Occupation");
        assertNotEquals(partyEmployment, partyEmployment1);
    }

    /**
     * Method under test: {@link PartyEmployment#equals(Object)}
     */
    @Test
    void testEquals23() {
        PartyEmployment partyEmployment = new PartyEmployment();

        PartyEmployment partyEmployment1 = new PartyEmployment();
        partyEmployment1.setEmployerMailingAddress(
                new EmployerMailingAddress("42 Main St", "42 Main St", "Oxford", "MD", "Postal Code", "GB"));
        assertNotEquals(partyEmployment, partyEmployment1);
    }

    /**
     * Method under test: {@link PartyEmployment#equals(Object)}
     */
    @Test
    void testEquals24() {
        PartyEmployment partyEmployment = new PartyEmployment();
        partyEmployment.setEmployerMailingAddress(mock(EmployerMailingAddress.class));
        assertNotEquals(partyEmployment, new PartyEmployment());
    }
}

