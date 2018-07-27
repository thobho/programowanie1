package com.sdacademy.day2.animals;

public abstract class Animal {

    private static final double GOLDEN_RATION = 1.61803398875;
    private static int idCounter;
    private int id;
    protected String species;

    Animal(String species) {
        this.id = idCounter;
        idCounter++;
        this.species = species;
    }

    protected void saySomethingAbout(){
        System.out.println("I consume memory, therefor I am!");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", species='" + species + '\'' +
                '}';
    }
}
