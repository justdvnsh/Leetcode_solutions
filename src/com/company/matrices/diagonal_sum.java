package com.company.matrices;

public class diagonal_sum {
    public static void main(String[] args) {
        int[][] arr1 = {{1,1,1,1}, {1,1,1,1}, {1,1,1,1}, {1,1,1,1}};
        int[][] arr2 = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int[][] arr3 = {{1,1,1,1,1},
                        {1,1,1,1,1},
                        {1,1,1,1,1},
                        {1,1,1,1,1},
                        {1,1,1,1,1}};
        int[][] arr4 = {{1}};

        System.out.println(diagonalSum(arr1));
        System.out.println(diagonalSum(arr2));
        System.out.println(diagonalSum(arr3));
        System.out.println(diagonalSum(arr4));
    }

    public static int diagonalSum(int[][] mat){
        int sum=0;
        if (mat.length == 1) return mat[0][0];
        if (mat.length % 2 == 0) {
            int idx = 0;
            for (int i = 0; i < mat.length; i++) {
                sum += mat[i][idx];
                idx++;
            }
            for (int i = 0; i<mat.length; i++) {
                sum += mat[i][idx-1];
                idx--;
            }
        } else {
            int idx = 0;
            int middle = (mat.length + 1) / 2;
            for (int i = 0; i < mat.length; i++) {
                sum += mat[i][idx];
                idx++;
            }
            for (int i = 0; i < mat.length; i++) {
                if (i != middle - 1) {
                    sum += mat[i][idx-1];
                    idx--;
                } else idx--;
            }
        }
        return sum;
    }
}
