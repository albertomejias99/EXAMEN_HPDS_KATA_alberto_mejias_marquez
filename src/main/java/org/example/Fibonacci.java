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
        int [] res = new int [3];
        int n = 0;
        while(calculateFibonacci(n)*calculateFibonacci(n+1)<= product){
            if (calculateFibonacci(n)*calculateFibonacci(n+1) == product){
                res[0] = calculateFibonacci(n);
                res[1] = calculateFibonacci(n+1);
                res[2] = 1;
                return res;
            }
            n++;
        }
        res[0] = calculateFibonacci(n);
        res[1] = calculateFibonacci(n+1);
        res[2] = 0;
        return res;
    }
}
