package com.bewater.cording.interview.javacontainer;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap();
        Map<Integer,String> map1 = new ConcurrentHashMap<>();


        map.put(1,"zz");
        map.put(2,"zz");
        map.put(3,"zz");
//        for (Integer key : map.keySet()) {
//            if (key == 2){
//                map.remove(2);
//            }
//        }
        //put的返回值是原来的值
        String dd = map.put(4, "dd");
        System.out.println(dd); //null
        String qq = map.put(4, "qq");
        System.out.println(qq); //dd
        String hh = map.putIfAbsent(1, "hh");   //putIfAbsent有则不操作
        System.out.println(hh); //zz 还是原来的值
        System.out.println(map.get(1)); //zz
        String gg = map.putIfAbsent(7, "gg");   //putIfAbsent没有才插入 返回null
        System.out.println(gg); //null 可以理解为旧值就是null
        System.out.println(map.get(7)); //gg    插入成功了


        //异或运算 相同为0 相异为1  例如 5^3 = 0101 ^ 0011 = 0110 =6  boolean也可以这么去看 相同为0就是false 相异为1就是false
//        int h = 5;
//        int d = 3;
//        System.out.println(5^3);
//        boolean a = true;
//        boolean b = false;
//        System.out.println(a ^ b);

//        System.out.println(3 << 1);       //左移一位 0011  0110   变成了6
    }
}
