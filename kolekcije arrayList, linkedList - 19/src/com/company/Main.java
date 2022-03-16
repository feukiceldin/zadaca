package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String namjernica;
        int hoceJos = 1;
        ArrayList <String> groceries = new ArrayList<>();

        while (hoceJos != 0){
            System.out.print("Unesite namjernicu: ");
            namjernica = scanner.nextLine();
            groceries.add(namjernica);
            System.out.println("Pohranjeno. Zelite li dodati jos?\n1 <- Da\n0 <- Ne");
            hoceJos = scanner.nextInt();
            scanner.nextLine();
            if (hoceJos == 1){
                System.out.println("Nastavljamo dalje.\n");
            } else if (hoceJos == 0){
                System.out.println("Ok, zaustavlja se unos.\n");
            } else {
                System.out.println("Nepravilna opcija, prekid unosa.\n");
                break;
            }
        }

        System.out.println("Lista namjernica je: " + groceries);
        System.out.println("U kupovini ste.");
        while (groceries.size() >= 0){
            System.out.print("Koju namjernicu zelite kupiti liste? ");
            int brojNamjernice = scanner.nextInt();
            if (brojNamjernice > groceries.size() || brojNamjernice < 0){
                System.out.println("Neispravan index/namjernica.\n");
                continue;
            }
            groceries.remove(brojNamjernice - 1);
            System.out.println("\nOk, sada lista izgleda ovako: " + groceries + "\n");
            if (groceries.size() == 0) {
                break;
            }
        }

        System.out.println("Lista je prazna, gotovi ste sa kupovinom.");

    }
}