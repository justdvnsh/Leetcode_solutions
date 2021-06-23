package com.company.matrices;

import java.util.*;

public class k_weakest_rows {
    public static void main(String[] args){
        int[][] arr1 = {{1,1,0,0,0}, {1,1,1,1,0}, {1,0,0,0,0}, {1,1,0,0,0}};
        int[][] arr2 = {{1,0,0,0}, {1,1,1,1}, {1,0,0,0}, {1,0,0,0}};

        System.out.println(Arrays.toString(kWeakestRows(arr1, 3)));
        System.out.println(Arrays.toString(kWeakestRows(arr2, 2)));
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        int arr[] = new int[mat.length];
        for(int i=0;i<mat.length;i++){
            int c=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == 1)
                    c++;
            }
            arr[i]=c;
        }
        int index=0;
        int weak[] = new int[k];

        for(int i=0;i<k;i++){
            int min=100;
            for(int j=0;j<arr.length;j++){
                if(arr[j] != -1 && arr[j]  < min){

                    min=arr[j];
                    index=j;

                }
            }
            arr[index]=-1;
            weak[i]=index;

        }


        return weak;
    }
}
