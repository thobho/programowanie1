package com.sdacademy.day1;

import java.util.Random;

import static java.lang.Math.*;

/*
Napisz klasę, która znajduje warość liczby PI na podstawie metody Monte Carlo. Metoda będzie omówiona na zajęciach.
Stwórz własną klasę Point, oraz metody pomocnicz do obliczania dystansu między punktami
Dobra wizualiza jest przedstawiona na tej stronie. https://academo.org/demos/estimating-pi-monte-carlo/
 */
public class Exercise5 {

    private static double R = 100;
    private int samples = 100000000;
    private Random random = new Random();

    public Point crateRandomPoint() {
        return new Point(random.nextDouble() * 2 * R - R, random.nextDouble() * 2 * R - R);
    }

    public double distance(Point a, Point b) {
        return 0;
    }

    double calculatePi() {
        return 0;
    }

    private static class Point {
        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public Point(double x, double y) {

            this.x = x;
            this.y = y;
        }

        double x;
        double y;
    }

    public static void main(String[] args) {
        Exercise5 exercise5 = new Exercise5();
        double pi = exercise5.calculatePi();
        System.out.println(pi);
        System.out.println(abs(pi - PI) / PI * 100 + "%");
    }
}
