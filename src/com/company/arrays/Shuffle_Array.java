package com.company.arrays;

import java.util.Arrays;

public class Shuffle_Array {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
//        shuffleArray(arr, 3);
        System.out.println(Arrays.toString(shuffleArray(arr, 3)));
    }

    // o(n) appraoch
    public static int[] shuffleArray(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int index = 0;
        for (int i=0; i<n; i++) {
            arr[index++] = nums[i];
            arr[index++] = nums[n+i];
        }
        return arr;
    }
}
