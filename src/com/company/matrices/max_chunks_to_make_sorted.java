package com.company.matrices;

public class max_chunks_to_make_sorted {
    public static void main(String[] args) {
        int[] arr1 = {4,3,2,1,0};
        int[] arr2 = {1,0,2,3,4};
        int[] arr3 = {5,4,3,2,1};
        int[] arr4 = {2,1,3,4,4};

        System.out.println(maxChunksToSorted(arr1));
        System.out.println(maxChunksToSorted(arr2));
        System.out.println(maxChunksToSorted(arr3));
        System.out.println(maxChunksToSorted(arr4));
    }

    public static int maxChunksToSorted(int[] arr){
        int[] lMin = new int[arr.length + 1];
        int val  = Integer.MAX_VALUE;
        lMin[arr.length] = val;
        for (int i = arr.length - 1; i >= 0; i--) {
            val = Math.min(arr[i], val);
            lMin[i] = val;
        }

        int lMax = arr[0], count = 0;
        for (int i = 0; i < arr.length; i++) {
            lMax = Math.max(lMax, arr[i]);
            if (lMax <= lMin[i+1]) count++;
        }

        return count;
    }
}
