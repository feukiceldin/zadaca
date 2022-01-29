package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("int side = 5 \nint area = 6*side*side \nint volume = side*side*side \n\narea = 6*5*5\narea = 150\n\nvolume = 5*5*5\nvolume = 125");

        System.out.println("\n\"Hamlet\" - William Shakespeare\n");

        String numString = "123";
        String string = "One Two Three";

        //first variant
        System.out.println(Integer.parseInt(numString)); //is numeric, executes normally

        try {
            System.out.println(Integer.parseInt(string)); //isn't numeric, throws an error, which is caught and resolved, so it can run normally
        } catch (NumberFormatException e) {
            System.out.println("Isn't a number.\n");
        }

        //second variant
        System.out.println(Character.isDigit(numString.charAt(0))); //checks if char at position 0 is a digit
        System.out.println(Character.isDigit(numString.charAt(1))); //checks if char at position 1 is a digit
        System.out.println(Character.isDigit(numString.charAt(2))); //checks if char at position 2 is a digit
        //on all positions are digits so every output is true

        System.out.println();

        System.out.println(Character.isDigit(string.charAt(0))); //checks if char at position 0 is a digit
        System.out.println(Character.isDigit(string.charAt(1))); //checks if char at position 1 is a digit
        System.out.println(Character.isDigit(string.charAt(2))); //checks if char at position 2 is a digit
        //first three characters are letters so every output is false

    }
}