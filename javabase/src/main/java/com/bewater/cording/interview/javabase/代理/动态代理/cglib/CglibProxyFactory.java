package com.bewater.cording.interview.javabase.代理.动态代理.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: bewater
 * @Date: Created in 16:09 2022/5/19
 */
public class CglibProxyFactory<T> implements MethodInterceptor {
    private T target;

    public CglibProxyFactory(T target) {
        this.target = target;
    }

    // 创建代理对象

    public Object getProxyInstance() {

        // 1.cglib工具类
        Enhancer en = new Enhancer();
        // 2.设置父类
        en.setSuperclass(this.target.getClass());
        // 3.设置回调函数
        en.setCallback(this);

        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib动态代理增强方法开始");
        method.invoke(target,args);
        System.out.println("cglib动态代理增强方法结束");
        return null;
    }
}
