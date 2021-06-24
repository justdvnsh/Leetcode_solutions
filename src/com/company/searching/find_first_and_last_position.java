package com.company.searching;

import java.util.Arrays;

public class find_first_and_last_position {
    public static void main(String[] args){
        int[] arr1 = {5,7,7,8,8,10};
        int[] arr2 = {};
        int[] arr3 = {1};
        System.out.println(Arrays.toString(searchRange(arr1, 8)));
        System.out.println(Arrays.toString(searchRange(arr1, 6)));
        System.out.println(Arrays.toString(searchRange(arr1, 10)));
        System.out.println(Arrays.toString(searchRange(arr2, 0)));
        System.out.println(Arrays.toString(searchRange(arr3, 1)));
        System.out.println(Arrays.toString(searchRange(arr3, 0)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = FindFirstOccurrence(nums, target);
        arr[1] = FindLastOccurrence(nums, target);
        return arr;
    }

    public static int FindFirstOccurrence(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int first = -1;
        if (low > high) return -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if (target < nums[mid]) high = mid - 1;

            if (target > nums[mid]) low = mid + 1;

            if (nums[mid] == target) {
                first = mid;
                high = mid - 1;
            }
        }
        return first;
    }

    public static int FindLastOccurrence(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int last = -1;
        if (low > high) return -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if (target < nums[mid]) high = mid - 1;

            if (target > nums[mid]) low = mid + 1;

            if (nums[mid] == target) {
                last = mid;
                low = mid + 1;
            }
        }
        return last;
    }
}
