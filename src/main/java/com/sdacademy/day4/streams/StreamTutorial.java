package com.sdacademy.day4.streams;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamTutorial {
    public static void main(String[] args) {
        List<Circle> circlesList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            circlesList.add(Circle.createRandomCircle());
        }
//        circlesList.circleStream()
//                .map(circle -> circle.getColor())
//                .forEach(color -> System.out.println(color));

        Stream<Circle> circleStream = circlesList.stream();
//
//        ShowCircle action = new ShowCircle();
//
        //       BigCircles predicate = new BigCircles();

        //       CircleArea mapper = new CircleArea();
        Comparator<Circle> circleComparator = (left, rigt) -> left.getColor().compareTo(rigt.getColor());

        ColorComparator comparator = new ColorComparator();

        Map<Double, Circle> collect = circleStream
                .filter(circle -> circle.r > 0)
                .sorted(comparator)
                .collect(Collectors.toMap(circle -> circle.r, circle -> circle));


        //.map(circle -> circle.r * circle.r * Math.PI)
        //.map(circle -> circle.getColor())

        //.forEach(circleColor -> System.out.println(circleColor));

    }

    public static class RadiusComparator implements Comparator<Circle> {
        @Override
        public int compare(Circle o1, Circle o2) {
            if (o1.r > o2.r) {
                return 1;
            } else if (o1.r < o2.r) {
                return -1;
            }
            return 0;
        }
    }

    public static class ColorComparator implements Comparator<Circle> {
        @Override
        public int compare(Circle o1, Circle o2) {
            return o1.getColor().compareTo(o2.getColor());
        }
    }

//    private static class CircleArea implements Function<Circle, Double>{
//        @Override
//        public Double apply(Circle circle) {
//            return circle.r * circle.r * Math.PI;
//        }
//    }
//
//    private static class ShowCircle implements Consumer<Circle>{
//        @Override
//        public void accept(Circle circle) {
//            System.out.println(circle);
//        }
//    }
//
//    private static class BigCircles implements Predicate<Circle>{
//        @Override
//        public boolean test(Circle circle) {
//            return circle.r > 0;
//        }
//    }


    private void streamCreations() {

        //generator
        Supplier<UUID> randomUUIDSupplier = UUID::randomUUID;
        Stream<UUID> infiniteStreamOfRandomUUID = Stream.generate(randomUUIDSupplier).limit(19);



        //builder

        Stream.Builder<Circle> builder = Stream.builder();

        Map<String, List<Circle>> collect = builder
                .add(Circle.createRandomCircle())
                .add(Circle.createRandomCircle())
                .add(Circle.createRandomCircle())
                .build()
                .collect(Collectors.groupingBy(Circle::getColor));


        Stream<BigDecimal> s = Stream.iterate(
                BigDecimal.ONE, bigDecimal ->
                        bigDecimal.add(BigDecimal.ONE))
                .limit(10).peek(System.out::println);


        Stream<Circle> iterate = Stream.iterate(new Circle(1, 1), seedCircle -> new Circle(seedCircle.x + 1, seedCircle.y + 1));


        String reduce = Stream.of("test", "noga", "napis").reduce("Start", (a, b) -> a.toUpperCase() + b);


        IntSummaryStatistics stats = s.collect(Collectors.summarizingInt(BigDecimal::intValue));
        System.out.println(stats);

    }


    public static class Circle implements Comparable<Circle> {

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

        public Circle(double x, double y) {
            this("red", x, y, 1);
        }

        @Override
        public int compareTo(Circle o) {
            if (this.r > o.r) {
                return 1;
            } else if (this.r < o.r) {
                return -1;
            }
            return 0;
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

        public static List<Circle> createRandomCircles(int n) {
            return IntStream.range(0, n).mapToObj(i -> createRandomCircle()).collect(toList());
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "color='" + color + '\'' +
                    ", x=" + x +
                    ", y=" + y +
                    ", r=" + r +
                    '}';
        }
    }
}
