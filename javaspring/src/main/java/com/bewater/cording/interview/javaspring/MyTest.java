package com.bewater.cording.interview.javaspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: bewater
 * @Date: Created in 19:13 2022/5/9
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("tx.xml"); //xml方式
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.bewater.cording.interview.javaspring"); //注解方式

    }
}
