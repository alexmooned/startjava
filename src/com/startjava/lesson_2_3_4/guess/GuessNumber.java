package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    private int targetNumber;
    private Player[] players = new Player[2];

    public GuessNumber(Player[] players) {
        this.players = players;
    }

    public void start() {
        targetNumber = (int) (Math.random() * 100 + 1);
        System.out.println(targetNumber);
        for (Player playerClear : players) {
            playerClear.setCntPl(0);
            Arrays.fill(playerClear.getEnteredNums(), 0);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("У каждого игрока по 10 попыток!");
        for (int i = 0; i < 10; i++) {
            for (Player plr : players) {
                System.out.print("Игрок " + plr.getName() + " введите число: ");
                int playerNum = scanner.nextInt();
                plr.setEnteredNums(i, playerNum);
                plr.setCntPl(plr.getCntPl() + 1);
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
            System.out.println("Игрок " + player.getName() + " угадал число " + targetNumber + " с " + player.getCntPl() + " попытки!");
            return true;
        }
        {
            String msg = playerNumber > targetNumber ? "Данное число больше того, что загадал компьютер" : "Данное число меньше того, что загадал компьютер";
            System.out.println(msg);
            return false;
        }
    }

    private void printNums(Player player) {
        int[] arraysCopyPlayer = Arrays.copyOf(player.getEnteredNums(), player.getCntPl());
        System.out.print("Игрок " + player.getName() + " ввел числа: ");
        for (int num : arraysCopyPlayer) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }
}