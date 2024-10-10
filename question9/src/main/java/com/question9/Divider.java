package com.question9;

public class Divider {

    public double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return num1 / num2;
    }
    public static void main(String[] args) {
        Divider divider = new Divider();

        try {
            int num1 = 4;
            int num2 = 2;
            System.out.println("Result: " + divider.divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter integers only.");
        }

        try {
            int num1 = 4;
            int num2 = 0;
            System.out.println("Result: " + divider.divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter integers only.");
        }
    }
}