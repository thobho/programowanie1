package com.sdacademy.day1;

import com.sdacademy.day2.animals.Animal;

import java.math.BigInteger;

/*
Zaimplementuj metodę factorial tak by zwracała silnie liczby całkowitej.
Dla liczb mniejszych od 1 metoda powinna rzucić wyjątek IllegalArgumentException
Zaimplementuj funckję bigFactorial, tak by zwracała silnię podanje liczby całkowiter. Napisz odpowiednie test(dla chętnych).
 */
public class Exercise1 {

    int factorial(int input) {
        if(input<0){
            throw new IllegalArgumentException();
        }

        if(input == 0){
            return 1;
        } else {
            return input * factorial(input -1);
        }
    }

    BigInteger bigFactorial(BigInteger bigInteger){
        return new BigInteger("1");
    }

    public static void main(String[] args) {
        Exercise1 exercise1Instace = new Exercise1();
        System.out.println(exercise1Instace.factorial(10));
    }
}
