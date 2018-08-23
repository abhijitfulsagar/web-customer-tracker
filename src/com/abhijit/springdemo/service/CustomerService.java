package com.abhijit.springdemo.service;

import java.util.List;

import com.abhijit.springdemo.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int id);
}
