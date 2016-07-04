package com.manish.javadev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.manish.javadev.model.Customer;
import com.manish.javadev.services.CustomerService;

@Controller
public class CustomerController {
	String message;
	@Autowired
	public CustomerService cs;

	@RequestMapping("/add.htm")
	public ModelAndView addCustomer() {
		System.out.println("addCustomer called");
		message = "Customer added successfully";
		Customer cust = new Customer("Manish", "Srivastava", 28);
		cs.addCustomer(cust);
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("MESSAGE", message);
		return mv;
	}

	@RequestMapping("/update.htm")
	public ModelAndView updateCustomer() {
		System.out.println("updateCustomer called");
		message = "Customer updated successfully";
		cs.updateCustomer(1);

		ModelAndView mv = new ModelAndView("home");
		mv.addObject("MESSAGE", message);
		return mv;
	}

	@RequestMapping("/delete.htm")
	public ModelAndView deleteCustomer() {
		System.out.println("deleteCustomer called");
		message = "Customer deleted successfully";
		cs.deleteCustomer(1);

		ModelAndView mv = new ModelAndView("home");
		mv.addObject("MESSAGE", message);
		return mv;
	}

	@RequestMapping("/search.htm")
	public ModelAndView searchCustomer() {
		System.out.println("searchCustomer called");
		message = "Customer find successfully";
		cs.searchCustomer(3);
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("MESSAGE", message);
		return mv;
	}
}

