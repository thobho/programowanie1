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
    private static int samples = 10000000;
    private Random random = new Random();

    private Point crateRandomPoint() {
        return new Point(random.nextDouble() * 2 * R - R, random.nextDouble() * 2 * R - R);
    }

    public double distance(Point a, Point b) {

        double x = a.getX() - b.getX();
        double y = a.getY() - b.getY();

        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    double calculatePi() {
        double hit = 0;

        Point zeroPoint = new Point(0, 0);

        for (int i = 0; i < samples; i++) {
            Point randomPoint = crateRandomPoint();
            if (distance(randomPoint, zeroPoint) < R) {
                hit++;
            }

        }
        return 4 * hit / samples;
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
