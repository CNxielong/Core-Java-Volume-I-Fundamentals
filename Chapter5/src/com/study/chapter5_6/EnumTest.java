package com.study.chapter5_6;

import java.util.Scanner;

/**
 * 
 * @ClassName: EnumTest
 * @Description: TODO(P189 枚举类测试 this program demonstrates enumerated types)
 * @author X-Dragon
 * @date 2018年9月17日 下午8:41:03
 *
 */
public class EnumTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a size:(SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
		String input = in.next().toUpperCase();
		Size size = Enum.valueOf(Size.class,input);//返回指定名字、给定类的枚举变量
		System.out.println("size="+size);
		System.out.println("abbreviation="+size.getAbbreviation());
		if (size == Size.EXTRA_LARGE) {
			System.out.println("Good job -- you paid attention to the _.");
		}
	}

}

enum Size {// 不是Class开头 enum开头
	SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
	private String abbreviation;

	private Size(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getAbbreviation() {
		return this.abbreviation;
		// return abbreviation;
	}
}