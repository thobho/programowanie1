package com.sdacademy.day2.animals;

public class Amphibian extends Animal{
    public Amphibian(String species) {
        super(species);
    }

    @Override
    protected void saySomethingAbout() {
        super.saySomethingAbout();
        System.out.println("I am amphibian creature.");
    }
}
