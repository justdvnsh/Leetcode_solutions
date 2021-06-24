package com.company.searching;

public class search_in_rotated_sorted_array {
    public static void main(String[] args){
        int[] arr1 = {4,5,6,7,0,1,2};
        int[] arr2 = {1};

        System.out.println(search(arr1, 0));
        System.out.println(search(arr1, 3));
        System.out.println(search(arr2, 0));
        System.out.println(search(arr2, 1));
    }

    public static int search(int[] nums, int target) {
        int index = 1;
        int low = 0;
        int high = nums.length - 1;

        if (low > high) return -1;
        if (target == nums[0]) return 0;

        while(low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > nums[0]) low = mid + 1;
            if (nums[mid] < nums[0]) high = mid - 1;
            if (nums[mid] == target) index = mid;
        }
        return index;
    }
}
