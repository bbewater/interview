package com.bewater.cording.interview.javajuc.锁;

import org.openjdk.jol.info.ClassLayout;

/**
 * @Author: bewater
 * @Date: Created in 17:09 2022/5/13
 */
public class JavaObjectLayout {

    static class T {
        int i;  //4byte
        boolean a;  //1byte
        String s = "wudi zz"; //4byte  s是个指针 指向常量池中的 wudi zz  64位机器都开启了指针压缩 所以是4个byte
    }

    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
        /**
         * java.lang.Object object internals:
         * OFF  SZ   TYPE DESCRIPTION               VALUE
         *   0   8        (object header: mark)     0x0000000000000001 (non-biasable; age: 0)
         *   8   4        (object header: class)    0xf80001e5
         *  12   4        (object alignment gap)
         * Instance size: 16 bytes
         * Space losses: 0 bytes internal + 4 bytes external = 4 bytes total
         */

        synchronized (o){
            System.out.println(ClassLayout.parseInstance(o).toPrintable());
        }

        T t = new T();
        System.out.println(ClassLayout.parseInstance(t).toPrintable());
        /**
         * OFF  SZ               TYPE DESCRIPTION               VALUE
         *   0   8                    (object header: mark)     0x0000000000000001 (non-biasable; age: 0)
         *   8   4                    (object header: class)    0xf800cc95
         *  12   4                int T.i                       0
         *  16   1            boolean T.a                       false
         *  17   3                    (alignment/padding gap)
         *  20   4   java.lang.String T.s                       (object)
         * Instance size: 24 bytes
         * Space losses: 3 bytes internal + 0 bytes external = 3 bytes total
         */

    }
}
