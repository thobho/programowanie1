package com.sdacademy.day2.exercises.exercise1;

import java.util.LinkedList;

/*
Zapimlementuj metody listy wiązanej
około 2h
 */
public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(12);
        list.add(231);
        list.add(4324);
    }


    /*
    Mając daną listę napisz metodę, która usuwa wszystkie elementy, które są równe zadanemu (elem)
     */
    public <E> MyLinkedList<E> removeKFromList(MyLinkedList<E> linkedList, E elem){
        return null;
    }


    /*
    Sprawdź czy lista (z pakietu java.util) jest palidromem. Pamiętaj! LinkedList to lista wiązana w obu kierunkach.
     */
    public boolean isPalindrome(LinkedList linkedList){
        return false;
    }

    /*
    Sprawdź, czy podana lista jest palidromem. Pamiętaj! Twoja lista jest wiązana w jednym kierunku.
     */
    public <E> boolean isPalindrome(MyLinkedList<E> linkedList){
        return false;
    }

}
