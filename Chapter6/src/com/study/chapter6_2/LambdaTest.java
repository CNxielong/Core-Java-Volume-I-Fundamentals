package com.study.chapter6_2;

import java.util.Arrays;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * 
 * @ClassName: LambdaTest  
 * @Description: TODO(P234 this program demonstrates the use of lambda expression )  
 * @author X-Dragon   
 * @date 2018��10��15�� ����3:18:21 
 *
 */
public class LambdaTest {

	public static void main(String[] args) {
		//����һ������String����
		String[] planets = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};
		//��ӡ����ǰ������
		System.out.println(Arrays.toString(planets));
		//����String���򷽷� 
		System.out.println("Sorted in dictionary order");
		Arrays.sort(planets);//
		//��ӡĬ������������
		System.out.println(Arrays.toString(planets));
		//�����Զ��尴�ճ������򷽷�
		System.out.println("Sort by length:");
		Arrays.sort(planets, (first,second)-> first.length()-second.length() );//lambda���ʽ ������ �����жϲ������͹�ʡ��
		//��ӡ
		System.out.println(Arrays.toString(planets));
		
		Timer t = new Timer( 1000, event -> System.out.println("The time is "+new Date()) );//ֻ��һ����������ʡ������
		t.start();
		
		// keep program running util user selects "OK"
		JOptionPane.showMessageDialog(null, "Quit program");//�����Ի���
		System.exit(0);
	}

}
