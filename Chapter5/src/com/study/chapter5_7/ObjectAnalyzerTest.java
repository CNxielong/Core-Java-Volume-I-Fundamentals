package com.study.chapter5_7;

import java.util.ArrayList;

/**
 * 
 * @ClassName: ObjectAnalyzer  
 * @Description: TODO(P200 This program uses reflection to spy on objects)  
 * @author X-Dragon  
 * @date 2018��9��26�� ����6:51:15 
 *
 */
public class ObjectAnalyzerTest {

	public static void main(String[] args) {
		ArrayList<Integer> squares = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			squares.add(i*i);
		}
		System.out.println(new ObjectAnalyzer().toString(squares));
	}

}
