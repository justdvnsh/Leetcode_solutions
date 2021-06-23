package com.company.matrices;

public class matrix_rotation {
    public static void main(String[] args){

    }

    public boolean findRotation(int[][] mat, int[][] target) {
        if (equalMatrix(mat, target)) return true;
        boolean found = true;
        int[][] temp = new int[mat.length][mat.length];
        int count = 4;
        while(count < 4) {

        }
        return found;
    }

    public boolean equalMatrix(int[][] mat, int[][] target) {
        for (int i =0; i < mat.length; i++) {
            for (int j =0; j < mat.length; j++) {
                if (mat[i][j] != target[i][j]) return false;
            }
        }
        return true;
    }
}
