package com.abhijit.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abhijit.springdemo.dao.CustomerDAO;
import com.abhijit.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//need to inject the customer dao
	@Autowired
	private CustomerDAO customerDAO;
	
	
	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		
		//get the customers from dao
		System.out.println("*************before customerDAO.getCustomers() call*******************");
		List<Customer> theCustomers = customerDAO.getCustomers();
		System.out.println("--------------the list--------------");
		System.out.println(theCustomers);
		
		//add the customers to the model
		theModel.addAttribute("customers",theCustomers);
		
		return "listCustomers";
	}
}
