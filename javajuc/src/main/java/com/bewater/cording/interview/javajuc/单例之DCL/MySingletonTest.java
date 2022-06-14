package com.bewater.cording.interview.javajuc.单例之DCL;

/**
 * @Author: bewater
 * @Date: Created in 14:53 2022/5/13
 */
public class MySingletonTest {

    public static void main(String[] args) {

        //饿汉模式的方式没有线程安全问题
//        for (int i = 0; i <100 ; i++) {
//            new Thread(() -> {
//                MyHungerSingleton instance = MyHungerSingleton.getInstance();
//                System.out.println(instance.hashCode());
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }).start();
//        }

            //懒汉模式有安全问题 需加锁
//        for (int i = 0; i < 100; i++) {
//            new Thread(() -> {
//                MyLazySingleton instance = MyLazySingleton.getInstance();
//                System.out.println(instance.hashCode());
//            }).start();
//        }

        //直接再getInstance方法上加锁 没安全问题 但是锁的粒度太大 假如getInstance方法还有些不受线程竞争影响的业务代码 直接加锁效率不高
//        for (int i = 0; i < 100; i++) {
//            new Thread(() -> {
//                MyLazySingletonSync1 instance = MyLazySingletonSync1.getInstance();
//                System.out.println(instance.hashCode());
//            }).start();
//        }

        //MyLazySingletonSync2仍有线程安全问题
//        for (int i = 0; i < 100; i++) {
//            new Thread(() -> {
//                MyLazySingletonSync2 instance = MyLazySingletonSync2.getInstance();
//                System.out.println(instance.hashCode());
//            }).start();
//        }

        //DCL 无线程安全问题 Double check Lock
//        for (int i = 0; i < 100; i++) {
//            new Thread(() -> {
//                MyLazySingletonDCL instance = MyLazySingletonDCL.getInstance();
//                System.out.println(instance.hashCode());
//            }).start();
//        }

        MySingletonTest mySingletonTest = new MySingletonTest();

    }
}
