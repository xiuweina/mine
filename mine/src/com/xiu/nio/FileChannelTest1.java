package com.xiu.nio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelTest1 {
    public static void main(String[] args) throws Exception {
        //读文件
//        File fie = new File("D:/File.txt");
//        FileInputStream fis = new FileInputStream(fie);
//        FileChannel fc = fis.getChannel();
//        ByteBuffer bb = ByteBuffer.allocate(1024);
//        fc.read(bb);
//        bb.flip();
//        while (bb.hasRemaining()){
//            System.out.print((char)bb.get());
//        }
//        bb.clear();
//        fc.close();

        //写文件
        File fie = new File("D:/File.txt");
        //写文件，使用RandomAccessFile
//        RandomAccessFile raf = new RandomAccessFile(fie, "rw");
        FileOutputStream fos = new FileOutputStream(fie);
        FileChannel fc = fos.getChannel();
        ByteBuffer bb = ByteBuffer.allocate(10);
        bb.put("0123456789".getBytes());
        bb.flip();
        fc.write(bb);
        bb.clear();
        fc.close();

        //写文件，使用RandomAccessFile
        RandomAccessFile raf = new RandomAccessFile(fie, "rw");

    }

}
