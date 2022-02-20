package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double num1, num2, num3, num4, num5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite 5 brojeva do 10.");
        System.out.println("Unesite prvi broj: ");
        num1 = scanner.nextInt();
        System.out.println("Unesite drugi broj: ");
        num2 = scanner.nextInt();
        System.out.println("Unesite treci broj: ");
        num3 = scanner.nextInt();
        System.out.println("Unesite cetvrti broj: ");
        num4 = scanner.nextInt();
        System.out.println("Unesite peti broj: ");
        num5 = scanner.nextInt();

        double prosjek = ((num1 + num2 + num3 + num4 + num5) / 5);
        System.out.println("\nVas prosjek je: " + (Math.round(prosjek * 100.0)/100.0));

        if (prosjek < 6 && prosjek > 0) {
            System.out.println("Prosjek je 5 ili manje, niste polozili i trebate se potruditi.\n");
        } else if (prosjek >= 6 && prosjek < 7) {
            System.out.println("Prosjek je izmedju 6 i 7, polozili ste ali moze bolje.\n");
        } else if (prosjek >= 7 && prosjek < 8) {
            System.out.println("Prosjek je izmedju 7 i 8, polozili ste.\n");
        } else if (prosjek >= 8 && prosjek < 9) {
            System.out.println("Prosjek je izmedju 8 i 9, polozili ste i vas trud se vidi.\n");
        } else if (prosjek >= 9 && prosjek < 10) {
            System.out.println("Prosjek je izmedju 9 i 10, polozili ste i zadovoljni smo vasim napretkom.\n");
        } else if (prosjek == 10) {
            System.out.println("Prosjek je 10, polozili ste i vas rad je odusevljavajuc.\n");
        } else {
            System.out.println("Neispravan prosjek.\n");
        }

        System.out.println("Unesite svoju najdrazu boju: \nZelena\t\t\tPlava");
        scanner.nextLine();
        String boja = scanner.nextLine();

        String bojaRez = Character.toLowerCase(boja.charAt(0)) == 'z' ? "Zelena" : "Plava";
        System.out.println("Vasa najdraza boja je: " + bojaRez);

    }
}
