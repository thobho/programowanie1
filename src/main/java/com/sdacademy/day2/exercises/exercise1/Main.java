package com.sdacademy.day2.exercises.exercise1;

import java.util.LinkedList;

/*
Zapimlementuj metody listy wiązanej
około 2h
 */
public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");


        list.remove("c");

        System.out.println(list);
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
