package com.sdacademy.day4.todolist;

import java.time.LocalDate;
import java.util.Scanner;

public class Console {

    static Scanner scanner = new Scanner(System.in);
    static int action;
    static ToDoList toDoList = new ToDoList();

    static void chooseAction() {
        System.out.println("Choose action:");
        action = scanner.nextInt();
    }

    public static void main(String[] args) {
        while (action != 3) {
            chooseAction();
            switch (action) {
                case 1:
                    System.out.println("Choosed 1");
                    break;
                case 2:
                    System.out.println("add");
                    addToDo();
                    break;
                default:
                    System.out.println("wrong");
            }
        }
    }

    static void addToDo(){
        System.out.println("Add text");
        String s = scanner.nextLine();
        s = scanner.nextLine();
        System.out.println("add priority");
        int i = scanner.nextInt();
        ToDo toDo = new ToDo(s, LocalDate.now(), i);
        toDoList.add(toDo);
        toDoList.save();
        System.out.println(toDo.shortString());
    }


}
