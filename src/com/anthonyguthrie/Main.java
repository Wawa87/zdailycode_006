package com.anthonyguthrie;

/**
 * Hello World application
 *
 * @author AnthonyGuthrie
 */
public class Main {

    /**
     * The entry point to the program.
     * @param args are input
     */
    public static void main(String[] args) {
        System.out.println("Hello World.");

        PrimitiveTypes.run("Exploring...");

        ArraysDemo.run("Arrays...");

        Operators.run("Operators...");

        MathPractice.demoMath();

        ReadFromConsole.readInput();
    }
}
