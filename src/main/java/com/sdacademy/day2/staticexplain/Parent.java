package com.sdacademy.day2.staticexplain;

public class Parent {

    private static String staticVariable = "Static variable from parent";
    private String instanceVariable = "Instance variable from parent";

    public static void staticMethod(){
        System.out.println("Static change from parent");
    }

    public void instanceMethod(){
        System.out.println("Instance change from parent");
    }

}
