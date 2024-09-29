package com.question7;

// Question 7: Implement & Trace Tower of Hanoi of 4 disks. (30 Marks)

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int n = 4;
        Stack<Integer> source = new Stack<>();
        Stack<Integer> auxiliary = new Stack<>();
        Stack<Integer> destination = new Stack<>();

        // push disks to source stack
        for (int i = n; i > 0; i--) {
            source.push(i);
        }

        System.out.println("Source: " + source);
        System.out.println("Auxiliary: " + auxiliary);
        System.out.println("Destination: " + destination + "\n");

        towerOfHanoi(n, source, auxiliary, destination);
    }

    public static void towerOfHanoi(int n, Stack<Integer> source, Stack<Integer> auxiliary, Stack<Integer> destination) {
        if (n == 1) {
            destination.push(source.pop());
            System.out.println("Base: Source: " + source + ", Auxiliary: " + auxiliary + ", Destination: " + destination + "\n");
        } else {
            towerOfHanoi(n - 1, source, destination, auxiliary);
            destination.push(source.pop());
            System.out.println("Rec: Source: " + source + ", Auxiliary: " + auxiliary + ", Destination: " + destination + "\n");
            towerOfHanoi(n - 1, auxiliary, source, destination);
        }
    }
}