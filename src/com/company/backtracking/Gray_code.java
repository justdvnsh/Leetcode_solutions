package com.company.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Gray_code {
    public static void main(String[] args) {
        System.out.println(grayCode(2));
        System.out.println(grayCode(1));
    }

    public static List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        List<String> seq = getSequence(n);
        for (int i = 0; i < seq.size(); i++) result.add(Integer.parseInt(seq.get(i), 2));
        return result;
    }

    public static List<String> getSequence(int n) {
        if (n == 1) {
            List<String> list = new ArrayList<>();
            list.add("0");
            list.add("1");
            return list;
        }

        List<String> list2 = getSequence(n-1);
        List<String> list3 = new ArrayList<>();

        // adding 0 to the each item
        for (int i = 0; i < list2.size(); i++) {
            String temp = list2.get(i);
            list3.add("0" + temp);
        }

        // adding 1 to the each item
        for (int i = list2.size() - 1; i >= 0; i--) {
            String temp = list2.get(i);
            list3.add("1" + temp);
        }

        return list3;
    }
}
