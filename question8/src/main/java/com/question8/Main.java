package com.question8;

interface StorageInterface<T> {
    void addItem(T item);
    T getItem();
}

class SimpleStorage<T> implements StorageInterface<T> {
    private T item;

    @Override
    public void addItem(T item) {
        this.item = item;
    }

    @Override
    public T getItem() {
        return item;
    }

    public static void main(String[] args) {
        SimpleStorage<String> stringStorage = new SimpleStorage<>();
        stringStorage.addItem("Hello");
        System.out.println("String item: " + stringStorage.getItem());

        SimpleStorage<Integer> intStorage = new SimpleStorage<>();
        intStorage.addItem(10);
        System.out.println("Integer item: " + intStorage.getItem());

        SimpleStorage<Float> floatStorage = new SimpleStorage<>();
        floatStorage.addItem(10.5f);
        System.out.println("Float item: " + floatStorage.getItem());
    }
}