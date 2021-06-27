package com.company.math;

public class rectangle_overlap {
    public static void main(String[] args) {

    }

    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        // checking if the rect is a line
        if (rec1[0] == rec2[2] || rec1[1] == rec1[3] ||
        rec2[0] == rec2[2] || rec2[1] == rec2[3]) return false;

        return !(rec1[2] <= rec2[0] ||
                rec1[3] <= rec2[1] ||
                rec1[0] >= rec2[2] ||
                rec1[1] >= rec2[3]);
    }
}
