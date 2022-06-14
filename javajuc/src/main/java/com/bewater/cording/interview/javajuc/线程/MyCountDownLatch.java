package com.bewater.cording.interview.javajuc.线程;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

/**
 * @Author: bewater
 * @Date: Created in 15:41 2022/5/7
 */
public class MyCountDownLatch {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        for (int i = 0; i <3 ; i++) {
            Thread thread = new Thread(() -> {
                try {
                    countDownLatch.await();
                    System.out.println("线程"+Thread.currentThread().getName()+"开始执行");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            thread.setName(i+"");
            thread.start();
        }
        //main线程来将计数器减一 直到减为0 上面阻塞的三个线程才会依次唤醒执行
        for (int i = 0; i <5 ; i++) {
            System.out.println("countDownLatch减一");
            countDownLatch.countDown();
        }

        /**
         * CountDownLatch表示计数器,可以给CountDownLatch设置一个数字,一个线程调用CountDownLatch的await()方法将会被阻塞
         * 其他线程可以调用CountDownLatch的countDown()方法来将计数器数字减一
         * 当数字被减为0后,所有await线程都将被唤醒
         *
         * 原理:调用await()方法的线程会利用AQS排队,一旦数字被减为0,则会将AQS中排队的线程依次唤醒
         */
    }
}
