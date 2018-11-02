package com.study.chapter14;

import java.util.Arrays;

/**
 * 
 * @Title: Bank  
 * @Description: TODO(p643��װ������)  
 * @author X-Dragon  
 * @date 2018��11��2�� ����6:31:54 
 * @version V1.0  
 *
 */
public class Bank {

	private final double[] accounts;
	
	/**
	 * 
	 * @Title: 
	 * ����һ���µ�ʵ�� Bank���췽��  
	 * @Description: TODO(��һ�仰�������ļ���ʲô)  
	 * @param n ���鳤��
	 * @param initialBalance ��ʼ���������г�Ա��ֵ
	 *
	 */
	public Bank(int n ,double initialBalance){
		accounts = new double[n];
		Arrays.fill(accounts, initialBalance);
	}
	
	/**
	 * 
	 * @Title: transfer  
	 * @Description: TODO(ת�˷���)   
	 * @param: @param from ������˻�ת��
	 * @param: @param to ��������˻�
	 * @param: @param amount   ת�˵Ľ��   
	 * @return: void      
	 * @throws
	 */

	public void transfer(int from, int to, double amount){
		//�ж�from�˻����<amount
		if (accounts[from]<amount) return;
		//�����ǰ�̶߳�����Ϣ
		System.out.println(Thread.currentThread());
		//from��Ǯ
		accounts[from] -= amount;
		//��FROMת��amount��to
//		System.out.println("�˻�:"+from+"ת�����˻�:"+to+":"+amount+"Ǯ");
		System.out.printf(" %10.2f from %d to %d", amount, from, to);
		//to��Ǯ
		accounts[to] += amount;
		//ͳ��ǮgetTotalBanlance()
		System.out.printf("Total Balance: %10.2f%n",getTotalBanlance());
	}
	
	/**
	 * 
	 * @Title: getTotalBanlance  
	 * @Description: TODO(���������˻����ܶ�)   
	 * @param: @param accounts
	 * @param: @return      
	 * @return: double      
	 * @throws
	 */
	public double getTotalBanlance(){
		double sum = 0;
		for (double d : accounts) {
			sum += d;
		}
		return sum;
	}
	/**
	 * 
	 * @Title: size  
	 * @Description: TODO(���������˻���Ŀ)   
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	public int size(){
		return accounts.length;
	}
}

