package com.hefshine.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Autowired
	private Person person;
	
	@Value("Developer")
	private String emprole;
	
	public Employee() {
		
	}

	public Employee(Person person, String emprole) {
		super();
		this.person = person;
		this.emprole = emprole;
	}

	public Person getPerson() {
		return person;
	}

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
		return "Employee [person=" + person + ", emprole=" + emprole + "]";
	}
	
	

}
