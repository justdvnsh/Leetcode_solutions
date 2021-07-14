package com.company.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
    public static List<List<Integer>> finalList = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr1 = {1,2,2};
        int[] arr2 = {0};

        System.out.println(subsets(arr1));
        System.out.println(subsets(arr2));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(nums);
        makeSubsets(nums, subset, 0);
        return finalList;
    }

    public static void makeSubsets(int[] nums, List<Integer> subset, int pos) {
        if (pos > nums.length) return;
        finalList.add(new ArrayList<>(subset));
        for (int i = pos; i < nums.length; i++) {
            if (pos != i && i > 0 && nums[i] == nums[i - 1]) continue;
            subset.add(nums[i]);
            makeSubsets(nums, subset, i + 1);
            subset.remove(subset.size() - 1);
        }
    }
}
