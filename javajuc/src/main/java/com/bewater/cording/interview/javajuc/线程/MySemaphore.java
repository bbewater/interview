package com.bewater.cording.interview.javajuc.线程;

import java.util.concurrent.Semaphore;

/**
 * @Author: bewater
 * @Date: Created in 17:19 2022/5/7
 */
public class MySemaphore {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i <5 ; i++) {
            Thread thread = new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println("线程"+Thread.currentThread().getName()+"获得许可");
                    Thread.sleep(2000);
                    semaphore.release();
                    System.out.println("线程"+Thread.currentThread().getName()+"释放许可");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            thread.setName(i+"");
            thread.start();
        }

        /**
         * semaphore表示信号量 可以设置许可的个数  表示同时允许最多多少个线程来使用该信号量 通过acquire()来获取许可
         * 如果没有许可可用则线程会阻塞,并通过AQS来排队,可以通过release()方法来释放许可,当某个线程释放了许可之后
         * 会从AQS队列中第一个排队的线程依次唤醒,直到没有空闲许可.
         * semaphore可控制并发量
         */

    }
}
