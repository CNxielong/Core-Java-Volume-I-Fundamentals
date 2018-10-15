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
 * @date 2018年10月15日 下午3:18:21 
 *
 */
public class LambdaTest {

	public static void main(String[] args) {
		//定义一个星球String数组
		String[] planets = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};
		//打印排序前的数组
		System.out.println(Arrays.toString(planets));
		//调用String排序方法 
		System.out.println("Sorted in dictionary order");
		Arrays.sort(planets);//
		//打印默认排序后的数组
		System.out.println(Arrays.toString(planets));
		//调用自定义按照长度排序方法
		System.out.println("Sort by length:");
		Arrays.sort(planets, (first,second)-> first.length()-second.length() );//lambda表达式 带参数 可以判断参数类型故省略
		//打印
		System.out.println(Arrays.toString(planets));
		
		Timer t = new Timer( 1000, event -> System.out.println("The time is "+new Date()) );//只有一个参数可以省略括号
		t.start();
		
		// keep program running util user selects "OK"
		JOptionPane.showMessageDialog(null, "Quit program");//弹出对话框
		System.exit(0);
	}

}
