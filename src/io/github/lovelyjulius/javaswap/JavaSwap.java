package io.github.lovelyjulius.javaswap;

import java.util.Scanner;

public class JavaSwap {
    /**
     * Main方法
     */
    public static void main(String[] args) {
        JavaSwap JavaSwap = new JavaSwap();
        String a, b;
        Scanner input = new Scanner(System.in);
        a = input.next();
        b = input.next();
        JavaSwap.swap(a, b);
    }

    /**
     * 用途:交换值并输出
     */
    public void swap(String a, String b) {
        String temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
