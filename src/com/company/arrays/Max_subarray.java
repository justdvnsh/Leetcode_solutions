package com.company.arrays;

public class Max_subarray {
    public static void main(String[] args) {
        int[] arr1 = {-2,1,-3,4,-1,2,1,-5,4};
        int[] arr2 = {1};
        int[] arr3 = {5,4,-1,7,8};
        int[] arr4 = {-1};
        int[] arr5 = {-1,3};
        int[] arr6 = {-2,-1};

        System.out.println(maxSubArray(arr1));
        System.out.println(maxSubArray(arr2));
        System.out.println(maxSubArray(arr3));
        System.out.println(maxSubArray(arr4));
        System.out.println(maxSubArray(arr5));
        System.out.println(maxSubArray(arr6));
    }

    /*
    * O(n) approach - sliding window
    * */
    public static int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int max = -99999999;
        int sum = 0;
        for (int el: nums) {
            sum += el;
            if (sum > max) max = sum;
            if (sum < 0) sum = 0;
        }
        return max;
    }
}
