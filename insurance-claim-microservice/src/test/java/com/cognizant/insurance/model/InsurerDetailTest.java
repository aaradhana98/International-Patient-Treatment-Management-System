package com.cognizant.insurance.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author Isha, Aaradhana, Nikhil, Adisha
 * 
 * 		the class tests all the setters and getters and constructors
 * 		for the Insurer Detail  
 *
 */
public class InsurerDetailTest {

	InsurerDetail insurerDetail = new InsurerDetail();

	@Test
	public void test_SetId() {
		insurerDetail.setId(12);
		assertEquals(12, insurerDetail.getId());
	}

	@Test
	public void test_GetId() {
		insurerDetail.setId(12);
		assertEquals(12, insurerDetail.getId());
	}

	@Test
	public void test_SetInsurerName() {
		insurerDetail.setInsurerName("XYZ");
		assertEquals("XYZ", insurerDetail.getInsurerName());
	}

	@Test
	public void test_GetInsurerName() {
		insurerDetail.setInsurerName("XYZ");
		assertEquals("XYZ", insurerDetail.getInsurerName());
	}

	@Test
	public void test_SetInsurerPackageName() {
		insurerDetail.setInsurerPackageName("Package 1");
		assertEquals("Package 1", insurerDetail.getInsurerPackageName());
	}

	@Test
	public void test_GetInsurerPackageName() {
		insurerDetail.setInsurerPackageName("Package 1");
		assertEquals("Package 1", insurerDetail.getInsurerPackageName());
	}

	@Test
	public void test_SetInsuranceAmountLimit() {
		insurerDetail.setInsuranceAmountLimit(123456);
		assertEquals(123456, insurerDetail.getInsuranceAmountLimit());
	}

	@Test
	public void test_GetInsuranceAmountLimit() {
		insurerDetail.setInsuranceAmountLimit(123456);
		assertEquals(123456, insurerDetail.getInsuranceAmountLimit());
	}

	@Test
	public void test_SetDisbursementDuration() {
		insurerDetail.setDisbursementDuration(10);
		assertEquals(10, insurerDetail.getDisbursementDuration());
	}

	@Test
	public void test_GetDisbursementDuration() {
		insurerDetail.setDisbursementDuration(10);
		assertEquals(10, insurerDetail.getDisbursementDuration());
	}

	@Test
	public void test_InsurerDetail_LongStringStringIntInt() {
		InsurerDetail insurer = new InsurerDetail(12, "XYZ", "Package 1", 123456, 10);
		assertEquals("XYZ", insurer.getInsurerName());
	}

}
