package com.sdacademy.day4.tree;

public class Main {
    public static void main(String[] args) {
        Tree<Integer> integerTree = new Tree<Integer>();
        integerTree.add(50);
        integerTree.add(23);
        integerTree.add(67);
        integerTree.add(12);
        integerTree.add(31);
        integerTree.add(55);
        System.out.println(integerTree.getMin());
      //  integerTree.printPreOrder();
       // integerTree.printLevel(1);
        Integer contains = integerTree.contains(534);
        System.out.println(contains);
    }
}
