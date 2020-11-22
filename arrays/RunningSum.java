package com.company.leetcode.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RunningSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new RunningSum().runningSum(new int[]{1, 2, 3, 4})));
    }

    public int[] runningSum(int[] nums) {
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            nums[index++] = nums[i - 1] + nums[i];
        }
        return nums;
    }
}
//
//    public int[] runningSum(int[] nums) {
//        return IntStream.range(0,nums.length).map(i->i==0?nums[i]:(nums[i]+=nums[i-1])).toArray();
//
//    }


