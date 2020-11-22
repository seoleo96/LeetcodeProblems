package com.company.leetcode.arrayCourseLeetcode;

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
    }

    static void duplicateZeros(int[] arr) {
        int i = 0, sh = 0;
        for (i = 0; i < arr.length; i++) {
            if (i + sh > arr.length - 1)
                break;
            sh += arr[i] == 0 ? 1 : 0;
        }

        for (int j = i - 1; j >= 0; j--) {
            if (j + sh <= arr.length - 1)
                arr[j + sh] = arr[j];
            if (arr[j] == 0) {
                --sh;
                arr[j + sh] = arr[j];
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
