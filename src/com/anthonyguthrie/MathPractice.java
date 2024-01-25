package com.anthonyguthrie;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Math Practice class.
 */
public class MathPractice {
    /**
     * Exercises with BigDecimal
     */
    public static void demoMath() {
        System.out.println("Exercises - BigDecimal");

        BigDecimal totalCost = BigDecimal.valueOf(20).setScale(2);
        BigDecimal splitTotal = totalCost.divide(BigDecimal.valueOf(3), RoundingMode.HALF_UP);
        System.out.println(splitTotal);

        System.out.println(Math.hypot(3, 4));

        System.out.println("Random:" + Math.random());
        System.out.println("Random Int:" + (int)(Math.random() * 100));

        Integer i = 8;
        Integer i2 = 8;
        System.out.println("Compare i == i2:" + (i == i2));

        Double d = 123.0;
        Double d2 = 123.0;
        System.out.println("Compare d == d2:" + (d == d2));
    }
}
