package com.question2;

public class Payment {
    public void processPayment(double amount) {
        System.out.println("Processing cash payment of " + amount + " PKR.");
    }

    public void processPayment(String cardNumber, double amount) {
        System.out.println("Processing credit card payment of " + amount + " PKR for card number " + cardNumber + ".");
    }

    public void processPayment(String checkNumber, String bankName, double amount) {
        System.out.println("Processing check payment of " + amount + " PKR from " + bankName + " with check number " + checkNumber + ".");
    }

    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.processPayment(1000);
        payment.processPayment("1234-5678-9012-3456", 2000);
        payment.processPayment("123456", "Bank of the World", 3000);
    }
}