package com.sdacademy.day4.tree;

public class Tree<T extends Comparable<T>> {
    private TreeNode<T> root;

    public boolean add(T newElement) {
        return addRec(newElement, root);
    }

    public T getMin() {
        TreeNode<T> minNodeRec = getMinNodeRec(this.root);
        return minNodeRec == null ? null : minNodeRec.getElement();
    }

    private TreeNode<T> getMinNodeRec(TreeNode<T> currentRoot) {
        if (currentRoot == null) {
            return null;
        }
        if (currentRoot.getLeft() == null) {
            return currentRoot;
        } else {
            return getMinNodeRec(currentRoot.getLeft());
        }
    }

    private boolean addRec(T newElement, TreeNode<T> currentRoot) {
        if (this.root == null) {
            this.root = new TreeNode<T>(newElement, null, null);
            return true;
        }

        if (newElement.compareTo(currentRoot.getElement()) == 0) {
            return false;
        }

        if (newElement.compareTo(currentRoot.getElement()) < 0) {
            if (currentRoot.getLeft() == null) {
                currentRoot.setLeft(new TreeNode<T>(newElement, null, null));
                return true;
            } else {
                addRec(newElement, currentRoot.getLeft());
                return true;
            }
        }

        if (newElement.compareTo(currentRoot.getElement()) > 0) {
            if (currentRoot.getRight() == null) {
                currentRoot.setRight(new TreeNode<T>(newElement, null, null));
                return true;
            } else {
                addRec(newElement, currentRoot.getLeft());
                return true;
            }
        }
        return false;
    }

    public void printLevel(int targetLevel) {
        System.out.println(this.root);
        printLevelRec(this.root);
    }

    private void printLevelRec(TreeNode<T> actualNode) {
        System.out.println(actualNode.getLeft());
        System.out.println(actualNode.getRight());

        if (actualNode.getLeft() != null) {
            printLevelRec(actualNode.getLeft());
        }
        if (actualNode.getRight() != null) {
            printLevelRec(actualNode.getRight());
        }
    }

    public T contains(T searchValue) {
        TreeNode<T> contains = contains(this.root, searchValue);
        return contains == null ? null : contains.getElement();
    }

    public TreeNode<T> contains(TreeNode<T> currentNode, T searchedValue) {
        if (searchedValue.equals(currentNode.getElement())) {
            return currentNode;
        } else if (currentNode.getLeft() != null && searchedValue.compareTo(currentNode.getElement()) < 0) {
            return contains(currentNode.getLeft(), searchedValue);
        } else if (currentNode.getRight() != null && searchedValue.compareTo(currentNode.getElement()) > 0) {
            return contains(currentNode.getRight(), searchedValue);
        }
        return null;
    }

    public void printPreOrder() {
        printRec(this.root);
    }

    private void printRec(TreeNode currentNode) {
        if (currentNode != null) {
            System.out.println(currentNode);
            if (currentNode.getLeft() != null) {

                printRec(currentNode.getLeft());
            }
            if (currentNode.getRight() != null) {
                printRec(currentNode.getRight());
            }

        }

    }
}
