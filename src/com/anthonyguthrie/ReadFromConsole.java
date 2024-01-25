package com.anthonyguthrie;

import java.util.Scanner;

public class ReadFromConsole {
    public static void readInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        System.out.println("You said: " + sc.next());
    }
}
