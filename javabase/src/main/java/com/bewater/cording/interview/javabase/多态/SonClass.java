package com.bewater.cording.interview.javabase.多态;

public class SonClass extends SuperClass{

    @Override
    public void method() {
        System.out.println("这是子类方法打印");
    }

    public void sonMethod(){
        System.out.println("子类独有的方法");
    }
}
