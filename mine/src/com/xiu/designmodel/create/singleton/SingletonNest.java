package com.xiu.designmodel.create.singleton;

/**
 * 静态嵌套类
 * 线程安全
 * 没有性能影响
 */
public class SingletonNest {
    private SingletonNest() {}

    private static class Holder{
        private static SingletonNest instance = new SingletonNest();
    }

    public static SingletonNest getInstance() {
        return Holder.instance;
    }

}
