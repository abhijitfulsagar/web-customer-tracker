package com.abhijit.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abhijit.springdemo.entity.Customer;
import com.abhijit.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//need to inject customerservice
	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		
		//get the customers from service		
		List<Customer> theCustomers = customerService.getCustomers();	
		System.out.println(theCustomers);
		
		//add the customers to the model
		theModel.addAttribute("customers",theCustomers);
		
		return "listCustomers";
	}
}
