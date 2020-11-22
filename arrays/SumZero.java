package com.company.leetcode.arrays;

import java.util.Arrays;

public class SumZero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SumZero().sumZero(5)));
    }

    public int[] sumZero(int n) {
        int[] A = new int[n];
//        for (int i = 0; i < n; ++i)
//            A[i] = i * 2 - n + 1;
        for (int i = 0; i < n - 1; i += 2) {
            int temp = i - n;
            A[i] = temp;
            A[i+1] = -temp;
        }
        return A;

    }
}
