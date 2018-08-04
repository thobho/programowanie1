package com.sdacademy.day4.exercises;

//https://pl.spoj.com/problems/JSZYCER/
public class SzyfrCezara {

    public static void main(String[] args) {
        System.out.println(szyfruj("test", 100));
    }

    private static String szyfruj(String text, int offset){

        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            buffer.append((char)(text.charAt(i) + offset));
        }
        return buffer.toString();
    }
}
