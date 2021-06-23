package com.company.matrices;

import java.util.Arrays;

public class transpose_matrix {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] arr2 = {{1,2,3}, {4,5,6}};
        int[][] arr3 = {{2,4,-1}, {-10,5,11}, {18,-7,6}};

        System.out.println(Arrays.deepToString(transpose(arr1)));
        System.out.println(Arrays.deepToString(transpose(arr2)));
        System.out.println(Arrays.deepToString(transpose(arr3)));
    }

    public static int[][] transpose(int[][] matrix){
        int[][] mat = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                mat[j][i] = matrix[i][j];
            }
        }
        return mat;
    }
}
