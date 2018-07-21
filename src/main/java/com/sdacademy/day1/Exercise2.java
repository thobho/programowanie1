package com.sdacademy.day1;
/*
Zapimplementuj funkcję gcd, która dla dwóch podanych liczb całkowitych zwraca największy wspólny dzielnik.
Jeżeli przynajmniej jeden z podanych argumentów jest mniejszy od zera wyjątek IllegalArgumentException powinien być wyrzucony.
Dla chętnych: napisz program konsolowy, który z konsoli przyjmuje liczby podane przez użytkownika i zwraca największy wspólny dzielnik.
 */
public class Exercise2 {
    int gcd(int a, int b) {
        if(b==0) {return a;} else {
            return gcd(b,a%b);
        }
    }

    public static void main(String[] args) {
        System.out.println("Wykorzystaj metodę main do własnego programu konsolowego.");
    }
}
