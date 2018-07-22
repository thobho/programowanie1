package com.sdacademy.day1.solutions;

public class Exercise7 {

    private static boolean isPalindrom(String str) {
        if (str.length() == 0 || str.length() == 1){
            return true;
        } else {
            if (str.charAt(0) != str.charAt(str.length() - 1)){
                return false;
            } else {
                return isPalindrom(str.substring(1, str.length()-1));
            }
        }
    }


    public static void main(String[] args) {

        String palindrome = "pętaka pętaj a tępaka tęp"
                .replace(" ", "");

        System.out.println(isPalindrom(palindrome));
    }

}
