# Question 2 (15 Marks):

You have been tasked with developing a simple payment system for a retail store. The store offers different payment methods based on the customer's preferences. To manage payments, you need to implement method overloading, a concept of compile-time polymorphism, to handle different types of payment scenarios.

## Requirements:

### Class: `Payment`

Create a `Payment` class that has overloaded methods to process payments based on different payment types:

- **By Cash**: A method `processPayment(double amount)` that accepts the total amount and prints a message like "Processing cash payment of [amount] PKR."
- **By Credit Card**: A method `processPayment(String cardNumber, double amount)` that accepts the card number and amount, and prints "Processing credit card payment of [amount] PKR for card number [cardNumber]."
- **By Check**: A method `processPayment(String checkNumber, String bankName, double amount)` that accepts a check number, bank name, and amount, and prints "Processing check payment of [amount] PKR from [bankName] with check number [checkNumber]."

Create a `main` method to test the different payment scenarios using a `Payment` object, invoking the correct overloaded method for each type of payment.

### Expected Output:

Processing cash payment of 100 PKR.
Processing credit card payment of 250 PKR for card number 1234-5678-9876-5432.
Processing check payment of 300 PKR from Bank of America with check number 00112233.
Processing mobile payment of 50 PKR from phone number +922345678900.