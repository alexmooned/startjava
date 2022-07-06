package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private static int a;
    private static int b;
    private static char sign;

    private static void pars(String expression) {
        String[] mathExpr = expression.split(" ");
        a = Integer.parseInt(mathExpr[0]);
        sign = mathExpr[1].charAt(0);
        b = Integer.parseInt(mathExpr[2]);
    }

    public static int calculate(String expression) {
        try {
            Calculator.pars(expression);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Используйте для вычислений только целые положительные числа");
        }
        return switch (sign) {
            case '+' -> Math.addExact(a, b);
            case '-' -> Math.subtractExact(a, b);
            case '*' -> Math.multiplyExact(a, b);
            case '/' -> a / b;
            case '%' -> a % b;
            case '^' -> (int) Math.pow(a, b);
            default -> {
                System.out.println("Знак математической операции задан неверно.");
                yield 0;
            }
        };
    }
}