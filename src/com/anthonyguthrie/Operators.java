package com.anthonyguthrie;

/**
 * Operators class demo.
 */
public class Operators {
    /**
     * Experiment with operators.
     * @param msg Include a message to print in the console.
     */
    public static void run(String msg) {
        System.out.println(msg);

//        Unary Operators
        System.out.println("Unary Operators...");
        int x = 5;
        int y = ++x;
        int z = x++;

//        Binary Operators
        System.out.println("Binary Operators...");
        int b0 = 10 + 1; // 11
        int b1 = b0 - 3; // 8
        int b2 = b1 / 2; // 4
        int b3 = b2 % 3; // 1
        int b4 = b3 * 10; // 10
        System.out.println(b0);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

//        Assignment Operators
        System.out.println("Assignment Operators...");
        int a0 = 10;
        System.out.println(a0);
        a0 += 2; // 12
        System.out.println(a0);
        a0 -= 3; // 9
        System.out.println(a0);
        a0 *= 3; // 27
        System.out.println(a0);
        a0 /= 9; // 3
        System.out.println(a0);
        a0 %= 2; // 1
        System.out.println(a0);
    }
}
