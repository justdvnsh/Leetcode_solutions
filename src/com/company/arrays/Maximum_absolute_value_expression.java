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
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList4 = new ArrayList<Integer>();

        for (int i=0; i < arr1.length; i++) {
            /*
             * Case 1 -> when
             * arr1[i] - arr1[j] > 0 && arr2[i] - arr2[j] > 0 && i - j > 0
             * */
            int case1 = 0;
            case1 = arr1[i] + arr2[i] + i;
            arrayList1.add(case1);

            /*
             * Case 2 -> when
             * arr1[i] - arr1[j] < 0 && arr2[i] - arr2[j] > 0 && i - j > 0
             * */
            int case2 = 0;
            case2 = arr1[i] - arr2[i] - i;
            arrayList2.add(case2);

            /*
             * Case 3 -> when
             * arr1[i] - arr1[j] > 0 && arr2[i] - arr2[j] > 0 && i - j < 0
             * */
            int case3 = 0;
            case3 = arr1[i] + arr2[i] - i;
            arrayList3.add(case3);

            /*
             * Case 1 -> when
             * arr1[i] - arr1[j] < 0 && arr2[i] - arr2[j] > 0 && i - j < 0
             * */
            int case4 = 0;
            case4 = arr1[i] - arr2[i] + i;
            arrayList4.add(case4);
        }

        int result1 = Math.max(
                findMax(arrayList1) - findMin(arrayList1),
                findMax(arrayList2) - findMin(arrayList2)
        );

        int result2 = Math.max(
                findMax(arrayList3) - findMin(arrayList3),
                findMax(arrayList4) - findMin(arrayList4)
        );

        return Math.max(result1, result2);
    }

    public static int findMax(ArrayList<Integer> arr) {
        int max = 0;
        for (Integer el: arr) {
            if (el > max) max = el;
        }
        return max;
    }

    public static int findMin(ArrayList<Integer> arr) {
        int min = 0;
        for (Integer el: arr) {
            if (el < min) min = el;
        }
        return min;
    }
}
