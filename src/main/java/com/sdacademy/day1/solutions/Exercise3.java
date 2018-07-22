package com.sdacademy.day1.solutions;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;


        for (int i = 3; i * i <= num; i += 2){
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }


    private static boolean isPrimeNaive(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;


        for (int i = 3; i < num; i += 1){
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static List<Integer> makeList(int n){
        List<Integer> integers = new ArrayList<Integer>();
        for (int i = 2; i < n; i++) {
            integers.add(i);
        }
        return integers;
    }

    public static List<Integer> makePrimeList(int n){
        List<Integer> integers = makeList(n);
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < integers.size(); i++) {

            Integer foundNumber = integers.get(i);

            boolean isPrime = true;
            for (int j = 2; j < foundNumber-1; j += 1){
                if (foundNumber % j == 0) {
                    isPrime = false;
                }
            }

            if(isPrime){
                result.add(foundNumber);
            }

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(makePrimeList(20));
    }
}
