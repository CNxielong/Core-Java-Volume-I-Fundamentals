package com.study.chapter6_1;

public class Student implements Named, Person {

	@Override
	public String getName() {
//		return Person.super.getName();//Person接口的默认方法
		return Named.super.getName();//Named接口的默认方法
	}


//	public String getName() {
//		return "Student";
//	}
	
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.getName());
	}
}
