package com.study.chapter4_3;

import java.time.LocalDate;
import java.util.Date;

public class Employee {

	//instance fields
	private String name;
	private double salary;
	private LocalDate hireDay;
	private Date date;

//  错误实例一: 错误的构造方法
//	public Employee(String n,double s){ //这种构造方法 构造出NULL
//		String name = n; //局部变量名屏蔽了同名的实例域(成员变量) 
//		double salary = s;
//	}
	
	//constructor
	public Employee(String name, double salary, LocalDate hireDay) {
		super();
		this.name = name;
		this.salary = salary;
		this.hireDay = hireDay;
	}
	
	public Employee(String name, double salary, int year, int month, int day) {
		super();
		this.name = name;
		this.salary = salary;
		this.hireDay = LocalDate.of(year, month, day);
	}

	public Employee(Date date) {
		super();
		this.date = date;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	// getter/setter method
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	public void setHireDay(LocalDate hireDay) {
		this.hireDay = hireDay;
	}
	
	public Date getDate() {
//		return date;//错误实例二: 编写返回引用可变对象的访问器方法	
		return (Date)date.clone();
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void raiseSalary(double byPercent){
		double raise = salary * byPercent / 100;
		salary += raise;//		this.salary += raise;
	}
	
	
}
