package com.study.chapter4_4;

/**
 * 
 * @ClassName: StaticTest
 * @Description: TODO(用于展示静态方法的调用)
 * @author X-Dragon
 * @date 2018年8月29日 下午7:24:54
 *
 */
public class StaticTest {

	public static void main(String[] args) {
		// fill the staff array with three Employee objects
		Employee[] staff = new Employee[3];

		staff[0] = new Employee("TOM", 40000);
		staff[1] = new Employee("Dick", 60000);
		staff[2] = new Employee("Harry", 65000);

		// print out information about all Employee objects
		for (Employee employee : staff) {
			employee.setId();
			System.out.println("name=" + employee.getName() + 
					",id=" + employee.getId() + ",salary=" + employee.getSalary());
		}
		
		int n = Employee.getNextId();//call static method 通过 类名.方法名() 的方式调用静态方法
		System.out.println("Next available id=" + n);
	}

}

class Employee {
	private static int nextId = 1;

	private String name;
	private double salary;
	private int id;

	public Employee(String n, double s) {
		super();
		this.salary = s;
		this.name = n;
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

	public int getId() {
		return id;
	}

	public void setId() {
		id = nextId;// set id to next avaliable id
		nextId++;
	}

	public static int getNextId() {
		return nextId; // return static field
	}

	public static void main(String[] args) {
		Employee e = new Employee("Harry", 50000);
		System.out.printf(e.getName() + " " + e.getSalary());
	}
}
