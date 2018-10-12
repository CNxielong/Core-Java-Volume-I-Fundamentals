package com.study.chapter6_1;

import java.time.LocalDate;

import javax.print.attribute.standard.MediaSize.Other;


/**
 * 
 * @ClassName: Employee  
 * @Description: TODO(P214 �����嵥6-1 �̳�Comparable�ӿ�) 
 * @author X-Dragon  
 * @date 2018��10��10�� ����5:29:49 
 * 
 */
public class Employee implements Comparable<Employee> {
	
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
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
	
	public void raiseSalary(double byPercent){
		double raise = salary*byPercent /100;
		salary += raise;
	}


	/**
	 * (�� Javadoc)  
	 * <p>Title: compareTo</p>  
	 * <p>Description:Compares employee by salary </p>  
	 * @param other another Employee object
	 * @return  salary - other.salary ( ����0-->1,С��0-->-1����� 0) 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Employee other) {
		return Double.compare(salary, other.salary);
	}
	
}
