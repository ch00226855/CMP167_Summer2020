# Week 11
# Classes and Objects

## Introduction to Objects
As the number of variables and methods increases, it becomes increasingly challenging to manage them. An appealing idea is to group them according to which **object** they are refering to.
- Illustration 8.1.2: Grouping variables/methods as objects.

## Introduction to Classes
As many objects share the similar group of variables and methods, they are abstracted as a **class**. For example, a restaurant defines a data type that has a name, a rating, a menu, etc.
- **Example**: Define a Book class with member variable name, author, number of pages, and price.

## Class members
- **Fields** are variables associated to the class. They can be used by any method defined in the class.
- **methods** are designed to perform certain action for the object.
- **Example**: In the Book class, add a method named `onSale()` that cut the price off by 20%. Add method `offSale()` that restores the price.

## Constructor and Constructor Overloading
A **good practice** is to initialize all fields when an object is created. Java provides a special method called **constructor** for this purpose.
- A constructor will be called when an object is created.
- A constructor that can be called without any arguments is called a **default constructor**. The default constructor intialize fields to default values.
- Overloaded constructors can be defined to pass particular values to the fields.
- **Example**: In the `Book` class, add a default constructor and an overloaded constructor.

## Getters and Setters
It is a **good practice** to set class fields private to prevent unintentional changes by outsize program. To accommodate leagal modifications by the outsize program, programmer should create **mutators** and **accessors** for the fields.
- A **mutator** method (also called **setter**) may modify ("mutate") a class' fields.
- An **accessor** method (also called **getter**) accesses fields but may not modify a class' fields.
- **Example**: In the Book class, change all fields to private. Add getters for each field, and setter for price. `setPrice()` should check if the price is valid (negative values are invalid).

## Public and private members
- Private methods are also called **helper methods**. Since they are not visible to outside programs, the main goal of a private method is to assist another method defined in the class.
- Public methods are primirily aimed for outside calls. These methods should represent functionalities of the object. For example, a dog object may have public methods to perform `bark()`, `eat()`, `sleep()`.

## toString() and equals()
- **toString()** methods aims to return a string that describes the object.
- **Example**: In the `Book` class, add a toString() method that returns the value of the fields.
- **equals()** method aims to compare if another object is the same as the current object.
- The first step of `equals()` is to check if the object in comparison belongs to the same class. This can be done using `instanceof`.
- **Example**: Add `equals()` method to the `Book` class.

## The Eliza Project
