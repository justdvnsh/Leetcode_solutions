package com.company.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Maximum_absolute_value_expression {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {-1,4,5,6};
        int[] arr3 = {1,-2,-5,0,10};
        int[] arr4 = {0,-2,-1,-7,-4};
        int[] arr5 = {1,-2};
        int[] arr6 = {8,8};

//        System.out.println(maxAbsvalExp(arr1, arr2));
//        System.out.println(maxAbsvalExp(arr3, arr4));
        System.out.println(maxAbsValExpOptimized(arr1, arr2));
        System.out.println(maxAbsValExpOptimized(arr3, arr4));
        System.out.println(maxAbsValExpOptimized(arr5, arr6));
    }

    // O(n^2) approach -> Brute force
    public static int maxAbsvalExp(int[] arr1, int[] arr2) {
        int max = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j=i; j < arr1.length; j++) {
                int val = Math.abs(arr1[i] - arr1[j]) + Math.abs(arr2[i] - arr2[j]) + Math.abs(i - j);
                if (val > max) max = val;
            }
        }
        return max;
    }

    // O(n) approach -> Simplyfying the expression
    public static int maxAbsValExpOptimized(int[] arr1, int[] arr2) {
        int[] signs = new int[] {-1, 1};
        int best = 0;
        for (int s1 : signs) {
            for (int s2 : signs) {
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for (int i = 0; i < arr1.length; i++) {
                    int val = s1 * arr1[i] + s2 * arr2[i] + i;
                    min = Math.min(val, min);
                    max = Math.max(val, max);
                }
                best = Math.max(max - min, best);
            }
        }
        return best;
    }
}
