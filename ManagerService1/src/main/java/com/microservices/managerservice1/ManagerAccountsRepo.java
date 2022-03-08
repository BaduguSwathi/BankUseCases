package com.microservices.managerservice1;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerAccountsRepo extends JpaRepository<Accounts,String> {

}
