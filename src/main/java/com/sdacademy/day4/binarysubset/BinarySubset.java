package com.sdacademy.day4.binarysubset;

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

    public static void main(String[] args) {
        String example = "110110000001111110010110110001111111111111111111101101111111000001010010101";

        System.out.println(longestSubset(example));
    }

}
