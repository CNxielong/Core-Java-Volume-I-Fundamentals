package com.study.chapter5_2;

/**
 * 
 * @ClassName: EqualsTest
 * @Description: TODO(P174 equals、hashCode、toString方法)
 * @author X-Dragon
 * @date 2018年9月12日 下午8:13:21
 *
 */
public class EqualsTest {

	public static void main(String[] args) {
		Employee alice1 = new Employee("Alice Adams", 75000, 1987, 12, 15);
		Employee alice2 = alice1;
		Employee alice3 = new Employee("Alice Adams", 75000, 1987, 12, 15);
		Employee bob = new Employee("Bob Brandson", 50000, 1989, 10, 1);

		System.out.println("alice1 == alice2: " + (alice1 == alice2));//true
		System.out.println("alice1 == alice3: " + (alice1 == alice3));//false
		System.out.println("alice1.equals(alice3): " + (alice1.equals(alice3)));//true
		System.out.println("alice1.equals(bob): " + (alice1.equals(bob)));//false
		//com.study.chapter5_2.Employee [name=Bob Brandson, salary=50000.0, hireDay=1989-10-01]
		System.out.println("bob.toString():"+bob);
		
		Manager carl = new Manager("Carl Cracker", 80000, 1987, 12, 15);
		Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
		boss.setBouns(5000);
		//com.study.chapter5_2.Manager [name=Carl Cracker, salary=80000.0, hireDay=1987-12-15]
		System.out.println("boss.toString():" + boss);
		System.out.println("carl.equals(boss):" + carl.equals(boss));//false
		System.out.println("alice1.hashCode():"+alice1.hashCode());//-808853550
		System.out.println("alice3.hashCode():"+alice3.hashCode());//-808853550
		System.out.println("bob.hashCode():"+bob.hashCode());//-624019882
		System.out.println("carl.hashCode():"+carl.hashCode());//-341762419
		
	
	
	}

}
