# Week 2
# Variables and Assignments

## Interactive Exercises on Zybooks

## Variable Concepts
- In a program, a **variable** is a named item, such as x or numPeople, used to hold a value.
- An **assignment** assigns a variable with a value, such as x = 5. That assignment means x is assigned with 5, and x keeps that value during subsequent assignments, until x is assigned again.
- An assignment's **left side** must be a variable. The **right side** can be an expression, so an assignment may be x = 5, y = x, or z = x + 2.
- Watch Participation Activity 2.1.2: Variables and assignments.
- Activity 2.1.3: Valid assignments.

## Integer Variable
- Declare a variable
  - A **variable declaration** is a statement that declares a new variable, specifying the variable's name and type.
  - Example: Write a program that asks the user to enter the year of birth, and then output the user age.
```java
        int birthYear; 
        int userAge; 


        Scanner scnr = new Scanner(System.in); // create a scanner object
        System.out.println("Please enter the year of birth:");
        birthYear = scnr.nextInt();
        
        userAge = 2020 - birthYear;
        
        System.out.println("Your age is: " + userAge + ".");
  ```
  - Activity 2.2.1: A variable refers to a memory location
- Assignment
  - An **assignment statement** assigns the variable on the left-side of the = with the current value of the right-side expression.
  - Challenge 2.2.1: Enter the output of the variable assignments.
  - Challenge 2.2.2: Assign a sum.
- Initialize a variable
  - Although not required, an integer variable is often assigned an initial value when declared.
  - Example: `int maxScore = 100;`
  - Challenge 2.2.3: Decaring and initializing variables
- Assignment with the same variable on both sides
- Common errors:
  - read a variable taht has not yet been assigned a value.
  - write an assignment statement in reverse, such as `9 = beansCount`.
## Variable Identifiers
- Rule for identifiers
  - The name of a variable is called its **identifier**.
  - An identifier must:
    - be a sequence of letters (a-z, A-Z), underscore (_), dollar signs ($), and digits (0-9)
    - **not** start with a digit
    - What is not allowed: space, +-*/!#%^&, 
    - Bad examples: 1stName, lucky!
   - Identifiers are **case sensitive**.
   - Cannot use **keywords** as identifiers. A keyword is a word with special meaning in the language, such as public, static, void.
   - Table 2.3.1: Java reserved words / keywords.
- Style guidelines
  - use **lower camel case** for variable names. Example: numStudents, userAge.
  - Create meaningful identifier names that describe their purposes.
  - Avoid confusing abbrevations
  - Don't make the name too long
  - Exercise 2.3.3: meaningful identifiers
## Arithmetic Expressions
- +, -, *, /
- Parenthesis
- Integer division
- Modulo operator
- Compound operators +=, -=, *=, /=, %=.
- No commas allowed
- Challenge 2.5.1: Compute an expression
- Challenge 2.5.2: Total cost

## Floating-Point Numbers
- Division by zero
- Formatting floating-point output
- Scientific notations
- Challenge 2.7.1: Sphere volume.

## Homework Assignment #1

