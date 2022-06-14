package com.bewater.cording.interview.javabase.代理.动态代理.jdk;

import java.lang.reflect.Proxy;

/**
 * @Author: bewater
 * @Date: Created in 15:21 2022/5/19
 */
public class DynamicProxyTest {

    public static void main(String[] args) throws Exception {
        //JDK动态代理 依靠接口+反射(Proxy类 InvocationHandler)
        DynamicTarget dynamicTarget = new DynamicTarget();
        DynamicInvocationHandler dynamicInvocationHandler = new DynamicInvocationHandler(dynamicTarget);
        DynamicInterface dynamicProxy = (DynamicInterface) Proxy.newProxyInstance(DynamicInterface.class.getClassLoader(), new Class[]{DynamicInterface.class}, dynamicInvocationHandler);
        dynamicProxy.work();
//        Class<DynamicInterface> proxyClass = (Class<DynamicInterface>) Proxy.getProxyClass(DynamicInterface.class.getClassLoader(), new Class[]{DynamicInterface.class});
//        Constructor<DynamicInterface> constructor = proxyClass.getConstructor(InvocationHandler.class);
//        DynamicInterface dynamicProxy = constructor.newInstance(dynamicInvocationHandler);
//        dynamicProxy.work();


    }
}
