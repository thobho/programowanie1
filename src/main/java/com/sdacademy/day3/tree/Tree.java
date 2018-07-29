package com.sdacademy.day3.tree;

public class Tree<T> {

    Node<T> root;

    public Tree(Node<T> root) {
        this.root = root;
    }

    private static class Node<T>{
        T value;
        Node<T> left;
        Node<T> right;

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getLeft() {
            return left;
        }

        public void setLeft(Node<T> left) {
            this.left = left;
        }

        public Node<T> getRight() {
            return right;
        }

        public void setRight(Node<T> right) {
            this.right = right;
        }
    }

    public static int maxDepth(Node root) {
        if(root==null)
            return 0;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        int bigger = Math.max(leftDepth, rightDepth);

        return bigger+1;
    }
}
