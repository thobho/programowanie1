package com.sdacademy.day4.todolist;

public interface ToDoRepo {
    void add(ToDo toDo);
    void remove(int toDoKey);
}
