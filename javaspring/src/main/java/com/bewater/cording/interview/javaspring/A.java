package com.bewater.cording.interview.javaspring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Author: bewater
 * @Date: Created in 19:31 2022/5/9
 */
@Component
public class A implements BeanFactoryAware, ApplicationContextAware {
    private BeanFactory beanFactory;
    private ApplicationContext applicationContext;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void test(){
        System.out.println("初始化方法");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }
}
