package com.manish.javadev.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.manish.javadev.dao.CustomerDAO;
import com.manish.javadev.model.Customer;

public class HIbernateCustomerDAOImpl implements CustomerDAO {
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Transactional(readOnly = false)
	public void addCustomer(Customer cust) {
		hibernateTemplate.save(cust);
	}

	@Transactional(readOnly = false)
	public void updateCustomer(int custId) {
		Customer cust = (Customer) hibernateTemplate.load(Customer.class,
				custId);
		cust.setFname("Divya");
		cust.setLname("Srivastava");
		hibernateTemplate.saveOrUpdate(cust);
		System.out.println(cust);
	}

	@Transactional(readOnly = false)
	public void deleteCustomer(int custId) {
		Customer cust = (Customer) hibernateTemplate.load(Customer.class,
				custId);

		hibernateTemplate.delete(cust);
		hibernateTemplate.flush();

		System.out.println(cust);
	}

	@Transactional(readOnly = false)
	public void searchCustomer(int custId) {
		Customer cust = (Customer) hibernateTemplate.load(Customer.class,
				custId);
		System.out.println(cust);

	}

}
