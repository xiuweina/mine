package com.xiu.syn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 测试synBlock和synMethod，均为锁class
 * static + syn = synchronized (Test2.class)
 */
public class Test2 implements Runnable{

	private static boolean flag = true;
//	
    private static synchronized void testSyncMethod() { // 注意static修改的同步方法，监视器=class
        for (int i = 0; i < 100; i++) {
            System.out.println("test3SyncMethod:" + i);
        }
    }

//    private void testSyncMethod() { 
//        synchronized (Test2.class) {
//            for (int i = 0; i < 100; i++) {
//                System.out.println("test3SyncMethod:" + i);
//            }
//        }
//    }
	
	private void testSyncBlock() {

//        synchronized (this) { // 注意this做为监视器．它与class分别是二个不同监视器．不会存在class被获取，this就要等的现象．这也是我以前关于监视器的一个误区．
//            for (int i = 0; i < 100; i++) {
//                System.out.println("test3SyncBlock:" + i);
//            }
//        }

        synchronized (Test2.class) { // 显示使用获取class做为监视器．它与static synchronized method隐式获取class监视器一样．
	        for (int i = 0; i < 100; i++) {
	        	System.out.println("test3SyncBlock:" + i);
	        }
        }
    }

    public void run() {
        // flag是static的变量．所以，不同的线程会执行不同的方法,只有这样才能看到不同的锁定效果．
    	// 如果不是static的变量，则，线程读取到的都是自实例中的flag变量，则只调用了testSyncMethod
        if (flag) {
            flag = false;
            testSyncMethod();
        } else {
            flag = true;
            testSyncBlock();
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(2);
        Test2 rt = new Test2();
        Test2 rt1 = new Test2();
        exec.execute(rt);
        exec.execute(rt1);
        exec.shutdown();
    }

}
