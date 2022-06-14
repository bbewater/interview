package com.bewater.cording.interview.javabase.代理.动态代理.cglib;

/**
 * @Author: bewater
 * @Date: Created in 16:13 2022/5/19
 */
public class CglibTest {
    public static void main(String[] args) {
        CglibTarget target = new CglibTarget();
        CglibProxyFactory<CglibTarget> proxyFactory = new CglibProxyFactory<>(target);
        CglibTarget proxy = (CglibTarget) proxyFactory.getProxyInstance();
        proxy.work();


    }
}
