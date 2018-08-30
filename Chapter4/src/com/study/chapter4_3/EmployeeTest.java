package com.study.chapter4_3;

import java.util.Date;

/**
 * 
 * @ClassName: EmployeeTest
 * @Description: TODO(Ա����Ĳ���)
 * @author X-Dragon
 * @date 2018��8��27�� ����8:40:37
 *
 */
public class EmployeeTest {

	public static void main(String[] args) {
		// fill the staff array with three Employee Object
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("A", 75000, 1987, 12, 15);
		staff[1] = new Employee("B", 50000, 1989, 10, 1);
		staff[2] = new Employee("C", 40000, 1990, 3, 15);

//		Employee e = new Employee(); //�﷨���� The constructor Employee() is undefined
		
		// raise every's salary by 5%
		for (Employee employee : staff) {
			employee.raiseSalary(5);
		}

		// print out information about all Employee objects
		for (Employee employee : staff) {
			System.out.println("name=" + employee.getName() + ",salary=" + employee.getSalary() 
				+ ",hireDay="+ employee.getHireDay());
		}

//����ʵ��һ: ����Ĺ��췽��
//		Employee employee = new Employee("abc", 110.10);//����Ĺ��췽��
//		System.out.println(employee.getName()+" "+employee.getSalary()); // null 0.0
		
//����ʵ����: ��д�������ÿɱ����ķ���������		
		Employee harry = new Employee(new Date());
		Date date = harry.getDate();
		System.out.println(date);
		double tenYearsInMilliSeconds = 10*365.25*24*60*60*1000;
		date.setTime(date.getTime() - (long)tenYearsInMilliSeconds);
		System.out.println(date);

	}

}
