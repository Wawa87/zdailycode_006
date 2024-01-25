package com.anthonyguthrie;

import java.util.Arrays;

/**
 * Arrays Demo class.
 */
public class ArraysDemo {
    /**
     * Experiment with arrays and write some things to the console.
     * @param msg Write this message to the console.
     */
    public static void run(String msg) {
        System.out.println(msg);

        int[] intArr;
        int intArr2[];

        intArr = new int[3];
        intArr2 = new int[]{4, 3, 2, 1};
        int[] intArr3 = {5, 6, 8};
        int[][] matrix = {{1, 2, 5}, {3, 4, 5}, {5, 6, 7}};

        System.out.println(Arrays.toString(intArr2));
        Arrays.sort(intArr2);
        System.out.println(Arrays.toString(intArr2));
    }
}
