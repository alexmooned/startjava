package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continued = "yes";
        while (!continued.equals("no")) {
            if ("yes".equals(continued)) {
                System.out.print("Введите математическое выражение (н-р: 1 + 2): ");
                String expression = scanner.nextLine();
                System.out.println(expression + " = " + Calculator.calculate(expression));
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            continued = scanner.nextLine();
        }
    }
}