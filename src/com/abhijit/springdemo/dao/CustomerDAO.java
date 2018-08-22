package com.abhijit.springdemo.dao;

import java.util.List;

import com.abhijit.springdemo.entity.Customer;

public interface CustomerDAO {
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
}
