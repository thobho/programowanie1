package com.sdacademy.day2.exercises.exercise2;

public interface Stack<E> {
    boolean push(E element);
    E pop();
    E peek();
    boolean isEmpty();
}
