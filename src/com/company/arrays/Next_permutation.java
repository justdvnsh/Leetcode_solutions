package com.company.arrays;

import java.util.Arrays;
import java.util.Collections;

public class Next_permutation {
    public static void main(String[] args){
        int[] arr1 = {1,2,3};
        int[] arr2 = {3,2,1};
        int[] arr3 = {1,1,5};
        int[] arr4 = {1};
        int[] arr5 = {1,2};
        int[] arr6 = {1,3,2};

        nextPermutation(arr1);
        nextPermutation(arr2);
        nextPermutation(arr3);
        nextPermutation(arr4);
        nextPermutation(arr5);
        nextPermutation(arr6);
    }

    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i,j);
        }
        reverse(nums, i + 1);

        System.out.println(Arrays.toString(nums));
    }

    private static void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

}
