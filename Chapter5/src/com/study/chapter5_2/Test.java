package com.study.chapter5_2;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("abc");
		System.out.println(arr.get(0));
		Employee[] e = new Employee[100];
		System.out.println(e[0]);
		Integer a  = 1000;
		Integer b  = 1000;
		if (a == b) {
			System.out.println("A=");
		}else if(a.equals(b)){
			System.out.println("E");
		}
		
	}

}
