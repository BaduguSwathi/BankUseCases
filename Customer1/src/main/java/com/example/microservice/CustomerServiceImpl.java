package com.example.microservice;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService{

	@Autowired
	public CustomerRepo repo;
	
	@Autowired
	public CustomerService service;
	@Override
	public Object registerCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return service.registerCustomer(customer);
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return service.saveCustomer(customer);
	}

	@Override
	public List<Deposite> findByttype(String ttyp) {
		// TODO Auto-generated method stub
		return service.findByttype(ttyp);
	}

	@Override
	public List<Customer> withdrawal(Customer customer) {
		// TODO Auto-generated method stub
		return service.withdrawal(customer);
	}

	

}
