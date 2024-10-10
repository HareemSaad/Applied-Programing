package com.question3;

public class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(42);
        System.out.println("Integer box contains: " + integerBox.getItem());

        Box<String> stringBox = new Box<>("Hello, World!");
        System.out.println("String box contains: " + stringBox.getItem());

        Box<Double> doubleBox = new Box<>(15.75);
        System.out.println("Double box contains: " + doubleBox.getItem());
    }
}