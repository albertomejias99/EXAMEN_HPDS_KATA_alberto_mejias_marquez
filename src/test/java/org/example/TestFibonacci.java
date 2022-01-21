package org.example;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestFibonacci {
    private Fibonacci fibo;

    @Before
    public void setUp() {
        fibo = new Fibonacci();
    }

    @Test
    public void test_fibonacci_input_0_return_0() {
        int res = fibo.calculateFibonacci(0);
        assertEquals(0, res);
    }
    @Test
    public void test_fibonacci_input_1_return_1() {
        int res = fibo.calculateFibonacci(1);
        assertEquals(1, res);
    }
    @Test
    public void test_fibonacci_input_3_return_2() {
        int res = fibo.calculateFibonacci(3);
        assertEquals(2, res);
    }

    @Test
    public void test_fibonacci_input_8_return_21() {
        int res = fibo.calculateFibonacci(8);
        assertEquals(21, res);
    }


    @Test
    public void test_productFib_with_input_714(){
        int [] res = fibo.productFib(714);
        assertArrayEquals(new int[] {21,34,1}, res);
    }

    @Test
    public void test_productFib_with_input_800(){
        int [] res = fibo.productFib(800);
        assertArrayEquals(new int[] {34,55,0}, res);
    }

    @Test
    public void test_productFib_with_input_1870(){
        int [] res = fibo.productFib(1870);
        assertArrayEquals(new int[] {34,55,1}, res);
    }


}
