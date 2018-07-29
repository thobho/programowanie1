package com.sdacademy.day3.lambdas;

public class MyConcerter {
    MyFunctionalInterface myFunctionalInterface;

    public MyConcerter(MyFunctionalInterface myFunctionalInterface) {
        this.myFunctionalInterface = myFunctionalInterface;
    }

    String convert(int input){
        return myFunctionalInterface.change(input);
    }

}
