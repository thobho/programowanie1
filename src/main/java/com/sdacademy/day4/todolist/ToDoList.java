package com.sdacademy.day4.todolist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToDoList {

    private List<ToDo> toDoList;
    private FileRepo fileRepo;

    ToDoList(){
        toDoList = new ArrayList<>();
        fileRepo = new FileRepo();
    }

    public void add(ToDo toDo){
        toDoList.add(toDo);
    }

    public void save(){
        fileRepo.saveToDo(this.toDoList);
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.add(new ToDo("tes", LocalDate.now(), 2));
        toDoList.add(new ToDo("afd", LocalDate.now(), 23));
        toDoList.add(new ToDo("afsdf", LocalDate.now(), 2));

        toDoList.save();

    }

}
