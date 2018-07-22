package com.sdacademy.day1.solutions;

import java.math.BigInteger;

public class Exercise1 {

    public int factorial(int n){
        int result = 1;
        for (int i = 2; i < n; i++) {
            result *= n;
        }
        return result;
    }

    public int factorialRec(int n){
        if(n==1){
            return n;
        }
        return n * factorial(n-1);
    }

    public static BigInteger factorialBig(BigInteger n){
        BigInteger one = new BigInteger("1");
        if(n.equals(one)){
            return n;
        }
        return n.multiply(factorialBig(n.subtract(one)));
    }

    public static void main(String[] args) {
        BigInteger ten = new BigInteger("3");
        System.out.println(factorialBig(ten));

    }

}
