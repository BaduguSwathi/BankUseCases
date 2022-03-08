package com.example.microservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class ManagerServiceImpl implements ManagerService{
    
	@Autowired
	public ManagerProxy template;
	@Autowired
	public ManagerService service;
	@Override
	public List<CustomerAccounts> findAllCustomerAccounts() {
		// TODO Auto-generated method stub
		return findAllCustomerAccounts();
	}

	@Override
	public List<CustomerAccounts> deleteCustomerAccounts() {
		// TODO Auto-generated method stub
		return deleteCustomerAccounts();
	}
	

	public String insertNotes(CustomerAccounts Customeraccounts, String accttype) {
		// TODO Auto-generated method stub
		return "inserted successfully";
	}

	public String deleteNotes() {
		// TODO Auto-generated method stub
		return "deleted successfully";
	}

	public Optional<Transactions> findByttype(String ttype) {
		// TODO Auto-generated method stub
		return findByttype(ttype);
	}

	


}
