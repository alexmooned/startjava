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
        Arrays.fill(pl1.enteredNums, 0);
        Arrays.fill(pl2.enteredNums, 0);
        for (int i = 0; i < 10; i++) {
            System.out.print("Игрок " + pl1.getName() + " введите число: ");
            int userNum = scanner.nextInt();
            pl1.enteredNums[i] = userNum;
            cntPl1++;
            if (compareNums(userNum, computerNum)) {
                System.out.println("Игрок " + pl1.getName() + " угадал число " + userNum + " с " + cntPl1 + " попытки!");
                break;
            }
            if (i == 9) System.out.println("У " + pl1.getName() + " закончились попытки.");

            System.out.print("Игрок " + pl2.getName() + " введите число: ");
            userNum = scanner.nextInt();
            pl2.enteredNums[i] = userNum;
            cntPl2++;
            if (compareNums(userNum, computerNum)) {
                System.out.println("Игрок " + pl2.getName() + " угадал число " + userNum + " с " + cntPl2 + " попытки!");
                break;
            }
            if (i == 9) System.out.println("У " + pl2.getName() + " закончились попытки.");
        }
        int[] arraysCopyPl1 = Arrays.copyOf(pl1.enteredNums, cntPl1);
        System.out.print("Игрок " + pl1.getName() + " ввел числа: ");
        printNums(arraysCopyPl1);

        int[] arraysCopyPl2 = Arrays.copyOf(pl2.enteredNums, cntPl2);
        System.out.print("Игрок " + pl2.getName() + " ввел числа: ");
        printNums(arraysCopyPl2);
    }

    private boolean compareNums(int userNumber, int computerNumber) {
        if (userNumber == computerNumber) return true;
        else {
            if (userNumber > computerNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (userNumber < computerNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
            return false;
        }
    }

    private void printNums(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }
}