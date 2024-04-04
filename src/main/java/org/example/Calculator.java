package org.example;

public class Calculator {
    public double calculate(double num1, double num2, String operator) throws ArithmeticException {
        double result;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    throw new ArithmeticException("Ошибка: деление на ноль!");
                }
                break;
            default:
                throw new IllegalArgumentException("Ошибка: неверный оператор!");
        }
        return result;
    }
}
