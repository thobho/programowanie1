package com.sdacademy.day4.exercises.linessegregator;

import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileLoader {
    private Scanner scanner;
    public static String DEFAULT_FILEPATH;
    private Properties properties;

    public FileLoader() {
        this.properties = new Properties();
        File props = new File("props.properties");
        try {
            this.properties.load(new FileReader(props));
        } catch (IOException e) {
            e.printStackTrace();
        }
        DEFAULT_FILEPATH = properties.getProperty("outputFile");
    }

    void readFile(String filePath) {
        File loadedFile = new File(filePath);
        try {
            scanner = new Scanner(loadedFile);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Person readPersonFromFile(String filePath) {
        File loadedFile = new File(filePath);
        Person person = null;
        try {
            scanner = new Scanner(loadedFile);
            while (scanner.hasNext()) {
                String personString = scanner.nextLine();
                String[] split = personString.split(",");

                int personId = Integer.parseInt(split[0]);
                String personName = split[1];
                String personSecondName = split[2];
                double i = Double.parseDouble(split[3]);

                person = new Person(personId, personName, personSecondName, i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return person;
    }

    private List<Person> readPersonsFromFile(String filePath) {
        File loadedFile = new File(filePath);
        List<Person> personList = new ArrayList<>();
        try {
            scanner = new Scanner(loadedFile);
            while (scanner.hasNext()) {
                String personString = scanner.nextLine();
                String[] split = personString.split(",");
                int personId = Integer.parseInt(split[0]);
                String personName = split[1];
                String personSecondName = split[2];
                double salary = Double.parseDouble(split[3]);

                personList.add(new Person(personId, personName, personSecondName, salary));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Zła ścieżka pliku " + e.getMessage());
        }
        return personList;
    }

    public List<Person> readFromFiles(List<String> filePaths) {
//        List<Person> collect = filePaths.stream()
//                .flatMap(path -> readPersonsFromFile(path).stream())
//                .collect(Collectors.toList());

        List<Person> result = new ArrayList<>();
        for (String path : filePaths) {
            List<Person> people = readPersonsFromFile(path);
            result.addAll(people);

        }
        Collections.sort(result);
        return result;

    }

    private static void writeToFile(String outputFilePath, List<Person> personList) {
        try {
            FileWriter fileWriter = new FileWriter(outputFilePath);
            for (Person p : personList) {
                fileWriter.write(p.toCsvString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FileLoader fileLoader = new FileLoader();
        //fileLoader.readFile("csvdata/test.csv");
        // Person person = fileLoader.readPersonFromFile("csvdata/test.csv");
//        List<Person> people = fileLoader.readPersonsFromFile("csvdata/test.csv");


        List<Person> people = fileLoader.readFromFiles(Arrays.asList(args));
        people.forEach(person -> System.out.println(person));


    }


}
