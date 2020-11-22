package com.company.leetcode.arrayCourseLeetcode;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums1 = {1, 7, 8, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 4, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
       m--;
       n--;
       int index = nums1.length-1;
       while(index>=0){
           if(m<0){
               nums1[index] = nums2[n];
               n--;
           }else if(n<0){
               nums1[index] = nums1[m];
               m--;
           }else{
               if (nums1[m]>nums2[n]){
                   nums1[index] = nums1[m];
                   m--;
               }
               else{
                   nums1[index] = nums2[n];
                   n--;
               }
           }

           index--;
       }
        System.out.println(Arrays.toString(nums1));
    }
}
