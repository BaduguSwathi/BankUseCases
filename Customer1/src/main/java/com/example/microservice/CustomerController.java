package com.example.microservice;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CustomerController 
{
      @Autowired
      public CustomerService customerservice;
      
      @GetMapping(value = "/{register}")
      public ResponseEntity registerCustomer(@PathVariable("register") Customer customer ) {
          return ResponseEntity.ok(customerservice.registerCustomer(customer));
      }
      
      @PostMapping("/{id}/withdrawal/{amount}")
      public List<Customer> withdrawal(@PathVariable Customer customer){
    	  return customerservice.withdrawal(customer);
      }

      @PostMapping( "/save-customer")
  	public Customer saveCustomer(@RequestBody Customer customer) {
  	return customerservice.saveCustomer(customer);

  	}
  	
  	  @GetMapping("/deposite")
  	    public List<Deposite> findByttype(String ttyp){
  			return customerservice.findByttype(ttyp);
  	    	
  	    }     
  	
}
