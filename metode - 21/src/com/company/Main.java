package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> locations = locations();
        cityFind(locations);
    }

    public static HashMap<String, String> locations (){
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> locations = new HashMap<>();
        int continuing = 1;
        while(continuing != 0) {
            System.out.print("Unesi grad: ");
            String city = scanner.nextLine();
            System.out.print("Unesi drzavu: ");
            String country = scanner.nextLine();
            locations.put(city, country);
            System.out.println("Jos jedan unos?\n1 <- Da\n0 <- Ne");
            continuing = scanner.nextInt();
            if (continuing == 1){
                System.out.println("Ok, jos jedan unos.\n");
                scanner.nextLine();
            } else if (continuing == 0){
                System.out.println("Ok, kraj unosa.\n");
                break;
            } else {
                while (continuing != 0 && continuing != 1){
                System.out.println("Pogresan unos, unesi opet.\n");
                System.out.println("Jos jedan unos?\n1 <- Da\n0 <- Ne");
                continuing = scanner.nextInt();
                scanner.nextLine();
                if (continuing == 1){
                    System.out.println("Ok, jos jedan unos.\n");
                } else if (continuing == 0){
                    System.out.println("Ok, kraj unosa.\n");
                    break;
                } } }
        }
        return locations;
    }

    public static void cityFind (HashMap<String, String> locations){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Koji grad zelite posjetiti? ");
        String city = scanner.nextLine();
        if (locations.containsKey(city)){
            System.out.printf("Grad koji zelite posjetiti %s nalazi se u drzavi %s.", city, locations.get(city));
        } else {
            System.out.println("Zeljeni grad nije u nasoj listi.");
        }
    }
}