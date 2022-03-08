package com.example.microservice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerAccounts {
	@Id
    private int accno;
    private int cid;
    private String accttype;
    private String date;
    public CustomerAccounts() {
    	
    }
	public CustomerAccounts(int accno, int cid, String accttype, String date) {
		super();
		this.accno = accno;
		this.cid = cid;
		this.accttype = accttype;
		this.date = date;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getAccttype() {
		return accttype;
	}
	public void setAccttype(String accttype) {
		this.accttype = accttype;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "CustomerAccounts [accno=" + accno + ", cid=" + cid + ", accttype=" + accttype + ", date=" + date + "]";
	}
    
}
