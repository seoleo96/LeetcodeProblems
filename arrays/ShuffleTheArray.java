package com.company.leetcode.arrays;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ShuffleTheArray().shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));
    }

    public int[] shuffle(int[] nums, int n) {
        int[] shuffleNums = new int[nums.length];
        int x = 0;
        int y = n-1;
        int index = 0;
        int length = n;

        while (length-->0){
            shuffleNums[index++] = nums[x++];
            shuffleNums[index++] = nums[++y];
        }
        return shuffleNums;
    }
}
