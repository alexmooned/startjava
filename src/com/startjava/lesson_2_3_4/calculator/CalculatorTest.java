package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continued = "yes";
        while (continued.equals("yes")) {
            Calculator calc = new Calculator();
            System.out.print("Введите математическое выражение (н-р: 1 + 2): ");
            String[] mathExpr = scanner.nextLine().split(" ");
            try {
                Calculator.setA(Integer.parseInt(mathExpr[0]));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("Используйте для вычислений только целые положительные числа");
                continue;
            }
            Calculator.setSign(mathExpr[1].charAt(0));
            try {
                Calculator.setB(Integer.parseInt(mathExpr[2]));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("Используйте для вычислений только целые положительные числа");
                continue;
            }
            System.out.println(Calculator.getA() + " " + Calculator.getSign() + " " + Calculator.getB() + " = " + Calculator.calculate());
            continued = "";
            while (!continued.equals("no") && !continued.equals("yes")) {   
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                continued = scanner.nextLine(); 
            }
        }       
    }
}