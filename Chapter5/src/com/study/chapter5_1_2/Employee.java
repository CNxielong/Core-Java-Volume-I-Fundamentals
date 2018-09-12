package com.study.chapter5_1_2;

import java.time.LocalDate;

public class Employee extends Person {

	private double salary;
	private LocalDate hireDay;

	public Employee(String name, double salary, int year, int month, int day) {
		super(name);
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	public void setHireDay(LocalDate hireDay) {
		this.hireDay = hireDay;
	}

	@Override
	public String getDescription() {
		return String.format("an employee with a salary of %.2f", salary);
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hireDay == null) ? 0 : hireDay.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj){//������
			return true;
		}
		//�жϷǿ�
		if(obj == null){
			return false;
		}
		//�ж������Ƿ�һ��
		if ( getClass() != this.getClass()  ) {
			return false;
		}
		//ǿ��ת�� �����Ƚ�
		Employee e = (Employee) obj;
		return e.getDescription().equals(this.getDescription()) 
				&& e.getName().equals(this.getName()) ;

	}
	
	
}
