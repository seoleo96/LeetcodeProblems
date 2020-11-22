package com.company.leetcode.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class KidsWithCandies {
    public static void main(String[] args) {
        System.out.println(new KidsWithCandies().kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> greatestNumberOfCandies = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();

        for (Integer countOfCandies : candies)
            greatestNumberOfCandies.add(extraCandies + countOfCandies > max - 1);

        return greatestNumberOfCandies;
//        for (int i = 0; i < candies.length; i++) {
//            if ((extraCandies + candies[i]) < max) {
//                greatestNumberOfCandies.add(false);
//            } else {
//                greatestNumberOfCandies.add(true);
//            }
//        }
//
//        for (int i = 0; i < candies.length; i++) {
//            greatestNumberOfCandies.set(i, extraCandies + candies[i] >= max);
//        }
    }
}
