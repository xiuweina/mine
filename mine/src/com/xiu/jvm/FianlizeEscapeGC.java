package com.xiu.jvm;

public class FianlizeEscapeGC {

    public static FianlizeEscapeGC SAVE_HOOK = null;

    public void isAlive() {
        System.out.println("yes, alive");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalieze executed");
        FianlizeEscapeGC.SAVE_HOOK = this;
    }

    public static void main(String[] args) throws Throwable{
        SAVE_HOOK = new FianlizeEscapeGC();

        SAVE_HOOK = null;
        System.gc();
        Thread.sleep(500);
        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        } else {
            System.out.println("no, dead");
        }

        SAVE_HOOK = null;
        System.gc();
        Thread.sleep(500);
        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        } else {
            System.out.println("no, dead");
        }
    }

}
