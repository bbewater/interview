package com.bewater.cording.interview.javajuc.单例之DCL;

/**
 * @Author: bewater
 * @Date: Created in 14:56 2022/5/13
 */
public class MyLazySingletonDCL {
    private static MyLazySingletonDCL instance;

    private MyLazySingletonDCL(){

    }

    //懒汉模式 需要时再创建
    public static MyLazySingletonDCL getInstance(){
        //不受线程竞争的其他代码
        if (instance == null){  //这个判断不可去掉 避免上来直接加锁 当线程较多时 上来直接加锁 加大锁竞争 效率受到影响 走if比加锁好很多
            synchronized (MyLazySingletonDCL.class){
                if (instance == null){
                    instance = new MyLazySingletonDCL();
                }
            }
        }
        return instance;

    }

}
