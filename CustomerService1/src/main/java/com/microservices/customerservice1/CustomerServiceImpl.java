package com.microservices.customerservice1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerServiceBean template;
	
	@Autowired
	private CustomerServiceRepo repo;
	@Override
	public CustomerServiceBean saveCustomer(CustomerServiceBean customerBean) {
		// TODO Auto-generated method stub
		return repo.save(customerBean);
	}

	@Override
	public CustomerServiceBean registerCustomer(CustomerServiceBean customBean) {
		// TODO Auto-generated method stub
		return repo.save(customBean);
	}

	@Override
	public List<DepositeDto> findByttype(String ttyp) {
		// TODO Auto-generated method stub
		return null;
	}

}
