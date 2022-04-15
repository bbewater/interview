package com.bewater.cording.interview.javabase.多态;

import jdk.nashorn.internal.ir.CallNode;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {


    public static void main(String[] args) {
        //多态
        SuperClass a = new SuperClass();
        SuperClass b = new SonClass();
        a.method();     //这是父类方法打印
        b.method();    //这是子类方法打印


        /**
         * 多态指的是相同类型的变量在调用同一个方法时呈现出多种不同的行为特征。而造成这一现象的原因在于Java中的变量有两个类型：
         * ①.编译时类型 由声明变量时的类型决定。
         * ②.运行时类型 由实际赋值给变量的对象的类型决定
         * 当一个变量的两个类型不一致，就会出现多态。
         *
         * 对于变量a而言
         * a的编译类型是SuperClass，实际类型也是SuperClass，所以调用Method()会执行SuperClass#Method()方法，打印出父类方法打印。
         *
         * 对于变量b而言
         * b的的编译类型是SuperClass，但是实际赋值时，给变量b赋值的是SonClass对象，所以b的实际类型是SonClass。
         * 而SonClass重写了父类SuperClass#Method()方法，所以调用Method()方法会调用SonClass#Method()，从而打印出子类方法打印。
         *
         * a和b的编译类型相同，却展现出了不同的行为特征，这就是多态。
         *
         * （PS：如果直接对b调用只有SonClass有的方法，编译时会报错，但是可以通过反射进行调用。）
         */
        //多态方式直接调用子类独有的方法 编译时就会报错 可以用放射的方式调用
        Class sonClazz = SonClass.class;
        try {
            Method sonMethod = sonClazz.getMethod("sonMethod");
            SonClass o = (SonClass) sonClazz.newInstance();
            sonMethod.invoke(o);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
