package com.sdacademy.day5.enumtutorial;

public class EnumTutorial {


    public static void main(String[] args) {
        introducePlanet(Planet.VENUS);
    }

    private static void introducePlanet(Planet planet) {
        switch (planet) {
            case MARS:
                System.out.println("Tutaj mieszjają marsjanki");
                break;
            case EARTH:
                System.out.println("Tutaj mieszjają ludzie");
        }
    }
}
