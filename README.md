# Java Class Types Demonstration

This project demonstrates the differences between Concrete Classes, Abstract Classes, and Interfaces in Java.

## Class Types

### 1. Concrete Class (Vehicle)
- A complete class that can be instantiated directly
- Contains only implemented methods
- Used for objects that don't need specialization
- Example: `Vehicle` with methods like `startEngine()`

### 2. Abstract Class (Animal)
- Cannot be instantiated directly
- Can contain both abstract (unimplemented) and concrete methods
- Used as a base class for related classes
- Example: `Animal` with abstract `makeSound()` method

### 3. Interface (Drawable)
- Defines a contract that implementing classes must follow
- All methods are abstract by default (before Java 8)
- Can contain default and static methods (Java 8+)
- Example: `Drawable` with `draw()` method

## How to Run
1. Compile all Java files: `javac *.java`
2. Run the main class: `java Main`

## Output Explanation
The program demonstrates:
- Creating and using a concrete class (Vehicle)
- Extending an abstract class (Animal → Dog)
- Implementing an interface (Drawable → Circle)
- Polymorphism using both abstract classes and interfaces
