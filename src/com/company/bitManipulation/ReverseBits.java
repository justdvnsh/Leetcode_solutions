package com.company.bitManipulation;

public class ReverseBits {
    public static void main(String[] args) {
    }

    public static int reverseBits(int n) {
        int num = 0;
        for (int i = 1; i < 32; i++) {
            num += (n & 1) << i;
        }
        return num;
    }
}
