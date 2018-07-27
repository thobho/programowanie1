package com.sdacademy.day3.exercise;

import java.util.Objects;

public class Pet {

    private String name;
    private int mass;
    private boolean isDangerous;

    public Pet(String name, int mass, boolean isDangerous) {
        this.name = name;
        this.mass = mass;
        this.isDangerous = isDangerous;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public boolean isDangerous() {
        return isDangerous;
    }

    public void setDangerous(boolean dangerous) {
        isDangerous = dangerous;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return mass == pet.mass &&
                isDangerous == pet.isDangerous &&
                Objects.equals(name, pet.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, mass, isDangerous);
    }
}
