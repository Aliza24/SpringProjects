package com.example.demo.demo1;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Boolean {

    public void code2(Scanner sc)
    {
        System.out.println("\n===== BOOLEAN OPERATIONS =====");
        System.out.println("Boolean values can only be true or false.");

        boolean p = readBoolean(sc, "Enter first boolean value (p) [true/false]: ");
        boolean q = readBoolean(sc, "Enter second boolean value (q) [true/false]: ");

        System.out.println("\nAND  (p & q)  : " + (p & q) + "   -> true only if BOTH are true");
        System.out.println("OR   (p | q)  : " + (p | q) + "   -> true if AT LEAST ONE is true");
        System.out.println("XOR  (p ^ q)  : " + (p ^ q) + "   -> true if they are DIFFERENT");
        System.out.println("NOT p (!p)    : " + (!p) + "   -> flips the value of p");
        System.out.println("NOT q (!q)    : " + (!q) + "   -> flips the value of q");
        System.out.println("EQUAL (p == q): " + (p == q) + "   -> true if both are the SAME");

        System.out.println("\nTruth table for AND, OR, XOR:");
        System.out.println("  p      q      AND    OR     XOR");
        boolean[] vals = {true, false};
        for (boolean x : vals) {
            for (boolean y : vals) {
                System.out.printf("  %-6b %-6b %-6b %-6b %-6b%n", x, y, (x & y), (x | y), (x ^ y));
            }
        }
    }

    private boolean readBoolean(Scanner sc, String message)
    {
        while (true) {
            System.out.print(message);
            String input = sc.next().trim().toLowerCase();
            if (input.equals("true")) return true;
            if (input.equals("false")) return false;
            System.out.println("Invalid input. Please type true or false.");
        }
    }
}