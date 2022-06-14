package com.bewater.cording.interview.javaspring.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: bewater
 * @Date: Created in 17:19 2022/5/11
 */
public class TestCycle {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("cycle.xml");
//        BeanA beanA = (BeanA) context.getBean("beanA");
//        BeanB beanB = (BeanB) context.getBean("beanB");
        BeanA beanA = context.getBean(BeanA.class);
        BeanB beanB = context.getBean(BeanB.class);
        System.out.println(beanA.getBeanB());
        System.out.println(beanB.getBeanA());
    }
}
