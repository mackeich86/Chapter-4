package org.example;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        String operator;

        System.out.println("Введите первое число:");
        num1 = scanner.nextDouble();

        System.out.println("Введите второе число:");
        num2 = scanner.nextDouble();

        System.out.println("Выберите операцию (+, -, *, /):");
        operator = scanner.next();

        Calculator calculator = new Calculator();
        try {
            double result = calculator.calculate(num1, num2, operator);
            System.out.println("Результат: " + result);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
