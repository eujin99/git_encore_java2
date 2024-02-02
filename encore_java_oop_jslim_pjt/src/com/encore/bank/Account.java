package com.encore.bank;

public class Account {
	
	private String 	custId ;
	private String 	custName ;
	private String 	accountNumber ; 
	private int 	balance ;
	public Account() {
		super();
	}
	public Account(String custId, String custName, String accountNumber, int balance) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	///////////// 
	public void addBalance( int amount ) {
		this.balance += amount ; 
	}
	public void subtractBalance( int amount ) {
		this.balance -= amount ; 
	}
	
}









