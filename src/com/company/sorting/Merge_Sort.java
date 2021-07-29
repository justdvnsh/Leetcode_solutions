package com.company.sorting;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args){
        int[] arr1 = {38, 27, 43, 3, 9, 82, 10};

        mergeSort(arr1, 0, arr1.length - 1);
    }

    public static void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = (nums.length - 1) / 2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid+1, right);

            merge(nums, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        
    }
}
