package com.sdacademy.day6;

import java.util.BitSet;
import java.util.EnumMap;
import java.util.EnumSet;


public class BitSetTutorial {


    public static void main(String[] args) {
        BitSet four = new BitSet();

        BitSet two = new BitSet();
        two.set(1);

        four.or(two);

        System.out.println(four);


        EnumSet<Colors> colors = EnumSet.allOf(Colors.class);


        EnumSet<Colors> of = EnumSet.of(Colors.GREEN, Colors.BLUE);



        EnumMap<Colors, String> enumMap = new EnumMap<>(Colors.class);
        enumMap.put(Colors.GREEN, "zielony");


    }


    private enum Colors {
        WHITE, GREEN, BLUE
    }
}
