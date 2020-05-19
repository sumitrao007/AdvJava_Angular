package com.hefshine.bean;

import org.springframework.stereotype.Component;

@Component(value = "account")
public class Account {
	
	
	public void deposits() {
		System.out.println("U Deposit amount......");
	}
	
	public void withdraw() {
		System.out.println("U Withdraw amount......");
	}
	
	public void deposits1(double amt) {
		System.out.println("U Deposit amount is "+amt);
	}
	
	public String fundTransfer() {
		return "Thank You for Using our Services Visit Again";
	}
	
	public void ChangePin() {
		System.out.println("U are in Change PIn method..");
		
		throw new IllegalArgumentException();
	}
	
	

}
