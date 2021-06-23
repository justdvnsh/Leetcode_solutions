package com.company.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Set_matrix_zeros {
    public static void main(String[] args) {
        int[][] mat1 = {{1,1,1}, {1,0,1}, {1,1,1}};
        int[][] mat2 = {{0,1,2,0}, {3,4,5,2}, {1,3,1,5}};

        setZeroMatrix(mat1);
        setZeroMatrix(mat2);
    }

    // O(m+n) space approach -> in place;
    public static void setZeroMatrix(int[][] matrix) {
        ArrayList<Integer> listContainingZero = new ArrayList<Integer>();
        ArrayList<Integer> indexOfZero = new ArrayList<Integer>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    listContainingZero.add(i);
                    indexOfZero.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            if (listContainingZero.contains(i)) Arrays.fill(matrix[i], 0);
            else {
                for (int j = 0; j < matrix[i].length; j++) {
                    for (int el: indexOfZero) {
                        if (el == j) matrix[i][j] = 0;
                    }
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
