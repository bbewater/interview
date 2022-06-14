package com.bewater.cording.interview.javabase.代理.动态代理.jdk;

/**
 * @Author: bewater
 * @Date: Created in 15:14 2022/5/19
 */
public class DynamicTarget implements DynamicInterface {
    @Override
    public void work() {
        System.out.println("目标类业务");
    }
}
