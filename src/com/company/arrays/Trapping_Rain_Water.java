package com.company.arrays;

import static java.lang.Math.min;

public class Trapping_Rain_Water {
    public static void main(String[] args) {
        int[] arr1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] arr2 = {4,2,0,3,2,5};
        System.out.println(trap(arr1));
        System.out.println(trap(arr2));
        System.out.println(trapOptimized(arr1));
        System.out.println(trapOptimized(arr2));
    }

    // O(n^2) appraoch -> Brute force
    public static int trap(int[] height) {
        int totalStoredWater = 0;
        for (int i=0; i<height.length; i++) {
            int left_max = findLeftMax(height, i);
            int right_max = findRightMax(height, i);
            int output = 0;
            if (left_max > 0 && right_max > 0) {
                output = Math.min(left_max, right_max) - height[i];
                if (output > 0) totalStoredWater += output;
            }
        }
        return totalStoredWater;
    }

    // O(n) approach -> Arrays
    public static int trapOptimized(int[] height) {
        int totalStoredWater = 0;
        int left_max = 0;
        int right_max = 0;
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        for (int i = 1; i < height.length; i++) {
            if (height[i-1] > left_max) left_max = height[i-1];
            leftMax[i] = left_max;
        }
        for (int i=height.length - 2; i >=0; i--) {
            if (height[i+1] > right_max) right_max = height[i+1];
            rightMax[i] = right_max;
        }

        for (int i =0; i<height.length; i++) {
            int output = Math.min(leftMax[i], rightMax[i]) - height[i];
            if (output > 0) totalStoredWater += output;
        }
        return totalStoredWater;
    }

    public static int findLeftMax(int[] arr, int idx) {
        int max = 0;
        for (int i=0; i<idx; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static int findRightMax(int[] arr, int idx) {
        int max=0;
        if (idx < arr.length - 1) {
            for (int i=idx+1; i<arr.length; i++) {
                if (arr[i] > max) max = arr[i];
            }
        }
        return max;
    }
}
