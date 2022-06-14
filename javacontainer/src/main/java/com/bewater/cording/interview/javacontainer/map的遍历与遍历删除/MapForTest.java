package com.bewater.cording.interview.javacontainer.map的遍历与遍历删除;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author: bewater
 * @Date: Created in 15:02 2022/6/14
 */
public class MapForTest {
    private static Map<String,String> map = new HashMap<>();


    public static void main(String[] args) {
        map.put("a","1");
        map.put("b","2");
        map.put("c","3");
        map.put("d","4");
        map.put("e","5");

        //entrySet
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }
        //keySet  效率不高相当于进行了两次循环
//        for (String s : map.keySet()) {
//            System.out.println(s + ":" + map.get(s));
//        }

        //迭代器遍历
//        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, String> entry = iterator.next();
//            System.out.println(entry.getKey()+":"+entry.getValue());
//        }
        //总之不要用keySet
//        Iterator<String> iterator = map.keySet().iterator();
//        while(iterator.hasNext()){
//            String next = iterator.next();
//            System.out.println(next+":"+map.get(next));
//        }

        //lambda表达式方式
//        map.forEach((a,b) -> {
////            System.out.println(a+":"+b);
////        });

        //stream流方式 单线程
//        map.entrySet().stream().forEach((item) -> {
//            System.out.println(item.getKey()+":"+item.getValue());
//        });

        //stream多线程
//        map.entrySet().stream().parallel().forEach((item) -> {
//            System.out.println(Thread.currentThread()+"--"+item.getKey()+":"+item.getValue());
//        });

        //循环中删除 报错java.util.ConcurrentModificationException  建议使用迭代器循环中删除  XXXX
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            if (entry.getKey().equalsIgnoreCase("a")){
//                map.remove("a");
//            }
//        }

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getKey().equalsIgnoreCase("c")){
                iterator.remove();  //使用iterator.remove方法删除
                continue;
            }
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
