package com.study.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Auther: XDragon
 * @Date: 2021/4/6/006 21:23
 * @Email:cnxielong@gmail.com
 */
public class LambdaTest {

    public static List<Employee> employees = Arrays.asList(
            new Employee(1, "xielong1", 18, 11.11f),
            new Employee(2, "xielong2", 19, 11.21f),
            new Employee(3, "xielong3", 17, 21.11f),
            new Employee(4, "xielong4", 16, 11.0f),
            new Employee(5, "xielong5", 18, 10.1f)
    );

    @Test
    public void test1() {
        //先比较年龄 后比较薪水
        Collections.sort(employees, (e1, e2) -> {
            if (e1.getAge() == e2.getAge()) {
                return Float.compare(e1.getSalary(), e2.getSalary());
            }
            return Integer.compare(e1.getAge(), e2.getAge());
        });

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Test
    public void test2() {
        String strHandler = strHandler("\t\t\t xielong ", (str) -> str.trim());
        System.out.println("处理后的字符串是：" + strHandler);
    }

    /**
     * 返回字符串声明
     *
     * @param string
     * @param my
     * @return
     */
    public String strHandler(String string, MyFunction my) {
        return my.getValue(string);
    }

    @Test
    public void optTest() {
        //输出 a和b的乘积
        opt(100L, 100L, (a, b) -> a * b);
        opt2(100L,100,(a, b) -> a+b);
    }

    /**
     * 两种泛型的计算
     * @param a
     * @param b
     * @param opt
     */
    public void opt(long a, long b, OptFunction<Long,Long, Long> opt) {
        System.out.println(opt.getValue(a, b));
    }

    public void opt2(long a, int b, OptFunction<Long,Integer,Long> opt) {
        System.out.println(opt.getValue(a, b));
    }

}
