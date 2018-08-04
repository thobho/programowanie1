package com.sdacademy.day4.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamTutorial {
    public static void main(String[] args) {
        List<Circle> circles = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            circles.add(Circle.createRandomCircle());
        }
        circles.stream()
                .map(circle -> circle.getColor())
                .forEach(color -> System.out.println(color));
    }


    public static class Circle {

        private static final String[] COLORS = {"red", "green", "blue"};

        private String color;
        double x;
        double y;
        double r;

        public Circle(String color, double x, double y, double r) {
            this.color = color;
            this.x = x;
            this.y = y;
            this.r = r;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        public double getR() {
            return r;
        }

        public void setR(double r) {
            this.r = r;
        }

        public String getColor() {
            return color;
        }

        public static Circle createRandomCircle() {
            Random random = new Random();
            return new Circle(COLORS[random.nextInt(3)], random.nextGaussian(), random.nextGaussian(), random.nextGaussian());
        }
    }
}
