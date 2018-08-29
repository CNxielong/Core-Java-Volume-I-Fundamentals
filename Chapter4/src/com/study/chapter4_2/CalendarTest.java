package com.study.chapter4_2;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @ClassName: CalendarTest
 * @Description: TODO(PAGE:101 ��ӡ��ǰ�·�����)
 * @author X-Dragon
 * @date 2018��8��27�� ����12:45:26
 */
public class CalendarTest {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now(); // 2018-08-27
		int month = date.getMonthValue(); // 8
		// System.out.println(date.getMonth()); //AUGUST
		int today = date.getDayOfMonth(); // 27

		date = date.minusDays(today - 1);// ��ǰ�·ݵ�һ�� 2018-08-01
		DayOfWeek dayOfWeek = date.getDayOfWeek();// WEDNESDAY
		int value = dayOfWeek.getValue();// 3

		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		for (int i = 1; i < value; i++) {
			System.out.print("    ");
		}
		while (date.getMonthValue() == month) {
			System.out.printf("%3d", date.getDayOfMonth());
			if (date.getDayOfMonth() == today) {// ���� *
				System.out.print('*');
			} else {
				System.out.print(" ");// System.out.print(' ');
			}

			date = date.plusDays(1);
			if (date.getDayOfWeek().getValue() == 1)
				System.out.println();// �����һ����
		}
		if (date.getDayOfWeek().getValue() != 1)
			System.out.println();// �����һ����
	}

}
