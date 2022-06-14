package com.bewater.cording.interview.javaspring.cycle;

/**
 * @Author: bewater
 * @Date: Created in 17:14 2022/5/11
 */
public class BeanA {
    private BeanB beanB;

    public BeanB getBeanB() {
        return beanB;
    }

    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }
}
