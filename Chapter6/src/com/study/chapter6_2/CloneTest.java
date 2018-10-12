package com.study.chapter6_2;
/**
 * 
 * @ClassName: CloneTest  
 * @Description: TODO(P229 this program demonstrates cloning)  
 * @author X-Dragon  
 * @date 2018年10月12日 下午5:47:35 
 *
 */
public class CloneTest {

	public static void main(String[] args) {
		
		Employee original = new Employee("EDG ClearLove",7777);
		original.setHireday(2018, 10, 12);
		try {
			Employee copy = original.clone();
			copy.setHireday(2018, 10, 13);
			copy.raise(10);
			System.out.println("original: "+original);
			System.out.println("copy: "+copy);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
