# Week 12
# Loops and Arrays
- **Populate an array**: ask user to enter 5 integers
- **Modify array elements**: convert all negative elements to zero.
- **Copying arrays** create another array whose values are twice as much as values of the first array.
- **Multiple arrays** create two array of integers, determine how many values from the first array are greater than the corresponding value from the second array.
- **Example: Tax calculator.** Create an array of annual salary values and an array of tax bracket cut-offs. Determine the amount of tax due for each person.
- **Array parameter**: create a separate method `getTaxes(double[] ary)` to calculate the taxes.
- **Modify a reference parameter**: Create a method that replaces all negative values from the input array to zero.


# Homework 7.1
- `readGrades()`
- `invalidIndex()`
- `rotateElements()`
- `reverseArray()`

# Project Eliza

# Example: Domain Name Validation
A **top-level domain (TLD)** name is the last part of an Internet domain name like .com in example.com. A **core generic top-level domain (core gTLD)** is a TLD that is either .com, .net, .org, or .info. A **restricted top-level domain** is a TLD that is either .biz, .name, or .pro. A **second-level domain** is a single name that precedes a TLD as in apple in apple.com.

Write a program that repeatedly prompts for a domain name, and indicates whether that domain name consists of a second-level domain followed by a core gTLD. Valid core gTLD's are stored in an array. For this program, a valid domain name must contain only one period, such as apple.com, but not support.apple.com. The program ends when the user enters -1.

**Example:**
**Input:**
>apple.com

>APPLE.com

>apple.comm

>apple.biz

>www.apple.info

>-1

**output**
>Enter the next domain name (-1 to exit): 

>"apple.com" is a valid domain name and has a core gTLD of ".com".
>
>Enter the next domain name (-1 to exit): 

>"APPLE.com" is a valid domain name and has a core gTLD of ".com".
>
>Enter the next domain name (-1 to exit): 

>"apple.comm" is a valid domain name and does not have a core gTLD.
>
>Enter the next domain name (-1 to exit): 

>"apple.biz" is a valid domain name and does not have a core gTLD.
>
>Enter the next domain name (-1 to exit): 

>"www.apple.info" is not a valid domain name.
>
>Enter the next domain name (-1 to exit): 
