package com.study.chapter6_1;

public class Student implements Named, Person {

	@Override
	public String getName() {
//		return Person.super.getName();//Person�ӿڵ�Ĭ�Ϸ���
		return Named.super.getName();//Named�ӿڵ�Ĭ�Ϸ���
	}


//	public String getName() {
//		return "Student";
//	}
	
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.getName());
	}
}
