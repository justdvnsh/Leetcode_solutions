package com.company.math;

public class Factorial_trailing_zeroes {
    public static void main(String[] args){
        System.out.println(trailingZeros(3));
        System.out.println(trailingZeros(4));
        System.out.println(trailingZeros(5));
        System.out.println(trailingZeros(10));
    }

    public static int trailingZeros(int n) {
        int count = 0;
        for (int i = 5; i <= n; i*=5) {
            count += (n/i);
        }
        return count;
    }
}
