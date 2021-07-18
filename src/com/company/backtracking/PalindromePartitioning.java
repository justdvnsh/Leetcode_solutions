package com.company.backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    public static List<List<String>> finalList = new ArrayList<>();

    public static void main(String[] args){
        System.out.println(partition("aab"));
        System.out.println(partition("a"));
    }

    public static List<List<String>> partition(String s){
        palindromePartitioning(0, new ArrayList<String>(), s);
        return finalList;
    }

    public static void palindromePartitioning(int i, List<String> currentStringList, String s) {
        if (i >= s.length()) {
            finalList.add(new ArrayList<>(currentStringList));
            return;
        }
        for (int j = i; j < s.length(); j++) {
            if (isPalindrome(s, i, j)) {
                currentStringList.add(s.substring(i, j+1));
                palindromePartitioning(j+1, currentStringList, s);
                currentStringList.remove(currentStringList.size() - 1);
            }
        }
    }

    public static boolean isPalindrome(String s, int start, int end) {
        while(start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
