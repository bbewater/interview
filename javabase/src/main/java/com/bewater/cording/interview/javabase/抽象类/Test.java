package com.bewater.cording.interview.javabase.抽象类;

public class Test {


    public static void main(String[] args) {
        SuperClass a = new SubClass();
        System.out.println(a.methodA());

        /*
        抽象类特点:
        ①.既有抽象方法也有具体实现的方法  这是和接口的区别 接口中的方法都是交由具体实现类去实现的
        ②.抽象类不能实例化 SuperClass superClass = new SuperClass();  wrong  因为有抽象方法的存在
        ③.抽象方法可以被继承 子类需重写抽象方法 抽象类的具体方法可无需重写 直接拿来用
         */
        System.out.println(Jay.a);
        //Jay.a = 5; //报错  接口中的成员变量必须是public static final修饰的 而抽象类中的成员变量可以是各种类型
    }
}
