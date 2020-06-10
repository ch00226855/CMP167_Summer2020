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
```java
boolean isReallyHot = (temperature > 80);
boolean isRegularHot = temperature > 70 && !isReallyHot;
boolean isHumid = (humidity > 0.5);

if (isReallyHot) {
    System.out.println("Turn on the air conditioner.");
    System.out.println("Turn on the evaporate cooler.");
} else if (isRegularHot && isHumid) {
    System.out.println("Turn on the air conditioner.");
} else if (isRegularHot && !isHumid) {
    System.out.println("Turn on the evaporate cooler.");
} else {
    System.out.println("Keep both off.");
}
```
- **Example**: Check if a year is a leap year. [How to check for leap year](https://en.wikipedia.org/wiki/Leap_year)
  - A leap year must be divisible by 4.
  - If a year is divisible by 100 but *not* divisible by 400, then it is *not* a leap year.
```java
boolean divisibleBy4 = (year % 4 == 0);
boolean divisibleBy100 = (year % 100 == 0);
boolean divisibleBy400 = (year % 400 == 0);

if (!divisibleBy4) {
    System.out.println("Not a leap year.");
} else if (divisibleBy100 && !divisibleBy400) {
    System.out.println("Not a leap year.");
} else {
    System.out.println("A leap year.");
}
```
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
- **Example"** Write a program that asks the user for a word, and then output the capitalized word.
```java
// 1. extract the first letter --> charAt(0)
char firstLetter = userInput.charAt(0);
// 2. convert the letter to uppercase --> toUpperCase()
char firstLetterUpper = Character.toUpperCase(firstLetter);
// 3. extract the substring from index 1 to the end --> substring()
int stringLength = userInput.length();
String subString = userInput.substring(1, stringLength);
// OR
// String subString = userInput.substring(1);
// 4. concatenate the uppercase letter with the rest of the string: --> +
String newString = firstLetterUpper + subString;
// Output the new string
System.out.println(newString);
```
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
