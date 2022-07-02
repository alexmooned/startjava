package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.*;

public class Calculator {

    private static int a;
    private static int b;
    private static char sign;

    public static void pars(String expr) {
        String[] mathExpr = expr.split(" ");
        a = Integer.parseInt(mathExpr[0]);
        sign = mathExpr[1].charAt(0);
        b = Integer.parseInt(mathExpr[2]);
    }

    public static int calculate() {
        return switch (sign) {
            case '+' -> addExact(a, b);
            case '-' -> subtractExact(a, b);
            case '*' -> multiplyExact(a, b);
            case '/' -> a / b;
            case '%' -> a % b;
            case '^' -> (int) pow(a, b);
            default -> {
                System.out.println("Знак математической операции задан неверно.");
                yield 0;
            }
        };
    }


}