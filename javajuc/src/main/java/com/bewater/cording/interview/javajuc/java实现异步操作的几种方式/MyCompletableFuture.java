package com.bewater.cording.interview.javajuc.java实现异步操作的几种方式;

import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: bewater
 * @Date: Created in 14:57 2022/8/8
 * @Desc:
 */
public class MyCompletableFuture {
    public static ThreadPoolExecutor tl = new ThreadPoolExecutor(5,10,1L, TimeUnit.SECONDS,new ArrayBlockingQueue<>(10));

    //参考文档: https://blog.csdn.net/mowushenght/article/details/122211330
    @Test
    public void gotoResEat() throws Exception{
        System.out.println(printThread("bewater开始点餐"));
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println(printThread("厨师开始炒菜"));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(printThread("厨师菜已炒好"));
            return "饭菜就绪";
        },tl);

        CompletableFuture<Void> completableFuture1 = CompletableFuture.runAsync(() -> {
            System.out.println(printThread("bewater等菜之余无聊开了一把游戏"));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(printThread("bewater游戏打完,并取得了mvp"));
        },tl);

        CompletableFuture<Void> completableFuture2 = completableFuture.thenAcceptBoth(completableFuture1, (a,b) -> {
            System.out.println(printThread(a + ",bewater开始吃饭,并点了一杯饮料"));
        }).thenApplyAsync((b) -> {
            System.out.println(printThread("服务员开始去拿饮料"));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "饮料好了";
        },tl).thenAccept((c) -> System.out.println(printThread(c + ",bewater开始喝饮料")));

        completableFuture2.join();
    }

    public String printThread(String s){
        return Thread.currentThread().getName()+"--"+s;
    }

}
