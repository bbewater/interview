package com.bewater.cording.interview.javabase.代理.静态代理;

/**
 * @Author: bewater
 * @Date: Created in 15:08 2022/5/19
 */
public class AProxy implements CommonInterface {
    private A target;   //静态代理类内部需维护一个目标类

    //构造方法需传入目标类作为参数
    public AProxy(A target) {
        this.target = target;
    }

    @Override
    public void work() {
        System.out.println("静态代理增强方法开始");
        target.work();
        System.out.println("静态代理增强方法开始");
    }
}
