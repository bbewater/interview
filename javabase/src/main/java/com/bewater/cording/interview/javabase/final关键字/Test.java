package com.bewater.cording.interview.javabase.final关键字;

public class Test {
    public static void main(String[] args) {
        int a = 4;
        //局部内部类
        class Inner{

            void inner(){
                //1.8编译通过
                System.out.println(a);  //1.7编译不通过(Error:(9,36) java: 从内部类中访问本地变量a; 需要被声明为最终类型)
                //a = 6;  编译不通过 对局部变量进行了修改
            }
        }

        //匿名内部类
        new Thread(() -> {
            System.out.println(a);  //1.8编译通过 1.7不通过
//            a = 8;    编译不通过
        }).start();

        //1.7之前 匿名内部类\局部内部类访问局部变量需加final修饰局部变量,这是因为局部内部类的生命周期比较长,所以拷贝了一份局部变量
        //又为了数据一致性 加上了final修饰
        //1.8之后不需要显示的加上final修饰局部变量了


    }


}

