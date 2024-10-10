package com.question4;

public class Calculator<T extends Number> {
    public double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static void main(String[] args) {
        Calculator<Integer> intCalc = new Calculator<>();
        System.out.println(intCalc.sum(5, 10));

        Calculator<Double> doubleCalc = new Calculator<>();
        System.out.println(doubleCalc.sum(5.5, 10.4));
    }
}