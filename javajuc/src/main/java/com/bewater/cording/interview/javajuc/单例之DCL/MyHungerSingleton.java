package com.bewater.cording.interview.javajuc.单例之DCL;

/**
 * @Author: bewater
 * @Date: Created in 14:47 2022/5/13
 */
public class MyHungerSingleton {
    //饿汉模式 上来就创建对象
    private static MyHungerSingleton instance = new MyHungerSingleton();

    //构造方法私有  使得外面不能直接new  而是通过下面给的getInstance方法 拿单例对象
    private MyHungerSingleton(){

    }

    public static MyHungerSingleton getInstance(){
        return instance;
    }

}
