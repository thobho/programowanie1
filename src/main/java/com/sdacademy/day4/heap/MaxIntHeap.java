package com.sdacademy.day4.heap;


import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxIntHeap {

    private static int DEFAULT_HEAP_SIZE = 16;

    private int[] heap;
    private int size;

    public MaxIntHeap() {
        this.heap = new int[DEFAULT_HEAP_SIZE];
        this.heap[0] = Integer.MAX_VALUE;
        size = 0;
    }

    public void add(int value) {
        size++;
        heap[size] = value;
        restoreHeapConditionUp();
        expandHeapArrayIfNecessary();
    }

    public int get() {
        int result = heap[1];
        heap[1] = heap[size];
        heap[size] = 0; // not necessary
        size--;
        restoreHeapConditionDown(1);
        return result;
    }

    private void restoreHeapConditionDown(int rootIndex) {
        int leftChildIndex = rootIndex * 2;
        int rightChildIndex = rootIndex * 2 + 1;
        int parent = heap[rootIndex];

        if (leftChildIndex <= size && heap[leftChildIndex] > heap[rightChildIndex]) {
            if (heap[leftChildIndex] > parent) {
                swap(rootIndex, leftChildIndex);
                restoreHeapConditionDown(leftChildIndex);
            }
        } else if (rightChildIndex <= size) {
            if (heap[rightChildIndex] > parent) {
                swap(rootIndex, rightChildIndex);
                restoreHeapConditionDown(rightChildIndex);
            }
        }

    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void restoreHeapConditionUp() {
        int childPointer = size;
        int parent = heap[childPointer / 2];
        int child = heap[childPointer];
        while (parent < child) {
            swap(childPointer / 2, childPointer);
            childPointer = childPointer / 2;
            child = heap[childPointer];
            parent = heap[childPointer / 2];
        }
    }

    private void swap(int from, int to) {
        int fromInt = heap[from];
        heap[from] = heap[to];
        heap[to] = fromInt;
    }

    private void expandHeapArrayIfNecessary() {
        if (size + 4 > heap.length) {
            int[] newArray = new int[heap.length * 2];
            System.arraycopy(heap, 0, newArray, 0, heap.length);
            heap = newArray;
        }
    }

    public static void main(String[] args) {
        //heap sort
        Instant start = Instant.now();
        int[] arr = generateRandomArray();
        heapSort(arr);
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end).toMillis());


        //Java sort
        int[] arr2 = generateRandomArray();
        Instant start2 = Instant.now();
        Arrays.sort(arr2);
        Instant end2 = Instant.now();
        System.out.println(Duration.between(start2, end2).toMillis());
    }

    private static void heapSort(int[] arr) {
        MaxIntHeap maxIntHeap = new MaxIntHeap();

        for (int i = 0; i < arr.length; i++) {
            maxIntHeap.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = maxIntHeap.get();
        }
    }

    private static int[] generateRandomArray() {
        int[] arr = new int[10000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
        return arr;
    }
}
