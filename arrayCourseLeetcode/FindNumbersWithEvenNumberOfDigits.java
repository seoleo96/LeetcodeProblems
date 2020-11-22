package com.company.leetcode.arrayCourseLeetcode;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {555, 901,800, 482, 1771};
        System.out.println(new FindNumbersWithEvenNumberOfDigits().findNumbers(arr));
    }

    public int findNumbers(int[] nums) {
        int countNumbers = 0;
        for (int num : nums) {
            int countDigits = 0;
            int temp = num;
            while (temp > 0) {
                countDigits++;
                temp /= 10;
            }
            if (countDigits % 2 == 0)
                countNumbers++;
        }
        return countNumbers;
    }
}
