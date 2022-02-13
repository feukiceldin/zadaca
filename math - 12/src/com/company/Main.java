package com.company;

public class Main {

    public static void main(String[] args) {
	    double doubleVar = 3.14;
        System.out.println("Vrijednost double varijable: " + doubleVar);
        doubleVar = Math.ceil(doubleVar);
        System.out.println("Vrijednost double varijable nakon ceil(): " + doubleVar);

        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 100);

        int max = Math.max((Math.max(a, b)), c);
        int min = Math.min((Math.min(a, b)), c);

        System.out.println("\na, b, c: " + a + ", " + b + ", " + c + "\n");

        System.out.println("Najmanja varijabla je: " + min);
        System.out.println("Najveca varijabla je: " +  max + "\n");

        System.out.println("Kvadrat najmanjeg broja: " + Math.round(Math.pow(min, 2)));
        System.out.println("Kvadrat najveceg broja: " + Math.round(Math.pow(max, 2)));
    }
}
