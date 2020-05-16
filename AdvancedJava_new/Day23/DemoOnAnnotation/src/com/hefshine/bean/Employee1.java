package com.hefshine.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Employee1 {
	
//	@Autowired
//	@Qualifier("person")
	private Person person;
	@Value("Developer")
	private String emprole;
	
	public Employee1() {
		
	}
	
	
//	@Autowired
//	public Employee1(@Qualifier("personA") Person person, @Value("Owner")String emprole) {
//		super();
//		this.person = person;
//		this.emprole = emprole;
//	}
	
	
	public Employee1( Person person, String emprole) {
		super();
		this.person = person;
		this.emprole = emprole;
	}
	
	public Person getPerson() {
		return person;
	}
	
	@Autowired
	@Qualifier("personA")
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getEmprole() {
		return emprole;
	}
	public void setEmprole(String emprole) {
		this.emprole = emprole;
	}
	@Override
	public String toString() {
		return "Employee1 [person=" + person + ", emprole=" + emprole + "]";
	}
	
	

}
