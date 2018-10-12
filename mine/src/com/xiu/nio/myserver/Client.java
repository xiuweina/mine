package com.xiu.nio.myserver;

import java.nio.channels.SocketChannel;

public class Client {
    private static final int PORT = 3099;
    private static final int SOCKRT_NUM = 5;

    static class NonBlockingSocketThread extends Thread {
        @Override
        public void run(){
            try {
                SocketChannel sc = SocketChannel.open();
            }catch (Exception e){

            }

            System.out.println("jdfs");
        }
    }

    public static void main(String[] args) {
        NonBlockingSocketThread[] sockets = new NonBlockingSocketThread[SOCKRT_NUM];
        for (int i = 0; i < SOCKRT_NUM; i ++){
            sockets[i] = new NonBlockingSocketThread();
        }
        for (int i = 0; i < SOCKRT_NUM; i ++){
            sockets[i].start();
        }
    }
}
