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
Type the following code in a text editor, and save it as `HelloWorld.java`.
```java
public class HelloWorld {
	public static void main (String[] args) {
		System.out.println("Hello World!");
	}
}
```
- Declare a public class with the same name as the file.
- A **program** starts in `main()`, executing the statements within main's braces { }, one at a time.
- Each **statement** typically appears alone on a line and ends with a semicolon, as English sentences end with a period.
- Use a `println` statement to output a string of text.
- Use double quotes **" "** to define a Java string.
- `//` declares a line of comment. Comments will be ignored by the machine.

### Compile and Execute the Program
- Open command prompt (Windows) or terminal (Mac & Linux)
- Find `javac` and `java`. If you use the default installation path, these files should be located in `c:\Program Files\Java\jdk-14.0.1\bin`.
- Grant access to `javac` and `java` from anywhere:
	- In Windows search, type "System variables".
	- In the Advanced tab, click "Environment variables".
	- Click "Path" and click "Edit"
	- Click "New" and enter the bin folder path.
	- Click OK.
	- Now try `java --version` on any folder, you should see the version displayed correctly.
- Navigate to the folder that store `HelloWorld.java`.
- Compile with `javac`: Type `javac HelloWorld.java`. There will be a compiled file `HelloWorld.class`.
- Execute with `java`: Type `java HelloWorld`. You should see `Hello World!`.

### Install Java Integrated Development Environment (IDE)
There are several software applications that provides comprehensive facilities for Java development. In this class we will mainly use IntelliJ Idea as development enrionment, though most other IDE works too.
- Create a project
	- Click "Create New Project"
	- Make sure the JDK 14 is selected. Click "Next".
	- Click "Next" again.
	- Enter a project name (For example, CMP167_Week1). Note how Intellij Idea creates a folder to represent this project.
- Create a .java file
	- Click the triangle to the left of the project name. It will reveal a folder named src.
	- Right click src, choose "New --> Java class"
	- Enter the class name (for example, HelloWorld)
- Write HelloWorld program
	- **Declare the main method**: Type "main" and choose the first suggestion.
	- **Use System.out.println**: Type "sout" and choose the first suggestion.
- Run the program in IDE
	- Click the triangle to the left of the src folder. HelloWorld will be revealed.
	- Right click HelloWorld, choose "Run".
---
## A Quick Introduction to Java
Let's create a program that calculate the annual salary.

- **Variable**: The int wage statement creates an integer variable named wage. The wage = 20 statement assigns wage with 20.
- **Basic output**:
  - The `System.out.print` method supports output. Outputting text is achieved via: 
  ```java
  System.out.print("desired text");
  ```
  - Multiple output statements continue printing on the same output line.
  - `System.out.println` (note the ln at the end, short for "line"), starts a new output line after the outputted values, called a **newline**.
  - Outputting the value of a variable names `x` is achieved via: `System.out.print(x);`
  - The programmer can combine multiple output items using the `+` symbol.
- **Basic input**: The following code at the top of a file enables the program to get input: 
  ```java
  import java.util.Scanner;
  ```
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
**Needed for homework:**
- Data type `double`
- Printing decimals with formatting
---
## Office Hour
