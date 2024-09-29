package com.question6;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        Stack<Character> stack = new Stack<>();
        reverseString(str, stack);
    }

    public static void reverseString(String str, Stack<Character> stack) {
        if (str.isEmpty()) {
            StringBuilder reversedStr = new StringBuilder();

            // empty stack to regenerate the reversed string
            while (!stack.isEmpty()) {
                reversedStr.append(stack.remove(0));
            }
            System.out.println("\nReversed String: " + reversedStr.toString() + "\n");
        } else {
            stack.push(str.charAt(str.length() - 1));
            System.out.println("Stack: " + stack);
            reverseString(str.substring(0, str.length() - 1), stack);
        }
    }
}