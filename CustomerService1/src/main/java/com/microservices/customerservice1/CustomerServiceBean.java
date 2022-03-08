package com.microservices.customerservice1;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name="customer")
public class CustomerServiceBean 
{
    private int cid;
    private String cname;
    private String address;
    public CustomerServiceBean() {
    	
    }
	public CustomerServiceBean(int cid, String cname, String address) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.address = address;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    
}
