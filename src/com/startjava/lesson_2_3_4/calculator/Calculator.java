package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.*;

public class Calculator {

    private static int a;
    private static int b;
    private static char sign;

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Calculator.a = a;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        Calculator.b = b;
    }

    public static char getSign() {
        return sign;
    }

    public static void setSign(char sign) {
        Calculator.sign = sign;
    }

    public static int calculate() {
        return switch (sign) {
            case '+':
                yield addExact(a, b);
            case '-':
                yield subtractExact(a, b);
            case '*':
                yield multiplyExact(a, b);
            case '/':
                yield a / b;
            case '%':
                yield a % b;
            case '^':
                int result = 1;
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }
                yield result;
            default:
                System.out.println("Знак математической операции задан неверно.");
                yield 0;
        };
    }


}

