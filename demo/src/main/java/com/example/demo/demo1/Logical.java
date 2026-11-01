package com.example.demo.demo1;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Logical {
    public void code3(Scanner sc)
    {
        System.out.println("\n===== LOGICAL OPERATIONS =====");
        System.out.println("Logical operators combine conditions (comparisons) to make decisions.");

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        boolean cond1 = a > 0;
        boolean cond2 = b > 0;

        System.out.println("\nCondition 1: a > 0 is " + cond1);
        System.out.println("Condition 2: b > 0 is " + cond2);

        System.out.println("\nAND  (cond1 && cond2)    : " + (cond1 && cond2) + "   -> both conditions must be true");
        System.out.println("OR   (cond1 || cond2)    : " + (cond1 || cond2) + "   -> at least one condition must be true");
        System.out.println("NOT  (!cond1)            : " + (!cond1) + "   -> reverses condition 1");
        System.out.println("NOR  (!(cond1 || cond2)) : " + (!(cond1 || cond2)) + "   -> true only if both are false");
        System.out.println("NAND (!(cond1 && cond2)) : " + (!(cond1 && cond2)) + "   -> false only if both are true");

        // Short-circuit demonstration
        System.out.println("\nShort-circuit example: (b != 0 && a / b > 1)");
        if (b != 0 && a / b > 1) {
            System.out.println("Result: true (a / b is greater than 1)");
        } else {
            System.out.println("Result: false");
        }
        System.out.println("&& stops at the first false condition, so a / b is never evaluated when b is 0 (no crash).");

        // Comparison operators
        System.out.println("\nComparison operators used to build conditions:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
    }
}