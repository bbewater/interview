package com.bewater.cording.interview.javajuc.线程;

/**
 * @Author: bewater
 * @Date: Created in 19:35 2022/5/7
 */
public class WaitTest {
    static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("线程t1开始执行");
            synchronized (lock) {
                System.out.println("t1加锁成功");
                try {
                    lock.wait();
                    System.out.println("线程t1执行结束");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();

        Thread.sleep(1000); //这里睡个1s保证t1线程先加上锁(wait的那方线程必须得先拿到锁 不然容易造成死锁)
        synchronized (lock){
            System.out.println("主线程加锁成功");
            try {
                lock.notify();
                System.out.println("主线程执行结束");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }





    }

}
