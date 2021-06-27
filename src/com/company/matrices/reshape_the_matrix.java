package com.company.matrices;

import java.util.Arrays;

public class reshape_the_matrix {
    public static void main(String[] args){
        int[][] arr1 = {{1,2}, {3,4}};

        System.out.println(Arrays.deepToString(reshapeMatrix(arr1, 1, 4)));
        System.out.println(Arrays.deepToString(reshapeMatrix(arr1, 2, 4)));
    }

    public static int[][] reshapeMatrix(int[][] mat, int r, int c) {
        if (r*c != mat.length * mat[0].length) return mat;

        int[][] arr = new int[r][c];
        int ri = 0, ci = 0;

        for (int[] ints : mat) {
            for (int j = 0; j < mat[0].length; j++) {
                if (ci >= c) {
                    ci = 0;
                    ri++;
                }

                arr[ri][ci] = ints[j];
                ci++;
            }
        }

        return arr;
    }
}
