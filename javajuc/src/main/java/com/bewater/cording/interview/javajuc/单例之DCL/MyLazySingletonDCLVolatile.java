package com.bewater.cording.interview.javajuc.单例之DCL;

/**
 * @Author: bewater
 * @Date: Created in 14:56 2022/5/13
 */
public class MyLazySingletonDCLVolatile {
    //DCL需不需要加volatile 需要 volatile 有禁止指令重排序的功能
    //对象创建 主要有三个步骤  1.在堆中开辟空间  这时候对象中的属性值都是默认值(数值类型为0  引用类型为null boolean类型为false)
    //2.给属性赋值
    //3.将栈中的引用指向丢中地址
    //设想一下 不加volatile 在2 3步骤发生了指令重排序 在多线程情况下 其他线程拿到的可能是半初始化状态的对象 而半初始化状态下的对象是不能拿来用的
    //所以DCL需要加volatile
    private static volatile MyLazySingletonDCLVolatile instance;

    private MyLazySingletonDCLVolatile(){

    }

    //懒汉模式 需要时再创建
    public static MyLazySingletonDCLVolatile getInstance(){
        //不受线程竞争的其他代码
        if (instance == null){  //这个判断不可去掉 避免上来直接加锁 当线程较多时 上来直接加锁 加大锁竞争 效率受到影响 走if比加锁好很多
            synchronized (MyLazySingletonDCLVolatile.class){
                if (instance == null){
                    instance = new MyLazySingletonDCLVolatile();
                }
            }
        }
        return instance;
    }

}
