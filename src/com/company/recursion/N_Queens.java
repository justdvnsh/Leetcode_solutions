package com.company.recursion;

import java.util.ArrayList;
import java.util.List;

public class N_Queens {

    public static List<List<String>> finalList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
        System.out.println(solveNQueens(1));
    }

    public static List<List<String>> solveNQueens(int n) {
        char queen[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                queen[i][j] = '.';
            }
        }
        solveQueen(queen, 0, n);
        return finalList;
    }

    public static void solveQueen(char[][] queen, int i, int n) {
        if (i >= n) {
            int r1, c1;
            List<String> res1 = new ArrayList<>();
            for (r1 = 0; r1 < n; r1++) {
                String temp = "";
                for(c1 = 0; c1 < n; c1++) temp += queen[r1][c1];
                res1.add(temp);
            }

            finalList.add(res1);
            return;
        }

        int c;
        for (c = 0; c < n; c++) {
            if (isValid(queen, i, c, n)) {
                queen[i][c] = 'Q';
                solveQueen(queen, i+1, n);
                queen[i][c] = '.';
            }
        }
    }

    public static boolean isValid(char[][] queen, int i, int j, int n) {
        int r, c;

        // checking for col
        r = i-1; c = j;
        while(r >= 0 && c >= 0) {
            if (queen[r][c] == 'Q') return false;
            r--;
        }

        // checking for row
        r = i; c = j - 1;
        while(r >= 0 && c >= 0) {
            if (queen[r][c] == 'Q') return false;
            c--;
        }

        // checking for left diagonal
        r = i-1; c = j - 1;
        while(r >= 0 && c >= 0) {
            if (queen[r][c] == 'Q') return false;
            r--; c--;
        }

        // checking for right diagonal
        r = i-1; c = j+1;
        while(r >= 0 && c >= 0 && r < n && c < n) {
            if (queen[r][c] == 'Q') return false;
            r--; c++;
        }

        return true;
    }
}
