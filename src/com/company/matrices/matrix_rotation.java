package com.company.matrices;

import java.util.Arrays;

public class matrix_rotation {
    public static void main(String[] args){

    }

    public boolean findRotation(int[][] mat, int[][] target) {
        int size = mat.length;
        if (Arrays.deepEquals(mat, target)) return true;
        boolean rot90 = true, rot180 = true, rot270 = true;

        // check if the matrix is rotated by 90 deg
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (mat[i][j] != target[j][size - 1 - i]) {
                    rot90 = false;
                    break;
                }
            }
        }

        if (rot90) return true;

        // check if the matrix is rotated by 180 deg
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (mat[i][j] != target[size - 1 - i][size - 1 - j]) {
                    rot180 = false;
                    break;
                }
            }
        }

        if (rot180) return true;

        // check if the matrix is rotated by 270 deg
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (mat[i][j] != target[size - 1 - j][i]) {
                    rot270 = false;
                    break;
                }
            }
        }

        if (rot270) return true;

        return false;
    }
}
