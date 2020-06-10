# Week 7
# Loops (Continued)

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
```java
for (int i = 0; i < 10; i++) {
    System.out.println("This sentence will repeat 10 times.");
}
```
If we use while loop:
```java
int i = 0;
while (i < 10) {
    System.out.println("This sentence will repeat 10 times.");
    i++;
}
```
- **Example 2:** Write a for loop where the loop index increments from 0 to 9. Print the loop index during each iteration.
```java
for (int i = 0; i < 10; i++) {
    System.out.println("Current loop index: " + i);
}
```
- **Example 3:** Write a for loop where the loop index increments from 0 to 9. Print the square of the loop index during each iteration.
```java
for (int i = 0; i < 10; i++) {
    System.out.print(i*i + " ");
}
```
- **Example 4:** Print the first 10 powers of 2: 1, 2, 4, 8, ...
```java
for (int i = 0; i < 10; i++) {
    System.out.printf("%.0f ", Math.pow(2, i));
}
```
- **Example 5:** Write a for loop where the loop index increments from 0 to 20, only covering even numbers. Print the loop index during each iteration.
```java
for (int i = 0; i <= 20; i += 2) {
    System.out.println(i + " ");
}
```
- **Example 6:** Write a for loop where the loop index increments from -11 to 19, only covering odd numbers. Print the loop index during each iteration and calculate the sum of these numbers.
```java
int sum = 0;
for (int i = -11; i < 20; i += 2) {
    System.out.println(i + " ");
    sum = sum  + i; // add current i to sum
}
System.out.println("Sum: " + sum);
```
- **Example 7:** Write a for loop where the loop index *decrements* from 9 to 0. Print the loop index during each iteration and calculate the sum of these numbers.
```java
for (int i = 9; i >= 0; i--) {
    System.out.println(i);
}
```
- **Example 8:** Write a for loop where the loop index *decrements* as 90, 80, 70, ..., 0. Print the loop index during each iteration and calculate the sum of these numbers..
- **Example 9:** Write a for loop where the loop index *decrements* from 9 to 0, while the loop still prints 90, 80, ..., 0
- **Example 10:** Use while loops to achieve the same output from Example 1 - 9.

## Loops and Strings
- Iterating through a string with a for loop
- Format:
```java
for (int i = 0; i < someString.length(); i++) {
  // do something to someString.charAt(i)
}
```
- **Example:** Count the number of digits in a string.
- Multiple iterations using a while loop
- **Example:** Remove extra spaces in a string

## Nested Loops
- A **nested loop** is a loop that appears in the body of another loop. 
- The nested loops are commonly referred to as the **inner loop** and **outer loop**.
- **Example 1**: Write a for loop whose loop index `i` goes through 1 to 5. For each index value, print that value 10 times.
- **Example 2**: Write a for loop whose loop index `i` goes through 1 to 5. For each index value, print that first 10 powers of that value.
- **Example 3**: Write a for loop whose loop index goes through 1 to 5. For each index value, print a star `*`  `i` times.
- **Example 4**: Write a for loop whose loop index goes through 1 to 5. For each index value, print all numbers between 0 and `i`.
- **Example 5**: Write a for loop whose loop index goes through 1 to 5. For each index value, print all numbers from `i` to 0.


