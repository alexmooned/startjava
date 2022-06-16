package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player pl1;
    private Player pl2;

    public GuessNumber(Player pl1, Player pl2) {
        this.pl1 = pl1;
        this.pl2 = pl2;
    }

    public void start() {
        int computerNum = (int) (Math.random() * 100 + 1);
        Scanner scanner = new Scanner(System.in);

        while (true) {
                System.out.print("Игрок " + pl1.getName() + " введите число: ");
                int userNum = scanner.nextInt();
                if (userNum > computerNum) {
                    System.out.println("Данное число больше того, что загадал компьютер");
                } else if (userNum < computerNum) {
                    System.out.println("Данное число меньше того, что загадал компьютер");
                } else {
                    System.out.println("Игрок " + pl1.getName() + " победил!");
                    break;
                }

                System.out.print("Игрок " + pl2.getName() + " введите число: ");
                userNum = scanner.nextInt();
                if (userNum > computerNum) {
                    System.out.println("Данное число больше того, что загадал компьютер");
                } else if (userNum < computerNum) {
                    System.out.println("Данное число меньше того, что загадал компьютер");
                } else {
                    System.out.println("Игрок " + pl2.getName() + " победил!");
                    break;
                }
            }
    }
}