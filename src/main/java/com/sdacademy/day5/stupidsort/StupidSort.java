package com.sdacademy.day5.stupidsort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StupidSort {

    static int count = 0;

    static void stupidSort(List<Integer> list) {
        while (!isSorted(list)) {
            Collections.shuffle(list);
            count++;
        }
    }


    static boolean isSorted(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(2, 6, 3, 2, 5,3,43,234,2,444,2);


        stupidSort(integers);
        System.out.println(count);
        System.out.println(integers);
    }

}
