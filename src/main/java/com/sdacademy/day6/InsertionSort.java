package com.sdacademy.day6;

public class InsertionSort {


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        shift(arr, 0, 2);

        System.out.println(args);



    }

    private static int[] sort(int[] arr) {

//        int pointer = 0;
//
//        for (int i = 1; i < arr.length; i++) {
//            int temp = arr[i];
//
//            for (int j = 0; j < en; j++) {
//
//            }
//
//        }
        return null;
    }

    private static void shift(int[] arr, int start, int end) {
        if (start < 0 || end > arr.length - 1) {
            throw new IllegalArgumentException("Bad parameter");
        }

        for (int i = end; i >= start + 1; i--) {
            arr[i] = arr[i - 1];
        }
    }

}
