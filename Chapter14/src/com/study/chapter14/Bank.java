package com.study.chapter14;

import java.util.Arrays;

/**
 * 
 * @Title: Bank  
 * @Description: TODO(p643封装银行类)  
 * @author X-Dragon  
 * @date 2018年11月2日 下午6:31:54 
 * @version V1.0  
 *
 */
public class Bank {

	private final double[] accounts;
	
	/**
	 * 
	 * @Title: 
	 * 创建一个新的实例 Bank构造方法  
	 * @Description: TODO(用一句话描述该文件做什么)  
	 * @param n 数组长度
	 * @param initialBalance 初始化数组所有成员的值
	 *
	 */
	public Bank(int n ,double initialBalance){
		accounts = new double[n];
		Arrays.fill(accounts, initialBalance);
	}
	
	/**
	 * 
	 * @Title: transfer  
	 * @Description: TODO(转账方法)   
	 * @param: @param from 从这个账户转出
	 * @param: @param to 进入这个账户
	 * @param: @param amount   转账的金额   
	 * @return: void      
	 * @throws
	 */

	public void transfer(int from, int to, double amount){
		//判断from账户余额<amount
		if (accounts[from]<amount) return;
		//输出当前线程对象信息
		System.out.println(Thread.currentThread());
		//from减钱
		accounts[from] -= amount;
		//从FROM转了amount到to
//		System.out.println("账户:"+from+"转给了账户:"+to+":"+amount+"钱");
		System.out.printf(" %10.2f from %d to %d", amount, from, to);
		//to加钱
		accounts[to] += amount;
		//统计钱getTotalBanlance()
		System.out.printf("Total Balance: %10.2f%n",getTotalBanlance());
	}
	
	/**
	 * 
	 * @Title: getTotalBanlance  
	 * @Description: TODO(计算所有账户的总额)   
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
	 * @Description: TODO(计算所有账户数目)   
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	public int size(){
		return accounts.length;
	}
}

