package com.sdacademy.day1;

/*
Proszę wymyślić i napisać rekursywną metodę, która będzie sprawdzać, czy podany ciąg znaków jest palindromem.
 */
public class Exercise7 {
    private static boolean isPalindrom(String str) {
        if(str.length() == 1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(reverse("abcdefg"));
    }

    private static String reverse(String str){
        if(str.length() == 1){
            return str;
        }
        if(str.length() == 2){
            return str.substring(1,2) + str.substring(0,1);
        }
        return str.substring(str.length()-1, str.length())
                + reverse(str.substring(1, str.length()-2))
                + str.substring(0,1);
    }
}
