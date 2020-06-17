# Week 10
# Methods (Continued)

## Unit Testing for Methods
Testing a large program can be hard because bugs may appear anywhere in the program, and multiple bugs may interact. **Good practice** is to test small parts of the program individually, before testing the entire program.
- **Unit testing** is the process of individually testing a small part or unit of a program, typically a method.
- A unit test is typically conducted by creating a **testbench** (a.k.a. test harness)
- Each unique set of input values is known as a **test vector**.

## Method Name Overloading
- Sometimes it is beneficial to have two methods with the same name but differing in the number or types of parameters, known as **method name overloading** or just **method overloading**.
- **Example:** Write a program with methods `datePrint(int currDay, int currMonth)` and `datePrint(int currDay, String currMonth)`. Use the methods to print `07/30/2020` and `July 30, 2020`.

# Arrays
A programmer commonly needs to maintain a list of items. An **array** is an ordered list of items of a given data type. Each item in an array is called an **element**.

## Array Declarations
- Format: `dataType[] = arrayName = new dataType[length];`
- The array declaration uses [ ] symbols after the data type to indicate that the variable is an array reference.
- The **new operator** creates space in memory to store the array with the specific number of elements.
- Access an array element: `arrayName[index]`
  - Any integer between 0 and **length-1** is a valid index.
- Illustration 7.2.1: An array declaration creats multiple variables in memory.
- **Example:** Create an array of the five largest countries in the world. Print the country names.

## Iterating Through an Array Using Loops
Because array indices are numbered 0 to N - 1 rather than 1 to N, programmers commonly use this for loop structure:
```java
for (int i = 0; i < myArray.length; i++) {
    // loop body
}
```
- **Example:** Create an array of the five largest countries in the world. Print the country names.
- **Example:** Find the sum of values in an array.
- **Example:** Find the maximum value in an array.
- Exercise 7.4.2: Find values in an array.
- Exercise 7.4.3: Populating an array with a for loop.
- Exercise 7.4.4: Array iteration: sum of excess
- Exercise 7.4.5: Printing array elements separated by commas.

## Tomorrow's quiz will cover Sec. 6.7 - 6.12 and Sec. 7.1 - 7.4.
