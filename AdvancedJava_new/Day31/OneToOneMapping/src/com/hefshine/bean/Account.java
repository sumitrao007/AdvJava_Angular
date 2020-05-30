package com.hefshine.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "accno",unique = true)
	private long accno;
	
	private String acctType;
	
	

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(long accno, String acctType) {
		super();
		this.accno = accno;
		this.acctType = acctType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAccno() {
		return accno;
	}

	public void setAccno(long accno) {
		this.accno = accno;
	}

	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", accno=" + accno + ", acctType=" + acctType + "]";
	}
	
	
	
}
