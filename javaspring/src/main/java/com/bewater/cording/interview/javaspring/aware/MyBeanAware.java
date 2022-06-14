package com.bewater.cording.interview.javaspring.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Author: bewater
 * @Date: Created in 22:23 2022/5/10
 */
@Component
public class MyBeanAware implements BeanFactoryAware, ApplicationContextAware, BeanNameAware {
    //aware接口存在的意义:当我们想访问spring容器自带的bean对象 我们可以利用aware接口来帮我们做这件事
    private String myField;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    @Override
    public void setBeanName(String name) {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
