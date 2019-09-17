package com.spring.test.springcoreadvanced.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
//	@Autowired							it can be used at field level as well as setter level also. in case of field there is no need to define the setter method
//	private Address address;

	
	private Address address;
	
	
	@Autowired
	public Employee(Address address) {
	super();
	this.address = address;
}



	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

//	public Address getAddress() {
//		return address;
//	}
//
//	
//	@Autowired
//	public void setAddress(Address address) {
//		this.address = address;
//	}


	

	
}