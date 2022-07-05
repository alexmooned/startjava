package com.startjava.lesson_2_3_4.guess;

public class Player {
    public int[] getEnteredNums() {
        return enteredNums;
    }

    public void setEnteredNums(int i, int playerNum) {
        this.enteredNums[i] = playerNum;
    }

    private int[] enteredNums = new int[10];

    private String name;

    public String getName() {
        return name;
    }
    public int getCntPl() {
        return cntPl;
    }

    public void setCntPl(int cntPl) {
        this.cntPl = cntPl;
    }

    private int cntPl;

    public Player(String name) {
        this.name = name;
    }
}