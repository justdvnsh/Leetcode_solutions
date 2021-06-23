package com.company.matrices;

public class count_negative_numbers {
    public static void main(String[] args){
        int[][] arr1 = {{4,3,2,-1},
                        {3,2,1,-1},
                        {1,1,-1,-2},
                        {-1,-1,-2,-3}};

        int[][] arr2 = {{3,2}, {1,0}};
        int[][] arr3 = {{1,-1}, {-1, -1}};
        int[][] arr4 = {{-1}};
        int[][] arr5 = {{5,1,0},
                        {-5,-5,-5}};
        int[][] arr6 = {{7,-3}};

        System.out.println(countNeg(arr1));
        System.out.println(countNeg(arr2));
        System.out.println(countNeg(arr3));
        System.out.println(countNeg(arr4));
        System.out.println(countNeg(arr5));
        System.out.println(countNeg(arr6));
    }

    // O(n^2) -> optimized
    public static int countNeg(int[][] mat) {
        if (mat[0].length == 1) {
            if (mat[0][0] < 0) return 1;
            else return 0;
        }

        int count = 0;
        int idx = mat[0].length - 1;

        for (int i = 0; i < mat.length; i++) {
            for (int j = idx; j >=0; j--) {
//                System.out.println("Comparing " + i + " and " + j);
                if (mat[i][j] < 0) {
                    count += mat.length - i;
                    idx--;
                }
//                System.out.println("Count is " + count);
            }
        }

        return count;
    }
}
