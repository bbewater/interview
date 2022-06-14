package com.bewater.cording.interview.javaspring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: bewater
 * @Date: Created in 15:31 2022/5/12
 */
@Component
public class AopB {
    @Autowired
    private AopA aopA;

    public void testAop(){
        System.out.println("正在执行业务逻辑");
        System.out.println(aopA);
    }
}
