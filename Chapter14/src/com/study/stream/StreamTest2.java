package com.study.stream;

import com.study.lambda.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream流的筛选与切片
 * @Auther: XDragon
 * @Date: 2021/4/12/012 22:25
 * @Email:cnxielong@gmail.com
 */
public class StreamTest2 {


    public static List<Employee> employees = Arrays.asList(
            new Employee(1, "xielong1", 18, 11.11f),
            new Employee(2, "xielong2", 19, 11.21f),
            new Employee(3, "xielong3", 17, 21.11f),
            new Employee(4, "xielong4", 16, 11.0f),
            new Employee(4, "xielong4", 16, 11.0f),
            new Employee(5, "xielong5", 18, 10.1f)
    );

    /**
     * 筛选与切片
     * filter-接收lambda，从流中排除某些元素
     * limit-截断流，使其元素不超过给定数量
     * skip(n)- 跳过前N个元素，如果不够N个返回空流。
     * distinct- 返回一个包含不同的元素流（根据 Object.equals(Object)）这个流。
     * */

    //内部迭代：迭代操作由Stream API构成
    @Test
    public void test1(){
        Stream<Employee> employeeStream = employees.stream().limit(3);//limit
//        employeeStream.forEach(System.out::println);

        Stream<Employee> ageStream = employees.stream().filter( (employee)->employee.getAge()>=18 );//断言型接口
//        ageStream.forEach(System.out::println);

        Stream<Employee> skipStream = employees.stream().skip(3);//跳过元素
        System.out.println("一共"+skipStream.count());
//        skipStream.forEach(System.out::println);

        Stream<Employee> distinctStream = employees.stream().distinct();
        distinctStream.forEach(System.out::println);
    }

    /**
     * 排序：
     * sorted()自然排序
     * sorted(Comparator com)定制排序
     * */
    @Test
    public void test2() {
//        employees.stream().sorted().forEach(System.out::println);//类型转换异常 不是可比较的类
        List<String> list = Arrays.asList("aaa", "bbb", "aa", "ccc", "d");
        list.stream().sorted().forEach(System.out::println);

//        employees.stream().sorted(
//                (e1, e2) -> Comparator.comparing(Employee::getAge).compare(e1, e2) // 只按照年龄排序
//        ).forEach(System.out::println);

        employees.stream().sorted((e1, e2) -> {
            if (e1.getAge() == e2.getAge()) {
                return e1.getName().compareTo(e2.getName());
            } else {
                return Integer.compare(e1.getAge(), e2.getAge());
            }
        }).forEach(System.out::println);

        System.out.println("xielong1".compareTo("xielong2"));
    }



}
