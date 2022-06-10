package com.startjava.lesson_1.finals;

public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("Игра - Угадай число");
        int min = 1;
        int max = 100;
        int randomNum = (int)(Math.random() * max + min);
        int userNum = 50;
        while (randomNum != userNum) {
            if (userNum > randomNum) {
                System.out.println("Число " + userNum + " больше того, что загадал компьютер");
                max = userNum;
                userNum = (max + min) / 2;
            } else {
                System.out.println("Число " + userNum + " меньше того, что загадал компьютер");
                min = userNum;
                userNum = (max + min) / 2;
            }
        }
        System.out.println("Вы победили!");
        System.out.println("Число компьютера: " + userNum);
    }
}