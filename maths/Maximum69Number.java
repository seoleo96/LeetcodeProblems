package com.company.leetcode.maths;

import java.util.Arrays;

public class Maximum69Number {
    public static void main(String[] args) {
        int number = 9669;
        System.out.println(maximum69Number(number));
    }

    public static int maximum69Number(int num) {
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        System.out.println(sb);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '6') {
                sb.setCharAt(i, '9');
                break;
            }
        }
        return Integer.parseInt(sb.toString());
    }

//    public static int maximum69Number(int num) {
//        char[] charsOfNumbers = String.valueOf(num).toCharArray();
//        System.out.println(Arrays.toString(charsOfNumbers));
//        for (int i = 0; i<charsOfNumbers.length; i++){
//            if (Integer.parseInt(String.valueOf(charsOfNumbers[i])) == 6){
//                charsOfNumbers[i]='9';
//                break;
//            }
//        }
//        return Integer.parseInt(String.valueOf(charsOfNumbers));
//    }
}
