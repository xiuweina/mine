package com.xiu.designmodel.create.singleton;

public class A {
    //Inner1要在A初始化后才能使用，即要被A的对象所调用
    class Inner1 {
        int k = 0;

        //static int j=0;
        //A加载后，Inner1没有加载，所以这个静态变量j无法立即使用，报错finalintz=0;
            /*
            static void say1(){

            }
            */
        void say2() {
        }
    }

    //Inner2在A加载好后就可以使用了
    static class Inner2 {
        int k = 0;
        static int j = 0;
        final int z = 0;

        static void say1() {

        }

        void say2() {

        }
    }

    //调用内部类
    void c() {
        final int x = 0;
        //final修饰后，可以由局部内部类调用newA().newInner1();
        //非静态内部类Inner1，需要它所属的类的对象调用newA().newInner1().say2();A.Inner2.say1();newA.Inner2().say2();
        //非静态方法say2()，需要它所属的类的对象调用
        class Inner3 {
            void print() {
                System.out.println(x);
            }
        }
        /**方法中的局部内部类的调用，需要在声明后因为，
         *在方法里的执行顺序是从上往下，而这个类
         *就相当于一个局部变量当然要先声明，再使用
         */
        new Inner3().print();
        if (true) {


        }
    }
}
