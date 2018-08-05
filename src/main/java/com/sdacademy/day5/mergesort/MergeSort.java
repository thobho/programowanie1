package com.sdacademy.day5.mergesort;

import java.util.LinkedList;
import java.util.List;

public class MergeSort {


    public static List<Integer> sort(List list){
        ListPair split = split(list);
        return merge(split.left, split.right);
    }

    private static ListPair split(List<Integer> list) {
        if (list.size() <= 1) {
            return new ListPair(list, null);
        }
        int middle = list.size() / 2;
        return new ListPair(list.subList(0, middle), list.subList(middle, list.size()));
    }

    private static List<Integer> merge(List<Integer> left, List<Integer> right) {

        LinkedList<Integer> result = new LinkedList<>();

        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.get(0) < right.get(0)) {
                result.add(left.remove(0));
            } else {
                result.add(right.remove(0));
            }
        }

        if (left.isEmpty()) {
            result.addAll(right);
            return result;
        }
        if (right.isEmpty()) {
            result.addAll(left);
            return result;
        }

        return result;
    }

    public static void main(String[] args) {
        LinkedList<Integer> left = new LinkedList<>();
        left.add(4);
        left.add(3);
        left.add(1);
        left.add(7);

        List<Integer> sort = sort(left);

        System.out.println(sort);

    }

    private static class ListPair {
        List<Integer> left;
        List<Integer> right;

        public ListPair(List<Integer> left, List<Integer> right) {
            this.left = left;
            this.right = right;
        }
    }

}
