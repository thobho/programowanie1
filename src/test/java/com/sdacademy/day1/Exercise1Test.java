package com.sdacademy.day1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise1Test {

    private Exercise1 exercise1;

    @Before
    public void setUp(){
        exercise1 = new Exercise1();
    }

    @Test(expected = IllegalArgumentException.class)
    public void power_shouldThrowExeption(){
        exercise1.factorial(0);
    }

    @Test
    public void power_shouldPower1(){
        int expected = exercise1.factorial(1);
        assertEquals(1, expected);
    }

    @Test
    public void power_shouldPower2(){
        int expected = exercise1.factorial(2);
        assertEquals(2, expected);
    }

    @Test
    public void power_shouldPower10(){
        int expected = exercise1.factorial(10);
        assertEquals(3628800, expected);
    }

    @Test
    public void power_shouldPowerBig(){
        int expected = exercise1.factorial(12);
        assertEquals(479001600, expected);
    }
}
