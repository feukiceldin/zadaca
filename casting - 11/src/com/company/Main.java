package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //implicit
	    byte num = 12;
        System.out.println("Byte Num: " + num);
        short num1 = (short) num;
        System.out.println("Num after casting to short: " + num1);
        int num2 = (int) num1;
        System.out.println("Num after casting to int: " + num2);
        long num3 = (long) num2;
        System.out.println("Num after casting to long: " + num3);
        float num4 = (float) num3;
        System.out.println("Num after casting to float: " + num4);
        double num5 = (double) num4;
        System.out.println("Num after casting to double: " + num5 + "\n");

        //explicit
        double broj = 3.14;
        System.out.println("Double Num: " + broj);
        float broj1 = (float) broj;
        System.out.println("Num after casting to float: " + broj1);
        long broj2 = (long) broj1;
        System.out.println("Num after casting to long: " + broj2);
        int broj3 = (int) broj2;
        System.out.println("Num after casting to int: " + broj3);
        short broj4 = (short) broj3;
        System.out.println("Num after casting to short: " + broj4);
        byte broj5 = (byte) broj4;
        System.out.println("Num after casting to byte: " + broj5 + "\n");

        //wrapper class
        String string = "abcdefg";
        System.out.println("String: " + String.valueOf(string));
        String aBoolean = "true";
        System.out.println("Boolean: " + Boolean.valueOf(aBoolean));
        String doublee = "12.34";
        System.out.println("Double: " + Double.valueOf(doublee));
        String loong = "123823479471";
        System.out.println("Long: " + Long.valueOf(loong));
        char character = 100;
        System.out.println("Character: " + Character.valueOf(character));
    }
}
