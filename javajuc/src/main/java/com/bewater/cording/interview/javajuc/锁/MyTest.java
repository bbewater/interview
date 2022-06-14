package com.bewater.cording.interview.javajuc.锁;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: bewater
 * @Date: Created in 16:45 2022/5/13
 */
public class MyTest {
    private static volatile AtomicInteger a = new AtomicInteger(1);
    private static CountDownLatch countDownLatch = new CountDownLatch(1000000);


    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <1000000 ; i++) {
            new Thread(() -> {
                a.incrementAndGet(); //代替a++  保证了原子性
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        System.out.println(a);


    }

}
