package com.study.test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Test {
	
	public static void main(String[] args) {
		String s1 = "001.002.003";
		String s2 = "001.003";
		if (s1.contains(s2)) {
			System.out.println(s1.contains(s2));
		}else{
			System.out.println(s1.contains(s2));
		}
	}
	

//	public static void main(String[] args) {
//		HashMap<String, String> map = new HashMap();
//		map.put("ABC", "ABC");
//		map.put("BCD", "BCD");
//		String s1 = map.get("ABC");
//		abc(s1);
////		abc2(map);
//		
//	}
	
	private static void abc(String s){
		System.out.println(s);
	}
	
	private  void abc2(String s){
//		System.out.println(map.get("ABC"));
	}
}
