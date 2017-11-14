package com.assignment_4.superclasses;

/***
 * Assignment 004 main
 * 
 * @author erik and niklas
 * @version 1.0
 * 
 * This is a superclass.
 * 
 */

public class Human {
	/**
	 * These are the attributes for the class Human: name,age.
	 */
	private String name = "";
	private int age = 0;
	
	/**
	 * This is the constructor of the class Human.
	 * 
	 */
	public Human(String name, int age) {
		this.name=name;
		this.age= age;
	}
	
	/**
	 * These are the getters and setters for the class Human.
	 * @return
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
