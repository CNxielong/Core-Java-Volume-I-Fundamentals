package com.study.chapter5_1;

/**
 * 
 * @ClassName: Manager  
 * @Description: TODO(P153 程序5-3 用于继承关系子类 ) 默认构造器是调用super()构造方法，如果父类没有&&子类没有自己的构造方法 则报错  
 * @author X-Dragon  
 * @date 2018年9月5日 下午7:04:20 
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
