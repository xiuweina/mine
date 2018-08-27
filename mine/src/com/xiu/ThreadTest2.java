package com.xiu;

public class ThreadTest2 {  
    public static void main(String[] args) {  
        final Business business = new Business();  
        new Thread(new Runnable() {  
            @Override  
            public void run() {  
                threadExecute(business, "sub");  
            }  
        }).start();  
        threadExecute(business, "main");  
    }     
    public static void threadExecute(Business business, String threadType) {  
        for(int i = 0; i < 100; i++) {  
            try {  
                if("main".equals(threadType)) {  
                    business.main(i);  
                } else {  
                    business.sub(i);  
                }  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
}  
class Business {  
    private boolean bool = true;  
    public synchronized void main(int loop) throws InterruptedException {  
        while(bool) {  
            this.wait();  
        }  
        for(int i = 0; i < 20; i++) {  
            System.out.println("main thread seq of " + i + ", loop of " + loop);  
        }  
        bool = true;  
        this.notify();  
    }     
    public synchronized void sub(int loop) throws InterruptedException {  
        while(!bool) {  
            this.wait();  
        }  
        for(int i = 0; i < 2; i++) {  
            System.out.println("sub thread seq of " + i + ", loop of " + loop);  
        }  
        bool = false;  
        this.notify();  
    }  
}  
