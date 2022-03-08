package com.microservices.managerservice1;

import javax.persistence.Id;

public class Transactions {
     @Id
     private int tid;
     private int cid;
     private String ttype;
     private  double amount;
     private String date;
}
