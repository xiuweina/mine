package com.xiu.designmodel.create.singleton;

public class Test {
    static SingletonDC sin1 = null;
    static SingletonDC sin2 = null;
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            private String name = "t1";
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                SingletonDC single = null;
                try {
                    single = SingletonDC.getInstance();
                    System.out.println("1"+single);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Test.sin1 = single;
            }
        });
        Thread t2 = new Thread(new Runnable() {
            private String name = "t2";
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                SingletonDC single = null;
                try {
                    single = SingletonDC.getInstance();
                    System.out.println("2"+single);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Test.sin2 = single;
            }
        });
        t1.start();
        t2.start();
        try {
            Thread.sleep(25000);
        } catch (InterruptedException e) {


        }
        System.out.println(sin1 == sin2);
    }
}
