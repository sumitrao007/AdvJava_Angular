package com.hefshine.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Employee {
	
	//Field level type
	//@Autowired
	private Person person;
	
//	@Value("Manager")
	private String emprole;
	
	public Employee() {
		
	}
	
	
	public Employee(Person person,String emprole) {
		super();
		this.person = person;
		this.emprole = emprole;
	}
	
	//@Autowired
	public Employee(Person person) {
		this.person = person;
	}
	
//	@Autowired
//	public Employee(@Value("Owner")String emprole) {
//		this.emprole = emprole;
//	}
	
	public Person getPerson() {
		return person;
	}
	
	//Setter Level Autowire
//	@Autowired
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getEmprole() {
		return emprole;
	}
	
//	@Value("CTO")
//	@Autowired
//	public void setEmprole(@Value("CTO")String emprole) {
//		this.emprole = emprole;
//	}
	
	public void setEmprole(String emprole) {
		this.emprole = emprole;
	}
	
	@Override
	public String toString() {
		return "Employee [person=" + person + ", emprole=" + emprole + "]";
	}
	
	

}
