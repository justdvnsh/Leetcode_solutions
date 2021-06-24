package com.company.math;

import java.lang.Math;

public class Excel_sheet_column_title {
    public static void main(String[] args) {
        System.out.println(convertToTitle(1));
        System.out.println(convertToTitle(2));
        System.out.println(convertToTitle(26));
        System.out.println(convertToTitle(27));
        System.out.println(convertToTitle(701));
        System.out.println(convertToTitle(2147483647));
    }

    public static String convertToTitle(int colNum) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int num = colNum;
        String result = "";
        while(num/26 > 0) {
            if (num%26 > 0) result = letters.charAt(num % 26 - 1) + result;
            else result = 'Z' + result;
            num = (int) (Math.ceil(num/26) - 1);
        }
        return result;
    }
}
