package com.sdacademy.day3.lambdas;

import java.util.Optional;

public class OptionalTutorial {

    public static void main(String[] args) {

        divide(2, 5)
                .map(x->x.toString())
                .ifPresent(x -> System.out.println("w pudełku jest " + x));
    }

    public static Optional<Double> divide(double a, double b) {
        if (b == 0) {
            return Optional.empty();
        }
        return Optional.of(a / b);
    }

}
