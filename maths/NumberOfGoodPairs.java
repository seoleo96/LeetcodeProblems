package com.company.leetcode.maths;

public class NumberOfGoodPairs {
    private static final int MAX_INPUT_SIZE = 100;

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 3};
        System.out.println(new NumberOfGoodPairs().numIdenticalPairs(arr));
    }

    public int numIdenticalPairs(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    cnt++;
                }
            }
        }
        return cnt;
    }

//    public int numIdenticalPairs(int[] nums) {
//        int result = 0;
//        int[] occurCount = new int[MAX_INPUT_SIZE + 1];
//        for (int num : nums) {
//            result += occurCount[num];
//            occurCount[num]++;
//            for (int i = 0; i < 6; i++) {
//                System.out.print(occurCount[i] + " ");
//            }
//
//            System.out.println();
//            System.out.println("res = " + result);
//        }


//        System.out.println(occurCount.length);
//        Arrays.toString(occurCount);
//        return result;
//    }

//    public int numIdenticalPairs(int[] nums) {
//        int result = 0;
//        for (int i = 0; i < nums.length-1; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i] == nums[j] && i<j)
//                    result++;
//            }
//        }
//        return result;
//    }
}
