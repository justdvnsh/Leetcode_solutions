package com.company.matrices;

public class search_a_2d_matrix {
    public static void main(String[] args) {
        int[][] arr1 = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int[][] arr2 = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int[][] arr3 = {{5}};
        int[][] arr4 = {{1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14,15},
                        {16,17,28,19,20},
                        {21,22,23,24,25}};

        System.out.println(searchMatrix(arr1, 5));
        System.out.println(searchMatrix(arr2, 20));
        System.out.println(searchMatrix(arr3, -10));
        System.out.println(searchMatrix(arr4, 19));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int r = 0;
        int c= m-1;
        while(r<n &&c>=0){
            if(matrix[r][c]>target){
                c--;
            }
            else if(matrix[r][c]<target){
                r++;
            }
            else {return true;}
        }
        return false;
    }
}
