package com.hefshine.bean;

public class Student {
	
	private String name;
	private String mobileno;
	private Address address;
	
	public Student() {
		
	}
	
	public Student(String name, String mobileno, Address address) {
		super();
		this.name = name;
		this.mobileno = mobileno;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", mobileno=" + mobileno + ", address=" + address + "]";
	}
	
	

}
