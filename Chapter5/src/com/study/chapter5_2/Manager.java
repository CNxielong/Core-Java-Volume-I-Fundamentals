package com.study.chapter5_2;

import java.time.LocalDate;

public class Manager extends Employee {
	
	private double bouns;

	public Manager(String name, double salary, int year, int month ,int day) {
		super(name, salary, year, month, day);
		bouns = 0;
	}

	public double getBouns() {
		return bouns;
	}

	public void setBouns(double bouns) {
		this.bouns = bouns;
	}

	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary + bouns;
	}
	
	@Override
	public boolean equals(Object otherObject){
		if(! super.equals(otherObject)) return false;//�������ȵ��ø����equals����
		Manager other = (Manager) otherObject;
		// super.equals checked that  this and other belong to the same class
		return bouns == other.bouns;
	}
	
	@Override
	public int hashCode() {
		//��ʾ����Double�Ĺ��췽�� Double�������hashCode����
		return super.hashCode()+17* new Double(bouns).hashCode();
		//Double(bouns). û��hashCode()���� �����ʾ��������֮���ǿ��ת��
	}
}
