package com.company.leetcode.maths;
import com.company.Printer;


public class LambdasDemo {
    public static void show(){
        greet(System.out::print);
    }

    public static void greet(Printer printer){
        printer.print("Hello, World!!");
    }

    public static void main(String[] args) {
        show();
    }
}
