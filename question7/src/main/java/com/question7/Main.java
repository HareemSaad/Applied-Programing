package com.question7;

public class Main {
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        System.out.println("Before swap: " + java.util.Arrays.toString(intArray));
        swap(intArray, 1, 3);
        System.out.println("After swap: " + java.util.Arrays.toString(intArray));

        String[] stringArray = {"Hello", "World", "Java"};
        System.out.println("Before swap: " + java.util.Arrays.toString(stringArray));
        swap(stringArray, 0, 2);
        System.out.println("After swap: " + java.util.Arrays.toString(stringArray));
    }
}