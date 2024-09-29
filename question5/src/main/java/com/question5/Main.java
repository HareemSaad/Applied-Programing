package com.question5;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        sumRecursive(n, result, stack);
    }

    public static void sumRecursive(int n, int result, Stack<Integer> stack) {
        if (n == 0) {
            System.out.println("\nSum: " + result + "\n");
        } else {
            stack.push(n);
            result += n;
            System.out.println("Stack: " + stack);
            System.out.println("Result = " + result);
            sumRecursive(n - 1, result, stack);
            stack.pop();
            System.out.println("Stack: " + stack);
        }
    }
}