package com.microservices.managerservice1;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;

public class ManagerServiceImpl implements ManagerService{

	@Autowired
	ManagerProxy template;
	@Autowired
	private ManagerCustomerAccountsRepo customeraccountrepo;
	@Autowired
	private ManagerAccountsRepo accountrepo;
	@Override
	public List<CustomerAccounts> custInfo() {

        return custInfo();
		
	}
	@Override
	public CustomerAccounts custInfoById(int id) {
		// TODO Auto-generated method stub
		Optional<CustomerAccounts> opt=customeraccountrepo.findById(id);
        return opt.get();
	}

	@Override
	public Accounts createAccount(Accounts accounts) {
		// TODO Auto-generated method stub
		  return accountrepo.save(accounts);
		
	}
	@Override
	public void deleteCustomerAccount(int id) {
		// TODO Auto-generated method stub
		template.deleteCustomerAccount(id);
	}

}
