package com.example.microservice;

import java.awt.print.Pageable;
import java.util.List;

public interface CustomerService {

	Object registerCustomer(Customer customer);


	Customer saveCustomer(Customer customerBean);


	List<Deposite> findByttype(String ttyp);


	List<Customer> withdrawal(Customer customer);

}
