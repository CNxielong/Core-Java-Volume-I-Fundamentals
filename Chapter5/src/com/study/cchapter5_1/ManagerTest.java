package com.study.cchapter5_1;

/**
 * 
 * @ClassName: ManagerTest
 * @Description: TODO(P152 程序5-1 多态实例)
 * @author X-Dragon
 * @date 2018年9月5日 下午7:08:02
 *
 */
public class ManagerTest {

	public static void main(String[] args) {
		// constrouct a Manager Object
		Manager boss = new Manager("xielong", 80000, 2000, 1, 1);
		boss.setBonus(5000);
		Employee[] staff = new Employee[3];

		// fill the staff array with Manager and Employee objects
		staff[0] = boss;
		staff[1] = new Employee("A", 50000, 1999, 9, 9);
		staff[2] = new Employee("B", 40000, 1998, 8, 8);

		// Print out information about all Employee objects
		for (Employee employee : staff) {
			System.out.println("name=" + employee.getName() + ",salary=" + employee.getSalary());
		}

	}

}
