package com.company.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Longest_subArray_of_Non_negative_ints {
    public static void main(String[] args){
        int[] arr1 = {2, 3, 4, -1, -2, 1, 5, 6, 3};
        int[] arr2 = {1, 0, 0, 1, -1, -1, 0, 0, 1, 0};

        System.out.println(longestSubArray(arr1));
        System.out.println(longestSubArray(arr2));
    }

    public static int longestSubArray(int[] nums) {
        int max = -9999;
        for (int i=0; i<nums.length; i++) {
            ArrayList<Integer> a = new ArrayList<>();
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < 0) break;
                else a.add(nums[j]);
            }
            if (a.size() > max) max = a.size();
        }

        return max;
    }
}
