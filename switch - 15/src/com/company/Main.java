package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a word:");
        String word = scanner.nextLine();
        if ((word.toLowerCase()).startsWith("naj")){
            System.out.println("You are using a superlative in Bosnian, " + word + ".\n");
        } else {
            System.out.println("It's a regular word, " + word + ".\n");
        }

        System.out.println("Input five numbers from 1 to 10: ");
        System.out.print("First number: ");
        double num1 = scanner.nextInt();
        System.out.print("Second number: ");
        double num2 = scanner.nextInt();
        System.out.print("Third number: ");
        double num3 = scanner.nextInt();
        System.out.print("Fourth number: ");
        double num4 = scanner.nextInt();
        System.out.print("Fifth number: ");
        double num5 = scanner.nextInt();

        double average = (num1 + num2 + num3 + num4 + num5)/5;
        int avg = (int) Math.round(average);

        switch(avg) {
            case 5 -> System.out.println("The average is 5, you did not pass the exam.\n");
            case 6 -> System.out.println("The average is 6, you passed the exam, but you can do better.\n");
            case 7 -> System.out.println("The average is 7, you passed the exam.\n");
            case 8 -> System.out.println("The average is 8, you passed the exam, your effort is good.\n");
            case 9 -> System.out.println("The average is 9, you passed the exam, we are proud of you.\n");
            case 10 -> System.out.println("The average is 10, you passed the exam, your exam was brilliant.\n");
            default -> System.out.println("Invalid average.\n");
        }

        double height, weight;

        System.out.print("Input your height in meters: ");
        height = scanner.nextDouble();
        System.out.print("Input your weight in kilograms: ");
        weight = scanner.nextDouble();

        double bmi = weight/(Math.pow(height, 2));

        if (bmi < 18.5){
            System.out.printf("Your BMI is -> %.2f. You are underweight.", bmi);
        } else if (bmi >= 18.5 && bmi < 24.9){
            System.out.printf("Your BMI is -> %.2f. You are normal weight.", bmi);
        } else if (bmi >= 24.9 && bmi < 29.9){
            System.out.printf("Your BMI is -> %.2f. You are normal weight.", bmi);
        } else if (bmi >= 29.9){
            System.out.printf("Your BMI is -> %.2f. You are obese.", bmi);
        } else {
            System.out.println("Invalid BMI.");
        }
    }
}
