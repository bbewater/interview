package com.bewater.cording.interview.javaspring.postConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Author: bewater
 * @Date: Created in 14:14 2022/5/12
 */
@Component
public class MyPostConstruct {
    @Autowired
    public ConstructA constructA;


    @PostConstruct
    public void construct(){
        /**
         * 注意 @Autowire注解是能够让Spring帮我们注入属性 得到的constructA是一个ConstructA对象
         * 利用方法上加@PostConstruct注解 是得在初始化之前执行该方法construct 完成相关constructA对象的一些操作
         */
        System.out.println("PostConstruct注解的作用:在初始化之前的前置处理器中完成该操作 CommonAnnotationBeanPostProcessor");
        constructA.setGame("lol");
        constructA.setName("zz");
    }

}
