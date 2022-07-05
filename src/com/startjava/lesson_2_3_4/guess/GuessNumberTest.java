package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player[] players = new Player[2];
        for (int i = 0; i < 2; i++) {
            System.out.print("Введите имя " + (i + 1) + " игрока: ");
            players[i] = new Player(scanner.nextLine());
        }
        GuessNumber game = new GuessNumber(players);
        String continued = "yes";

        while (!continued.equals("no")) {
            if ("yes".equals(continued)) {
                game.start();
            }
            System.out.println("Хотите продолжить игру? [yes/no]: ");
            continued = scanner.nextLine();
        }
    }
}