package com.cg.retailStore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.persistence.Column;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.retailstore.model.UserDetails;
import com.cg.retailstore.repository.IUserDetailsRepository;
import com.cg.retailstore.service.IUserDetailsService;

@RunWith(SpringRunner.class)

@SpringBootTest
class RetailStoreManagementTests {

	@Autowired
	private IUserDetailsService userDetailsService;

	/*
	 * @MockBean private IUserDetailsRepository repository;
	 */

	// @Test
	/*
	 * void contextLoads() { }
	 */

	@Test
	public void saveUserRetTest() {
		System.out.println("******************");

		UserDetails userDetails = new UserDetails();
		userDetails.setName("Pavitra");
		userDetails.setPassword("12345");
		userDetails.setRole("Retailer");
		assertNotNull(userDetailsService.addUserDetails(userDetails));
	}

	@Test
	public void saveUsersCusTest() {
		System.out.println("******************");

		UserDetails userDetails = new UserDetails();
		userDetails.setName("Haleema");
		userDetails.setPassword("12346");
		userDetails.setRole("Customer");
		assertNotNull(userDetailsService.addUserDetails(userDetails));
	}

	@Test
	public void saveUserSupTest() {
		System.out.println("******************");

		UserDetails userDetails = new UserDetails();
		userDetails.setName("Zareena");
		userDetails.setPassword("12347");
		userDetails.setRole("Supplier");
		assertNotNull(userDetailsService.addUserDetails(userDetails));
	}

}
