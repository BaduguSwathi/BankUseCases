package com.microservices.managerservice1;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerCustomerAccountsRepo extends JpaRepository<CustomerAccounts, Integer>{

}
