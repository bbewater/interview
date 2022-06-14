package com.bewater.cording.interview.javajuc.线程池;

import java.util.concurrent.*;

/**
 * @Author: bewater
 * @Date: Created in 22:31 2022/5/6
 */
public class QQ extends ThreadPoolExecutor {
    public QQ(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory, RejectedExecutionHandler handler) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory, handler);
    }

    @Override
    protected void beforeExecute(Thread t, Runnable r) {
        super.beforeExecute(t, r);
    }

    @Override
    protected void afterExecute(Runnable r, Throwable t) {
        super.afterExecute(r, t);
    }
}
