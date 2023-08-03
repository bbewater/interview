package com.bewater.cording.interview.javajuc.threadLocal;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: bewater
 * @Date: Created in 23:06 2022/5/15
 */
public class MyThreadLocalTest {
    private static ThreadLocal<String> tl = new ThreadLocal<>();


    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            final int j = i;
            new Thread(() -> {
                tl.set("t"+j);
                System.out.println(Thread.currentThread()+"---"+tl.get());
                tl.remove();    //手动remove 防止内存泄漏
            }).start();
        }
    }
}
