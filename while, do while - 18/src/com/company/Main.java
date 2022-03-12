package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        //prvi zadatak
        System.out.print("Unesi string da se izbroji koliko ima kojih karaktera: ");
        String string = scanner.nextLine();

        int nonCharCount = 0;
        int numCount = 0;
        int charCount = 0;

        for (char letter : string.toCharArray()) {
            if (Character.isLetter(letter)) {
                charCount++;
            }

            if (Character.isDigit(letter)) {
                numCount++;
            }

            if (!Character.isLetterOrDigit(letter) && letter != ' ') {
                nonCharCount++;
            }
        }

        System.out.printf("U stringu ima %d slova, %d brojeva i %d ostalih znakova.\n", charCount, numCount, nonCharCount);
        System.out.println();

        //prva varijanta drugog zadatka
        int i = 1;
        while (i <= 100) {
            if (i % 15 == 0) {
                System.out.println(i + " <- djeljiv i sa 3 i sa 5");
            } else if (i % 3 == 0) {
                System.out.println(i + " <- djeljiv sa 5");
            } else if (i % 5 == 0) {
                System.out.println(i + " <- djeljiv sa 3");
            }
            i++;
        }

        //druga varijanta drugog zadatka
        i = 0;
        String divide5 = "";
        String divide3 = "";
        String divide3and5 = "";

        while (i <=100) {
            if (i % 15 == 0) {
                divide3and5 += (i + ", ");
            } else if (i % 3 == 0) {
                divide3 += (i + ", ");
            } else if (i % 5 == 0) {
                divide5 += (i + ", ");
            }
            i++;
        }

        //ukloniti zarez i zamjeniti tackom
        divide3 = divide3.substring(0, divide3.length() - 2) + ".";
        divide5 = divide5.substring(0, divide5.length() - 2) + ".";
        divide3and5 = divide3and5.substring(0, divide3and5.length() - 2) + ".";

        System.out.println("\nDjeljivih sa 3: " + divide3);
        System.out.println("Djeljivih sa 5: " + divide5);
        System.out.println("Djeljivih sa 3 i 5: " + divide3and5 + "\n");

        //treci zadatak
        int sum = 0;
        i = 1;
        int num;
        do {
            System.out.print("Unesi " + i + ". broj: ");
            num = scanner.nextInt();
            if (num < 5 || num > 10){
                System.out.println("Neispravan broj.");
                continue;
            }
            sum += num;
            i++;
        } while (i <= 5);

        System.out.println();
        double prosjek = Math.round(sum / 5.0);

        if (prosjek < 6 && prosjek > 0) {
            System.out.println("Prosjek je 5 ili manje, niste polozili i trebate se potruditi.");
        } else if (prosjek >= 6 && prosjek < 7) {
            System.out.println("Prosjek je izmedju 6 i 7, polozili ste ali moze bolje.");
        } else if (prosjek >= 7 && prosjek < 8) {
            System.out.println("Prosjek je izmedju 7 i 8, polozili ste.");
        } else if (prosjek >= 8 && prosjek < 9) {
            System.out.println("Prosjek je izmedju 8 i 9, polozili ste i vas trud se vidi.");
        } else if (prosjek >= 9 && prosjek < 10) {
            System.out.println("Prosjek je izmedju 9 i 10, polozili ste i zadovoljni smo vasim napretkom.");
        } else if (prosjek == 10) {
            System.out.println("Prosjek je 10, polozili ste i vas rad je odusevljavajuc.");
        } else {
            System.out.println("Neispravan prosjek.");
        }
    }
}