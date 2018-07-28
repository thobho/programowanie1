package com.sdacademy.day2.cwiczenia;

import java.util.*;

public class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }


    public static void main(String[] args) {
        Collection<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(1);
        ints.add(32);
        ints.add(321);
        ints.add(34531);
        ints.add(54);

        ints = new HashSet<>();


        Iterator<Integer> iterator = ints.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
