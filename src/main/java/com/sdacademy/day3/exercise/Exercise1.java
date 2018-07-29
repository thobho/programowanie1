package com.sdacademy.day3.exercise;

import java.util.*;
import java.util.function.Predicate;

public class Exercise1 {


    private static Map<Pet, Person> petMap = new HashMap<>();


    private static Person getOwner(Pet pet) {
        Pet mruczek = new Pet("Mruczek", 12, true);
        Person person = petMap.get(mruczek);
        return person;
    }

    public static void main(String[] args) {

        petMap.put(new Pet("Mruczek", 12, true), new Person("Adam", 12, false));
        petMap.put(new Pet("Cygan", 5, false), new Person("Wojtek", 22, false));
        petMap.put(new Pet("Gruby", 6, true), new Person("Adam", 40, false));
        petMap.put(new Pet("Gruby", 2, false), new Person("Adam", 40, false));
        petMap.put(new Pet("Bobo", 5, true), new Person("Michał", 14, false));
        petMap.put(new Pet("Sisi", 11, false), new Person("Michał", 14, false));
        petMap.put(new Pet("Lonia", 3, true), new Person("Ania", 9, true));
        petMap.put(new Pet("Smok", 5, false), new Person("Ania", 9, true));
        petMap.put(new Pet("Rumo", 6, true), new Person("Basia", 19, true));
        petMap.put(new Pet("Dodo", 7, false), new Person("Magda", 19, true));
        petMap.put(new Pet("Niemamimienia", 9, false), new Person("Basia", 19, true));

        Predicate<Person> agePersonPredicate = person -> person.getAge() > 18;
        Predicate<Person> namePersonPredicate = person -> person.getName().charAt(0) == 'A';

        Set<Person> people = personsWithOnePet(petMap);

        System.out.println(people);


    }

    public static Set<Pet> petsOfPerson(Map<Pet, Person> petsMap, Predicate<Person> predicate) {
        Set<Pet> result = new HashSet<>();
        for (Map.Entry<Pet, Person> entry : petsMap.entrySet()) {
            Person value = entry.getValue();
            if (predicate.test(value)) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public static Set<Pet> petsOfPerson(Map<Pet, Person> petsMap) {
        Set<Pet> result = new HashSet<>();
        Set<Pet> pets = petsMap.keySet();
        for (Pet pet : pets) {
            if (pet.isDangerous() && pet.getMass() > 6) {
                result.add(pet);
            }
        }
        return result;
    }

//    public static Set<Person> personsWithOnePet(Map<Pet, Person> petsMap) {
//        Set<Person> result = new HashSet<>();
//
//        Map<Person, Integer> numberOfPetsForPerson = new HashMap<>();
//
//        for (Map.Entry<Pet, Person> entry : petsMap.entrySet()) {
//            Person person = entry.getValue();
//            Pet pet = entry.getKey();
//
//
//            if(!numberOfPetsForPerson.containsKey(person)){
//
//                numberOfPetsForPerson.put(person, 1);
//            }
//        }
//
//    }


    public static Set<Person> personsWithOnePet(Map<Pet, Person> petsMap) {
        Collection<Person> values = petsMap.values();
        Set<Person> result = new HashSet<>();

        for (Person person : values) {
            int i = occurancesInCollection(values, person);

            if (i == 1) {
                result.add(person);
            }

        }

        return result;
    }

    private static int occurancesInCollection(Collection<Person> collection, Person person) {
        int conut = 0;
        for (Person pe : collection) {
            if (person.equals(pe)) {
                conut++;
            }
        }
        return conut;
    }


}
