package com.xiu.jvm3_6;

import java.io.IOException;

public class Test3_6_3 {
    private  static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws IOException {
        byte[] allocation1, allocation2, allocation3;
        allocation1 = new byte[_1MB/4];
        allocation2 = new byte[4*_1MB];
        allocation3 = new byte[4*_1MB];
        allocation3 = null;
        allocation3 = new byte[4*_1MB];
        System.in.read();
    }
}
