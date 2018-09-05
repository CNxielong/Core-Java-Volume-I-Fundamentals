package com.study.cchapter5_1_2;

/**
 * 
 * @ClassName: PersonTest
 * @Description: TODO(抽象类多态的实例)
 * @author X-Dragon
 * @date 2018年9月5日 下午8:32:57
 *
 */
public class PersonTest {

	public static void main(String[] args) {
		Person[] people = new Person[2];
		// fill the people array with Employee and student objects
		people[0] = new Employee("A", 50000, 1999, 9, 9);
		people[1] = new Student("B", "CS");

		// print out names and descriptions of all Person objects
		for (Person p : people) {
			System.out.println(p.getName()+", "+p.getDescription());
		}
	}

}
