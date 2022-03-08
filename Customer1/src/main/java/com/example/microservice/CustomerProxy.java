package com.example.microservice;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

public interface CustomerProxy {
	 @GetMapping("/custInfo")
	    public List<CustomerAccounts> CustomerInfo();
}
