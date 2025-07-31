# 🚀 Core Java & Spring Boot Tutorial

> **A comprehensive learning repository for mastering Core Java concepts and Spring Boot fundamentals**

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)](https://maven.apache.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)](https://opensource.org/licenses/MIT)

## 📋 Table of Contents

- [🎯 Overview](#-overview)
- [📁 Project Structure](#-project-structure)
- [🧱 Core Java Concepts](#-core-java-concepts)
- [💻 Code Examples](#-code-examples)
- [🚀 Getting Started](#-getting-started)
- [📚 Learning Path](#-learning-path)
- [🛠️ Technologies](#️-technologies)
- [🎓 Mini Projects](#-mini-projects)
- [🤝 Contributing](#-contributing)
- [📞 Contact](#-contact)

## 🎯 Overview

This repository serves as a **practical learning guide** for mastering Core Java fundamentals and transitioning into Spring Boot development. It's designed with a progressive learning approach, starting from basic Java concepts and gradually building up to enterprise-level development.

### ✨ Key Features

- **🧠 Beginner-Friendly**: Clear explanations with practical examples
- **📦 Modular Structure**: Each concept in its own directory
- **🎯 Real-World Examples**: Banking system, calculator, student directory
- **📝 Well-Documented**: Comprehensive comments and explanations
- **🔄 Progressive Learning**: From basics to advanced concepts

## 📁 Project Structure

```
core-java-springboot-tutorial/
├── 📁 Variables/                           # Data types and variable declarations
│   ├── VariableDeclaration.java
│   ├── ReservedWordsExample.java
│   ├── IdentifiersDemo.java
│   ├── UnderstandingByte_Short_Int_Long/
│   ├── FloatingPointTypesDemo.java
│   └── CharBooleanDemo.java
├── 📁 BeginCalc/                           # Basic calculator implementation
├── 📁 OOPBanking/                          # Object-Oriented Programming examples
├── 📁 StudentDirector/                     # Collections and CRUD operations
├── 📁 Accepting_Input_From_User/           # User input handling
├── 📁 Implicit_TypeCasting/                # Automatic type conversions
├── 📁 Explicit_TypeCasting/                # Manual type casting
├── 📁 Operators/                           # Arithmetic, logical, comparison operators
├── 📁 Loops/                               # Control flow and loops
├── 📁 Statements/                          # Conditional statements
└── 📁 Swap_Two_Variables_Using_Third_Variable/  # Variable swapping techniques
```

## 🧱 Core Java Concepts

### 🔹 1. Java Fundamentals

**What is Java?**
- Platform-independent, object-oriented programming language
- Widely used for enterprise backend development, Android apps, and APIs
- Write once, run anywhere (WORA) principle

### 🔹 2. Reserved Words & Identifiers

| Concept | Description | Example |
|---------|-------------|---------|
| **Reserved Words** | Keywords that cannot be used as identifiers | `class`, `public`, `if`, `else`, `for` |
| **Identifiers** | Names for variables, methods, classes | Must start with letter, `_`, or `$` |

### 🔹 3. Variables and Data Types

#### Integer Types
| Type | Size | Range | Use Case |
|------|------|-------|----------|
| `byte` | 8-bit | -128 to 127 | Small numbers, memory efficiency |
| `short` | 16-bit | -32,768 to 32,767 | Medium integers |
| `int` | 32-bit | -2³¹ to 2³¹-1 | **Default for integers** |
| `long` | 64-bit | -2⁶³ to 2⁶³-1 | Large numbers |

#### Floating Point Types
| Type | Size | Precision | Use Case |
|------|------|-----------|----------|
| `float` | 32-bit | 6-7 digits | Less precision, memory efficient |
| `double` | 64-bit | 15-16 digits | **Default for decimals** |

#### Other Types
- `char`: Unicode character (16-bit)
- `boolean`: true/false values

### 🔹 4. Type Casting

#### Implicit Casting (Widening)
```java
int number = 100;
double decimal = number; // Automatic conversion
```

#### Explicit Casting (Narrowing)
```java
double decimal = 100.04;
int number = (int) decimal; // Manual conversion, data loss possible
```

### 🔹 5. Operators

| Category | Operators | Description |
|----------|-----------|-------------|
| **Arithmetic** | `+`, `-`, `*`, `/`, `%` | Mathematical operations |
| **Relational** | `==`, `!=`, `<`, `>`, `<=`, `>=` | Comparison operations |
| **Logical** | `&&`, `||`, `!` | Boolean logic |
| **Assignment** | `=`, `+=`, `-=`, `*=` | Variable assignment |

## 💻 Code Examples

### 🔸 Variable Declaration
```java
// Integer types
byte smallNumber = 127;
short mediumNumber = 32767;
int regularNumber = 2147483647;
long bigNumber = 9223372036854775807L;

// Floating point types
float price = 19.99f;
double pi = 3.14159265359;

// Other types
char grade = 'A';
boolean isActive = true;
```

### 🔸 User Input with Scanner
```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
System.out.print("Enter your name: ");
String name = scanner.nextLine();
System.out.print("Enter your age: ");
int age = scanner.nextInt();
```

### 🔸 Variable Swapping
```java
int a = 10, b = 20;
System.out.println("Before: a = " + a + ", b = " + b);

// Using third variable
int temp = a;
a = b;
b = temp;

System.out.println("After: a = " + a + ", b = " + b);
```

## 🚀 Getting Started

### Prerequisites
- **Java JDK 17+** (recommended)
- **IDE**: IntelliJ IDEA, Eclipse, or VS Code
- **Maven** (optional, for future Spring Boot projects)

### Installation Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/betulsalim/core-java-springboot-tutorial.git
   cd core-java-springboot-tutorial
   ```

2. **Open in your IDE**
   - Import as Java project
   - Ensure JDK is properly configured

3. **Start Learning**
   - Begin with `Variables/` directory
   - Follow the learning path below
   - Run examples and experiment with code

## 📚 Learning Path

### 🥇 Beginner Level
1. **Variables & Data Types** → `Variables/`
2. **User Input** → `Accepting_Input_From_User/`
3. **Operators** → `Operators/`
4. **Type Casting** → `Implicit_TypeCasting/` → `Explicit_TypeCasting/`

### 🥈 Intermediate Level
5. **Control Flow** → `Statements/` → `Loops/`
6. **Basic Programs** → `BeginCalc/`
7. **Variable Techniques** → `Swap_Two_Variables_Using_Third_Variable/`

### 🥉 Advanced Level
8. **Object-Oriented Programming** → `OOPBanking/`
9. **Collections & CRUD** → `StudentDirector/`
10. **Spring Boot** (coming soon)

## 🛠️ Technologies

| Technology | Version | Purpose |
|------------|---------|---------|
| **Java** | JDK 17+ | Core programming language |
| **Spring Boot** | Latest | Framework (coming soon) |
| **Maven** | Latest | Build tool (optional) |
| **IntelliJ IDEA** | Latest | Recommended IDE |

## 🎓 Mini Projects

### 1. **Beginner Calculator** (`BeginCalc/`)
- **Skills**: Logic, operators, method calls
- **Concepts**: Basic arithmetic operations
- **Learning**: Control structures and user input

### 2. **OOP Banking System** (`OOPBanking/`)
- **Skills**: Encapsulation, inheritance, polymorphism
- **Concepts**: Object-oriented design
- **Learning**: Real-world application modeling

### 3. **Student Directory** (`StudentDirector/`)
- **Skills**: Collections, CRUD operations
- **Concepts**: List, Map, Set usage
- **Learning**: Data management and manipulation

### 4. **Input & Casting Examples**
- **Skills**: Type handling, user interaction
- **Concepts**: Scanner class, type conversion
- **Learning**: Data validation and conversion

## 🚧 Upcoming Content

- [x] Core Java fundamentals
- [ ] Java Collections Framework
- [ ] Exception Handling
- [ ] File I/O Operations
- [ ] Spring Boot Setup
- [ ] RESTful API Development
- [ ] Unit Testing (JUnit)
- [ ] JSON Serialization
- [ ] Database Integration
- [ ] Security Implementation

## 🤝 Contributing

We welcome contributions! Here's how you can help:

1. **Fork** the repository
2. **Create** a feature branch (`git checkout -b feature/AmazingFeature`)
3. **Commit** your changes (`git commit -m 'Add some AmazingFeature'`)
4. **Push** to the branch (`git push origin feature/AmazingFeature`)
5. **Open** a Pull Request

### Contribution Guidelines
- Add clear comments to your code
- Follow Java naming conventions
- Include examples and explanations
- Test your code before submitting

## 📞 Contact

**Maintained by:** [Betül Salim](https://github.com/betulsalim)

- 🌐 **GitHub**: [github.com/betulsalim](https://github.com/betulsalim)
- 📧 **Email**: [Add your email here]
- 💼 **LinkedIn**: [Add your LinkedIn here]

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

<div align="center">

⭐ **If this repository helps you learn Java, please give it a star!** ⭐

**Happy Coding! 🚀**

</div>
