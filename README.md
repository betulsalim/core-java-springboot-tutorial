# core-java-springboot-tutorial
A practical learning repository for mastering Core Java concepts and Spring Boot fundamentals. Includes clean, modular code examples demonstrating key topics such as data types, OOP, collections, exception handling, and building RESTful APIs with Spring Boot. Ideal for backend development practice and interview preparation.


# Core Java & Spring Boot Tutorial

This repository is a practical learning guide for mastering **Core Java fundamentals** and stepping into **Spring Boot development**. It is structured in a way that aligns with key beginner-friendly concepts while gradually preparing you for backend development.

> 🧠 Whether you're a beginner or brushing up your Java skills, this repository provides hands-on examples with clear structure and naming.

---

## 📁 Project Structure

core-java-springboot-tutorial/
│
├── Variables/ # Covers basic data types and variable declarations
├── BeginnerCalculator/ # A simple arithmetic calculator to understand logic and control flow
├── OOPBankingProject/ # Object-oriented programming (OOP) with real-life simulation (Banking)
├── StudentDirectory/ # A basic collection-driven CRUD-style student info manager (Basic for understanding List/Set)


---

## 🧱 Core Concepts Covered

Below are the key Java topics explained and practiced in this repository:

### 1. **What is Java For?**
Java is a general-purpose, object-oriented programming language widely used for backend systems, desktop applications, Android development, and enterprise-level APIs. It offers platform independence via the Java Virtual Machine (JVM).

### 2. **What Are Reserved Words in Java?**
Reserved words (or **keywords**) are predefined words in Java with special meaning and cannot be used as identifiers (e.g., `class`, `public`, `static`, `if`, `else`, `int`, `void`, etc.).

➡️ See: `Variables/ReservedWordsExample.java`

### 3. **What Are Identifiers in Java?**
Identifiers are names given to classes, variables, methods, and objects.  
Rules:
- Must begin with a letter, `_`, or `$`
- Cannot start with a digit
- Cannot use Java reserved keywords

➡️ See: `Variables/IdentifiersDemo.java`

### 4. **What Are Variables in Java?**
Variables store data values. Java is a statically typed language, meaning each variable must be declared with a data type.

➡️ See: `Variables/VariableDeclaration.java`

---

## 🔢 Data Types in Java

### 5. **Understanding `byte`, `short`, `int`, `long`**

| Type   | Size     | Range                          |
|--------|----------|---------------------------------|
| byte   | 8-bit    | -128 to 127                    |
| short  | 16-bit   | -32,768 to 32,767              |
| int    | 32-bit   | -2^31 to 2^31-1                |
| long   | 64-bit   | -2^63 to 2^63-1                |

📌 Use `byte`/`short` only when memory optimization is important.

➡️ See: `Variables/UnderstandingByte_Short_Int_Long/`

### 6. **Understanding `float`, `double`**

- `float` (32-bit): Less precision, use for performance/memory
- `double` (64-bit): Default for decimals, higher precision

➡️ See: `Variables/FloatingPointTypesDemo.java`

### 7. **Understanding `char`, `boolean`**

- `char`: Stores a single character (Unicode)
- `boolean`: Stores `true` or `false`, commonly used in conditions

➡️ See: `Variables/CharBooleanDemo.java`

---

## 📌 When Should You Use `byte`, `short`, `int`?

- `int` is most commonly used for integers.
- Use `byte` or `short` only when you are dealing with very large arrays (e.g., sensor data, embedded systems) and need memory optimization.

---

## 💡 Projects to Reinforce Concepts

- **Beginner Calculator** – Helps understand operators, conditionals, method calls
- **OOP Banking System** – Practice classes, objects, inheritance, encapsulation
- **Student Directory** – Learn collections (`List`, `Map`) and data management logic
- **Variables Folder** – Each Java primitive data type is explained with examples

---

## 🛠️ Technologies Used

- Java (JDK 17+ recommended)
- IntelliJ IDEA
- Maven (optional)
- Spring Boot (in upcoming sections)

---

## 🚧 Upcoming Content

✅ Core Java fundamentals  
🔜 Spring Boot setup and REST API building  
🔜 Java Collections, Exception Handling, File I/O  
🔜 Testing and JSON handling with Spring

---

## 📬 Contact

Maintained by [Betül Salim](https://github.com/betulsalim)  
Feel free to fork or star the repo if you find it helpful.

---

