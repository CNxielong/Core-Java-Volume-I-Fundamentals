package com.study.chapter14;

/**
 * @Title: UnsynchBankTest
 * @Description: TODO(P642 This program show data corruption when multiple
 *               threads access a data structure)
 * @author X-Dragon
 * @date 2018年11月2日 下午6:12:27
 * @version V1.0
 */
public class UnsynchBankTest {

	public static final int NACCOUNTS = 100;
	public static final double INITIAL_BALANCE = 1000;
	public static final double MAX_AMOUNT = 1000;// 转账
	public static final int DELAY = 10;// 线程sleep

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 新建一个账户数组
		Bank bank = new Bank(NACCOUNTS, INITIAL_BALANCE);
		// for循环
		for (int i = 0; i < NACCOUNTS; i++) {
			// 转出账户Account
			int fromAccount = i;
			// 定义Runnable接口
			Runnable r = () -> {
				try {
					while (true) {
						int toAccount = (int) (bank.size() * Math.random());
						double amount = MAX_AMOUNT * Math.random();
						bank.transfer(fromAccount, toAccount, amount);
						Thread.sleep((int) Math.random() * DELAY);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			};
			// 开启线程
			Thread t = new Thread(r);
			t.start();
		}

	}

}
