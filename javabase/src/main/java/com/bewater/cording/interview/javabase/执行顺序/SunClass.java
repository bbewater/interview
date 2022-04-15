package com.bewater.cording.interview.javabase.执行顺序;

public class SunClass extends SuperClass{

    static Instance instance = new Instance("3.子类的静态成员变量");
    Instance instance1 = new Instance("8.子类的普通成员变量");


    static{
        System.out.println("4.子类的静态代码块");
    }

    {
        System.out.println("9.子类的动态代码块");
    }

    public SunClass() {
        System.out.println("10.子类的构造器");
    }
}
