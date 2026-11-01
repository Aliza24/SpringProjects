package com.example.demo.demo1;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Arithmetic {

    public void code1(Scanner sc)
    {
        System.out.println("/n====ARITHMETIC OPERATIONS====");
        System.out.println("Arithmetic operators do maths on numbers.");

        System.out.println("Enter first number (a): ");
        double a = sc.nextDouble();
        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        System.out.println("\nAddition       (a + b): " + a + " + " + b + " = " + (a + b));
        System.out.println("Subtraction    (a - b): " + a + " - " + b + " = " + (a - b));
        System.out.println("Multiplication (a * b): " + a + " * " + b + " = " + (a * b));

        if (b != 0) {
            System.out.println("Division       (a / b): " + a + " / " + b + " = " + (a / b));
            System.out.println("Modulus        (a % b): " + a + " % " + b + " = " + (a % b)
                    + "   (the remainder after dividing a by b)");
        } else {
            System.out.println("Division and modulus are not possible because b is 0.");
        }

        // Increment / decrement
        int x = (int) a;
        System.out.println("\nIncrement/Decrement on the whole part of a (" + x + "):");
        System.out.println("x++ (use, then add 1): " + (x++) + "  -> x is now " + x);
        System.out.println("++x (add 1, then use): " + (++x) + "  -> x is now " + x);
        System.out.println("x-- (use, then subtract 1): " + (x--) + "  -> x is now " + x);
        System.out.println("--x (subtract 1, then use): " + (--x) + "  -> x is now " + x);
    }
}
