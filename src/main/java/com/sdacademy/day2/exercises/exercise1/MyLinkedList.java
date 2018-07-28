package com.sdacademy.day2.exercises.exercise1;

public class MyLinkedList<T> {
    private Node<T> head;
    private int size;

    public MyLinkedList() {

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

    public void push(T newElement) {
        if (head == null) {
            head = new Node<>(newElement, null);
            size++;
            return;
        }
        head = new Node<>(newElement, head);
        size++;
    }

    public void remove(T toRemove) {

        if (head == null){
            return;
        }

        if (toRemove.equals(head.getValue())) {
            head = head.getNext();
            size--;
            return;
        }

        Node<T> actual = head;

        while (actual.hasNext() ) {
            if(actual.getNext().getValue().equals(toRemove)){
                Node<T> nextNext = actual.getNext().getNext();
                actual.setNext(nextNext);
                size--;
                return;
            }
            actual = actual.getNext();

        }
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
