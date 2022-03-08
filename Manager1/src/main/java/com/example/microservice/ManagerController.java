package com.example.microservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping
public class ManagerController {
	@Autowired  
	ManagerService service;
    
    @GetMapping("/all")
    public List<CustomerAccounts> findAllCustomerAccounts(){
		return service.findAllCustomerAccounts();
    	
    }
    @GetMapping("/delete")
    public List<CustomerAccounts> deleteCustomerAccounts(){
    	return service.deleteCustomerAccounts();
    }
   
    
}
