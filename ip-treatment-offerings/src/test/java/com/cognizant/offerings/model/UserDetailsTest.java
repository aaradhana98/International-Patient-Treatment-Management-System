package com.cognizant.offerings.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author Isha, Aaradhana, Nikhil, Adisha
 * 
 * 		the class tests all the setters and getters and constructors
 * 		for the User Details  
 *
 */
public class UserDetailsTest {

	UserDetails userDetails = new UserDetails();

	@Test
	void test_UserDetail_String() {
		UserDetails userDetail = new UserDetails(1, "Ron");
		assertEquals("Ron", userDetail.getUserName());

	}

	@Test
	void test_GetName() {
		userDetails.setUserName("Ron");
		assertEquals("Ron", userDetails.getUserName());
	}

	@Test
	void test_SetName() {
		userDetails.setUserName("Ron");
		assertEquals("Ron", userDetails.getUserName());
	}
}
