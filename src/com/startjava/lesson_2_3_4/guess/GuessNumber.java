package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
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
        System.out.println(computerNum);
        Scanner scanner = new Scanner(System.in);
        System.out.println("У каждого игрока по 10 попыток!");
        int cntPl1 = 0;
        int cntPl2 = 0;
        Arrays.fill(pl1.playerNum, 0);
        Arrays.fill(pl2.playerNum, 0);
        for (int i = 0; i < 10; i++) {
            System.out.print("Игрок " + pl1.getName() + " введите число: ");
            int userNum = scanner.nextInt();
            pl1.playerNum[i] = userNum;
            cntPl1++;
            if (checkNum(userNum, computerNum) == 1) {
                System.out.println("Игрок " + pl1.getName() + " угадал число " + userNum + " с " + cntPl1 + " попытки!");
                break;
            }
            if (i == 9) System.out.println("У " + pl1.getName() + " закончились попытки.");

            System.out.print("Игрок " + pl2.getName() + " введите число: ");
            userNum = scanner.nextInt();
            pl2.playerNum[i] = userNum;
            cntPl2++;
            if (checkNum(userNum, computerNum) == 1) {
                System.out.println("Игрок " + pl2.getName() + " угадал число " + userNum + " с " + cntPl2 + " попытки!");
                break;
            }
            if (i == 9) System.out.println("У " + pl2.getName() + " закончились попытки.");
        }
        int[] arraysCopyPl1 = Arrays.copyOf(pl1.playerNum, cntPl1++);
        printArray(arraysCopyPl1);

        int[] arraysCopyPl2 = Arrays.copyOf(pl2.playerNum, cntPl2++);
        printArray(arraysCopyPl2);
    }

    private int checkNum(int userNumber, int computerNumber) {
        if (userNumber > computerNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
            return 0;
        } else if (userNumber < computerNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
            return 0;
        } else {
            return 1;
        }
    }

    private void printArray(int[] array){
        for (int num : array
        ) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }
}