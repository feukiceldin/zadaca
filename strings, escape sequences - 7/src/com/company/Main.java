package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("int side = 5 \nint area = 6*side*side \nint volume = side*side*side \n\narea = 6*5*5\narea = 150\n\nvolume = 5*5*5\nvolume = 125");

        System.out.println("\n\"Hamlet\" - William Shakespear\n");

        String numString = "1234567890";
        String string = "One Two Three";

        System.out.println(Integer.parseInt(numString)); //is numeric, executes normally

        try {
            System.out.println(Integer.parseInt(string)); //isn't numeric, throws an error, which is caught and resolved, so it can run normally
        } catch (NumberFormatException e) {
            System.out.println("Isn't a number.");
        }
    }
}