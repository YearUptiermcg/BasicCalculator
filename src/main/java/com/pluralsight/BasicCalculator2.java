package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator2 {
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        float num1= promptForFloat("Enter the first number: ");
        float num2 = promptForFloat("Enter the second number: ");
        String option = promptforOperationType();

        if (  option.equals("A") ) doAdd(num1, num2);
        if (  option.equals("S") ) doSubtract(num1, num2);
        if (  option.equals("M") ) doMultiply(num1, num2);
        if (  option.equals("D") ) doDivide(num1, num2);

    }
    public static String promptforOperationType() {

        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.print("Please select an option: ");

        String option = scanner.nextLine();
        return option;


    }


    public static float promptForFloat(String prompt){
        Scanner s = new Scanner(System.in);
        System.out.print(prompt);
        float num = s.nextFloat();
        s.nextLine();
        return num;
    }
    public static void doAdd ( float a, float b){
        float result = a + b;
        System.out.println(a + "+" + b + "=" + result);
            }
            public static void doSubtract ( float a, float b){
                float result = a + b;
                System.out.println(a + "-" + b + "=" + result);
    }
            public static void doMultiply ( float a, float b){
                float result = a + b;
                System.out.println(a + "*" + b + "=" + result);
    }
            public static void doDivide ( float a, float b){
                float result = a + b;
                System.out.println(a + "/" + b + "=" + result);
    }
}