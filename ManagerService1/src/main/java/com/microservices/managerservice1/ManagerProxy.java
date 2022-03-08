package com.microservices.managerservice1;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

public interface ManagerProxy {
    @GetMapping("/getcustomer")
   

	public List<CustomerAccounts> getCustomerDetials();

	public void deleteCustomerAccount(int id);
}
