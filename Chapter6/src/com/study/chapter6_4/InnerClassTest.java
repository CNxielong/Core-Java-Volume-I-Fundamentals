package com.study.chapter6_4;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * 
 * @ClassName: InnerClassTest
 * @Description: TODO(P246 This program demonstrates the use of inner classes.)
 * @author X-Dragon
 * @date 2018年10月17日 上午11:06:25
 *
 */
public class InnerClassTest {

	public static void main(String[] args) {
		TalkingClock clock = new TalkingClock(1000, true);
		clock.start();
		
		//keep program running until user selects "OK"
		JOptionPane.showMessageDialog(null, "Quit program");
		System.exit(0);
	}

}

/**
 * 
 * @ClassName: TalkingClock
 * @Description: TODO(A clock that prints the time regular intervals)
 * @author X-Dragon
 * @date 2018年10月17日 上午11:21:26
 *
 */
class TalkingClock {
	
	private int interval;
	private boolean beep;

	// 全参数构造方法
	public TalkingClock(int interval, boolean beep) {
		this.interval = interval;
		this.beep = beep;
	}

	// Starts the clock
	public void start() {
		ActionListener listener = new TimerPrinter();
		Timer t = new Timer(interval, listener);
		t.start();
	}

	// 内部类TimerPrinter
	public class TimerPrinter implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("At the tone, this time is" + new Date());
			if (beep)
				Toolkit.getDefaultToolkit().beep();
		}

	}
}
