package com.study.test;


public class Test {
		
	private String name;
	private int age;
	private boolean boyFriend;
	
	public Test() {//空参构造
//		this()和this("name",  67, true);同时只能出现一个 否则构造器陷入死循环
		this("name",  67, true);//this 指针调用非空构造参数
		System.out.println("I am a boy:");
	}

	public Test(String name, int age, boolean boyFriend) {
//		this(); //语法报错Recursive constructor invocation Test() 地递归构造函数
		System.out.println("I am a boy:");
		this.name = name;
		this.age = age;
		this.boyFriend = boyFriend;
	}
	
}
