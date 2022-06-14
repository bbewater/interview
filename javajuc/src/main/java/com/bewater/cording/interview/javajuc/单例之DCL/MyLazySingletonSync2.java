package com.bewater.cording.interview.javajuc.单例之DCL;

/**
 * @Author: bewater
 * @Date: Created in 14:56 2022/5/13
 */
public class MyLazySingletonSync2 {
    private static MyLazySingletonSync2 instance;

    private MyLazySingletonSync2(){

    }

    //懒汉模式 需要时再创建
    public static MyLazySingletonSync2 getInstance(){
        //不受线程竞争的其他代码
        if (instance == null){
            synchronized (MyLazySingletonSync2.class){
                    instance = new MyLazySingletonSync2();
            }
        }
        return instance;

    }

}
