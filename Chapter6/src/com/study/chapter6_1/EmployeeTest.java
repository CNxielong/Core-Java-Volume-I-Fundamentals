package com.study.chapter6_1;

import java.util.Arrays;

/**
 * 
 * @ClassName: EmployeeTest
 * @Description: TODO(This program demonstrates the use of the Comparable interface)
 * @author X-Dragon
 * @date 2018年10月10日 下午5:39:07
 *
 */
public class EmployeeTest {

	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("H H", 35000);
		staff[1] = new Employee("C C", 75000);
		staff[2] = new Employee("T T", 38000);
		Arrays.sort(staff);
		// Print out information about all Employee objects
		for (Employee employee : staff) {
			System.out.println("name=" + employee.getName() + ",salary=" + employee.getSalary());
		}
	}

}
