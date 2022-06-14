package com.bewater.cording.interview.javabase.代理.动态代理.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: bewater
 * @Date: Created in 15:50 2022/5/19
 */
public class DynamicInvocationHandler implements InvocationHandler {
    private DynamicTarget target;

    public DynamicInvocationHandler(DynamicTarget target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理方法增强开始");
        method.invoke(target,args);
        System.out.println("动态代理方法增强结束");
        return null;
    }
}
