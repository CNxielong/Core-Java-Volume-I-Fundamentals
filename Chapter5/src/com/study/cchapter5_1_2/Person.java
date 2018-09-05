package com.study.cchapter5_1_2;

public abstract class Person {
	public abstract String getDescription();
	private String name;
	public Person(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
