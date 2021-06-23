package com.company.arrays;

// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//Return the running sum of nums.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Running_sum {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,1,1,1};
        int[] arr3 = {3,1,2,10,1};
        int[] runningSum1 = runningSumBruteForce(arr1);
        int[] runningSum2 = runningSumBruteForce(arr2);
        int[] runningSum3 = runningSumBruteForce(arr3);
        int[] runningSumOpti1 = runningSumOptimized(arr1);
        int[] runningSumOpti2 = runningSumOptimized(arr2);
        int[] runningSumOpti3 = runningSumOptimized(arr3);
        System.out.println("-------------O(n^2) -> Brute force -----------");
        System.out.println(Arrays.toString(runningSum1));
        System.out.println(Arrays.toString(runningSum2));
        System.out.println(Arrays.toString(runningSum3));
        System.out.println("-------------O(n) -> Optimized -----------");
        System.out.println(Arrays.toString(runningSumOpti1));
        System.out.println(Arrays.toString(runningSumOpti2));
        System.out.println(Arrays.toString(runningSumOpti3));
    }

    public static int[] runningSumBruteForce(int[] nums) {
        int[] sumArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += nums[j];
            }
            sumArr[i] = sum;
        }
        return sumArr;
    }

    public static int[] runningSumOptimized(int[] nums) {
        int[] sumArr = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sumArr[i] = sum;
        }
        return sumArr;
    }
}
