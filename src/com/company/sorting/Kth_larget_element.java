package com.company.sorting;

import java.util.Arrays;

public class Kth_larget_element {
    public static void main(String[] args) {
        int[] arr1 = {3,2,1,5,6,4};
        int[] arr2 = {3,2,3,1,2,4,5,5,6};

        System.out.println(kLargest(arr1, 2));
        System.out.println(kLargest(arr2, 4));
    }

    public static int kLargest(int[] nums, int k) {
        Arrays.sort(nums);
        if (k > nums.length) return -1;
        return nums[nums.length - k];
    }
}
