package com.company.searching;

public class find_peak_element {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,1};
        int[] arr2 = {1,2,1,3,5,6,4};
        int[] arr3 = {2,1};
        int[] arr4 = {1,2};
        int[] arr5 = {3,4,3,2,1};

        System.out.println(findPeakElement(arr1));
        System.out.println(findPeakElement(arr2));
        System.out.println(findPeakElement(arr3));
        System.out.println(findPeakElement(arr4));
        System.out.println(findPeakElement(arr5));
    }

    public static int findPeakElement(int[] nums){
        int mid;
        if(nums.length==1) return 0;
        if(nums[0]>nums[1]) return 0;
        int n=nums.length;
        if(nums[n-1]>nums[n-2]) return n-1;
        int start=1,end=nums.length-2;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
                return mid;
            else if(nums[mid]<nums[mid+1])
                start=mid+1;
            else if(nums[mid]<nums[mid-1])
                end=mid-1;
        }
        return -1;
    }
}
