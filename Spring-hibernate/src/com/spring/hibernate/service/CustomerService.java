package com.spring.hibernate.service;

import java.util.List;

import com.spring.hibernate.entity.Customer;

public interface CustomerService {

	public List<Customer> getAllCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
}
