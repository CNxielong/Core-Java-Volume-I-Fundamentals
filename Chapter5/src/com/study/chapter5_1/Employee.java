package com.study.chapter5_1;

import java.time.LocalDate;

/**
 * 
 * @ClassName: Employee  
 * @Description: TODO(P152 程序清单5-1 继承关系父类)  
 * @author X-Dragon  
 * @date 2018年9月5日 下午6:56:12 
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
