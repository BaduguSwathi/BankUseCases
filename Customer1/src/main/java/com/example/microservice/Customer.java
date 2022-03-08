package com.example.microservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="customer")
public class Customer {
	 @Id
	 @GeneratedValue(strategy =GenerationType.AUTO )
     private int cid;
     private String cname;
     private String Address;
     public Customer() {
    	 
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
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Customer(int cid, String cname, String address) {
		super();
		this.cid = cid;
		this.cname = cname;
		Address = address;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", Address=" + Address + "]";
	}
     
}
