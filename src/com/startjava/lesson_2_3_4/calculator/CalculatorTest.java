package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continued = "yes";
        while (!continued.equals("no")) {
            if ("yes".equals(continued)) {
                System.out.print("Введите математическое выражение (н-р: 1 + 2): ");
                String expr = scanner.nextLine();
                try {
                    Calculator.pars(expr);
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Используйте для вычислений только целые положительные числа");
                    continue;
                }
                System.out.println(expr + " = " + Calculator.calculate());
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            continued = scanner.nextLine();
        }
    }
}