package com.study.chapter5_7;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 
 * @ClassName: CopyofTest  
 * @Description: TODO(P204 This program demonstrates the use of reflection for manipulating arrays.)  
 * @author X-Dragon  
 * @date 2018年9月30日 下午5:11:15 
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
	 * @return    参数  
	 * Object[]    返回类型  not the same type as a
	 * @throws
	 */
	public static Object[] badCopyOf(Object[] a, int newLength){
		Object[] newArray = new Object[newLength];
		System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
//		System.arraycopy(a, 0, newArray, 0, newLength); //可能数组下标越界
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
	 * @return    参数   a larger array that contains all elements of a.
	 * Object[]    返回类型  
	 * @throws
	 */
	public static Object goodCopyOf(Object a, int newLength){
		//获得a的Class类型
		Class c1 = a.getClass();
		//判断 c1是否是ARRAY 不是返回NULL
		if( ! c1.isArray() ) return null;
		//利用反射机制获得一个Object对象
		Class componentType = c1.getComponentType();//返回表示数组的组件类型的类
		int length = Array.getLength(a);
		Object newArray = Array.newInstance(componentType, newLength);//创建具有指定组件类型和长度的新数组
		System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
//		System.arraycopy(a, 0, newArray, 0, newLength);//java.lang.ArrayIndexOutOfBoundsException
		return newArray;
	}
	
	public static Object goodCopy(Object a, int newLenth){
		//获得a的Class
		Class c1 = a.getClass();
		System.out.println("C1: "+c1);
		//判断a是否为数组 否返回NULL
		if( !c1.isArray() ) return null;
		//获得c1 getComponentType
		Class componentType = c1.getComponentType();
		System.out.println("componentType: "+componentType);
		//获得a的长度
		int length = Array.getLength(a);
		//Array.实例化
//		Object newInstance = Array.newInstance(c1, Math.min(newLenth, length));// java.lang.ArrayStoreException
		Object newInstance = Array.newInstance(componentType, newLenth);
		//拷贝方法
		System.arraycopy(a, 0, newInstance, 0, Math.min(newLenth, length));
		return newInstance;
	}
}
