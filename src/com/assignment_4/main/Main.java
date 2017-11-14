package com.assignment_4.main;

import com.assignment_4.subclasses.BankCustomer;
import com.assignment_4.subclasses.PersonalAccount;
import com.assignment_4.subclasses.SavingAccount;
import com.assignment_4.superclasses.BankAccount;
/***
 * Assignment 004 main
 * 
 * @author erik and niklas
 * @version 1.0
 * 
 * <h1>The Bank system</h1>
 *Disclaimer: This program is a Assignment for school.
 * * It can be used not modified.
 * A bank system that handles bank,personal,saving accounts.
 *
 */

public class Main {
	/**
	 * 
	 * This is the main method which is used to add customer accounts 
	 * and allows you to withdraw and deposit from each account. 
	 * 
	 */

	public static void main(String[] args) {
		String account = "";
		
		//Creates a bank account for the human Erik who is 26 years old.
		BankCustomer bc = new BankCustomer("Erik",26);
		bc.addAccount(new BankAccount());
		bc.addAccount(new PersonalAccount());
		bc.addAccount(new SavingAccount());
		System.out.println(bc.toString());
		
		//Deposits 30 to the bank account.
		account = bc.getCustomerAccounts().get(0).getAccountNumber();
		System.out.println("Depositing 30.0 to the first account");
		bc.depositToAccount(account, 30.0);
		System.out.println(bc.toString());
		
		//Withdraws 200 from the personal account
		System.out.println("Withdrawing 200.0 from the first account");
		account = bc.getCustomerAccounts().get(1).getAccountNumber();
		bc.withdrawFromAccount(account, 200.0);
		System.out.println(bc.toString());
		
		//Deposits 200 to the saving account.
		System.out.println("Depositing 200.0 to the first account");
		account = bc.getCustomerAccounts().get(2).getAccountNumber();
		bc.depositToAccount(account, 200.0);
		System.out.println(bc.toString());

	}

}
