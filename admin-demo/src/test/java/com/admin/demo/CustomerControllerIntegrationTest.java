package com.admin.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import com.admin.demo.AdminDemoApplication;
import com.admin.demo.model.Customer;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AdminDemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CustomerControllerIntegrationTest {
	@Autowired
	private TestRestTemplate restTemplate;

	@LocalServerPort
	private int port;

	private String getRootUrl() {
		return "http://localhost:" + port;
	}

	@Test
	public void contextLoads() {

	}

	@Test
	public void testGetAllCustomers() {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/customers",
				HttpMethod.GET, entity, String.class);
		
		assertNotNull(response.getBody());
	}

	@Test
	public void testGetCustomerById() {
		Customer customer = restTemplate.getForObject(getRootUrl() + "/customers/1", Customer.class);
		System.out.println(customer.getFirstName());
		assertNotNull(customer);
	}

	@Test
	public void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setEmailId("joe.bloggs@gmail.com");
		customer.setFirstName("Joe");
		customer.setLastName("Bloggs");

		ResponseEntity<Customer> postResponse = restTemplate.postForEntity(getRootUrl() + "/customers", customer, Customer.class);
		assertNotNull(postResponse);
		assertNotNull(postResponse.getBody());
	}

	@Test
	public void testUpdateCustomer() {
		int id = 1;
		Customer customer = restTemplate.getForObject(getRootUrl() + "/customers/" + id, Customer.class);
		customer.setFirstName("admin");
		customer.setLastName("demo");
		customer.setEmailId("admin.demo@gmail.com");

		restTemplate.put(getRootUrl() + "/customers/" + id, customer);

		Customer updatedCustomer = restTemplate.getForObject(getRootUrl() + "/customers/" + id, Customer.class);
		assertNotNull(updatedCustomer);		
	}

	@Test
	public void testDeleteCustomer() {
		int id = 1;
		Customer customer = restTemplate.getForObject(getRootUrl() + "/customers/" + id, Customer.class);
		assertNotNull(customer);

		restTemplate.delete(getRootUrl() + "/customers/" + id);

		try {
			customer = restTemplate.getForObject(getRootUrl() + "/customers/" + id, Customer.class);
		} catch (final HttpClientErrorException e) {
			assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
		}
	}
}
