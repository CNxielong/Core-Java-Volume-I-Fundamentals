package com.study.chapter14;

/**
 * @Title: UnsynchBankTest
 * @Description: TODO(P642 This program show data corruption when multiple
 *               threads access a data structure)
 * @author X-Dragon
 * @date 2018��11��2�� ����6:12:27
 * @version V1.0
 */
public class UnsynchBankTest {

	public static final int NACCOUNTS = 100;
	public static final double INITIAL_BALANCE = 1000;
	public static final double MAX_AMOUNT = 1000;// ת��
	public static final int DELAY = 10;// �߳�sleep

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �½�һ���˻�����
		Bank bank = new Bank(NACCOUNTS, INITIAL_BALANCE);
		// forѭ��
		for (int i = 0; i < NACCOUNTS; i++) {
			// ת���˻�Account
			int fromAccount = i;
			// ����Runnable�ӿ�
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
			// �����߳�
			Thread t = new Thread(r);
			t.start();
		}

	}

}
