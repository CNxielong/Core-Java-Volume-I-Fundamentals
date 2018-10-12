package com.study.chapter6_2;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * 
 * @ClassName: TimerTest  
 * @Description: TODO(P223 接口与回调 定时器)  
 * @author X-Dragon  
 * @date 2018年10月12日 下午3:30:35 
 *
 */
public class TimerTest {

	public static void main(String[] args) {
		ActionListener listener = new TimePrinter();
		//constructor a timer that calls the listener
		//once every 5 seconds
		Timer t = new Timer(5000, listener);
		t.start();
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}

}

class TimePrinter implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println("At the tone, the time is" + new Date());
		Toolkit.getDefaultToolkit().beep();//蜂鸣一声
	}
	
}
