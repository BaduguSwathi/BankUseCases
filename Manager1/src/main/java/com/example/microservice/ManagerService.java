package com.example.microservice;

import java.util.List;

public interface ManagerService {

	List<CustomerAccounts> findAllCustomerAccounts();

	List<CustomerAccounts> deleteCustomerAccounts();


}
