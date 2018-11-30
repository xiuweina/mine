package com.xiu.jvm3_6;

public class Test3_6_1 {
    private static final int _1MB = 1024 * 1024;
    public static void main(String[] args) {
        byte[] alloation1, alloation2, alloation3, alloation4;
        alloation1 = new byte[2 * _1MB];
        alloation2 = new byte[2 * _1MB];
        alloation3 = new byte[2 * _1MB];
        alloation4 = new byte[4 * _1MB];
    }
}
