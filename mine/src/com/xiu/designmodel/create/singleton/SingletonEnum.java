package com.xiu.designmodel.create.singleton;

class Resource {
    void print() {
        System.out.println("0000");
    }
}

/**
 * 枚举单例，effective java 最优，
 *SingletonEnum.INSTANCE.getResource
 */
public enum SingletonEnum {
    INSTANCE;
    private Resource resource;
    SingletonEnum() {
        resource = new Resource();
    }
    public Resource getResource() {
        return resource;
    }
}
