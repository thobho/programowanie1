package com.sdacademy.day2.staticexplain;

public class Child extends Parent {

    public static void staticMethod(){
        System.out.println("Static change from child");
    }

    public void instanceMethod(){
        System.out.println("Instance change from child");
    }

}
