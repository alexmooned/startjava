package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int countAttempts;
    private int[] enteredNums = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public void setCountAttempts(int countAttempts) {
        this.countAttempts = countAttempts;
    }

    public int[] getEnteredNums() {
        int[] arraysCopyPlayer = Arrays.copyOf(enteredNums, countAttempts);
        return arraysCopyPlayer;
    }

    public void setEnteredNum(int i, int playerNum) {
        this.enteredNums[i] = playerNum;
    }
}