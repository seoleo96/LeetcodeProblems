package com.company.leetcode.arrays;

import java.util.Arrays;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && j < nums2.length-1) {
                    arr(nums2, nums1[i]);
                }
                else{
                    nums1[i] = nums2[j];
                }
            }
        }
        return nums1;
    }
     static void arr(int[] nums2, int x){

     }

}
