package com.study.chapter5_7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * 
 * @ClassName: ReflectionTest
 * @Description: TODO(P195 )
 * @author X-Dragon
 * @date 2018年9月19日 下午9:02:03
 *
 */
public class ReflectionTest {

	public static void main(String[] args) {
		// read class name from command line args or user input
		String name;
		if (args.length > 0)
			name = args[0];
		else {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter Class name(e.g. java.util.Date): ");
			name = in.next();
		}

		try {
			// print class name and superclass name(if != Object)
			Class c1 = Class.forName(name);
			Class superc1 = c1.getSuperclass();
			String modifier = Modifier.toString(c1.getModifiers());
			if (modifier.length() > 0) {
				System.out.print(modifier + " ");
			}
			System.out.print("class " + name);
			if (superc1 != null && superc1 != Object.class) {
				System.out.print("extends " + superc1.getName());
			}
			System.out.println("\n{\n");
			printConstructors(c1);
			System.out.println();
			printMethods(c1);
			System.out.println();
			printFields(c1);
			System.out.println("}");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.exit(0);
	}

	/**
	 * 
	 * @Title: printConstructors @Description: TODO(print all constructors of a
	 * class) @param @param c1 参数 @return void 返回类型 @throws
	 */
	public static void printConstructors(Class c1) {
		Constructor[] constructors = c1.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			// 打印名称
			String name = c1.getName();
			System.out.print("	");
			// 长度大于0打印 modifier
			String modifier = Modifier.toString(constructor.getModifiers());// 获得权限修饰符号

			if (modifier.length() > 0) {
				System.out.print(modifier + "");
			}
			System.out.print(name + "(");

			// print parameters types
			Class[] parameterTypes = constructor.getParameterTypes();
			for (int i = 0; i < parameterTypes.length; i++) {
				if (i > 0)
					System.out.print(", ");
				System.out.print(parameterTypes[i].getName());
			}
			System.out.println(")");
		}
	}

	/**
	 * 
	 * @Title: printMethods 
	 * @Description: TODO(print all methods of a class) 
	 * @param c1 参数 
	 * @return void 返回类型 
	 * @throws
	 */

	public static void printMethods(Class c1) {
		Method[] methods = c1.getDeclaredMethods();
		Class retType = c1.getClass();
		for (Method method : methods) {
			String name = method.getName();
			System.out.print("	");
			// print modifiers,return retType and method name
			String modifiers = Modifier.toString(method.getModifiers());
			if (modifiers.length() > 0) {
				System.out.print(modifiers + " ");
			}
			System.out.print(retType.getName() + " " + name + "(");

			// print parameters types
			Class[] parameterTypes = method.getParameterTypes();
			for (int i = 0; i < parameterTypes.length; i++) {
				if (i > 0)
					System.out.print(", ");
				System.out.print(parameterTypes[i].getName());
			}
			System.out.println(");");
		}
	}

	/**
	 * 
	 * @Title: printFields  
	 * @Description: TODO(Prints all fields of a class)  
	 * @param @param c1    参数  
	 * @return void    返回类型  
	 * @throws
	 */
	 
	public static void printFields(Class c1) {
		Field[] fields = c1.getDeclaredFields();
		for (Field field : fields) {
			Class type = field.getType();
			String name = field.getName();
			System.out.print("	");
			String modifiers = Modifier.toString(field.getModifiers());
			if (modifiers.length() > 0) {
				System.out.print(modifiers + " ");
			}
			System.out.println(type.getName() + " " + name + ";");
		}
	}

}
