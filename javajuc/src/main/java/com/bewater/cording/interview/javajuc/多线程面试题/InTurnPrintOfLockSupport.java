package com.bewater.cording.interview.javajuc.多线程面试题;

import java.util.concurrent.locks.LockSupport;

/**
 * @Author: bewater
 * @Date: Created in 15:43 2022/5/27
 * 巧用LockSupport解决交替打印的问题
 */
public class InTurnPrintOfLockSupport {
    //面试题:交替打印a1b2c3  英文和数字交替打印

    static char[] num = {'1','2','3','4','5'};
    static char[] eng = {'a','b','c','d','e'};
    static Thread t1;
    static Thread t2;

    public static void main(String[] args) {
        t1 = new Thread(() -> {
            for (int i = 0; i < eng.length; i++) {
                System.out.print(eng[i]);
                LockSupport.unpark(t2);
                LockSupport.park();
            }

        }, "t1");


        t2 = new Thread(() -> {
            for (int i = 0; i < num.length; i++) {
                LockSupport.park();
                System.out.print(num[i]);
                LockSupport.unpark(t1);

            }

        }, "t2");
        t1.start();
        t2.start();


    }

}
