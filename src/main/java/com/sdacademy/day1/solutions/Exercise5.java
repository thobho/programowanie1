package com.sdacademy.day1.solutions;

import java.util.Random;

public class Exercise5 {

    private static double R = 100;
    private int samples = 100000;
    private Random random = new Random();

    public Point crateRandomPoint() {
        return new Point(random.nextDouble() * 2 * R - R, random.nextDouble() * 2 * R - R);
    }

    public double distance(Point a, Point b) {

        double a2 = Math.pow(a.getX() - b.getX(), 2);
        double b2 = Math.pow(a.getY() - b.getY(), 2);

        return Math.sqrt(a2 + b2);
    }

    double calculatePi() {
        double hit = 0;
        for (int i = 0; i < samples; i++) {
            Point point = crateRandomPoint();
            Point zeroPoint = new Point(0, 0);
            if(distance(point, zeroPoint) < R){
                hit++;
            }
        }
        return 4 * hit / samples;
    }

    static class Point {
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
        Point a = new Point(2, 2);
        Point b = new Point(2, 4);
        System.out.println(exercise5.calculatePi());
    }

}
