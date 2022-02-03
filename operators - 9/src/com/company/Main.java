package com.company;

public class Main {

    public static void main(String[] args) {
	int number1 = 3;
    int number2 = 8;

    System.out.println("Number 1 is: " + number1);
    number1 += 8;
    System.out.println("After addition of 8: " + number1);
    number1 -= 3;
    System.out.println("After subtraction of 3: " + number1);
    number1 /= 2;
    System.out.println("After division with 2: " + number1);
    number1 *= 4;
    System.out.println("After multiplication with 4: " + number1);
    number1 %= 5;
    System.out.println("After modulo with 5: " + number1 + "\n");

    System.out.println("Number 2 is: " + number2);
    number2 += 5;
    System.out.println("After addition of 5: " + number2);
    number2 -= 2;
    System.out.println("After subtraction of 2: " + number2);
    number2 /= 3;
    System.out.println("After division with 3: " + number2);
    number2 *= 6;
    System.out.println("After multiplication with 6: " + number2);
    number2 %= 7;
    System.out.println("After modulo with 7: " + number2 + "\n");

    String string = "My cool string! My favorite numbers are ";

    System.out.println("Before using arithmetic operator: " + string);
    string += 3;
    System.out.println("After using arithmetic operator: " + string);
    string += " and 5.";
    System.out.println("After using arithmetic(concatenation) operator: " + string);
    }
}
