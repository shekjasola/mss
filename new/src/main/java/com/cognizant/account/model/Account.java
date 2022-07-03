package com.cognizant.account.model;

public class Account {

	private String number;
	private String type;
	private double balance;

	public Account(String number, String type, double balance) {
		super();
		this.number = number;
		this.type = type;
		this.balance = balance;
	}

	public String getNumber() {
		return number;
	}

	public String getType() {
		return type;
	}

	public double getBalance() {
		return balance;
	}

}
