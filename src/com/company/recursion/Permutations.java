package com.company.recursion;

import java.util.*;

public class Permutations {

    public static ArrayList<List<Integer>> finalList = new ArrayList();

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {0,1};
        int[] arr3 = {1};

        System.out.println(permute(arr1));
        System.out.println(permute(arr2));
        System.out.println(permute(arr3));
    }

    public static List<List<Integer>> permute(int[] nums) {
        make_permutations(nums, 0);
        return finalList;
    }

    public static void make_permutations(int[] nums, int pos) {
        ArrayList<Integer> elementalArrayList  = new ArrayList<>();

        if (pos >= nums.length) {
            for(int i = 0; i < nums.length; i++) elementalArrayList.add(nums[i]);
            finalList.add(elementalArrayList);
            return;
        }

        for (int i = pos; i < nums.length; i++) {
            swap(nums, pos, i);
            make_permutations(nums, pos + 1);
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
