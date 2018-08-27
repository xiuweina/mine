package com.xiu.designmodel.create.prototype;

public class Prototype {

    public static void main(String[] args) {
        Cloned c = new Cloned(10, "10");
        Cloned d = null;
        try {
            d = (Cloned) c.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(c == d);
        System.out.println(c.getClass()==d.getClass());
        System.out.println(c.equals(d));
    }

}


