package com.study.chapter4_6;

import java.util.Random;



/**
 * 
 * @ClassName: ConstructorTest  
 * @Description: TODO(����չʾJAVA����Ĺ��췽��)  
 * @author X-Dragon  
 * @date 2018��8��30�� ����6:39:01 
 *
 */
public class ConstructorTest {

	public static void main(String[] args) {
		// fill the staff array with three Employee objects
		Employee[] staff = new Employee[3];

		staff[0] = new Employee("Harry", 40000);
		staff[1] = new Employee(60000);
		staff[2] = new Employee();

		// print out information about all Employee objects
		for (Employee employee : staff) {
			System.out.println("name=" + employee.getName() + 
					",id=" + employee.getId() + ",salary=" + employee.getSalary());
		}
	}

}

class Employee{
	private static int nextId;
	
	private int id;
	private String name = "";// instance field initialization
	private double salary;
	
	//static initialization block
	static {
		Random generator = new Random();
		//set nextId to a random num between 0 and 9999
		nextId = generator.nextInt(10000);
		System.out.println("nextId="+nextId);
	}
	
	//object initialization block
	{
		id = nextId;
		nextId++;
	}

	//three overloaded constructors
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(double salary) {
		//call the Employee(String name, double salary) constructor
		this("Employee #"+nextId, salary);
	}
	
	//the default constructor
	public Employee() {
		// name initialized to "" --see above
		// salary not explicitly set --initialized to 0
		// id initialized in initialization block
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	
}
