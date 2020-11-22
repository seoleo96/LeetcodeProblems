package com.company.leetcode.arrays;

import com.company.DataStructure.Arrays.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class DecompressRunLengthEncodedList {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                new DecompressRunLengthEncodedList()
                        .decompressRLElist(new int[]{1,1,2,3})
                )
        );
    }

    public int[] decompressRLElist(int[] nums) {
        int lenth = 0;
        for (int i = 0; i < nums.length; i+=2) {
            lenth+=nums[i];
        }
        int[] res = new int[lenth];
        int index = 0;
        for (int i = 0; i < nums.length; i+=2) {
            Arrays.fill(res, index, index + nums[i], nums[i+1]);
            index += nums[i];
        }
        return res;
    }

//    public int[] decompressRLElist(int[] nums) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for (int i = 0; i < nums.length; i+=2) {
//            int temp = nums[i];
//            while (temp-- > 0){
//                arrayList.add(nums[i+1]);
//            }
//        }
//        int[] res = new int[arrayList.size()];
//        for (int i = 0; i < arrayList.size(); i++) {
//
//            res[i] = arrayList.get(i);
//
//        }
//        return res;
//    }
}
