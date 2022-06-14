package com.bewater.cording.interview.javaspring.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: bewater
 * @Date: Created in 18:09 2022/5/9
 */
@Configuration
public class MyPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
            if (beanDefinitionName.equals("myConfigurationClass")){
                BeanDefinition bd = beanFactory.getBeanDefinition("myConfigurationClass");

            }
        }
    }

    /**
     * BeanFactoryPostProcessor: 后置处理器或者增强器  当beanDefinition加载到IOC容器中 接下来就要利用BeanFactory利用反射实例化对象了
     * 在实例化对象之前 我们可以利用这些增强器做一些事情(例如自己的业务代码做到一些增强)
     */
}
