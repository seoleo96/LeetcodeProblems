package com.company.leetcode.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class PrintDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 5, 6, 7, 4};
        System.out.println(Arrays.toString(duplicateArrays(arr)));
        int[] a = duplicateArrays(arr);
        for (int i = 0; i<a[a.length-1]; i++) {
            System.out.print(a[i] + " ");
        }

        duplicateArray(arr);
    }

    static int[] duplicateArrays(int[] arr) {
        int[] dArr = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    dArr[index++] = arr[i];
                    break;
                }
            }
        }
        dArr[arr.length-1] = index;
        return dArr;
    }

    static void duplicateArray(int[] arr) {
        var set = new HashSet<Integer>();
        for (int value : arr) {
            if (set.contains(value)) {
                System.out.println("Array - " + value);
            } else {
                set.add(value);
            }
        }
    }
}
