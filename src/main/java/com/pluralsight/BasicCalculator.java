package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read two floating-point numbers
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        // Display possible calculations
        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        // Step 2: Ask the user for an operation
        System.out.print("Please select an option: ");
        char choice = scanner.next().charAt(0); // Using 'choice' instead of 'operation'

        double result = 0; // Initialize result

        // Perform the requested operation using if statements
        if (choice == 'A' || choice == 'a') {
            result = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " + secondNumber + " = " + result);
        }

        if (choice == 'S' || choice == 's') {
            result = firstNumber - secondNumber;
            System.out.println(firstNumber + " - " + secondNumber + " = " + result);
        }

        if (choice == 'M' || choice == 'm') {
            result = firstNumber * secondNumber;
            System.out.println(firstNumber + " * " + secondNumber + " = " + result);
        }

        if (choice == 'D' || choice == 'd') {
            if (secondNumber != 0) {
                result = firstNumber / secondNumber;
                System.out.println(firstNumber + " / " + secondNumber + " = " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        }
    }
}