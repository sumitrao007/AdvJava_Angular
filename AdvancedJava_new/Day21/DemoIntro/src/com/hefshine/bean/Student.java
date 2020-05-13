package com.hefshine.bean;

public class Student {
	
	private int rollnumber;
	private String name;
	
	public Student() {
		
	}
	
	public Student(int rollnumber, String name) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
	}
	
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + "]";
	}
	

}
