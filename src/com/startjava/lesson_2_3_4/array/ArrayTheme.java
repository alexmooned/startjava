package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        //������ �������� �������
        System.out.println("������ �������� �������");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int size = numbers.length;

        for (int dig : numbers
        ) {
            System.out.print(dig + " ");
        }
        for (int i = 0; i < size / 2; i++) {
            int num = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = num;
        }
        System.out.println("");
        for (int dig : numbers
        ) {
            System.out.print(dig + " ");
        }
        //����� ������������ ��������� �������
        System.out.println("\n\n����� ������������ ��������� �������");
        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (i + 1) * 2;
        }
        int x = 1;
        for (int i = 1; i < 9; i++) {
            x *= array2[i];
            System.out.print(array2[i]);
            if (i < 8) {
                System.out.print(" * ");
            }
        }
        System.out.print(" = " + x);
        System.out.println("\n�������� �������� ������� � �������� 0 = " + array2[0]);
        System.out.println("�������� �������� ������� � �������� 9 = " + array2[9]);
        //�������� ��������� �������
        System.out.println("\n�������� ��������� �������");
        double[] array3 = new double[15];
        System.out.println("�������� ������:");
        for (int i = 0; i < array3.length; i++) {
            array3[i] = Math.random();
            System.out.println(array3[i]);
        }
        double midNum = array3[array3.length / 2];
        System.out.println("���������� ������:");
        int cnt = 0;
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] > midNum) {
                array3[i] = 0;
                cnt++;
            }
            System.out.println(array3[i]);
        }
        System.out.println("���������� ���������� �����: " + cnt);
        //����� ��������� ������� �������� � �������� �������
        System.out.println("\n����� ��������� ������� �������� � �������� �������:");
        char[] array4 = new char[26];
        cnt = 0;
        for (char i = 'A'; i <= 'Z'; i++) {
            array4[cnt] = i;
            cnt++;
        }
        String symb = "";
        for (int i = array4.length - 1; i >= 0; i--) {
            symb += array4[i];
            System.out.println(symb);
        }
        //��������� ���������� �����
        System.out.println("\n��������� ���������� �����:");
        int[] array5 = new int[30];
        int numNew = 1;
        for (int i = 0; i < array5.length; i++) {
            do {
                cnt = 0;
                numNew = (int) (Math.random() * 41 + 60);
                for (int numFind : array5
                ) {
                    if (numFind == numNew) cnt++;
                }
            } while (cnt > 0);
            array5[i] = numNew;
        }
        for (int i = 0; i < array5.length - 1; i++) {
            for (int j = i + 1; j < array5.length; j++) {
                if (array5[i] > array5[j]) {
                    int temp = array5[i];
                    array5[i] = array5[j];
                    array5[j] = temp;
                }
            }
        }
        cnt = 0;
        for (int i = 0; i < array5.length; i++) {
            if (cnt == 10) {
                System.out.println("");
                cnt = 0;
            }
            cnt++;
            System.out.print(array5[i] + " ");
        }
    }
}
