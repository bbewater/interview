package com.bewater.cording.interview.javajuc.线程;

/**
 * @Author: bewater
 * @Date: Created in 19:21 2022/5/8
 */
public class ThreadLocalTest {
    static ThreadLocal tl = new ThreadLocal();

    public static void main(String[] args) {


        tl.set("threadLocal");
        System.out.println(tl.get());
        tl.remove();

    }


}
