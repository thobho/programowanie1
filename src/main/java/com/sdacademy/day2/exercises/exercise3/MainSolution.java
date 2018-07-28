package com.sdacademy.day2.exercises.exercise3;


import java.util.*;

public class MainSolution {
    public static void main(String[] args) {
        convertToSystem(100, 2);
    }

    static String convertToSystem(int l, int p) {
        Stack<Integer> stack = new Stack<>();
        String result = "";
        while (l > 0) {
            int element = l % p;
            stack.push(element);
            l = l / p;
        }

        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }


}
