package com.bewater.cording.interview.javabase.执行顺序;

public class Test {

    public static void main(String[] args) {
        SunClass sunClass = new SunClass();

        //初始化顺序准则:
        //①.先静态 后动态
        //②.先父类后子类
        //③.变量--->代码块--->构造器

        //1.父类的静态变量--->2.父类的静态代码块--->3.子类的静态变量--->4.子类的静态代码块--->5.父类的普通成员变量--->6.父类的动态代码块
        //--->7.父类的构造器--->8.子类的普通成员变量--->9.子类的动态代码块--->10.子类的构造器
    }
}
