package com.xiu.enumtest;

public class Test {
    public static void main(String[] args) {
//        Type t = Type.A;
//        System.out.println(t.toString());
        System.out.println(Type.A.name());
        System.out.println(Type.A.name);
        Type t2 = Type.valueOf("a");
        System.out.println();
//        Class c = Type.A.getClass();
//        System.out.println(Type.A.getClass());
//        Type.printSta();
//        Type.A.printIns("A");
    }
}
enum Type {

    A("a", 0) {
        @Override
        void printIns(String a) {
            System.out.println(a + "not static");
        }
    } ;
    /*,
    B("b", 1){
        @Override
        void printIns(String a) {
            System.out.println(a + "not static");
        }
    },C("c", 2){
        @Override
        void printIns(String a) {
            System.out.println(a + "not static");
        }
    },D("d", 3){
        @Override
        void printIns(String a) {
            System.out.println(a + "not static");
        }
    };*/
    String name;
    int ordinal;
    Type(String name,int o) {
        this.name = name;
        this.ordinal = o;
    }

    static void printSta() {
        System.out.println("jkl");
    }


    abstract void printIns(String ins);
//    {
//        System.out.println(ins + "not static");
//    }

}