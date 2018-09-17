package com.study.chapter5_3;

import java.util.ArrayList;

import com.study.chapter5_2.Employee;

/**
 * 
 * @ClassName: ArrayListTest  
 * @Description: TODO(P182 ����5-11 ����ArrayList��Demo)  
 * @author X-Dragon  
 * @date 2018��9��17�� ����7:46:00 
 *
 */
public class ArrayListTest {

	public static void main(String[] args) {
		//����ָ������Ԫ�ش�С ���� 		Employee[] staff = new Employee[3];
		ArrayList<Employee> staff = new ArrayList<>();
		
		// fill the staff ArrayList with three Employee objects
		staff.add(new Employee("A", 75000, 1987, 12, 15));
		staff.add(new Employee("B", 50000, 1989, 10, 1));
		staff.add(new Employee("C", 40000, 1990, 3, 15));
		//raise everyone's salary by 5%
		for (Employee employee : staff) {
			employee.raiseSalary(5);
		}
		//print out information about all Employee objects
		for (Employee employee : staff) {
			System.out.println(employee);//�Ѿ���дtoString����
		}
	}

}
