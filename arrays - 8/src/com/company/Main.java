package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	String recenica = "Danas je lijep i suncan dan.";
    String [] nizRijeci = recenica.split(" ");
    System.out.println(Arrays.toString(nizRijeci));

    System.out.println();

    double [][] nizBrojeva = {{1.1, 4.2, 9.3},
                             {16.4, 25.5, 36.6},
                             {49.7, 64.8, 81.9}};

    double sumaKolone1 = nizBrojeva[0][0] + nizBrojeva[1][0] + nizBrojeva[2][0];
    double sumaReda2 = nizBrojeva[1][0] + nizBrojeva[1][1] + nizBrojeva[1][2];

    System.out.println("Suma brojeva u koloni 1 je: " + sumaKolone1);
    System.out.println("Suma brojeva u redu 2 je: " + sumaReda2);

    }
}
