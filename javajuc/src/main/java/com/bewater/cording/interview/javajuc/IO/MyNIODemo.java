package com.bewater.cording.interview.javajuc.IO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: bewater
 * @Date: Created in 15:19 2022/6/7
 */
public class MyNIODemo {

    private static List<SocketChannel> clients = new ArrayList<>();
    private static Logger logger = LoggerFactory.getLogger(MyNIODemo.class);


    public static void main(String[] args) throws Exception {
        ServerSocketChannel server = ServerSocketChannel.open();
        server.bind(new InetSocketAddress(8080));
        server.configureBlocking(false);    //设置接受客户端连接为非阻塞
        ByteBuffer allocate = null;
        while(true){
            //前面设置了非阻塞 有客户端连接返回对应的channel 没有客户端连接返回null
            //在系统调用accept函数 有客户端连接返回对应的文件描述符 没有的话返回-1
            SocketChannel client = server.accept();
            if (client==null){
//                System.out.println("<-----等待客户端连接中----->");
            }else {
                client.configureBlocking(false);    //设置读取客户端信息为非阻塞
                int port = client.socket().getPort();
                logger.info("<-----客户端port为{}----->",port);
                clients.add(client);
                allocate = ByteBuffer.allocate(4096);
            }
            for (SocketChannel socketChannel : clients) {
                //前面设置了读取客户端信息非阻塞
                int read = socketChannel.read(allocate); //>0 -1 0
                if (read>0){
                    //调用flip之后，读写指针指到缓存头部
                    allocate.flip();
                    byte[] buffer = new byte[allocate.limit()];
                    allocate.get(buffer);
                    String s = new String(buffer);
                    System.out.println((socketChannel.socket().getPort() + ":" + s));
                    allocate.clear();
                }

            }




        }


    }
}
