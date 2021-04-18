package com.study.lambda;

import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.*;

/**
 * 一、方法引用三种形式
 * lambda体中的内容有方法已经实现了，可以用方法引用（lambda表达式的另外一种表现形式）
 *
 *  对象::实例方法名
 *  类::静态方法名
 *  类::实例方法名
 *
 *  二、构造器引用
 *  ClassName::new
 *
 * 三、数组引用
 *  Type::new
 *
 * @Auther: XDragon
 * @Date: 2021/4/8/008 22:47
 * @Email:cnxielong@gmail.com
 */
public class MethodRefTest {

    @Test
    public void test1(){
        Consumer<String> con =(x)-> System.out.println(x);
        PrintStream ps = System.out;
        Consumer<String> con1 = ps::println;
        con1.accept("ABC");
        con.accept("and then");
//        con1.andThen(con);
    }

    @Test
    public void test2(){
        Employee employee = new Employee();
        Supplier<String> sup = () -> employee.getName();
        String s = sup.get();
        System.out.println(s);

        Supplier<Integer> sup2 = employee::getAge;
        Integer integer = sup2.get();
        System.out.println(integer);
    }

    @Test
    public void test3(){//类静态方法
        Comparator<Integer> comInteger = Integer::compare;
        int compare = comInteger.compare(1, 2);
        System.out.println(compare);
    }

    @Test
    public void test4(){//类::实例方法名
        BiPredicate<String,String> biPredicate = String::equals;
        boolean test = biPredicate.test("ABC", "abc");
        System.out.println(test);
    }

    @Test
    public void test5(){//构造器引用
        Supplier<Employee> supplier = Employee::new;
        Employee employee = supplier.get();
        System.out.println(employee);//默认是空参构造器
    }

    @Test
    public void test6(){//构造器引用 多个参数
        BiFunction<Integer,String,Employee> function = Employee::new;
        Employee employee = function.apply(1,"xielong");
        System.out.println(employee);//默认是空参构造器
    }

    @Test
    public void test7(){//构造器引用 多个参数
        Function<Integer,Character[]> function = Character[]::new;
        Character[] apply = function.apply(20);
        System.out.println(apply.length);

    }

}
