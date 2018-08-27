package com.xiu.designmodel.create.singleton;

/**
 * 懒汉
 */
public class SingletonLazy {
    private SingletonLazy() {}

    private static SingletonLazy instance = null;

    public SingletonLazy getInstance() {
        if (null == instance) {
            instance = new SingletonLazy();
        }
        return instance;
    }

}
