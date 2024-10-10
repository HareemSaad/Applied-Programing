package com.question5;

import java.util.List;

public class Printer {
    public void printItems(List<?> items) {
        for (Object item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Printer printer = new Printer();

        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        printer.printItems(intList);

        List<String> stringList = List.of("Apple", "Orange", "Banana");
        printer.printItems(stringList);
    }
}