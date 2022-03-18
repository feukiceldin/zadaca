package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> songs = new HashMap<>();

        int continuing = 1;

        while (continuing != 0){
            System.out.print("Enter a song: ");
            String song = scanner.nextLine();
            System.out.print("Enter the singer: ");
            String singer = scanner.nextLine();
            songs.put(song,singer);
            System.out.println("Added to playlist. Do you want to enter more?\n1 <- Yes\n0 <- No");
            continuing = scanner.nextInt();
            scanner.nextLine();
            if (continuing == 1){
                System.out.println("Ok, continuing.\n");
            } else if (continuing == 0){
                System.out.println("Ok, stopping input.\n");
            } else {
                System.out.println("Invalid option, stopping input.\n");
                break;
            }
        }

        for (int i = 0; i < songs.size(); i++) {
            System.out.println("Song: " + songs.keySet().toArray()[i]);
            System.out.println("Singer: " + songs.get(songs.keySet().toArray()[i]));
            System.out.println("Song finished. Play again?\n1 <- Yes\n0 <- No");
            continuing = scanner.nextInt();
            if (continuing == 1){
                System.out.println("Ok, playing again.\n");
                i--;
            } else if (continuing == 0){
                System.out.println("Ok, continuing.\n");
            } else {
                System.out.println("Invalid option, continuing.\n");
            }
        }

        System.out.println("All songs in playlist played. Thanks for using our service!");

    }
}
