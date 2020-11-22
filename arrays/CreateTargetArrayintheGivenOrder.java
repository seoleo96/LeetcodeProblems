package com.company.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArrayintheGivenOrder {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(
                        new CreateTargetArrayintheGivenOrder()
                                .createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1})
                )
        );
    }

    public int[] createTargetArray(int[] nums, int[] index) {
        // If there is only one element, return early.
        if(index.length == 1 ){
            return nums;
        }

        int[] retArray = new int[nums.length];
        ArrayList tempArr = new ArrayList();

        // Take advantage of ArrayList.add() so we don't have to
        // manually reorder array elements on each add().
        for(int i = 0;i<nums.length;i++){
            tempArr.add(index[i],nums[i]);
        }
        System.out.println(tempArr);

        // Fill our int[] with the elements in our ArrayList
//        for(int k = 0;k<tempArr.size();k++){
//            // Because ArrayList.get() returns Object type, we have
//            // type cast to an integer.
//            retArray[k] = (Integer)tempArr.get(k);
//        }
        return retArray;
    }

//    public int[] createTargetArray(int[] nums, int[] index) {
//        int length = index.length;
//        int[] res = new int[length];
//        for (int i = 0; i < length; i++) {
//            if (i == index[i] ) {
//                res[index[i]] = nums[i];
//            }else{
//                int temp = i;
//                while (temp > index[i]){
//                    res[temp] = res[temp-1];
//                    temp--;
//                }
//                res[index[i]] = nums[i];
//            }
//
//        }
//        return res;
//    }
}
