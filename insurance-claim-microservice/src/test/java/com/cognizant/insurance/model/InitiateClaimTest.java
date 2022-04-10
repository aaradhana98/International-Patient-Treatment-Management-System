package com.cognizant.insurance.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author Isha, Aaradhana, Nikhil, Adisha
 * 
 * 		the class tests all the setters and getters and constructors
 * 		for the  Initiate Claim
 *
 */
public class InitiateClaimTest {
	
	InitiateClaim initiateClaim=new InitiateClaim();

	@Test
	public void test_SetId() {
		initiateClaim.setId(101);
		assertEquals(101,initiateClaim.getId());
	}
	
	@Test
	public void test_GetId() {
		initiateClaim.setId(101);
		assertEquals(101,initiateClaim.getId());
	}
	
	@Test
	public void test_SetPatientName() {
		initiateClaim.setPatientName("Harry");
		assertEquals("Harry",initiateClaim.getPatientName());
	}
	
	@Test
	public void test_GetPatientName() {
		initiateClaim.setPatientName("Harry");
		assertEquals("Harry",initiateClaim.getPatientName());
	}
	
	@Test
	public void test_SetAilment() {
		initiateClaim.setAilment("Urology");
		assertEquals("Urology",initiateClaim.getAilment());
	}
	
	@Test
	public void test_GetAilment() {
		initiateClaim.setAilment("Urology");
		assertEquals("Urology",initiateClaim.getAilment());
	}
	
	@Test
	public void test_SetTreatmentPackageName() {
		initiateClaim.setTreatmentPackageName("Package 5");
		assertEquals("Package 5",initiateClaim.getTreatmentPackageName());
	}
	
	@Test
	public void test_GetTreatmentPackageName() {
		initiateClaim.setTreatmentPackageName("Package 5");
		assertEquals("Package 5",initiateClaim.getTreatmentPackageName());
	}
	
	@Test
	public void test_SetInsurerName() {
		initiateClaim.setInsurerName("XYZ");
		assertEquals("XYZ",initiateClaim.getInsurerName());
	}
	
	@Test
	public void test_GetInsurerName() {
		initiateClaim.setInsurerName("XYZ");
		assertEquals("XYZ",initiateClaim.getInsurerName());
	}
}
