package com.study.chapter5_6;

import java.util.Scanner;

/**
 * 
 * @ClassName: EnumTest
 * @Description: TODO(P189 ö������� this program demonstrates enumerated types)
 * @author X-Dragon
 * @date 2018��9��17�� ����8:41:03
 *
 */
public class EnumTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a size:(SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
		String input = in.next().toUpperCase();
		Size size = Enum.valueOf(Size.class,input);//����ָ�����֡��������ö�ٱ���
		System.out.println("size="+size);
		System.out.println("abbreviation="+size.getAbbreviation());
		if (size == Size.EXTRA_LARGE) {
			System.out.println("Good job -- you paid attention to the _.");
		}
	}

}

enum Size {// ����Class��ͷ enum��ͷ
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