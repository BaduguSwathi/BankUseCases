package com.microservices.managerservice1;

import java.util.List;

public interface ManagerService {

	List<CustomerAccounts> custInfo();

	CustomerAccounts custInfoById(int id);

	Accounts createAccount(Accounts accounts);

	void deleteCustomerAccount(int id);

}
