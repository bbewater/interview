package com.bewater.cording.interview.javajuc.线程;

/**
 * @Author: bewater
 * @Date: Created in 19:17 2022/5/7
 */
public class JoinTest {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(2000L);
                System.out.println("thread线程执行结束");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        thread.join();  //join方法会让main线程进入阻塞状态 等thread线程先执行完 main线程才能继续执行
        System.out.println("到我主线程执行了");
        //执行结果:thread线程执行结束  到我主线程执行了
    }
}
