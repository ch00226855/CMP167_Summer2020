# Week 3
# Variables (Continued)

## Constant Variables
A good practice is to minimize the use of literal numbers in code.
- It improves code readability: `newPrice = origPrice - 5` vs. `newPrice = origPrice - priceDiscount`.
- It is easier to modify the code. If price discount is changed to 10, the programmer only need to change the value of priceDiscount.
- If there is a number that does not require change, assign it to a **constant variable**.
  - add keyword `final` to its declaration.
  - Use only upper case letters and _ to form its name, making it clearly visible in code.
  - Challenge 2.9.1: Using constants in expressions.

## Math Methods
A **method** is a list of statements executed by invoking the method's name. A **method call** invokes the execution of this list automatically. For example, `Math.sqrt(3)` invokes the statements that calculate the square root of 3. The value(s) inside `()` is called the **argument(s)**.
- `Math.sqrt()`: returns the square root of the argument.
- `Math.abs()`: returns the absolute value of the argument.
- `Math.pow(x, y)`: returns the y-th power of x.
- `Math.random()`: returns a random number between 0.0 and 0.9999....
- Activity 2.10.6: Method calls in arguments.
- Challenge 2.10.3: Using math functions to calculate the distance between two points.
```java
xDist = x2 - x1;
yDist = y2 - y1;
pointsDistance = Math.sqrt(Math.pow(xDist, 2) + Math.pow(yDist, 2));
```

## Type Conversions
- **Implicit Conversions**: if a type conversion is needed and can be done without loss of precision, the compiler will perform it automatically.
  - For an arithmetic operator like + or \*, if either operand is a double, the other is automatically converted to double, and then a floating-point operation is performed.
  - For assignments, the right side type is converted to the left side type if the conversion is possible without loss of precision.
- **Type casting**: convert an item's type explicitly.
  - Format: (type)variable.
  - Example: `myInt = (int)myDouble;`
  - Exercise: Family 1 has 3 children. Family 2 has 4 children. Family 3 has 1 child. Write a program that calculates the average number of childern per family.
  - Common error: accidentally perform integer division when floating-point division was intended.
  - Activity 2.12.5: Type casting.
  ```java
  avgKids = (double)(numKidsA + numKidsB + numKidsC) / numFamilies;
  ```
  
## Binary Numbers (Reading Assignment)

## Characters
The `char` type variable is used to store a single character. In java, a character value should be surrounded by single quotes, as in `myChar = 'm';`.
- A character is internally stored as a number
  - **ASCII** is an early standard for encoding characters as numbers.
  - Table 2.14.1: ASCII table
  - Activity 2.14.2: A char variable stores a number.
  - Character arithmetic
- Escape sequence
  - In addition to regular characters, character encoding includes several special characters, such as newline or tab.
  - The special characters are represented as **escape sequences**, which consist of a backslash `\` and another character.
  - Table 2.14.2: Common escape sequences.
  - Activity 2.14.5: Escape sequences.
- Getting a character from input
  - Java scanner does not have a method for getting one character from input.
  - Instead, use the following sequence: `myChar = scnr.next().charAt(0);`

## Strings
A **string** is a sequence of characters. In java, a string is represented using text surrounded by double quotes, as in `"Hello"`.
- Activity 2.15.1: A string is stored as a sequence of characters in memory.
- String variables and assignments.
  - Use type `String`. Note that the word is capitalized, becasue its underlying structure is different from a primitive type such as int or double.
- Get a string from input
  - Load a whole line of text: `scnr.nextLine()`
  - Load text until the next whitespace: `scnr.next()`
  - Mixing `next()` and `nextLine()` can be tricky because of the invisible newline character.
  - Activity 2.15.7: Combining next() and nextLine() can be tricky.
  - Challenge 2.15.1: Reading and outputting strings.
- String methods

## Style Guidelines
Each programming team, whether a company, open source project, or a classroom, may have style guidelines for writing code.

## Homework 2
