package com.xiu.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

    public static void main(String[] args) throws Exception{
        Person p = new Person();
        p.setAge(40);
        p.setName("nm");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:/person.txt"))) {
            oos.writeObject(p);
            System.out.println("writeObject");
            oos.close();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/person.txt"))) {
            Person pn = (Person) ois.readObject();
            System.out.println(pn.getName()+":"+pn.getAge());
        }

    }

}
