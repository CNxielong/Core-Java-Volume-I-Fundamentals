package com.study.chapter4_3;

import java.util.Date;

/**
 * 
 * @ClassName: EmployeeTest
 * @Description: TODO(员工类的测试)
 * @author X-Dragon
 * @date 2018年8月27日 下午8:40:37
 *
 */
public class EmployeeTest {

	public static void main(String[] args) {
		// fill the staff array with three Employee Object
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("A", 75000, 1987, 12, 15);
		staff[1] = new Employee("B", 50000, 1989, 10, 1);
		staff[2] = new Employee("C", 40000, 1990, 3, 15);

//		Employee e = new Employee(); //语法报错 The constructor Employee() is undefined
		
		// raise every's salary by 5%
		for (Employee employee : staff) {
			employee.raiseSalary(5);
		}

		// print out information about all Employee objects
		for (Employee employee : staff) {
			System.out.println("name=" + employee.getName() + ",salary=" + employee.getSalary() 
				+ ",hireDay="+ employee.getHireDay());
		}

//错误实例一: 错误的构造方法
//		Employee employee = new Employee("abc", 110.10);//错误的构造方法
//		System.out.println(employee.getName()+" "+employee.getSalary()); // null 0.0
		
//错误实例二: 编写返回引用可变对象的访问器方法		
		Employee harry = new Employee(new Date());
		Date date = harry.getDate();
		System.out.println(date);
		double tenYearsInMilliSeconds = 10*365.25*24*60*60*1000;
		date.setTime(date.getTime() - (long)tenYearsInMilliSeconds);
		System.out.println(date);

	}

}
