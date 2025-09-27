# Employee Payroll System

- A Java-based payroll management system that handles different types of employees and their salary calculations.
  
🎓 Learning Objective: Object-Oriented Programming (OOP)
This project is specifically designed for learning and practicing core Object-Oriented Programming concepts in Java. It serves as an excellent example to understand how OOP principles are applied in real-world applications.


## 📋 Project Overview

This project is a comprehensive payroll management system that allows you to:
- Manage both full-time and part-time employees
- Calculate salaries based on different employment types
- Add, remove, and display employee information
- Maintain employee records efficiently

## 🏗️ Project Structure

```
Employee-Payroll-System/
├── src/
│   ├── Employee.java          # Abstract base class
│   ├── FullTimeEmployee.java  # Full-time employee implementation
│   ├── PartTimeEmployee.java  # Part-time employee implementation
│   ├── PayrollSystem.java     # Payroll management system
│   └── Main.java             # Main application class
├── README.md                 # Project documentation
└── .gitignore               # Git ignore file
```

## 📁 Class Descriptions

### 1. Employee (Abstract Class)
- **Abstract base class** for all employee types
- Contains common attributes: `name` and `id`
- Defines abstract method `calcSalary()`
- Provides getter methods and toString implementation

### 2. FullTimeEmployee (Concrete Class)
- Extends `Employee` class
- Specific attribute: `monthlySalary`
- Salary calculation: Fixed monthly salary

### 3. PartTimeEmployee (Concrete Class)
- Extends `Employee` class
- Specific attributes: `hoursWorked` and `hourlyRate`
- Salary calculation: Hours worked × Hourly rate

### 4. PayrollSystem (Management Class)
- Manages employee records using `ArrayList<Employee>`
- Provides functionality to:
  - Add employees
  - Remove employees by ID
  - Display all employees

### 5. Main (Application Class)
- Demonstrates the system functionality
- Creates sample employees
- Tests add/remove operations

## 🚀 Features

- **Polymorphism**: Unified interface for different employee types
- **Encapsulation**: Proper data hiding with private fields and public methods
- **Abstraction**: Abstract base class defining common behavior
- **ArrayList Management**: Efficient employee record handling
- **Flexible Salary Calculation**: Different calculation methods for different employee types

## 💻 How to Run

### Prerequisites
- Java JDK 8 or higher
- Any Java IDE (VS Code, IntelliJ, Eclipse) or command line

### Compilation and Execution

1. **Compile all Java files:**
```bash
javac *.java
```

2. **Run the application:**
```bash
java Main
```

### Expected Output
```
Initial Employee Details: 
Employee [name = Faisal, id = 101, salary = 70000.0]
Employee [name = Abdur Rahman, id = 202, salary = 1800.0]

Removing Employees...... 
Remaining Employee Details: 
Employee [name = Faisal, id = 101, salary = 70000.0]
```

## 🔧 Usage Example

```java
// Create payroll system
PayrollSystem payroll = new PayrollSystem();

// Create employees
FullTimeEmployee ftEmployee = new FullTimeEmployee("John Doe", 101, 50000);
PartTimeEmployee ptEmployee = new PartTimeEmployee("Jane Smith", 102, 160, 15);

// Add to system
payroll.addEmployee(ftEmployee);
payroll.addEmployee(ptEmployee);

// Display employees
payroll.displayEmployee();

// Remove employee
payroll.removeEmployee(102);
```

## 🎯 Key Java Concepts Demonstrated

- **Inheritance**: Employee → FullTimeEmployee/PartTimeEmployee
- **Polymorphism**: Employee reference holding different subclass objects
- **Abstraction**: Abstract class and methods
- **Encapsulation**: Private fields with public getters
- **ArrayList Collections**: Dynamic employee list management
- **Method Overriding**: Custom salary calculation implementations

## 📊 Employee Types Supported

| Employee Type | Salary Calculation | Constructor Parameters |
|---------------|-------------------|------------------------|
| Full-Time | Fixed monthly salary | `(name, id, monthlySalary)` |
| Part-Time | Hours × Hourly Rate | `(name, id, hoursWorked, hourlyRate)` |

## 🔮 Future Enhancements

- Add more employee types (Contract, Commission-based)
- Implement persistence (file/database storage)
- Add salary slip generation
- Include tax calculation features
- Add search and update functionality
- Implement GUI interface

## 👥 Author

**Abdur Rahman Faisal**
- Software Engineering Enthusiast
- CSE @ SEU
- 
📧 Email: arfaisal463@gmail.com
🔗 LinkedIn: [https://www.linkedin.com/in/abdur-rahman-faisal/]
🐙 GitHub: [https://github.com/arFaisal043]


---

**Happy Coding!** 🎉
