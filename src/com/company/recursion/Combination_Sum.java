package com.company.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum {

    public static List<List<Integer>> finalList = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr1 = {2,3,6,7};
        int[] arr2 = {2,3,5};
        int[] arr3 = {2};
        int[] arr4 = {1};

        System.out.println(combinationSum(arr1, 7));
        System.out.println(combinationSum(arr2, 8));
        System.out.println(combinationSum(arr3, 1));
        System.out.println(combinationSum(arr4, 1));
        System.out.println(combinationSum(arr4, 2));
    }

    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> subset = new ArrayList<>();
        findRequiredSum(nums, subset, target, 0, 0);
        return finalList;
    }

    public static void findRequiredSum(int[] nums, List<Integer> subset, int target, int pos, int sum) {
        if (target == sum) finalList.add(new ArrayList<>(subset));
        if (pos >= nums.length || sum > target) return;

        for (int i = pos; i < nums.length; i++) {
            subset.add(nums[i]);
            findRequiredSum(nums, subset, target, i, sum + nums[i]);
            subset.remove(subset.size() - 1);
        }
    }
}
