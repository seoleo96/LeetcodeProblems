package com.company.leetcode.maths;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(28);
        System.out.println(new PerfectNumber().checkPerfectNumber(6));
    }

//    public boolean checkPerfectNumber(int num) {
//        int sum=0;
//        if(num==0)
//            return false;
//        for (int i = 1; i < num; i++) {
//            if (num%i==0){
//                sum+=i;
//            }
//        }
//        return sum == num;
//    }

    public boolean checkPerfectNumber(int num) {
        if(num<2)
            return false;
        int sum = 1;
        for(int i=2;i<=(int)Math.sqrt(num);i++){
            if(num%i==0)
                sum = sum + i + num/i;
        }
        return sum==num;
    }
}
