package com.study.chapter6_1;


public interface Person {
	default String	getName(){return getClass().getName()+":Person_"+hashCode();}
}
