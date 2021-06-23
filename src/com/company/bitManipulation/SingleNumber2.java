package com.company.bitManipulation;

public class SingleNumber2 {
    public static void main(String[] args) {
        int[] arr1 = {2,2,3,2};
        int[] arr2 = {0,1,0,1,0,1,99};

        System.out.println(singleNumber2(arr1));
        System.out.println(singleNumber2(arr2));
    }

    public static int singleNumber2(int[] nums) {
        int el = 0;
        for (int i =0; i < 32; i++) {
            int sum = 0;
            for (int num : nums) {
                // counting the number of set bits at ith pos
                if ((num & (1 << i)) != 0) sum++;
            }

            // if the number of 1's is not a multiple of 3, then we'll be doing
            // OR operation with the element;
            if (sum%3==1) {
                el |= (1<<i);
            }
        }
        return el;
    }
}
