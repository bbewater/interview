package com.bewater.cording.interview.javaspring.factoryBean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: bewater
 * @Date: Created in 18:53 2022/5/9
 */
@Configuration
public class MyFactoryBean implements FactoryBean {

    /**
     * FactoryBean存在的意义在于:创建一些特殊的bean 这些bean可以通过getObject()方法创建 而不需要走普通bean的那些生命周期了
     * @return
     * @throws Exception
     */
    @Override
    public Object getObject() throws Exception {
        SpecialBean specialBean = new SpecialBean();
        return specialBean;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
