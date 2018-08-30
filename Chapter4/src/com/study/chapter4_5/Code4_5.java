package com.study.chapter4_5;

import java.time.LocalDate;
import java.util.Date;

import com.study.chapter4_3.Employee;

public class Code4_5 {

	public static void tripleValue(double x)// doesn't work
	{
		x = 3 * x;
	}
	public static void tripleValue(Employee x)// works
	{
		x.raiseSalary(200);
	}
	public static void main(String[] args) {
		double percent = 10;
		tripleValue(percent);
		System.out.println(percent);// 10
		
		Employee harry = new Employee("harry", 5000,LocalDate.now());
		tripleValue(harry);
		System.out.println(harry.getSalary());
	}

}
