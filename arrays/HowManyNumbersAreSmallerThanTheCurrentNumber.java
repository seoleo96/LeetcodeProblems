package com.company.leetcode.arrays;

import com.company.DataStructure.Arrays.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                new HowManyNumbersAreSmallerThanTheCurrentNumber()
                        .smallerNumbersThanCurrent(new int[]{8,1,2,2,3})));
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {


        return nums;
    }

//    public int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] smallerNumbersThenCurrent = Arrays.copyOf(nums, nums.length);
//        Arrays.sort(nums);
//        ArrayList<Integer> helper =(ArrayList<Integer>) Arrays.stream(nums).boxed().collect(Collectors.toList());
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = helper.indexOf(smallerNumbersThenCurrent[i]);
//        }
//        return nums;
//    }
//    public int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] smallerNumbersThenCurrent = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            int count = 0;
//            for (Integer number : nums) {
//                count += nums[i] > number ? 1 : 0;
//            }
//            smallerNumbersThenCurrent[i] = count;
//        }
//        return smallerNumbersThenCurrent;
//    }
}
