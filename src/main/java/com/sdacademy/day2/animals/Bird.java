package com.sdacademy.day2.animals;

public class Bird extends Animal implements Singable{
    public Bird(String species) {
        super(species);
    }

    @Override
    protected void saySomethingAbout() {
        super.saySomethingAbout();
        System.out.println("I can fly");
    }

    @Override
    public void sing(String song) {
        System.out.println(String.format("I am %s and I sing %s", species, song));
    }
}
