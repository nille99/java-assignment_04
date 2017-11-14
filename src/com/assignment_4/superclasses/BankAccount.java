package com.assignment_4.superclasses;

import java.util.UUID;

/***
 * Assignment 004 main
 * 
 * @author erik and niklas
 * @version 1.0
 * 
 * This is a superclass.
 * 
 */

import com.assignment_4.interfaces.BankOperations;

public class BankAccount implements BankOperations {
	
	/**
	 * These are the attributes for the class BankAccount: accountNumber,accountType, balance.
	 */
	private String accountNumber = "";
	private String accountType = "";
	private double balance = 0.0;
	
	/**
	 * This is the constructor for BankAccount.
	 */
	public BankAccount() {
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.balance = 0;
		this.accountType = "Bank Account";
	}
	
	/**
	 * These are our getters and setters
	 * @return
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * This is the method to withdraw money from an account in the class BankAccount.
	 */
	public void withdrawMoney(double amount) {
		if (amount>=0) {
			setBalance(getBalance()-amount);
		}else {
			System.out.println("You can not withdraw a negative value!");
		}
	}
	/**
	 * this is the method to deposit money to an account in the class BankAccount.
	 */
	public void depositMoney(double amount) {
		if (amount>=0) {
			setBalance(getBalance()+amount);
		}else {
			System.out.println("You can not deposit a negative value!");
		}
	}
	
	/**
	 * This is the method to print in class BankAccount.
	 */
	public String toString() {
		return "BankAccount [Account Number = " + accountNumber + ", balance = " + balance + ", account type = " + accountType
				+ "]\n";
	}
	
	

}
