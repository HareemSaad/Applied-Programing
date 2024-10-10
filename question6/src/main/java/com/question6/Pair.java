package com.question6;

public class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        Pair<Integer, String> intStringPair = new Pair<>(1, "Apple");
        System.out.println("Key: " + intStringPair.getKey() + ", Value: " + intStringPair.getValue());

        Pair<String, Double> stringDoublePair = new Pair<>("Name", 10.5);
        System.out.println("Key: " + stringDoublePair.getKey() + ", Value: " + stringDoublePair.getValue());
    }
}