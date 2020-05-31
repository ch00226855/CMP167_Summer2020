# Week 1
# Introduction to Java
---
## Syllabus
- Course information
- Topics
- Blackboard
- Grade policy
- Textbook
- Resources
---
## Configure Java Environment
### Install Java Development Kit (JDK)
- Google "JDK download", find download link from oracle.com.
- Download JDK standard edition (SE). The latest version is JDK 14.
- Use 64 bit version.

### Create HelloWorld.java in a Text Editor
- Declare a public class with the same name as the file.
- A **program** starts in `main()`, executing the statements within main's braces { }, one at a time.
- Each **statement** typically appears alone on a line and ends with a semicolon, as English sentences end with a period.
- Use a `println` statement to output a string of text.
- Use double quotes **" "** to define a Java string.
- `//` declares a line of comment. Comments will be ignored by the machine.

### Compile and Execute the Program
- Open command prompt (Windows) or terminal (Mac & Linux)
- Compile with `javac`
- Execute with `java`

### Install Java Integrated Development Environment (IDE)
There are several software applications that provides comprehensive facilities for Java development. In this class we will mainly use IntelliJ Idea as development enrionment, though most other IDE works too.
- Create a project
- Create a .java file
- Write HelloWorld program
- Run the program in IDE
---
## A Quick Introduction to Java
Let's create a program that calculate the annual salary.

- **Variable**: The int wage statement creates an integer variable named wage. The wage = 20 statement assigns wage with 20.
- **Basic output**:
  - The `System.out.print` method supports output. Outputting text is achieved via: 
  ```System.out.print("desired text");```
  - Multiple output statements continue printing on the same output line.
  - `System.out.println` (note the ln at the end, short for "line"), starts a new output line after the outputted values, called a **newline**.
  - Outputting the value of a variable names `x` is achieved via: `System.out.print(x);`
  - The programmer can combine multiple output items using the `+` symbol.
- **Basic input**: The following code at the top of a file enables the program to get input: `import java.util.Scanner;`
  - Getting input is achieved by first creating a Scanner object via the statement: `Scanner scnr = new Scanner(System.in);`
  - System.in corresponds to keyboard input. 
  - Then, given Scanner object `scnr`, the following statement gets an input value and assigns x with that value: `x = scnr.nextInt();`.
- **Comments**
  - A **single-line comment** starts with `//` and includes all the following text on that line. Single-line comments commonly appear after a statement on the same line.
  - A **multi-line comment** starts with `/*` and ends with `*/`, where all text between `/*` and `*/` is part of the comment. A multi-line comment is also known as a block comment.
- **Whitespace**
  - Whitespace refers to blank spaces (space and tab characters) between items within a statement and blank lines between statements (called newlines). 
  - The Java compiler ignores most whitespace.
  - **Good practice** is to deliberately and consistently use whitespace to make a program more readable. Programmers usually follow conventions defined by their company, team, instructor, etc., such as:
    - Use blank lines to separate conceptually distinct statements.
    - Indent lines the same amount.
    - Align items to reduce visual clutter.
    - Use a single space before and after any operators like =, +, *, or / to make statements more readable.
- **Errors**:
  - Syntax error
  - Error message for missing a semicolon
  - Unclear error message
  - **Good practice**: fix one error at a time
  - Compile-time error
  - **Good practice**: compile the program after a few lines of code.
---
## 5 Minutes Break

---
## Quiz on Kahoot
On most days, there will be one quiz at the beginning of the class and one quiz after the break. Quiz questions come from textbook exercises. Quiz scores count toward the final grade.
---
## Interactive Exercises on Zybooks
---
## Homework Assignment #1
---
## Office Hour
