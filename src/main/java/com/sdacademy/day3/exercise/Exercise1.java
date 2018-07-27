package com.sdacademy.day3.exercise;

import java.util.HashMap;
import java.util.Map;

public class Exercise1 {


    private static Map<Pet, Person> peapoleMap = new HashMap<>();

    {
        peapoleMap.put(new Pet("Mruczek", 12, true), new Person("Adam", 12, false));
        peapoleMap.put(new Pet("Cygan", 5, false), new Person("Wojtek", 22, false));
        peapoleMap.put(new Pet("Gruby", 6, true), new Person("Adam", 40, false));
        peapoleMap.put(new Pet("Gruby", 2, false), new Person("Adam", 40, false));
        peapoleMap.put(new Pet("Bobo", 5, true), new Person("Michał", 14, false));
        peapoleMap.put(new Pet("Sisi", 11, false), new Person("Michał", 14, false));
        peapoleMap.put(new Pet("Lonia", 3, true), new Person("Ania", 9, true));
        peapoleMap.put(new Pet("Smok", 5, false), new Person("Ania", 9, true));
        peapoleMap.put(new Pet("Rumo", 6, true), new Person("Basia", 19, true));
        peapoleMap.put(new Pet("Dodo", 7, false), new Person("Magda", 19, true));
        peapoleMap.put(new Pet("Niemamimienia", 9, false), new Person("Basia", 19, true));
    }
}
