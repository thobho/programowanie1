package com.sdacademy.day6;

import java.util.*;

public class TreeMapOperations {

    private static final Random RANDOM = new Random();
    public static final int MAP_LENGTH = 10;

    public static void main(String[] args) {

        NavigableMap<Point, Circle> map = new TreeMap<>();

        for (int i = 0; i < MAP_LENGTH; i++) {
            map.put(Point.createRandom(), Circle.createRandomCircle());
        }

        //pierwsza para
        Map.Entry<Point, Circle> pointCircleEntry = map.firstEntry();
        System.out.println(pointCircleEntry);

        //pierwsza para gdzie klucz większy od Point(1,1)
        Point searchKey = new Point(1, 1);
        Map.Entry<Point, Circle> pointCircleEntry1 = map.ceilingEntry(searchKey);
        System.out.println(pointCircleEntry1);

        //Wszystkie punkty, gdzie klucz mniejsze od Point(1,1) --- odpowiednio jest tailMap
        SortedMap<Point, Circle> pointCircleSortedMap = map.headMap(new Point(1, 1));
        System.out.println(pointCircleSortedMap);

        //Wszystkie punkty "pomiędzy zadanymi"
        SortedMap<Point, Circle> pointCircleSortedMap1 = map.subMap(new Point(1, 1), new Point(2, 2));


        //recompyute value for key
        Point firstPoint = map.firstKey();
        map.computeIfPresent(firstPoint, (point, circle)-> new Circle(point.distance, Color.RED));

    }

    private enum Color {
        RED, GREEN, BLUE;

    }

    public static <T extends Enum<?>> T randomEnum(Class<T> clazz){

        int x = RANDOM.nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }

    private static class Circle {
        private double r;
        private Color color;

        public Circle(double r, Color color) {
            this.r = r;
            this.color = color;
        }

        private static Circle createRandomCircle(){
            return new Circle( RANDOM.nextDouble(), randomEnum(Color.class));
        }

        public void setR(double r) {
            this.r = r;
        }
    }

    private static class Point implements Comparable<Point> {
        private double x;
        private double y;
        private double distance;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
            this.distance = distanceFromZero();
        }

        private double distanceFromZero() {
            return Math.sqrt(x * x + y * y);
        }

        @Override
        public int compareTo(Point o) {
            return Double.compare(this.distanceFromZero(), o.distanceFromZero());
        }

        private static Point createRandom() {
            return new Point(RANDOM.nextGaussian(), RANDOM.nextGaussian());
        }
    }
}
