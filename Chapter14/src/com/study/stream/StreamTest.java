package com.study.stream;

import com.study.lambda.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * stream流
 * 1、创建流
 * 2、流的操作
 * 3、流终止
 * @Auther: XDragon
 * @Date: 2021/4/11/011 23:48
 * @Email:cnxielong@gmail.com
 */
public class StreamTest {

    @Test
    public void  test1(){
        //1、Collection系列集合提供的stream()或
        ArrayList<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        //2、Arrays中的静态方法stream()获取数组流
        Employee[] employees = new Employee[10];
        Stream<Employee> stream2 = Arrays.stream(employees);

        //3、Stream类中的静态方法of()
        Stream<String> abc = Stream.of("abc", "123");

        //4、无限流
        Stream<Integer> iterate = Stream.iterate(0, (x) -> x + 2);
        iterate.limit(5).forEach(System.out::println);

    }

}
