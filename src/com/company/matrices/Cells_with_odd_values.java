package com.company.matrices;

import java.util.Arrays;

public class Cells_with_odd_values {
    public static void main(String[] args){
        int[][] arr1 = {{0,1}, {1,1}};
        int[][] arr2 = {{1,1}, {0,0}};
        int[][] arr3 = {{0,0}, {0,0}};
        System.out.println(oddCells(2,3, arr1));
        System.out.println(oddCells(2,2, arr2));
        System.out.println(oddCells(1,1, arr3));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int oddCells = 0;
        int[][] mat = new int[m][n];
        for (int[] index : indices) {
            for (int j = 0; j < n; j++) {
                mat[index[0]][j] += 1;
            }
            for (int x = 0; x < m; x++) {
                mat[x][index[1]] += 1;
            }
        }
        for (int[] list: mat) {
            for (int el: list) {
                if (el % 2 != 0) oddCells++;
            }
        }
        System.out.println(Arrays.deepToString(mat));
        return oddCells;
    }
}
