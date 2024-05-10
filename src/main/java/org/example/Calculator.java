package org.example;

public class Calculator {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Enter 3 elements: first number, operator, second number");
            return;
        }

        double firstNumber, secondNumber;
        String operator = args[1];

        try {
            firstNumber = Double.parseDouble(args[0]);
            secondNumber = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format : " + e.getMessage());
            return;
        }

        double result;

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("We can't divide by zero!");
                    return;
                }
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.print(firstNumber + " " + operator + " " + secondNumber + " = " + result);
    }
}