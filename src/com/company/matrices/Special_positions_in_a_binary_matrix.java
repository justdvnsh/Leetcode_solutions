package com.company.matrices;

import java.util.Arrays;

public class Special_positions_in_a_binary_matrix {
    public static void main(String[] args){
        int[][] arr1 = {{1,0,0}, {0,0,1}, {1,0,0}};
        int[][] arr2 = {{1,0,0}, {0,1,0}, {0,0,1}};
        int[][] arr3 = {{0,0,0,1}, {1,0,0,0}, {0,1,1,0}, {0,0,0,0}};
        int[][] arr4 = {{0,0,0,0,0}, {1,0,0,0,0}, {0,1,0,0,0}, {0,0,1,0,0}, {0,0,0,1,1}};

        System.out.println(specialNum(arr1));
        System.out.println(specialNum(arr2));
        System.out.println(specialNum(arr3));
        System.out.println(specialNum(arr4));
    }

    public static int specialNum(int[][] mat){
        int count = 0;
        int[] rows = new int[mat.length];
        int[] cols = new int[mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    rows[i] += 1;
                    cols[j] += 1;
                }
            }
        }

        for (int i = 0; i < rows.length; i++) {
            if (rows[i] == 1) {
                for (int j =0; j < cols.length; j++) {
                    if (mat[i][j] == 1) {
                        count += (cols[j] == 1) ? 1 : 0;
                        break;
                    }
                }
            }
        }
        return count;
    }
}
