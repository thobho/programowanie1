package com.sdacademy.day2.exercises.exercise3;

import java.util.Stack;

/*
Przeliczanie systemów liczbowych
 */
public class Main {

    public static void main(String[] args) {
        System.out.println( convertToSystem(10, 16));

    }

    static String convertToSystem(int l, int p) {
        Stack<Integer> stack = new Stack<>();

        while (l>0){
            stack.push(l%p);
            l = l / p;
        }

        String result = "";
        while (!stack.isEmpty()){
            result = result + stack.pop();
        }

        return result;
    }
}

