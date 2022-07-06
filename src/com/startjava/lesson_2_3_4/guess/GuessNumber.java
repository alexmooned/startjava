package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private int targetNumber;
    private Player[] players = new Player[2];

    public void createPlayers() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print("Введите имя " + (i + 1) + " игрока: ");
            players[i] = new Player(scanner.nextLine());
        }
    }

    public void start() {
        targetNumber = (int) (Math.random() * 100 + 1);
        System.out.println(targetNumber);
        playersClear();
        Scanner scanner = new Scanner(System.in);
        System.out.println("У каждого игрока по 10 попыток!");
        for (int i = 0; i < 10; i++) {
            for (Player plr : players) {
                System.out.print("Игрок " + plr.getName() + " введите число: ");
                int playerNum = scanner.nextInt();
                plr.setEnteredNum(i, playerNum);
                plr.setCountAttempts(plr.getCountAttempts() + 1);
                if (compareNums(plr, playerNum)) {
                    for (Player playerAttemps : players) {
                        printNums(playerAttemps);
                    }
                    return;
                }
                if (i == 9) System.out.println("У " + plr.getName() + " закончились попытки.");
            }
        }
    }

    private boolean compareNums(Player player, int playerNumber) {
        if (playerNumber == targetNumber) {
            System.out.print("Игрок " + player.getName() + " угадал число " + targetNumber + " с ");
            System.out.println(player.getCountAttempts() + " попытки!");
            return true;
        }
        String msg = playerNumber > targetNumber ? "больше" : "меньше";
        System.out.println("Данное число " + msg + " того, что загадал компьютер");
        return false;
    }

    private void printNums(Player player) {
        System.out.print("Игрок " + player.getName() + " ввел числа: ");
        for (int num : player.getEnteredNums()) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }

    private void playersClear() {
        for (Player player : players) {
            player.setCountAttempts(0);
            Arrays.fill(player.getEnteredNums(), 0);
        }
    }
}