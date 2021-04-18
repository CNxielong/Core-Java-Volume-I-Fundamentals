package com.study.stream;

import com.study.lambda.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream����ɸѡ����Ƭ
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
     * ɸѡ����Ƭ
     * filter-����lambda���������ų�ĳЩԪ��
     * limit-�ض�����ʹ��Ԫ�ز�������������
     * skip(n)- ����ǰN��Ԫ�أ��������N�����ؿ�����
     * distinct- ����һ��������ͬ��Ԫ���������� Object.equals(Object)���������
     * */

    //�ڲ�����������������Stream API����
    @Test
    public void test1(){
        Stream<Employee> employeeStream = employees.stream().limit(3);//limit
//        employeeStream.forEach(System.out::println);

        Stream<Employee> ageStream = employees.stream().filter( (employee)->employee.getAge()>=18 );//�����ͽӿ�
//        ageStream.forEach(System.out::println);

        Stream<Employee> skipStream = employees.stream().skip(3);//����Ԫ��
        System.out.println("һ��"+skipStream.count());
//        skipStream.forEach(System.out::println);

        Stream<Employee> distinctStream = employees.stream().distinct();
        distinctStream.forEach(System.out::println);
    }

    /**
     * ����
     * sorted()��Ȼ����
     * sorted(Comparator com)��������
     * */
    @Test
    public void test2() {
//        employees.stream().sorted().forEach(System.out::println);//����ת���쳣 ���ǿɱȽϵ���
        List<String> list = Arrays.asList("aaa", "bbb", "aa", "ccc", "d");
        list.stream().sorted().forEach(System.out::println);

//        employees.stream().sorted(
//                (e1, e2) -> Comparator.comparing(Employee::getAge).compare(e1, e2) // ֻ������������
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
