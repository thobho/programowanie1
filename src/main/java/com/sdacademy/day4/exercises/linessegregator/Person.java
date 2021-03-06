package com.sdacademy.day4.exercises.linessegregator;

import java.util.Objects;

public class Person implements Comparable<Person> {

    public static final String FORMAT = "Mój test to %s, następny test to %s, a liczba to" +
            "moj liczba %d";
    private int id;
    private String name;
    private String secondName;
    private double account;

    public Person(int id, String name, String secondName, double account) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }


    @Override
    public int compareTo(Person o) {
        return o.getId() - this.getId();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", account=" + account +
                '}';
    }

    public String toCsvString() {
        return String.format("%d,%s,%s,%f%n", this.id, this.name, this.secondName, this.account);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Double.compare(person.account, account) == 0 &&
                Objects.equals(name, person.name) &&
                Objects.equals(secondName, person.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, secondName, account);
    }

    public static void main(String[] args) {


        String test = "TEST";
        String drugiTest = "asdasdasd";
        int a = 2;

        System.out.println(String.format(FORMAT, test, drugiTest, a));
    }
}
