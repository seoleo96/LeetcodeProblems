package com.company.leetcode.arrays;

public class MaxSumOfDigitsInArray {
    public static void main(String[] args) {
        int[] arr = {555, 901, 800, 482, 1771};
        System.out.println(findMaxSumDigits(arr));
    }

    static int findMaxSumDigits(int[] nums) {
        int maxSumDigits = 0;
        int maxSumDigitsOfNumber = 0;
        for (int num : nums) {
            int temp = num;
            int sumDigits = 0;
            while (temp > 0) {
                sumDigits += temp % 10;
                temp /= 10;
            }

            if (maxSumDigits < sumDigits) {
                maxSumDigits = sumDigits;
                maxSumDigitsOfNumber = num;
            }

        }
        return maxSumDigitsOfNumber;
    }
}
