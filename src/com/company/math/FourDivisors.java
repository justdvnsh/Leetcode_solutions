package com.company.math;

import java.util.ArrayList;

public class FourDivisors {
    public static void main(String[] args){
        int[] arr1 = {21,4,7};

        System.out.println(sumFourDivisors(arr1));
    }

    public static int sumFourDivisors(int[] nums) {
        int sum=0;
        for (int el : nums) {
            // if the element has 4 divisors, add all the divisors
            sum += checkFourDivisors(el); 
        }
        return sum;
    }

    public static int checkFourDivisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.floor(Math.sqrt(n)); i++) {
            if (n % i == 0) {
                if (i != n / i) {
                    divisors.add(i);
                    divisors.add(n / i);
                } else divisors.add(i);
            }
        }

        int sum=0;
        if (divisors.size() == 4) {
            for (int i=0; i<divisors.size(); i++) {
                sum += divisors.get(i);
            }
        }
        return sum;
    }
}
