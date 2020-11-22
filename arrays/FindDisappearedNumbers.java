package com.company.leetcode.arrays;

import com.company.DataStructure.Arrays.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        List<Integer> list = new FindDisappearedNumbers().findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        list.forEach(System.out::print);
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> missingNumbers = new ArrayList<>();
        HashSet<Integer> numbers = new HashSet<>();
        for (Integer i : nums) {
            numbers.add(i);
        }
        for (int i = 1; i < nums.length; i++) {
            if (!numbers.contains(i)){
                missingNumbers.add(i);
            }
        }
        return missingNumbers;
    }

//    public List<Integer> findDisappearedNumbers(int[] nums) {
//
//        List<Integer> missingNumbers = new ArrayList<>();
//        HashSet<Integer> numbers = new HashSet<>();
//
//
//        for (Integer i : nums) {
//
//        }
//        return missingNumbers;
//    }

}
