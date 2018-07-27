package com.sdacademy.day3.lambdas;

public class LambdasExample {

    private static MyFunctionalInterface myFunction = input -> "My input " + input;
    private static MyFunctionalInterface myAnotherFunction = input -> "Crazy number " + input;

    private static MyFunctionalInterface myJava7Function = new MyFunctionalInterface() {
        @Override
        public String method(int input) {
            return "Java 7 style " + input;
        };
    };


    public static void main(String[] args) {

        numberPrinter(myFunction, 2);
        numberPrinter(myAnotherFunction, 2);

    }

    public static void numberPrinter(MyFunctionalInterface printMethod, int number){
        System.out.println(printMethod.method(number));
    }

}
