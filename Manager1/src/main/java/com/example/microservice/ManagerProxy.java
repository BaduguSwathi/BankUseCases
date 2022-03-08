package com.example.microservice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="Customer1")
public interface ManagerProxy {
	 @GetMapping("/getcutomer")
	    public List<CustomerAccounts> getCustomerDetials();
}
