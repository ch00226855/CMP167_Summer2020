# Week 6
# Decision Branching (Continued)

## Boolean Type
- **Boolean** refers to a quantity that has only two possible values, true or false.
- A Boolean variable may be set using true or false keywords, as in `isMale = true;`
- A Boolean variable may also be set to the result of a logical expression, as in `isOverweight = (userBmi >= 25);`
- A **good pratice** is to use Boolean variables to simplify a complex expression. An expression that combines logical and relational operators can be simplified by assigning boolean variables with the result of the expression using relational operators.
- **Example**: Write a program that determines if the air conditioner and the evaporate cooler should be turned on.
  - If temperature > 80, turn both on.
  - If 70 < temperature < 80 and humidity > 0.5, turn on the air conditioner.
  - If 70 < temperature < 80 and humidity < 0.5, turn on the evaporate cooler.
  - Otherwise, keep both off.
- Challenge 4.11.1: Using Boolean

## String Methods
- Equality: `equals()`, `equalsIgnoreCase()`
- Relational: `compareTo()`, `compareToIgnoreCase()`
- Access operations: `charAt()`, `indexOf()`
- Length of a string: `length()`
- Concatenate strings: `+`
- Truncate strings: `substring()`
- Replace in strings: `replace()`
- Challenge 4.12.1: Detect word
- Challenge 4.12.2: Print two strings in alphabetical order

## Character operations
- Table 4.14.1: Character methods
- Each method must prepend Character.
- static methods and instance methods
  - Static methods associate with a class, such as `Math.pow()` or `Character.isDigit()`
  - Instance methods associate with an object, such as `scnr.nextInt()`
  - Instance methods from different objects will behave differently.
- Challenge 4.14.1: String with digit

# Loops

## While Loops
- A **while loop** is a program construct that repeatedly executes a list of sub-statements (known as the **loop body**) while the loop's expression evaluates to true.
- Each execution of the loop body is called an **iteration**.
- Format:
```java
while (expression) {
  loop body
}
```
- **Example:** Print the powers of 2 up to 1024: 1, 2, 4, 8, 16, ..., 1024.
- A **common error** is to create a loop that never stops, which is called an **infinite loop**.
- Exercise 5.2.9: while loop iterations
- Challenge 5.2.3: Basic while loop expression


## For Loops
- A loop commonly must iterate a specific number of times, such as 10 times. Though achievable with a while loop, that situation is so common that a special kind of loop exists. 
- A **for loop** is a loop whose number of iterations can be easily controlled.
- Format:
```java
for (initial value; condition; update) {
    loop body
}
```
- **Example 1:** Print the same sentence 10 times.
- **Example 2:** Write a for loop where the loop index increments from 0 to 9. Print the loop index during each iteration.
- **Example 3:** Write a for loop where the loop index increments from 0 to 9. Print the square of the loop index during each iteration.
- **Example 4:** Print the first 10 powers of 2: 1, 2, 4, 8, ...
- **Example 5:** Write a for loop where the loop index increments from 0 to 20, only covering even numbers. Print the loop index during each iteration.
- **Example 6:** Write a for loop where the loop index increments from 1 to 19, only covering odd numbers. Print the loop index during each iteration.
- **Example 7:** Write a for loop where the loop index *decrements* from 9 to 0. Print the loop index during each iteration.
- **Example 8:** Write a for loop where the loop index *decrements* as 90, 80, 70, ..., 0. Print the loop index during each iteration.
- **Example 9:** Write a for loop where the loop index *decrements* from 9 to 0, while the loop still prints 90, 80, ..., 0
- **Example 10:** Use while loops to achieve the same output from Example 1 - 9.
