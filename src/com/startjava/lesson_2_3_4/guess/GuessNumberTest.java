package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        String continued = "yes";
        Scanner scanner = new Scanner(System.in);
        GuessNumber game = new GuessNumber();

        game.createPlayers();

        while (!continued.equals("no")) {
            if ("yes".equals(continued)) {
                game.start();
            }
            System.out.println("Хотите продолжить игру? [yes/no]: ");
            continued = scanner.nextLine();
        }
    }
}