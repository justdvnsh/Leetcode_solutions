package com.company.arrays;

import java.util.Arrays;

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
        int min = nums[0], max = nums[0], n = nums.length;
        for (int x : nums) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        if (min == max) return 0;
        // since max gap can be >= Math.ceil((double) (max - min) / (n - 1))
        int bucketSize = (int) Math.ceil((double) (max - min) / (n - 1));
        // creating n buckets with each bucket of size bucketSize
        int[] minBucket = new int[n];
        int[] maxBucket = new int[n];
        Arrays.fill(minBucket, Integer.MIN_VALUE);
        Arrays.fill(maxBucket, Integer.MAX_VALUE);
        for (int x : nums) {
            int idx = (x - min) / bucketSize;
            minBucket[idx] = Math.min(x, minBucket[idx]);
            maxBucket[idx] = Math.max(x, maxBucket[idx]);
        }
        int maxGap = bucketSize;
        int prev = maxBucket[0];
        for (int i = 0; i < n; i++) {
            if (minBucket[i] == Integer.MIN_VALUE) continue;
            maxGap = Math.max(maxGap, minBucket[i] - prev);
            prev = maxBucket[i];
        }

        return maxGap;
    }
}
