package com.sdacademy.day3.lambdas;

import org.apache.commons.math3.primes.Primes;

public class LambdasExample {

    private static MyFunctionalInterface myFunction = input -> "My input " + input;
    private static MyFunctionalInterface myAnotherFunction = input -> "Crazy number " + input;

    private static MyFunctionalInterface myJava7Function = new MyFunctionalInterface() {
        @Override
        public String change(int input) {
            return null;
        }
    };


    public static void main(String[] args) {
        Primes.isPrime(12);
        numberPrinter(myFunction, 2);
        numberPrinter(myAnotherFunction, 2);

    }

    public static void numberPrinter(MyFunctionalInterface printMethod, int number){
        System.out.println(printMethod.change(number));
    }

}
