package com.study.chapter6_1;

public interface Named {
	default String getName(){return getClass().getName()+":Named_"+hashCode();};
//	 String getName();//B ����Ĭ��ʵ�֡� ����ֱ���á����򱨴�Cannot directly invoke the abstract method getName() for the type Named
}	
