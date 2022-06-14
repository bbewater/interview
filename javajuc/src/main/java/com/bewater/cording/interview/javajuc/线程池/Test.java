package com.bewater.cording.interview.javajuc.线程池;


import java.util.concurrent.*;

public class Test {


    public static void main(String[] args) throws Exception {
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 20, 10L, TimeUnit.MINUTES, new LinkedBlockingQueue<>(10));
//        threadPoolExecutor.execute(() -> {
//            System.out.println("无敌");
//        });
//        threadPoolExecutor.submit(new Callable<Object>() {
//            @Override
//            public Object call() throws Exception {
//                return null;
//            }
//        });

//        ZD zd = new ZD();
//        System.out.println(zd.call());

//        ExecutorService executorService = Executors.newFixedThreadPool(1); 不推荐使用工具类Executors创建线程池 阿里云规范 可控粒度太小

//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,
//                4,
//                10,
//                TimeUnit.MILLISECONDS,
//                new ArrayBlockingQueue<>(2),
//                new ThreadFactory() {   //线程工厂用于创建线程 最大的好处是可以设置线程参数 快速定位问题线程
//                    @Override
//                    public Thread newThread(Runnable r) {
//                        Thread thread = new Thread(r);
//                        thread.setName("zz");
//                        return thread;
//                    }
//                }, new ThreadPoolExecutor.AbortPolicy());
//        threadPoolExecutor.execute(() -> {
//            for (int i = 0; i <10 ; i++) {
//                System.out.println(i);
//            }
//        });

        //这里就像是线程池复用线程那样 t.start() 其实里面就是调用了worker里面的run方法
        Thread thread = new Thread(new XQ());
        thread.start();

    }


}
