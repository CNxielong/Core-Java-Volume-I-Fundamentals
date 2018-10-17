package com.study.chapter6_2;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Cloneable {

	private String name;
	private double salary;
	private Date hireDay;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	protected Employee clone() throws CloneNotSupportedException {
		// call object.clone()
		Employee cloned = (Employee) super.clone();
		//clone mutable fields 克隆变量
		cloned.hireDay = (Date)hireDay.clone();
		return cloned;
	}


	/**
	 * 
	 * @Title: setHireday @Description: TODO(Set the hire day to given
	 * date.) @param year the year of the hire day @param month the month of the
	 * hire day @param day the day of the hire day 参数 void 返回类型 @throws
	 */
	public void setHireday(int year, int month, int day) {
		Date newHireday = new GregorianCalendar(year, month - 1, day).getTime();
		hireDay = newHireday;
		// Example of instance field mutation
//		hireDay.setTime(newHireday.getTime());//空指针异常
	}

	public void raise(double percent) {
		salary += salary * percent / 100;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", hireDay=" + hireDay + "]";
	}

}
