package com.xiu.nio.myserver;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * nio-server，使用selector
 */
public class SelectorServer {
    private static final int PORT = 3099;
    private static ByteBuffer bb = ByteBuffer.allocate(1024);

    public static void main(String[] args) throws Exception{
        Selector selector = Selector.open();

        ServerSocketChannel ssc = ServerSocketChannel.open();
        ssc.socket().bind(new InetSocketAddress(PORT));
        ssc.configureBlocking(false);

        ssc.register(selector, SelectionKey.OP_ACCEPT);
        while (true){
            int readyNum = selector.select();
            if(readyNum == 0) {
                continue;
            }
            Iterator<SelectionKey> itr = selector.selectedKeys().iterator();
            while (itr.hasNext()) {
                SelectionKey skey = itr.next();
                if(skey.isAcceptable()){
                    ServerSocketChannel serverSocket = (ServerSocketChannel) skey.channel();
                    SocketChannel socketChannel = serverSocket.accept();
                    socketChannel.configureBlocking(false);
                    socketChannel.register(selector,SelectionKey.OP_READ);
                } else if (skey.isReadable()){
                    SocketChannel sc = (SocketChannel) skey.channel();
                    sc.read(bb);
                    bb.flip();
                    while (bb.hasRemaining()){
                        System.out.print((char) bb.get());
                    }
                    System.out.println();
                    bb.clear();
                    sc.close();
                }
                itr.remove();
            }
        }

    }
}
