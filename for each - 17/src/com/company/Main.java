package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Help with filling up array!");
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i+1) + ". number: ");
            int num = scanner.nextInt();
            arr[i] = num;
        }

        int sum = 0;
        for (int num : arr) {
            if (num % 2 != 0){
                sum += num;
            }
        }

        System.out.println("Sum of all odd numbers is " + sum + ".\n");
        scanner.nextLine();
        System.out.print("Enter a string: ");
        String string = scanner.nextLine().toLowerCase(Locale.ROOT);

        sum = 0;

        for (char character : string.toCharArray()) {
            if (character == 'a'){
                sum += 1;
            }
        }

        System.out.println("There is " + sum + " 'a' characters in the string.\n");

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        System.out.print("Enter a month: ");
        int month = scanner.nextInt();

        int days = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? 29 : 28;

        switch (month) {
            case 1 -> System.out.println("January has 31 days.");
            case 2 -> System.out.println("February has " + days + " days in year " + year + ".");
            case 3 -> System.out.println("March has 31 days.");
            case 4 -> System.out.println("April has 30 days.");
            case 5 -> System.out.println("May has 31 days.");
            case 6 -> System.out.println("June has 30 days.");
            case 7 -> System.out.println("July has 31 days.");
            case 8 -> System.out.println("August has 31 days.");
            case 9 -> System.out.println("September has 30 days.");
            case 10 -> System.out.println("October has 31 days.");
            case 11 -> System.out.println("November has 30 days.");
            case 12 -> System.out.println("December has 31 days.");
            default -> System.out.println("Not a month.");
        }
    }
}
