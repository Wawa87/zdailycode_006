package com.anthonyguthrie;

/**
 * Primitive Types exploration
 */
public class PrimitiveTypes {
    /**
     * Write out some numbers of various types.
     * @param msg Include a message to print.
     */
    public static void run(String msg) {
        System.out.println(msg);
//        Integers
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4;
        long num = 23_311L;
        long l2 = 2000000000000L;

        int dec = 123;
        int bin = 0b10011001;
        int oct = 0240;
        int hex = 0x78;
        int acdc = 0xACDC;

        System.out.println(dec);
        System.out.println(bin);
        System.out.println(oct);
        System.out.println(hex);
        System.out.println(acdc);

//        Floating Point
        float f = 1.2f;
        double d = 1.3;

//        Boolean
        boolean bool = true;

//        Characters
        char c = 'a';
    }
}
