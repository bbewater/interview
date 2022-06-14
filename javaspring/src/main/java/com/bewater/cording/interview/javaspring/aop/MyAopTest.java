package com.bewater.cording.interview.javaspring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: bewater
 * @Date: Created in 15:32 2022/5/12
 */
public class MyAopTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.bewater.cording.interview.javaspring.aop");
        AopB bean = context.getBean(AopB.class);
        bean.testAop();

        //AnnotationAwareAspectJAutoProxyCreator-->beanPostProcessor

    }
}
