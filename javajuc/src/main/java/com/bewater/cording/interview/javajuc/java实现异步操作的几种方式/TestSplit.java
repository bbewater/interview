package com.bewater.cording.interview.javajuc.java实现异步操作的几种方式;

import org.junit.Test;

/**
 * @Author: bewater
 * @Date: Created in 14:37 2022/8/11
 * @Desc:
 */
public class TestSplit {

    @Test
    public void testSplit(){
        String s = "a/b";
        String[] split = s.split("/", 2);
        System.out.println(split.toString());

    }
}
