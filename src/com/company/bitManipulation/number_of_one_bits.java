package com.company.bitManipulation;

public class number_of_one_bits {
    public static void main(String[] args) {

    }

    public static int hammingWeight(int n) {
        int count = 0;
        for (int i =0; i < 32; i++) {
            if ((n & (1<<i)) == 1) count++;
        }
        return count;
    }
}
