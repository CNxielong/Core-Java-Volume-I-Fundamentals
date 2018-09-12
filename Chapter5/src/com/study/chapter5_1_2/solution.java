package com.study.chapter5_1_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class solution {

	private static List<Integer> list;

	public static void main(String[] args) {
		int num = 6;
		int[] salaries = {10,20,10,20,20,30};

		list = salaryfrequency(num,salaries);
		Collections.sort(list);
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}

	private static List<Integer> salaryfrequency(int num, int[] salaries) {
		List list = new ArrayList<Integer>();	
		for (int i = 0; i < num; i++) {
			list.add(salaries[i]);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ",");
		}
		System.out.println();
		int count = 1;// 默认出现的次数为1
		for (int i = 0; i < list.size(); i++) {
			count = 1;
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					count++;
					list.remove(j);
					j--;
				}
			}
			System.out.println(list.get(i) + "》》》出现了" + count);
		}
		return list;
	}
	
}
