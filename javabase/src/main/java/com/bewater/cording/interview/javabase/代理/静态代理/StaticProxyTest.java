package com.bewater.cording.interview.javabase.代理.静态代理;

/**
 * @Author: bewater
 * @Date: Created in 15:10 2022/5/19
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        A target = new A();
        AProxy proxy = new AProxy(target);
        proxy.work();

        //静态代理缺点:
        //①.需提前为每个目标类创建代理对象
        //②.目标类和代理类需实现相同接口  当目标类本身不实现任何接口 则静态代理无法做到了
    }
}
