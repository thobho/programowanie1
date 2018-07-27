package com.sdacademy.day2.staticexplain;

public class Main {


    public static void main(String[] args) {
        Parent p1 = new Parent();
        Parent p2 = new Child();
        Child c = new Child();

        p1.staticMethod();
        p1.instanceMethod();

        System.out.println("\n");
        p2.staticMethod();
        p2.instanceMethod();

        System.out.println("\n");
        c.staticMethod();
        c.instanceMethod();


    }

}
