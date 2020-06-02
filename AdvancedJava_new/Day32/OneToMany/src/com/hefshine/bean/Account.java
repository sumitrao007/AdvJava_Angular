package com.hefshine.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private long accountno;
	
	private String accType;
	
	@ManyToOne
	@PrimaryKeyJoinColumn
	private Employee emp;
	

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Account(int id, long accountno, String accType) {
		super();
		this.id = id;
		this.accountno = accountno;
		this.accType = accType;
	}
	public Account(long accountno, String accType) {
		super();
		
		this.accountno = accountno;
		this.accType = accType;
	}

	
	public Employee getEmp() {
		return emp;
	}



	public void setEmp(Employee emp) {
		this.emp = emp;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAccountno() {
		return accountno;
	}

	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", accountno=" + accountno + ", accType=" + accType + "]";
	}
	
	
	
}
