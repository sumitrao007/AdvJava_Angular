package com.hefshine.bean;

import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id;
	private String fname;
	private String lname;
	
	//It's not create new table 
	@Embedded
	private Address address;
	
	//It creates Another Table
	@ElementCollection
	private Set<String> hobbies;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

	
	public Set<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Set<String> hobbies) {
		this.hobbies = hobbies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", fname=" + fname + ", lname=" + lname + ", address=" + address + ", hobbies="
				+ hobbies + "]";
	}

	
	
	

}
