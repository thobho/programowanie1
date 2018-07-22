package com.sdacademy.day1.solutions;

import java.util.Scanner;

import static java.lang.String.format;

public class Demo {

    static double a;
    static double b;

    private static double giveMeValue(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private static void talkToUser(){
        System.out.println("Give me an a:");
        a = giveMeValue();
        System.out.println("Give me b:");
        b = giveMeValue();
    }

    public static void main(String[] args) {
        talkToUser();
        if(a!=0){
            double result = -b/a;
            System.out.println("Wynik to"+result);
        } else if(b==0){
            System.out.println("Nieskonczenie wiele rozwiazan");
        } else {
            System.out.println("Brak rozwiazan");
        }


    }


}








































//    public static double readValue() {
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextDouble();
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Give me a:");
//        double a = readValue();
//        System.out.println("Give me b:");
//        double b = readValue();
//        double result;
//        if (a != 0) {
//            result = -b / a;
//            System.out.println(format("Rozwiązanie to %f", result));
//        } else if (b == 0) {
//            System.out.println("Nieskończenie wiele rozwiązań");
//        } else {
//            System.out.println("Brak rozwiązań");
//        }
//    }
