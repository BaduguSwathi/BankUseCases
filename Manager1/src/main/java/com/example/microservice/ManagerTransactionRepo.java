package com.example.microservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerTransactionRepo extends JpaRepository<Transactions, Integer>{

}
