package com.study.chapter5_2;

import java.time.LocalDate;

public class Manager extends Employee {
	
	private double bouns;

	public Manager(String name, double salary, int year, int month ,int day) {
		super(name, salary, year, month, day);
		bouns = 0;
	}

	public double getBouns() {
		return bouns;
	}

	public void setBouns(double bouns) {
		this.bouns = bouns;
	}

	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary + bouns;
	}
	
	@Override
	public boolean equals(Object otherObject){
		if(! super.equals(otherObject)) return false;//子类首先调用父类的equals方法
		Manager other = (Manager) otherObject;
		// super.equals checked that  this and other belong to the same class
		return bouns == other.bouns;
	}
	
	@Override
	public int hashCode() {
		//表示调用Double的构造方法 Double对象才有hashCode方法
		return super.hashCode()+17* new Double(bouns).hashCode();
		//Double(bouns). 没有hashCode()方法 这个表示基本类型之间的强制转换
	}
}
