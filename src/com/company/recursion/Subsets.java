package com.company.recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static List<List<Integer>> finalList = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {0};

        System.out.println(subsets(arr1));
        System.out.println(subsets(arr2));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> presentSubset = new ArrayList<>();
        makeSubsets(nums, nums.length, 0, presentSubset);
        return finalList;
    }

    public static void makeSubsets(int[] arr, int N, int i, List<Integer> presentSubset) {
        if (i >= N) {
            finalList.add(presentSubset);
            return;
        }

        List<Integer> l2 = new ArrayList<Integer>(presentSubset);
        List<Integer> l3 = new ArrayList<Integer>(presentSubset);
        l2.add(arr[i]);
        makeSubsets(arr, N, i+1, l2);
        makeSubsets(arr, N, i+1, l3);
    }
}
