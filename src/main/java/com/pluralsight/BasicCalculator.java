package com.pluralsight;

import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Step 1:
        System.out.print("Enter the first number: ");
        float num1 = s.nextFloat();
        s.nextLine();

        System.out.print("Enter the second number: ");
        float num2 = s.nextFloat();
        s.nextLine();

        // Display possible calculations
        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.print("Please select an option: ");

        String option = s.nextLine();

        //assume we will add
        if (option.equals("A")) {
            //System.out.println("A is selected");
            float result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
        }
        if (option.equals("S")) {
            //System.out.println("S is selected");
            float result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " - " + result);
        }
        if (option.equals("M")) {
            //System.out.println("M is selected");
            float result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
        }
        if (option.equals("D")) {
            //System.out.println("D is selected");
            float result = num1 + num2;
            System.out.println(num1 + " / " + num2 + " = " + result);


        }
    }
}
