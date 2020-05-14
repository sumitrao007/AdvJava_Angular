package com.hefshine.bean;

public class Address {
	
	private String area;
	private String city;
	private String pin;
	
	public Address() {
		
	}
	
	public Address(String area, String city, String pin) {
		super();
		this.area = area;
		this.city = city;
		this.pin = pin;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [area=" + area + ", city=" + city + ", pin=" + pin + "]";
	}
	

}
