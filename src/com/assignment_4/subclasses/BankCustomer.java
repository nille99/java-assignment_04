package com.assignment_4.subclasses;

/***
 * Assignment 004 main
 * 
 * @author erik and niklas
 * @version 1.0
 * 
 * This is a subclass to Human.
 * 
 */

import java.util.ArrayList;

import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.superclasses.Human;

public class BankCustomer extends Human{
	/**
	 * This is the ArrayList attribute in BankCustomer: customerAccounts
	 */
	ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();
	
	/**
	 * This is the constructor for BankAccount.
	 * 
	 */
	public BankCustomer(String name,int age) {
		super(name,age);
	}
	
	/**
	 * Getters and setters for customerAccounts
	 * 
	 */
	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccounts;
	}
	public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}
	
	/**
	 * Method to add accounts to the ArrayList customerAccounts.
	 * 
	 */
	
	public void addAccount(BankAccount bankAccount) {
		this.customerAccounts.add(bankAccount);
	}
	
	/**
	 * A method to deposit money to an account.
	 * 
	 */
	
	public void depositToAccount(String accountNumber,double amount) {
		for (int i = 0; i < customerAccounts.size();i++) {
			if(customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).depositMoney(amount);
			}
		}
	}
	
	/**
	 * A method to withdraw money from an account.
	 * 
	 */
	
	public void withdrawFromAccount(String accountNumber,double amount) {
		for (int i = 0; i < customerAccounts.size();i++) {
			if(customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).withdrawMoney(amount);
			}
		}
	}
	
	/**
	 * Method to print all accounts for a customer. 
	 */
	
	public String toString() {
		return "Customer: "+getName()+" Age: "+getAge()+"\n" + customerAccounts.get(0)+customerAccounts.get(1)+customerAccounts.get(2);
	}
	
	
	


}
