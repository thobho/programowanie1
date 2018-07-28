package com.sdacademy.day2.animals;

public abstract class Animal implements Comparable<Animal>{

    protected static final double GOLDEN_RATIO = 1.61803398875;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", species='" + species + '\'' +
                '}';
    }

    @Override
    public int compareTo(Animal anotherAnimal) {
        return  this.getId() - anotherAnimal.getId();
    }
}
