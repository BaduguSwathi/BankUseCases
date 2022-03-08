package com.example.microservice;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Accounts {
	    @Id
	    private String accttype;
	    private Double mainbalance;
	    private Double roi;
	    public Accounts() {
	    	
	    }
		public Accounts(String accttype, Double mainbalance, Double roi) {
			super();
			this.accttype = accttype;
			this.mainbalance = mainbalance;
			this.roi = roi;
		}
		public String getAccttype() {
			return accttype;
		}
		public void setAccttype(String accttype) {
			this.accttype = accttype;
		}
		public Double getMainbalance() {
			return mainbalance;
		}
		public void setMainbalance(Double mainbalance) {
			this.mainbalance = mainbalance;
		}
		public Double getRoi() {
			return roi;
		}
		public void setRoi(Double roi) {
			this.roi = roi;
		}
		@Override
		public String toString() {
			return "Accounts [accttype=" + accttype + ", mainbalance=" + mainbalance + ", roi=" + roi + "]";
		}
	    
}
