package com.study.chapter6_1;

public interface Named {
	default String getName(){return getClass().getName()+":Named_"+hashCode();};
//	 String getName();//B 不是默认实现。 不能直接用。否则报错Cannot directly invoke the abstract method getName() for the type Named
}	
