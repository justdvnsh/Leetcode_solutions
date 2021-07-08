package com.company.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_II {

    public static List<List<Integer>> finalList = new ArrayList<>();

    public static void main(String[] args){
        int[] arr1 = {10,1,2,7,6,1,5};
        int[] arr2 = {2,5,2,1,2};

        System.out.println(combinationSum2(arr1, 8));
        System.out.println(combinationSum2(arr2, 5));
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target){
        List<Integer> presentSubset =new ArrayList<>();
        Arrays.sort(candidates);
        returnSubsets(candidates, 0, 0, presentSubset, target);
        return finalList;
    }

    public static void returnSubsets(int[] arr, int sum, int i, List<Integer> presentSubset, int target) {
        int j;
        if (sum > target) return;
        if (sum == target) {
            finalList.add(new ArrayList<>(presentSubset));
            return;
        }

        for (j = i; j < arr.length; j++) {
            if (j != i && arr[j] == arr[j-1]) continue;
            presentSubset.add(arr[j]);
            returnSubsets(arr, sum + arr[j], j + 1, presentSubset, target);
            presentSubset.remove(presentSubset.size() - 1);
        }
    }
}
