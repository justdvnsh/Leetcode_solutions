package com.company.matrices;

import java.util.ArrayList;
import java.util.Set;

public class toeplitz_matrix {
    public static void main(String[] args){
        int[][] arr1 = {{1,2,3,4}, {5,1,2,3}, {9,5,1,2}};
        int[][] arr2 = {{1,2}, {1,2}};
        int[][] arr3 = {{84}};

        System.out.println(isToeplitzMatrix(arr1));
        System.out.println(isToeplitzMatrix(arr2));
        System.out.println(isToeplitzMatrix(arr3));
    }

    public static boolean isToeplitzMatrix(int[][] matrix){
        if (matrix.length == 1) return true;
        for (int i =0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                if (i > 0 && j > 0 && matrix[i-1][j-1]!=matrix[i][j]) return false;
            }
        }
        return true;
    }
}
