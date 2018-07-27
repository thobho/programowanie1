package com.sdacademy.day2.animals;

public class Mammal extends Animal {
    public Mammal(String species) {
        super(species);
    }

    @Override
    protected void saySomethingAbout() {
        super.saySomethingAbout();
        System.out.println("I consume memory, therefor I am!");
    }
}
