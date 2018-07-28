package com.sdacademy.day2.staticexplain;

public class Main {


    public static void main(String[] args) {
        Parent p1 = new Parent();
        Parent p2 = new Child();
        Child c = new Child();

        Parent.staticMethod();
        p1.instanceMethod();

        System.out.println("\n");

        Parent.staticMethod();
        p2.instanceMethod();

        System.out.println("\n");
        Child.staticMethod();
        c.instanceMethod();


    }

}
