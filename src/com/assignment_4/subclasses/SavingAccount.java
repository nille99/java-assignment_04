package com.assignment_4.subclasses;

import java.util.UUID;

import com.assignment_4.superclasses.BankAccount;

/***
 * Assignment 004 main
 * 
 * @author erik and niklas
 * @version 1.0
 * 
 * This is a subclass to BankAccount.
 * 
 */

public class SavingAccount extends BankAccount {
	/**
	 * This is the constructor for the class SavingAccount.
	 */
	public SavingAccount() {
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType("Saving account");
	}

}
