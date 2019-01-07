package com.spring.hibernate.dao;

import java.util.List;

import com.spring.hibernate.entity.Customer;

public interface CustomerDao {

	public List<Customer> getAllCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);

	 
}
