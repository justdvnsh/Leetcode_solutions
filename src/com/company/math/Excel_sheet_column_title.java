package com.company.math;

import java.lang.Math;

public class Excel_sheet_column_title {
    public static void main(String[] args) {
        System.out.println(convertToTitle(1));
        System.out.println(convertToTitle(2));
        System.out.println(convertToTitle(26));
        System.out.println(convertToTitle(27));
        System.out.println(convertToTitle(28));
        System.out.println(convertToTitle(701));
        System.out.println(convertToTitle(2147483647));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 26) {
            int n = columnNumber % 26;

            if (n==0) n = 26;
            sb.append((char)('A' + n-1));

            columnNumber = (columnNumber - n)/26;
        }
        sb.append((char)('A' + columnNumber - 1));
        return sb.reverse().toString();
    }
}
