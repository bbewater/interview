package com.bewater.cording.interview.javajuc.java实现异步操作的几种方式;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: bewater
 * @Date: Created in 14:02 2022/8/10
 * @Desc:
 */
@Slf4j
public class Test {

    public void methodA(){
        try{
            methodB();
        }catch (Exception e){
            log.error(e.getMessage()+"-----");
        }
    }

    public void methodB(){
        methodC();
    }

    public void methodC(){
        int a = 5/0;
    }
    @org.junit.Test
    public void test(){
        methodA();
    }
}
