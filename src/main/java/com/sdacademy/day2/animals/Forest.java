package com.sdacademy.day2.animals;

import java.util.ArrayList;
import java.util.List;

public class Forest {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Mammal("Cat"));
        animals.add(new Bird("Nightnagle"));
        animals.add(new Amphibian("Frog"));
        animals.forEach(System.out::println);
        createOrchiestra().forEach(animal -> animal.sing("Smooth criminal"));
    }

    private static List<Singable> createOrchiestra(){
        List<Singable> orchiestra = new ArrayList<>();
        orchiestra.add(new Bird("Nightnagle"));
        orchiestra.add(new Bird("Stork"));
        orchiestra.add(new Elephant("Elephant"));
        return orchiestra;
    }

}
