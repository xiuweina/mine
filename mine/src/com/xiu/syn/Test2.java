package com.xiu.syn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ����synBlock��synMethod����Ϊ��class
 * static + syn = synchronized (Test2.class)
 */
public class Test2 implements Runnable{

	private static boolean flag = true;
//	
    private static synchronized void testSyncMethod() { // ע��static�޸ĵ�ͬ��������������=class
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

//        synchronized (this) { // ע��this��Ϊ������������class�ֱ��Ƕ�����ͬ���������������class����ȡ��this��Ҫ�ȵ�������Ҳ������ǰ���ڼ�������һ��������
//            for (int i = 0; i < 100; i++) {
//                System.out.println("test3SyncBlock:" + i);
//            }
//        }

        synchronized (Test2.class) { // ��ʾʹ�û�ȡclass��Ϊ������������static synchronized method��ʽ��ȡclass������һ����
	        for (int i = 0; i < 100; i++) {
	        	System.out.println("test3SyncBlock:" + i);
	        }
        }
    }

    public void run() {
        // flag��static�ı��������ԣ���ͬ���̻߳�ִ�в�ͬ�ķ���,ֻ���������ܿ�����ͬ������Ч����
    	// �������static�ı��������̶߳�ȡ���Ķ�����ʵ���е�flag��������ֻ������testSyncMethod
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
