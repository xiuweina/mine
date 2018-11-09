package com.xiu.serial;

import java.io.Serializable;

public class Person implements Serializable{
    private static final long serialVersionUID = -8632314589936974818L;

    private String name;
    private int age;
    private String sex;

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
