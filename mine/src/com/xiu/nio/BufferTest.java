package com.xiu.nio;

import java.nio.CharBuffer;

/**
 * 第一个nio程序，简单，测试代码
 * CharBuffer
 */
public class BufferTest {
    private static String[] strs = {
        "A random string value",
        "The product of an infinite number of monkeys",
        "Hey hey we're the monkees",
        "Opening act for the Monkees:Jimi Hendrix",
        "Scuse me while I kiss this fly",
        "Help Me! Help Me!"
    };
    private static int index = 0;

    public static boolean fillBuffer(CharBuffer charBuffer) {
        if (index >= strs.length) {
            return false;
        }
        for (int i=0;i<strs[index].length();i++){
            charBuffer.put(strs[index].charAt(i));
        }
        index ++;
        return true;
    }

    public static void pullBuffer(CharBuffer charBuffer) {
        while (charBuffer.hasRemaining()){
            System.out.print(charBuffer.get());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CharBuffer charBuffer = CharBuffer.allocate(100);
        while (fillBuffer(charBuffer)){
            charBuffer.flip();
            pullBuffer(charBuffer);
            charBuffer.clear();
        }
    }
}
