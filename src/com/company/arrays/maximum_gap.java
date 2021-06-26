package com.company.arrays;

public class maximum_gap {
    public static void main(String[] args) {
        int[] arr1 = {3,6,9,1};
        int[] arr2 = {10};
        int[] arr3 = {1,3,100};
        int[] arr4 = {100,3,2,1};

        System.out.println(maxGap(arr1));
        System.out.println(maxGap(arr2));
        System.out.println(maxGap(arr3));
        System.out.println(maxGap(arr4));
    }

    public static int maxGap(int[] nums) {
        int gap = 0;
        if (nums.length == 1) return 0;
        if (nums.length == 2) return nums[1] - nums[0];
        for (int i = 0; i <= nums.length - 2; i++) {
            System.out.println("nums[i + 1] = " + nums[i + 1] + " nums[i] = " + nums[i]);
            if (nums[i + 1] - nums[i] > gap) gap = nums[i + 1] - nums[i];
        }
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] - nums[i] > gap) gap = nums[i - 1] - nums[i];
        }
        return gap;
    }
}
