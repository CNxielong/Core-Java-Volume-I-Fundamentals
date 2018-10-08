package com.study.chapter5_7;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 
 * @ClassName: CopyofTest  
 * @Description: TODO(P204 This program demonstrates the use of reflection for manipulating arrays.)  
 * @author X-Dragon  
 * @date 2018��9��30�� ����5:11:15 
 *
 */
public class CopyofTest {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		//a goodCopyOf
		a = (int[])goodCopyOf(a, 10);
		System.out.println(Arrays.toString(a));
		String[] b = {"A","B","CD"};
		b = (String[])goodCopyOf(b, 10);
		System.out.println(Arrays.toString(b));
		b = (String[])goodCopy(b, 10);
		System.out.println(Arrays.toString(b));
		//b badCopyOf 
		System.out.println("The following call will generate an exception");
		b = (String[])badCopyOf(b, 10);//java.lang.ClassCastException:
	}

	/**
	 * 
	 * @Title: badCopyOf  
	 * @Description: TODO(
	 * This method attempts to grow an array by allocating a new array and 
	 * copying all elements)  
	 * @param a the array to copy
	 * @param newLength the new array length
	 * @return    ����  
	 * Object[]    ��������  not the same type as a
	 * @throws
	 */
	public static Object[] badCopyOf(Object[] a, int newLength){
		Object[] newArray = new Object[newLength];
		System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
//		System.arraycopy(a, 0, newArray, 0, newLength); //���������±�Խ��
		return newArray;
	}
	
	/**
	 * 
	 * @Title: goodCopyOf  
	 * @Description: TODO(
	 * P204 this method grows an array by allocating a new array of the 
	 * same type and copying all elements)  
	 * @param a the array to grow.This can be an object array or a primitive type array
	 * @param newLength
	 * @return    ����   a larger array that contains all elements of a.
	 * Object[]    ��������  
	 * @throws
	 */
	public static Object goodCopyOf(Object a, int newLength){
		//���a��Class����
		Class c1 = a.getClass();
		//�ж� c1�Ƿ���ARRAY ���Ƿ���NULL
		if( ! c1.isArray() ) return null;
		//���÷�����ƻ��һ��Object����
		Class componentType = c1.getComponentType();//���ر�ʾ�����������͵���
		int length = Array.getLength(a);
		Object newArray = Array.newInstance(componentType, newLength);//��������ָ��������ͺͳ��ȵ�������
		System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
//		System.arraycopy(a, 0, newArray, 0, newLength);//java.lang.ArrayIndexOutOfBoundsException
		return newArray;
	}
	
	public static Object goodCopy(Object a, int newLenth){
		//���a��Class
		Class c1 = a.getClass();
		System.out.println("C1: "+c1);
		//�ж�a�Ƿ�Ϊ���� �񷵻�NULL
		if( !c1.isArray() ) return null;
		//���c1 getComponentType
		Class componentType = c1.getComponentType();
		System.out.println("componentType: "+componentType);
		//���a�ĳ���
		int length = Array.getLength(a);
		//Array.ʵ����
//		Object newInstance = Array.newInstance(c1, Math.min(newLenth, length));// java.lang.ArrayStoreException
		Object newInstance = Array.newInstance(componentType, newLenth);
		//��������
		System.arraycopy(a, 0, newInstance, 0, Math.min(newLenth, length));
		return newInstance;
	}
}
