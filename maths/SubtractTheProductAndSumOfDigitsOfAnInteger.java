package com.company.leetcode.maths;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(new SubtractTheProductAndSumOfDigitsOfAnInteger().subtractProductAndSum(n));
    }

    public int subtractProductAndSum(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        int rem = 1;
        int sum = 0;
        for (char c : chars) {
            int temp = Integer.parseInt(String.valueOf(c));
            rem*=temp;
            sum+=temp;
        }
        return rem-sum;
    }

//    public int subtractProductAndSum(int n) {
//
//        int dim  = 1;
//        int sum = 0;
//        while (n>0){
//            int x = n%10;
//            dim*=x;
//            sum+=x;
//            n/=10;
//        }
//        return dim-sum;
//    }
}
