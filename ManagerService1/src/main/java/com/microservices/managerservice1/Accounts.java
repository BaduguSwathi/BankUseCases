package com.microservices.managerservice1;

import javax.persistence.Id;

public class Accounts {
  @Id
  private int accttyp;
  private Double mainbalance;
  private Double roi;
}
