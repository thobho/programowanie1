package com.sdacademy.day2.animals;

public class Elephant extends Mammal implements Singable{
    public Elephant(String species) {
        super(species);
    }

    @Override
    public void sing(String song) {
        System.out.println("I also can sing this "+song.toUpperCase());
    }
}
