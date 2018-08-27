package com.xiu.designmodel.create.prototype;

public class Cloned implements Cloneable{
    int i;
    String k;
    public Cloned(int i, String k) {
        this.i = i;
        this.k = k;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

