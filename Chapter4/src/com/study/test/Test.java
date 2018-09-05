package com.study.test;

public class Test {

	public static Long fibonacciRecursive(int i) {// µÝ¹é

		if (i <= 2) {
			return 1L;
		} else {
			return fibonacciRecursive(i - 1) + fibonacciRecursive(i - 2);
		}

	}
	
	
	public static long fibonacciRecurrence(Long i) {// µÝÍÆ
		
		if (i <= 2) {
			return 1L;
		} else {
			Long  s1 = 1L, s2 = 1L, sn = 0L;
			for (int j = 2; j < i; j++) {
				sn = (long)(s1 + s2);
				s1 = s2;
				s2 = sn;
			}
			
			return sn;
		}

	}

	public static void main(String[] args) {

		Long result = fibonacciRecursive(0);
		System.out.println(result);
		Long result2 = fibonacciRecurrence(6L);
		System.out.println(result2);
	}
}
