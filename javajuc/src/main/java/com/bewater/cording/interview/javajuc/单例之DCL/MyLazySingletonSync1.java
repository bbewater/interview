package com.bewater.cording.interview.javajuc.单例之DCL;

/**
 * @Author: bewater
 * @Date: Created in 14:56 2022/5/13
 */
public class MyLazySingletonSync1 {
    private static MyLazySingletonSync1 instance;

    private MyLazySingletonSync1(){

    }

    //懒汉模式 需要时再创建
    public synchronized static MyLazySingletonSync1 getInstance(){
            if (instance == null)
                instance = new MyLazySingletonSync1();
            return instance;
    }

}
