package com.bewater.cording.interview.javabase.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: bewater
 * @Date: Created in 15:03 2022/11/29
 * @Desc:
 */
public class ReflectionTest {

    //反射的优缺点:
    //优点:
    //①:对于任意一个类，都能够知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意一个方法
    //②:增加程序的灵活性和扩展性，降低耦合性，提高自适应能力
    //③.反射已经运用在了很多流行框架如：Struts、Hibernate、Spring 等等。
    //缺点:
    //①:使用反射会有效率问题。会导致程序效率降低。
    //②:反射技术绕过了源代码的技术，因而会带来维护问题。反射代码比相应的直接代码更复杂 。


    public static void main(String[] args) {
        //获取class对象的三种方式
        //①.Class.forName(类的路径)
        Class<?> studentClazz1 = null;
        try {
            studentClazz1 = Class.forName("com.bewater.cording.interview.javabase.反射.Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //②. 类.class
        Class<Student> studentClazz2 = Student.class;
        Student student = new Student();
        //③.  实例.getClass
        Class<? extends Student> studentClazz3 = student.getClass();
        System.out.println(studentClazz1 == studentClazz2);
        System.out.println(studentClazz1 == studentClazz3);
        System.out.println(studentClazz2 == studentClazz3);
        //全都返回true

        //使用反射创建实例对象  class对象.newInstance
        try {
            Student s = (Student) studentClazz1.newInstance();
            System.out.println(s);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        //使用反射获取实例对象中构造方法然后创建实例对象
        try {
            //getConstructor 获得public类型的构造方法 参数需匹配 newInstance参数也需匹配
            Constructor<?> constructor = studentClazz1.getConstructor(null);
            Student s1 = (Student) constructor.newInstance();
            System.out.println(s1);
            //getDeclaredConstructor 获取私有构造方法 参数也需匹配 newInstance参数也需匹配
            Constructor<?> declaredConstructor = studentClazz1.getDeclaredConstructor(String.class, int.class);
            //记得私有构造方法访问权限设置为true
            declaredConstructor.setAccessible(true);
            Student s2 = (Student) declaredConstructor.newInstance("bewater",20);
            System.out.println(s2);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        //利用反射获取实例私有属性 并赋值
        try {
            Student s3 = (Student) studentClazz1.newInstance();
            Field name = studentClazz1.getDeclaredField("name");
            //同样私有属性访问权限也要设置为true
            name.setAccessible(true);
            name.set(s3,"奇亚娜");
            System.out.println(s3);
        } catch (NoSuchFieldException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        //利用反射方式获取class对象的私有方法
        try {
            Method function = studentClazz1.getDeclaredMethod("function", String.class);
            function.setAccessible(true);
            Student s4 = (Student) studentClazz1.newInstance();
            function.invoke(s4,"私有方法调用传参");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
