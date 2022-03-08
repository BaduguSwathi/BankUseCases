package com.microservices.customerservice1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerServiceRepo extends JpaRepository<CustomerServiceBean,Integer>{


	

}
