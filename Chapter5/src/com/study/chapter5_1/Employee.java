package com.study.chapter5_1;

import java.time.LocalDate;

/**
 * 
 * @ClassName: Employee  
 * @Description: TODO(P152 �����嵥5-1 �̳й�ϵ����)  
 * @author X-Dragon  
 * @date 2018��9��5�� ����6:56:12 
 *
 */
public class Employee {
	
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String name, double salary, int year,int month, int day) {
		super();
		this.name = name;
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
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
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getHireDay() {
		return hireDay;
	}
	
	public void raiseSalary(double byPercent){
		double raise = salary*byPercent /100;
		salary += raise;
	}
	
}
