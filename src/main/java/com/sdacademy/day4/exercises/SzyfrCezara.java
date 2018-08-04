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
















    public static String charTurorial(String toCode, int offset){
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < toCode.length(); i++) {
            char selectChar = toCode.charAt(i);
            int incrementedChar = selectChar + 1;
            stringBuffer.append(incrementedChar);
        }
        return stringBuffer.toString();
    }

    public static String charTurorial2(String toCode, int offset){

        //obsłuzyć offset wykraczający poza zakre charów

        StringBuffer stringBuffer = new StringBuffer();
        char[] chars = toCode.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] + 1);
        }
        return new String();
    }





















}
