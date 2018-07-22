package com.sdacademy.day1;

/*
Napisz metodę, która jako argument przyjmuje tablicę liczb całkowitych i sortuję ją "w miejscu" używając BubbleSort.
Napisz metodę, która jako argument przyjmuje tablicę liczb całkowitych i sortuję ją "w miejscu" używając CoctailSort.
Algorytmy będą omówione na zajęciach.
Zapimlementuj testy(dla chętnych).
 */
public class Exercise4 {
    void bubbleSort(int arr[]) {

    }

    void swap(int[] arr, int from, int to){
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;

    }

    void cocktailSort(int a[]) {

    }


    /* Prints the array */
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public int[] shakeSort(int[] input){
        return new int[1];
    }
}
