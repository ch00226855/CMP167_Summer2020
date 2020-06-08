# Week 5
# Chapter 4 Branches

In programming, it is common that the programmer may want the computer to execute certain statements **only if** some conditions are met. For example, a program that calculates the square root of a number may only want to do the calculation if the input value is not negative.

## If Statements
- An **if** statement executes a group of statements if an expression is true.
- Format: 
```java
if (condition) {
  a group of statements
}
```
- **Example**: write a program that asks for user's age. If the age is greater than 200, output "Something doesn't look right."
```java
if (userAge > 200) {
    System.out.println("Something does not look right.");
}
```
- **Exercise** 4.2.2: If statements 

## If-Else Statements
- An **if-else statement** executes one group of statements when an expression is true, and another group of statements when the expression is false.

- Format:
```java
if (condition) {
  a group of statements
} else {
  another group of statements
}
```
- **Example:** Write a program that asks the user today's date. If user's answer is correct, output "Correct!"; otherwise, output "Wrong answer. Check again!".
```java
if (userInput.equals("June 8th")) {
    System.out.println("Correct!");
} else if (userInput.equals("06/08")) {
    System.out.println("Correct!");
} else {
    System.out.println("Wrong answer!");
}
```
Or use a switch block:
```java
switch (userInput) {
    case "June 8th":
        System.out.println("Correct!");
        break;
    case "06/08":
        System.out.println("Correct!");
        break;
    default:
        System.out.println("Wrong answer!");
}
```
- **Exercise** 4.2.5: Writing an if-else statement.

## Multiple If-Else Statements
- An If-else statement can be extended to have three (or more) branches.
- Format:
```java
if (condition1) {
  statements
} else if (condition2) {
  statements
} else if (condition3) {
  statements
} else {
  statements
}
```
- Each branch's expression is checked in sequence.
- As soon as one branch's expression is found to be true, that branch's statement execute (and no subsequent branch is considered).
- If no expression is true, the else branch executes.
- **Example**: write a program that asks the user the number of years married.
  - if input is 1, output "paper anniversary"
  - if input is 10, output "tin anniversary"
  - if input is 25, output "silver anniversary"
  - if input is 50, output "gold anniversary"
  - if input is 60, output "diamond anniversary"
  - for other input, output "nothing special this year"
```java
if (yearsMarried == 1) {
    System.out.println("This year would be your paper anniversary.");
} else if (yearsMarried == 10) {
    System.out.println("This year would be your tin anniversary.");
} else if (yearsMarried == 25) {
    System.out.println("This year would be your silver anniversary.");
} else if (yearsMarried == 50) {
    System.out.println("This year would be your gold anniversary.");
} else if (yearsMarried == 60) {
    System.out.println("This year would be your diamond anniversary.");
} else {
    System.out.println("Nothing is special this year.");
}
```
Or use a switch block:
```java
switch (yearsMarried) {
    case 1:
        System.out.println("This year would be your paper anniversary.");
        break;
    case 10:
        System.out.println("This year would be your tin anniversary.");
        break;
    case 25:
        System.out.println("This year would be your silver anniversary.");
        break;
    case 50:
        System.out.println("This year would be your gold anniversary.");
        break;
    case 60:
        System.out.println("This year would be your diamond anniversary.");
        break;
    default:
        System.out.println("Nothing is special this year.");
}
```
- **Common Error**: forgetting curly brackes `{}` for a branch.
- **Challenge** 4.2.4: If-else statement: Fix errors.

## Equality and Relational Operators
- == (equal), != (not equal)
- \>, <, >=, <=
- Comparing characters
- Comparing strings: use `equals()` method
- comparing floating-point numbers: provide an error bound

## Logical Operators
- AND, OR, NOT
- &&, ||, !
- **Example**: Detecting if a value is between 10 and 15.
- Table 4.8.1: Precedence rules for arithmetic, logical, and relational operators.
- **Exercise 4.8.2**: Order of evaluation
