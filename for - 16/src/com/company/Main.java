package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite string: ");
        String string = scanner.nextLine();

        String[] stringArr = string.toString().split(" ");
        String stringBezSpace = "";

        for(i = 0; i < stringArr.length; i++){
            stringBezSpace = stringBezSpace + stringArr[i];
        }
        System.out.println("String bez praznih mjesta: " + stringBezSpace + "\n");

        int[][] arr = new int[3][3];
        System.out.println("Pomozi popuniti niz!");
        for(i = 0; i < 3; i++){
            int j;
            for (j = 0; j < 3; j++) {
                System.out.printf("Unesi broj za poziciju [%d][%d]: ", i, j);
                int broj = scanner.nextInt();
                arr[i][j] = broj;
            }
        }

        System.out.println("Niz izgleda ovako: \n" + Arrays.toString(arr[0]) + "\n" +
                                                     Arrays.toString(arr[1]) + "\n" +
                                                     Arrays.toString(arr[2]));

        int sum = 0;
        for(i = 0; i < 3; i++){
            int j;
            for (j = 0; j < 3; j++) {
                if(arr[i][j] % 2 == 0){
                    sum += arr[i][j];
                }
            }
        }

        System.out.println("\nSuma svih parnih brojeva niza je " + sum + ", a kvadratni korijen je " +
                (Math.round(Math.sqrt(sum)*100.0))/100.0 + "\n");

        System.out.print("Unesi broj za kojeg zelis tablicu mnozenja: ");
        int number = scanner.nextInt();
        for (i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", i, number, i * number);
        }

    }
}
