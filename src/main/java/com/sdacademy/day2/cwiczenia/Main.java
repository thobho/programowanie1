package com.sdacademy.day2.cwiczenia;

import java.util.*;

public class Main {


    public static void main(String[] args) {


        Deque<Integer> integerDeque = new LinkedList<>();

        integerDeque.getFirst();







//        Integer[] ints = {1132,32,432,423,52};
//        List<String> strings = Arrays.asList("kot", "domek", "interfejs", "i");
//        List<String> twoLongestStrings = getTwoLongestStrings(strings);
//        Collections.reverse(strings);
//        System.out.println(twoLongestStrings);

    }

    private static List<String> getTwoLongestStrings(List<String> list){
        String longest = "";
        String secondLongest = "";

        for (String actual: list){
            if(actual.length() > longest.length()){
                secondLongest = longest;
                longest = actual;
            }
        }

        return Arrays.asList(longest, secondLongest);
    }



    private static <T> void oddIndexElements(T[] arr){
        for (int i = 0; i <arr.length; i++) {
            if(i%2==0){
                System.out.println(arr[i]);
            }
        }
    }

    private static <T> void oddIndexElements2(T[] arr){
        for (int i = 0; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }
    }

}
