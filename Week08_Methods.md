# Week 8
# User-Defined Methods

## What is a method?
A **method** is a named list of statements.
- A method definition consists of the new method's name and a block of statements, such as `public static void printPizzaArea() { /* block of statements */ }`.
  - `public`: the method may be caleed from any class in the program.
  - `static`: the method is associated with the class.
  - Return type: what value will be returned to the place of method call. `void` means nothing is returned.
- **Example**: Write a method that prints "Hello!".
- A **method call** is an invocation of a method's name, causing the method's statements to execute.
- **Example**: Write a method named **getEMPLID()** that returns the EMPLID whenever it is called.
- Why use methods?
  - Reduce redundancy
  - Improve readability
  
## Parameters and Arguments
A programmer can influence a method's behavior via an input.
- A **parameter** is a method input specified in a method definition. Ex: A pizza area method might have diameter as an input.
- An **argument** is a value provided to a method's parameter during a method call. Ex: A pizza area method might be called as printPizzaArea(12.0) or as printPizzaArea(16.0).
- **Example**: Write a method **printPizzaArea** that calculates the area of a pizza with given diameter. Use this method to calculate the area of a 12-inch pizza and a 16-inch pizza.
- A method definition may have multiple parameters, separated by commas. Parameters are assigned with argument values by position: First parameter with first argument, second with second, etc.
- A method definition with no parameters must still have the parentheses.
- Challenge 6.1.2: Basic method call
- Challenge 6.1.3: Method call with parameter

## How methods work?
Each method call creates a new set of local variables, forming part of what is known as a **stack frame**. A **return** causes those local variables to be discarded.
- Acitivity 6.3.1: Method calls and returns.
- The name of a defined variable or method item is only visible to part of a program, known as the item's **scope**.
  - A variable declared in a method has scope limited to inside that method.
  - More precisely, the scope starts after the declaration until the method's end.
  - Multiple variables with the same name: which one is being referenced?
  

## Returning A Value from A Method
A method may return one value using a **return statement**.
- A method can only return one item.
- The return type needs to be declared at the beginning.
- Type **void** indicates that a method does not return any value.

## Method Calls
- Calling a method
- Calling a method in an expression
- Calling methods from methods

## Methods with Branches / Loops
A method's block of statements may include branches, loops, and other statements.
- **Example**: Write a method that converts 1-7 to Sunday-Saturday.
- **Example**: Write a method that calculates the sum of all integers in a range.

## Testing A Method
