package com.bewater.cording.interview.javajuc.线程;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: bewater
 * @Date: Created in 15:18 2022/5/7
 */
public class MyThread {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            System.out.println("zz");
        });
        thread.start();
        Thread.yield();
        thread.join();

    }
}
