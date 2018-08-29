package com.study.chapter4_3;

import java.time.LocalDate;
import java.util.Date;

public class Employee {

	//instance fields
	private String name;
	private double salary;
	private LocalDate hireDay;
	private Date date;

//  ����ʵ��һ: ����Ĺ��췽��
//	public Employee(String n,double s){ //���ֹ��췽�� �����NULL
//		String name = n; //�ֲ�������������ͬ����ʵ����(��Ա����) 
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
//		return date;//����ʵ����: ��д�������ÿɱ����ķ���������	
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
