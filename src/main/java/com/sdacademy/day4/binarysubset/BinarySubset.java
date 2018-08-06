package com.sdacademy.day4.binarysubset;

import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


public class BinarySubset {


    private static int longestSubset(String s) {
        int max = 0;
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                counter++;
                if (counter > max) {
                    max = counter;
                }
            } else {
                counter = 0;
            }
        }
        return max;
    }



    public static int longestSubsequence(String sequence){


        int longest = 0;
        int counter = 0;

        char[] chars = sequence.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='1'){
                counter++;
                if(counter>longest){
                    longest = counter;
                }
            } else {
                counter = 0;
            }
        }

        return longest;
    }

    public static String stringDistinct(String inputString){

        Set<Character> tempCharSet = new LinkedHashSet<>();

        for (int i = 0; i < inputString.length(); i++) {
            tempCharSet.add(inputString.charAt(i));
        }

        Iterator<Character> iterator = tempCharSet.iterator();
        StringBuilder stringBuilder = new StringBuilder();
        while (iterator.hasNext()){
            stringBuilder.append(iterator.next());
        };

        return stringBuilder.toString();
    }

    private Map<Long, List<String>> mergeList(Map<Long, List<String>> first, Map<Long, List<String>> second){

        Set<Long> allKeys = first.keySet();
        Set<Long> secondKeys = second.keySet();
        allKeys.addAll(secondKeys);

        Map<Long, List<String>> mergedMap = new HashMap<>();


        for (Long actualKey : allKeys) {
            List<String> itemsFromAll = first.get(actualKey);
            List<String> itemsFromSecond = second.get(actualKey);

            itemsFromAll.addAll(itemsFromSecond);

            List<String> mergedList =
                    Stream.concat(itemsFromAll.stream(), itemsFromSecond.stream())
                            .collect(Collectors.toList());

            mergedMap.put(actualKey, itemsFromAll);
        }
        return mergedMap;

    }



    public static void main(String[] args) {
        String example = "110110000001111110010110110001111111111111111111101101111111000001010010101";
        String example2 = "asaaaaaaabdbbbdddddddddddddaaaaa";

//        Instant start = Instant.now();
//
//        for (int i = 0; i < 100000; i++) {
//
//            System.out.println(longestSubsequence(example));
//        }
//
//        Instant end = Instant.now();
//
//        System.out.println(Duration.between(start, end).toMillis());
        System.out.println( stringDistinct(example2));


    }

}
