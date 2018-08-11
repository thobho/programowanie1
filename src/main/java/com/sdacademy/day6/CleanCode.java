package com.sdacademy.day6;

import com.google.common.collect.ImmutableSet;

public class CleanCode {

    public static void main(String[] args) {

    }

    private  static boolean validate(int age, int isPremumUser, String name){
        return false;
    }

    private static class Person{
        String name;
        //inne pola
        String streetName;
        String zipCode;
        String city;

    }

    private static String concatenateStrings(){
        String result = "";

        for (int i = 0; i < 4; i++) {
            result += "dasdas";
        }

        return result;
    }
}
