package com.company.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parenthesis {

    public static List<String> finalString = new ArrayList<>();
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args){
        System.out.println(generateParenthesis(1));
        System.out.println(generateParenthesis(2));
        System.out.println(generateParenthesis(3));
    }

    public static List<String> generateParenthesis(int n) {
        generate(n, 0, 0);
        return finalString;
    }

    public static void generate(int n, int open, int close) {
        if (open == n && close == n) {
            finalString.add(sb.toString());
            return;
        }

        if (open < n) {
            sb.append("(");
            generate(n, open + 1, close);
            sb.setLength(sb.length() - 1);
        }

        if (close < open) {
            sb.append(")");
            generate(n, open, close + 1);
            sb.setLength(sb.length() - 1);
        }
    }
}
