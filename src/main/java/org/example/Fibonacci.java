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

    public int [] productFib(int product){
        int n = 0;
        int fn;
        int fn1;
        while(calculateFibonacci(n)*calculateFibonacci(n+1)<= product){
            fn = calculateFibonacci(n);
            fn1  =calculateFibonacci(n+1);
            if (checkIfInputIsTheProduct(fn, fn1, product)){
                return new int [] {fn, fn1, 1};
            }
            n++;
        }
        return new int [] {calculateFibonacci(n), calculateFibonacci(n+1), 0};
    }

    private boolean checkIfInputIsTheProduct(int fn, int fn1, int product){
        return fn*fn1 == product;
    }
}
