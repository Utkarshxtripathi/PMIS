# Java Learning Journey (TNS Foundation)

Welcome to the **Java Learning & Practice Repository**! This repository documents a day-by-day progression through core Java concepts, object-oriented programming (OOP), pattern printing, problem-solving, and mini-projects.

---

## 📁 Repository Structure

```
├── Day 1/
│   └── Basic/
│       └── TNS.java                             # Java basics, Scanner input, standard I/O, conditionals
├── Day 2/
│   └── Operators and Control Flow/
│       └── TNS2.java                            # Operators, type casting, temperature conversion, swap, leap year
├── Day 3/
│   ├── Loops and Patterns/
│   │   └── TNS3.java                            # Nested loops, geometric & star patterns
│   └── Control Flow/
│       └── TNS3_2.java                          # Switch-case menu-driven area calculations
├── Day 4/
│   ├── Classes and Objects/
│   │   └── TNS4.java                            # Introduction to Classes, Objects, state & methods
│   └── Exercise 1/                              # Practice Problem Set (Exercises 1 - 10)
│       └── Exercise1.java - Exercise10.java
├── Day 5/
│   ├── OOPS/                                    # Four pillars of OOP
│   │   ├── Abstraction.java                     # Abstract classes and methods
│   │   ├── encapsulation.java                   # Data hiding, getters & setters
│   │   ├── Inheritance.java                     # Base & derived classes
│   │   ├── Polymorphism.java                    # Method overloading & overriding
│   │   ├── BankingSystem.java                   # Bank account simulation with OOP
│   │   └── Constructor/                         # Constructor overloading and `this` reference
│   │       ├── Main.java
│   │       └── coffeewallet1.java
│   └── ProblemSet2/                             # OOP practice problems
│       ├── Main.java
│       └── Vehical.java
├── Day 6/
│   └── Inheritance/                             # Deep dive into Inheritance & Keyword Usage
│       ├── SingleInheritance.java               # Single level inheritance
│       ├── MultiLevelInheritance.java           # Multi-level class hierarchy
│       ├── hieraricalInheritance.java           # Hierarchical inheritance
│       ├── MultipleInheritance.java             # Multiple inheritance via Interfaces
│       ├── inheritance.java                     # Core concepts and examples
│       └── SUPER USE/                           # Usage of the `super` keyword
│           ├── demo.java, demo1.java            # Constructor chaining and method resolution
│           ├── mainapp.java, mainapp1.java
│           └── Banking System/                  # Banking domain model leveraging inheritance
│               ├── BankAccount.java
│               └── MainApp.java
├── Day 7/
│   ├── Abstraction/
│   │   └── abstract1.java                       # Abstract classes, abstract methods (Shape, Circle, Rectangle)
│   ├── Final Keyword/
│   │   └── Final1.java                          # `final` methods preventing method overriding
│   ├── Static Keyword/
│   │   ├── staticL.java                         # `static` variables (shared across instances)
│   │   └── PracticeQues.java                    # Static counters & methods (User Registration System)
│   └── Relationships/
│       ├── relationship.java                    # IS-A vs HAS-A relationship theory, Battery, Camera, Phone
│       └── app.java                             # HAS-A composition execution (Phone assembling Battery & Camera)
└── Day 8/
    └── Exception Handling/                      # Robust Error & Exception Handling
        ├── Basics/
        │   ├── Exception.java                   # Try-catch handling (Arithmetic & ArrayIndexOutOfBounds)
        │   └── ProblemStatement.java            # Graceful zero-division handling using try-catch
        ├── Finally/
        │   └── finally1.java                    # Cleanup & guaranteed execution with `finally` block
        ├── Keywords/
        │   ├── throw.java                       # Explicit exception generation with `throw` keyword
        │   └── throws.java                      # Declaring checked exceptions using `throws` keyword
        └── Practice/
            └── ATMWithdrawl.java                # Practical ATM balance validation using try-catch & throw
```

---

## 🚀 Overview of Daily Learnings

### **Day 1: Fundamentals of Java**
- Basic syntax and structure of a Java program.
- Console input and output using `java.util.Scanner`.
- Conditional logic with `if`, `else if`, and `else`.

### **Day 2: Operators & Control Flow**
- Arithmetic operators, type casting, and temperature conversion logic.
- Decision-making using `switch-case` statements.
- Swapping without a third variable, time calculation, and leap year validation.

### **Day 3: Loops & Pattern Generation**
- `for` loops and nested loops.
- Star patterns including hollow rectangles, inverted triangles, and pyramid alignments.
- Menu-driven geometric area calculation with `switch-case`.

### **Day 4: Classes, Objects & Problem Solving**
- Defining classes, instance variables, methods, and constructors.
- Practical problem set covering 10 distinct algorithmic and logic exercises (`Exercise 1` to `Exercise 10`).

### **Day 5: Object-Oriented Programming (OOP) Principles**
- **Encapsulation**: Restricting direct access to data members.
- **Inheritance**: Code reusability through superclasses and subclasses.
- **Polymorphism**: Dynamic method dispatch and compile-time overloading.
- **Abstraction**: Hiding internal implementation details using abstract classes.
- Practical domain exercises (Banking System, Coffee Wallet, Vehicle management).

### **Day 6: Advanced Inheritance & The `super` Keyword**
- In-depth exploration of inheritance models:
  - Single Inheritance
  - Multilevel Inheritance
  - Hierarchical Inheritance
  - Multiple Inheritance using Java Interfaces
- Deep dive into `super()` constructor calls and `super` member access.
- Modular Banking System demonstrating real-world inheritance patterns.

### **Day 7: Advanced OOP Mechanics & Object Relationships**
- **Abstraction**: Abstract base classes defining contracts for concrete subclasses (`abstract1.java`).
- **`final` Keyword**: Preventing method overriding and securing critical logic (`Final1.java`).
- **`static` Keyword**: Class-level variables and methods shared across instances (`staticL.java`, `PracticeQues.java`).
- **Object Relationships**: IS-A (Inheritance) vs HAS-A (Composition & Aggregation) design paradigm (`relationship.java`, `app.java`).

### **Day 8: Robust Exception Handling**
- **Try-Catch Fundamentals**: Catching runtime exceptions like `ArithmeticException` and `ArrayIndexOutOfBoundsException` (`Exception.java`, `ProblemStatement.java`).
- **The `finally` Block**: Guaranteeing execution regardless of whether an exception occurs (`finally1.java`).
- **`throw` vs `throws`**:
  - `throw`: Manually throwing exceptions for invalid conditions (`throw.java`).
  - `throws`: Propagating and declaring checked exceptions (`throws.java`).
- **Real-World Application**: ATM withdrawal simulation with balance checking and custom exception triggers (`ATMWithdrawl.java`).

---

## 🛠️ How to Compile and Run

To compile and run any individual Java file:

```bash
# Navigate to the file's directory (or use relative path)
javac "Day 1/Basic/TNS.java"
java -cp "Day 1/Basic" TNS
```

---

*Authored by [Utkarsh Tripathi](https://github.com/Utkarshxtripathi)*
