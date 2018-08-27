package com.xiu.syn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ����synBlock��synMethod����Ϊ��this
 * 
 */
public class Test1 implements Runnable{

	private static boolean flag = true;
//	static
    private synchronized void testSyncMethod() { // ע��static�޸ĵ�ͬ��������������=class
        for (int i = 0; i < 100; i++) {
            System.out.println("testSyncMethod:" + i);
        }
    }

//    private void testSyncMethod() { 
//       synchronized (this) {
//           for (int i = 0; i < 100; i++) {
//               System.out.println("testSyncMethod:" + i);
//           }
//       }
//    }
	
	private void testSyncBlock() {

        synchronized (this) { // ע��this��Ϊ������������class�ֱ��Ƕ�����ͬ���������������class����ȡ��this��Ҫ�ȵ�������Ҳ������ǰ���ڼ�������һ��������
            for (int i = 0; i < 100; i++) {
                System.out.println("testSyncBlock:" + i);
            }
        }

        // synchronized (RunnableTest.class) { // ��ʾʹ�û�ȡclass��Ϊ������������static synchronized method��ʽ��ȡclass������һ����
        // for (int i = 0; i < 100; i++) {
        // System.out.println("testSyncBlock:" + i);
        // }
        // }
    }

    public void run() {

        // flag��static�ı��������ԣ���ͬ���̻߳�ִ�в�ͬ�ķ���,ֻ���������ܿ�����ͬ������Ч����
    	// �������static�ı��������̶߳�ȡ���Ķ�����ʵ���е�flag��������ֻ������
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
        Test1 rt = new Test1();
        Test1 rt1 = new Test1();
        exec.execute(rt);
        exec.execute(rt1);
        exec.shutdown();
    }

}
