package com.study.chapter4_5;

import java.time.LocalDate;

/**
 * 
 * @ClassName: ParamTest
 * @Description: TODO(用于展示JAVA参数传递方式)
 * @author X-Dragon
 * @date 2018年8月29日 下午8:05:18
 *
 */
public class ParamTest {

	public static void main(String[] args) {

		/**
		 * Test1:Method can't modify numeric parameters
		 */
		System.out.println("Testing tripleValue:");
		double percent = 10;
		System.out.println("Before:percent=" + percent);
		tripleValue(percent);
		System.out.println("After:percent=" + percent);

		/**
		 * Test2:Method can change the state of object parameters
		 */
		System.out.println("\nTesting tripleValue:");
		Employee harry = new Employee("harry", 5000);
		System.out.println("Before:percent=" + harry.getSalary());
		tripleValue(harry);
		System.out.println("After:percent=" + harry.getSalary());
		
		/**
		 * Test3:Method can't attach new objects to object parameters
		 */
		System.out.println("\nTesting swap:");
		Employee a = new Employee("Alice", 70000);
		Employee b = new Employee("Bob", 70000);
		System.out.println("Before:a=" + a.getName());
		System.out.println("Before:b=" + b.getName());
		swap(a, b);
		System.out.println("After:a=" + a.getName());
		System.out.println("After:b=" + b.getName());
	}

	public static void tripleValue(double x)// doesn't work
	{
		x = 3 * x;
		System.out.println("End of method: x="+x);
	}

	public static void tripleValue(Employee x)//  works
	{
		x.raiseSalary(200);
		System.out.println("End of method: salary="+x.getSalary());
//		double d =x.getSalary()*3;
//		System.out.println("d="+d);

	}
	
	public static void swap(Employee x, Employee y){
		Employee temp = x;
		x = y;
		y = temp;
		System.out.println("End of method: x="+ x.getName());
		System.out.println("End of method: y="+ y.getName());
	}

}

class Employee // simplified Employee class
{
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

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

}
