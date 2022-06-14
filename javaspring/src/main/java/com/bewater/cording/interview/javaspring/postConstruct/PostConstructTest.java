package com.bewater.cording.interview.javaspring.postConstruct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: bewater
 * @Date: Created in 14:17 2022/5/12
 */
public class PostConstructTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.bewater.cording.interview.javaspring.postConstruct");
        MyPostConstruct bean = context.getBean(MyPostConstruct.class);
        System.out.println(bean.constructA.getGame());
    }
}
