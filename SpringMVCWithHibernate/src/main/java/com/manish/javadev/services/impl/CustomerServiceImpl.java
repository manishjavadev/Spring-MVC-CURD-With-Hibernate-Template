package com.manish.javadev.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.manish.javadev.dao.CustomerDAO;
import com.manish.javadev.model.Customer;
import com.manish.javadev.services.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerDAO cdao;

	public void addCustomer(Customer cust) {

		cdao.addCustomer(cust);
	}

	public void updateCustomer(int custId) {
		cdao.updateCustomer(custId);

	}

	public void deleteCustomer(int custId) {
		cdao.deleteCustomer(custId);

	}

	public void searchCustomer(int custId) {
		cdao.searchCustomer(custId);
		
	}

}
