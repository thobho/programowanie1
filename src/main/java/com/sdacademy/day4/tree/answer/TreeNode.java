package com.sdacademy.day4.tree.answer;

import java.util.Objects;

public class TreeNode<T extends Comparable<T>> {
    private T element;
    private TreeNode<T> left;
    private TreeNode<T> right;

    public TreeNode(T element, TreeNode<T> left, TreeNode<T> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode<?> treeNode = (TreeNode<?>) o;
        return Objects.equals(element, treeNode.element) &&
                Objects.equals(left, treeNode.left) &&
                Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {

        return Objects.hash(element, left, right);
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "element=" + element +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
