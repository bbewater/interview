package com.bewater.cording.interview.javajuc.单例之DCL;

/**
 * @Author: bewater
 * @Date: Created in 14:56 2022/5/13
 */
public class MyLazySingleton {
    private static MyLazySingleton instance;

    private MyLazySingleton(){

    }

    //懒汉模式 需要时再创建
    public static MyLazySingleton getInstance(){
        if (instance == null)
            instance = new MyLazySingleton();
        return instance;
    }

}
