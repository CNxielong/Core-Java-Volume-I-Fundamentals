package com.study.test;


public class Test {
		
	private String name;
	private int age;
	private boolean boyFriend;
	
	public Test() {//�ղι���
//		this()��this("name",  67, true);ͬʱֻ�ܳ���һ�� ��������������ѭ��
		this("name",  67, true);//this ָ����÷ǿչ������
		System.out.println("I am a boy:");
	}

	public Test(String name, int age, boolean boyFriend) {
//		this(); //�﷨����Recursive constructor invocation Test() �صݹ鹹�캯��
		System.out.println("I am a boy:");
		this.name = name;
		this.age = age;
		this.boyFriend = boyFriend;
	}
	
}
