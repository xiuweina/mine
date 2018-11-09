package com.xiu.nio.myserver;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class Client {
    private static final int PORT = 3099;
    private static final int SOCKTE_NUM = 5;
    private static final String STR = "olala";

    static class NonBlockingSocketThread extends Thread {
        @Override
        public void run(){
            try {
                SocketChannel sc = SocketChannel.open();
                sc.configureBlocking(false);
                sc.connect(new InetSocketAddress(PORT));
                while(!sc.finishConnect()) {
                    System.out.println("连接未建立");
                    Thread.sleep(10);
                }
                System.out.println("连接已建立-"+this.getName());
                String write = STR + this.getName();
                ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                byteBuffer.put(write.getBytes());
                byteBuffer.flip();
                sc.write(byteBuffer);
                byteBuffer.clear();
                sc.close();
            }catch (Exception e){

            }

            System.out.println("jdfs");
        }
    }

    public static void main(String[] args) {
        NonBlockingSocketThread[] sockets = new NonBlockingSocketThread[SOCKTE_NUM];
        for (int i = 0; i < SOCKTE_NUM; i ++){
            sockets[i] = new NonBlockingSocketThread();
        }
        for (int i = 0; i < SOCKTE_NUM; i ++){
            sockets[i].start();
        }
    }
}
