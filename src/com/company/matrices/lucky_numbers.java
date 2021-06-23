package com.company.matrices;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lucky_numbers {
    public static void main(String[] args) {
        int[][] arr1 = {{3,7,8}, {9,11,13}, {15,16,17}};
        int[][] arr2 = {{1,10,4,2}, {9,3,8,7}, {15,16,17,12}};

        System.out.println(luckyNumbers(arr1));
        System.out.println(luckyNumbers(arr2));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> lucky = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> numsTemp = new ArrayList<>();
        for (int i =0; i < matrix.length; i++) {
            int min = matrix[i][0];
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) min = matrix[i][j];
            }
            nums.add(min);
        }
        for (int i =0; i < matrix[0].length; i++) {
            int max = matrix[0][i];
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] > max) max = matrix[j][i];
            }
            nums.add(max);
        }
        for (int el: nums) {
            int count = 0;
            if (numsTemp.contains(el)) lucky.add(el);
            else numsTemp.add(el);
        }
        return lucky;
    }
}
