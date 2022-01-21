package org.example;

public class Fibonacci {
    private final int f0 = 0;
    private final int f1 = 1;


    public int calculateFibonacci(int i) {
        if (i == 0) return f0;
        if (i == 1) return f1;
        else{
            return calculateFibonacci(i-1) + calculateFibonacci(i-2);
        }
    }

    
}
