package com.study.lambda;

/**
 * 多个泛型 运算符方法
 * @Auther: XDragon
 * @Date: 2021/4/6/006 22:24
 * @Email:cnxielong@gmail.com
 */
@FunctionalInterface
public interface OptFunction<T,S,U> {
    /**
     * 运算符方法
     * @param t1
     * @param s1
     * @return
     */
    U getValue(T t1,S s1);
}
