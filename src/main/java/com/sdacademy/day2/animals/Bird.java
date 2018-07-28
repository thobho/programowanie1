package com.sdacademy.day2.animals;

public class Bird extends Animal implements Singable{

    boolean hasFeather;

    public Bird(String species) {
        super(species);
    }

    public Bird(String species, boolean hasFeather) {
        super(species);
        this.hasFeather = hasFeather;
    }

    public static double lengthOfWing(){
        return Animal.GOLDEN_RATIO;
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
