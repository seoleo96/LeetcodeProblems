package com.company.leetcode.arrays;

public class LastNumberContains {
    public static void main(String[] args) {
        int x = 3;
        System.out.println(count(new int[]{12,32,42,33,23,43}, x));

    }

    static int count(int[] arr, int num){
        int sum = 0;
        for (int value : arr) {
            sum += num == value%10 ? value:0;
        }
        return sum;
    }
}
