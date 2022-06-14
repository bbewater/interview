package com.bewater.cording.interview.javabase.代理.静态代理;

/**
 * @Author: bewater
 * @Date: Created in 15:06 2022/5/19
 */
public class A implements CommonInterface {
    @Override
    public void work() {
        System.out.println("目标类业务");
    }
}
