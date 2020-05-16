package com.hefshine.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Value("Pankaj1")
	private String name;
	@Value("8883054089")
	private String mobileno;
	@Value("Raisen1")
	private String city;
	
	public Person() {
		
	}
	
	public Person(String name, String mobileno, String city) {
		super();
		this.name = name;
		this.mobileno = mobileno;
		this.city = city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", mobileno=" + mobileno + ", city=" + city + "]";
	}
	
	

}
