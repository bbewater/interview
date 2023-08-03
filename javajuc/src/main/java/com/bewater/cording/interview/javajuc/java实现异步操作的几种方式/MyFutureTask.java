package com.bewater.cording.interview.javajuc.java实现异步操作的几种方式;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Author: bewater
 * @Date: Created in 14:19 2022/8/8
 * @Desc:
 */
public class MyFutureTask {

    public static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 20, 10L, TimeUnit.MINUTES, new LinkedBlockingQueue<>(10));

    /**
     * FutureTask.java是对Futre和Runnable最简单的实现，实现了run函数，所以可以直接执行，
     * 任务执行结束通过set()保存结果，setException()保存异常信息。
     * 通常配合executorService.submit()一起使用，ExecutorService中将任务包装成FutureTask执行execute()；
     */

    /**
     * 优缺点:
     * 能获得异步线程执行结果
     * 无法方便得知任务何时完成
     * 在主线程获得任务结果会导致主线程阻塞
     * 复杂一点的情况下，比如多个异步任务的场景，一个异步任务依赖上一个异步任务的执行结果，异步任务合并等，Future无法满足需求
     */

    @Test
    public void gotoResEat() throws Exception{
        System.out.println("bewater点完菜");
        Future<String> submit = threadPoolExecutor.submit(() -> {
            System.out.println("厨师开始炒菜");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("厨师炒完菜");
            return "饭菜好了";
        });
        String s = submit.get();
        threadPoolExecutor.shutdown();
        System.out.println(s+"bewater开始吃菜");
    }

    @Test
    public void testMapToLong(){
        List<Long> longList = new ArrayList<>();
        Long a = 1L;
        Long b = 1L;
        Long c = 1L;
        Long d = 1L;
        longList.add(a);
        longList.add(b);
        longList.add(c);
        longList.add(d);
        long sum = longList.stream().mapToLong(Long::longValue).sum();
        System.out.println(sum);
    }

}
