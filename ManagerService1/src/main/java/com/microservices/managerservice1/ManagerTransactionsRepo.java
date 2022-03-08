package com.microservices.managerservice1;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerTransactionsRepo extends JpaRepository<Transactions, Integer>{

}
