package com.company;

import java.util.Scanner;

import static java.lang.String.valueOf;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input two numbers (can be decimal): ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        double sumResult = num1 + num2;
        double subResult = num1 - num2;
        double multiplyResult = num1 * num2;
        double divisionResult = num1 / num2;
        double moduloResult = num1 % num2;

        System.out.println("Sum result: " + sumResult);
        System.out.println("Subtraction result: " + subResult);
        System.out.println("Multiplication result: " + multiplyResult);
        System.out.println("Division result: " + divisionResult);
        System.out.println("Modulo result: " + moduloResult);

        double maxResult = Math.max(Math.max(Math.max(Math.max(sumResult, subResult), multiplyResult), divisionResult), moduloResult);

        System.out.println("The largest one is: " + maxResult);

        System.out.println();

        System.out.println("Please input a string: ");
        scanner.nextLine();
        String string = scanner.nextLine();
        int len = string.length();

        System.out.println("Your string is " + len + " characters long. Square root of " + len + " is " + Math.sqrt(len));

        System.out.println();

        System.out.println("Please input a long number: ");
        long longNumber = scanner.nextLong();
        System.out.println("Your number is: " + longNumber);
        String longString;
        longString = valueOf(longNumber);
        int longLen = longString.length();
        System.out.println("Length of your number is: " + longLen);

    }
}
