package com.xiu.designmodel.create.singleton;

class Resource {

}
public enum SingletonEnum {
    INSTANCE;
    private Resource instance;
    SingletonEnum(){
        instance = new Resource();
    }
    public Resource getInstance() {
        return instance;
    }
}
