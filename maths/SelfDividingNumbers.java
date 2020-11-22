package com.company.leetcode.maths;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1, 22));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for (int i = left; i < right + 1; i++) {
            if (isSelfDivideNumber(i))
                result.add(i);
        }
        return result;
    }

    static boolean isSelfDivideNumber(int number) {
        int x = number;
        while (x > 0) {
            int temp = x % 10;
            if (temp == 0 || ( number % temp != 0)){
                return false;
            }
            x/=10;
        }
        return true;
    }

}
