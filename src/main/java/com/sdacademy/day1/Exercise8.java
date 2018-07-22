package com.sdacademy.day1;

/*
Proszę napisać metodę, która znajduję n-tą liczbę Fibonnaciego. Proszę napisać ją w wersji iteracyjnej i rekurencyjnej.
 */
public class Exercise8 {

    private static int fibonacci(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }

        int oneBefore = 1;
        int twoBefore = 1;
        int newFibonacci = 0;

        for (int i = 0; i < n; i++) {
            newFibonacci = oneBefore + twoBefore;
            twoBefore = oneBefore;
            oneBefore = newFibonacci;
        }

        return newFibonacci;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(6));

        Object a = new Object();
        Object b = new Object();



        System.out.println(a.equals(b));

    }
}
