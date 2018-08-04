package com.sdacademy.day4.todolist;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class FileRepo {
    private static final String DEFAULT_FILE = "todos.txt";
    private File file;
    private Scanner scanner;

    public FileRepo() {
        this.file = new File(DEFAULT_FILE);
        if (!file.exists()) {
            try {
                boolean newFile = file.createNewFile();
            } catch (IOException e) {
                System.out.println("CAN NOT CREATE FILE");
            }
        }
        try {
            this.scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("CAN NOT CREATE FILE");
        }

    }

    public void saveToDo(List<ToDo> todos) {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            todos.forEach(toDo -> {
                try {
                    fileWriter.write(toDo.shortString());
                } catch (IOException e) {
                    System.out.println("Can not write");
                }
            });
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void saveToDo(ToDo todo) {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(todo.shortString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<ToDo> readToDos() {
        List<ToDo> result = new ArrayList<>();
        while (scanner.hasNext()) {
            String toDoString = scanner.nextLine();
            String[] split = toDoString.split("&");

            result.add(new ToDo(split[0], LocalDate.parse(split[2].trim()), Integer.parseInt(split[1])));

        }
        return result;
    }

    public static void main(String[] args) {
        FileRepo fileRepo = new FileRepo();
        fileRepo.saveToDo(new ToDo("TEST", LocalDate.now(), 2));
        List<ToDo> toDos = fileRepo.readToDos();
        System.out.println();
    }
}
