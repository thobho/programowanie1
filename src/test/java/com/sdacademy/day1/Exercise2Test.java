package com.sdacademy.day1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise2Test {

    private Exercise2 exercise2;

    @Before
    public void setUp(){
        exercise2 = new Exercise2();
    }

    @Test(expected = IllegalArgumentException.class)
    public void gcd_shouldThrowFirst(){
        exercise2.gcd(-1,1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void gcd_shouldThrowSecond(){
        exercise2.gcd(1,-1);
    }

    @Test
    public void gcd_shouldCalculate1(){
        int actual = exercise2.gcd(1, 2);
        assertEquals(1, actual);
    }

    @Test
    public void gcd_shouldCalculate2(){
        int actual = exercise2.gcd(5, 10);
        assertEquals(5, actual);
    }
}
