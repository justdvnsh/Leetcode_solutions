package com.company.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PermutationsII {

    public static List<List<Integer>> finalList = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr1 = {1,1,2};
        int[] arr2 = {1,2,3};

        System.out.println(permuteUnique(arr1));
        System.out.println(permuteUnique(arr2));
    }

    public static List<List<Integer>> permuteUnique(int[] nums){
        make_permutation(nums, 0);
        return finalList;
    }

    public static void make_permutation(int[] nums, int pos) {
        List<Integer> elementalArrayList = new ArrayList<>();

        if (pos >= nums.length) {
            for (int num : nums) elementalArrayList.add(num);
            finalList.add(elementalArrayList);
            return;
        }

        HashSet<Integer> hs = new HashSet<>();
        hs.add(nums[pos]);

        for (int i = pos; i < nums.length; i++) {

            if (hs.contains(nums[i]) && i != pos) continue;
            hs.add(nums[i]);
            swap(nums, pos, i);
            make_permutation(nums, pos + 1);
            swap(nums, pos, i);
        }
    }

    public static int[] swap(int[] nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
        return nums;
    }
}
