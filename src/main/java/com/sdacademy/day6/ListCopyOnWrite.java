package com.sdacademy.day6;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class ListCopyOnWrite {

    public static void main(String[] args) {
       // arrayListIteration();
        copyOnWriteListIteration();
    }

    private static void arrayListIteration() {
        List<Integer> integers = Stream.of(1, 2, 3, 4, 5, 5, 6).collect(toList());
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            integers.remove(iterator.next());
        }
    }

    private static void copyOnWriteListIteration() {
        CopyOnWriteArrayList copyOnWriteArrayList =
                new CopyOnWriteArrayList(Stream.of(1, 2, 3, 4, 5, 6).collect(toList()));
        Iterator<Integer> iterator = copyOnWriteArrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            copyOnWriteArrayList.remove(iterator.next());
        }


        System.out.println(copyOnWriteArrayList);
    }


}
