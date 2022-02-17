package com.company;

import java.util.Scanner;

import static java.lang.String.valueOf;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input two numbers (can be decimal): ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        num1 += 3;
        num1 *= 5;
        num1 /= 2;
        num1 -= 6;

        num2 += 2;
        num2 *= 3;
        num2 /= 4;
        num2 -= 7;

        System.out.println("After arithmetic operations your numbers look like: " + num1 + " and " + num2 + ".");
        System.out.println("The larger one is: " + Math.max(num1, num2));

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
