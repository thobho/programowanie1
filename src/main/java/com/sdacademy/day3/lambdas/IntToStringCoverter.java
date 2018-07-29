package com.sdacademy.day3.lambdas;

public class IntToStringCoverter implements MyFunctionalInterface {

    @Override
    public String change(int input) {
        return "Moj piekny int to" + input;
    }
}
