package com.company.leetcode.arrayCourseLeetcode;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        System.out.println(new MaxConsecutiveOnes().findMaxConsecutiveOnes(arr));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                maxCount = Math.max(count, maxCount);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }
}
