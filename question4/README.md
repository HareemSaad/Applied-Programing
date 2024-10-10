# Question 4 (10 Marks):

Write a generic class `Calculator` that has a method `sum()` to add two numbers. Use bounded type parameters to ensure the method only works with types that extend `Number` (e.g., `Integer`, `Double`, etc.).

- Define the `Calculator<T extends Number>` class.
- Implement a method `sum(T num1, T num2)` that returns the sum of `num1` and `num2.
- Demonstrate this class with different numeric types, like `Integer` and `Double`.
