package com.study.chapter5_1;

/**
 * 
 * @ClassName: Manager  
 * @Description: TODO(P153 ����5-3 ���ڼ̳й�ϵ���� ) Ĭ�Ϲ������ǵ���super()���췽�����������û��&&����û���Լ��Ĺ��췽�� �򱨴�  
 * @author X-Dragon  
 * @date 2018��9��5�� ����7:04:20 
 *
 */
public class Manager extends Employee {
	private double bonus;



	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		bonus  = 0;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
}
