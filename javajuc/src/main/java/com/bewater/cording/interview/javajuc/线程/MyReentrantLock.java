package com.bewater.cording.interview.javajuc.线程;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: bewater
 * @Date: Created in 17:40 2022/5/7
 */
public class MyReentrantLock {

    static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        lock.lock();    //阻塞加锁

        boolean b = lock.tryLock(); //tryLock非阻塞加锁  返回false代表加锁失败 true代表加锁成功

        //自旋锁 tryLock很大一部分使用在自旋锁上面
        while(! lock.tryLock()){ //自旋
            //加锁加不到 做一些其他事情
            //例如1.7版本的ConcurrentHashMap 利用自旋锁来遍历链表 看看在获取不到锁的时候 要不要创建HashEntry

        }

    }
}
