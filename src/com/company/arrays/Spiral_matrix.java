package com.company.arrays;

import java.util.Arrays;

public class Spiral_matrix {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(spiralMat(3)));
        System.out.println(Arrays.deepToString(spiralMat(4)));
    }

    // O(n^2) approach -> Layer by layer traversal
    public static int[][] spiralMat(int n) {
        int count = 1;
        int[][] result = new int[n][n];
        for (int i = 0; i < (n + 1) / 2; i++) {
            // left to right
            for (int ptr = i; ptr < n - i; ptr++) {
                result[i][ptr] = count++;
            }

            // top to down
            for (int ptr = i + 1; ptr < n - i; ptr++){
                result[ptr][n - i - 1] = count++;
            }

            // right to left
            for (int ptr = i + 1; ptr < n - i; ptr++){
                result[n - i - 1][n-ptr-1] = count++;
            }

            // ottom to top
            for (int ptr = i+1; ptr < n - i - 1; ptr++) {
                result[n - ptr - 1][i] = count++;
            }
        }

        return result;
    }
}
