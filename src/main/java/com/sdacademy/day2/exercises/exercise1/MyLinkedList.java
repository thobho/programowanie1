package com.sdacademy.day2.exercises.exercise1;

public class MyLinkedList<T> {
    private Node<T> head;
    private int size;

    public MyLinkedList() {
        this.head = null;
    }

    public MyLinkedList(T newElement) {
        head = new Node<>(newElement, null);
        size++;
    }

    public void add(T newElement) {
        if (head == null) {
            head = new Node<>(newElement, null);
            size++;
            return;
        }
        Node<T> currentNode = head;
        while (currentNode.hasNext()) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(new Node<>(newElement, null));
        size++;
    }

    public void push(T element) {
        //dodwanie nowego elementu na początku listy
    }

    public void remove(T element) {
        //usuwanie elementu, jeżeli istnieje w liście
    }

    public void remove(int index) {
        //usuwanie elementu na podanym indexie
    }

    public void insert(T element, int index) {
        //dodwanie elementu na pozycji wskazanej, przez index. wyjątek jeżeli index>size
    }

    public boolean hasElement(T element) {
        //sprawdzanie, czy elemnt znajduje się na liście
        return false;
    }


}
