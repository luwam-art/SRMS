# Student Record Management System

A professional Java-based application designed to manage student records efficiently using Object-Oriented Programming (OOP), Java File I/O, Streams, Serialization, and Exception Handling concepts.

---

# Project Overview

The Student Record Management System is a menu-driven console application developed in Java. The system allows users to perform complete student management operations while demonstrating practical implementation of advanced Java programming concepts.

The application focuses on:

* clean object-oriented design
* modular architecture
* efficient file handling
* reliable data persistence
* robust exception handling

This project was developed as part of an Object-Oriented Programming and Java File I/O practical assignment.

---

# Key Features

## Student Management

* Add Student Records
* Search Student by ID
* Update Student Information
* Delete Student Records
* Display All Students

---

## File Handling

The system supports multiple file storage mechanisms:

### Text File Storage

Uses:

* `Scanner`
* `PrintWriter`
* `FileWriter`

Stores records inside:

```text id="2ctaqe"
students.txt
```

---

### Binary File Storage

Uses:

* `DataInputStream`
* `DataOutputStream`

Stores records inside:

```text id="tt83hv"
students.dat
```

---

### Object Serialization

Uses:

* `ObjectInputStream`
* `ObjectOutputStream`

Stores serialized objects inside:

```text id="9uif06"
students.ser
```

---

## Report Generation

Automatically generates reports containing:

* Total Students
* Highest GPA
* Lowest GPA
* Average GPA

---

## Backup System

The project includes a backup mechanism using:

* `BufferedInputStream`
* `BufferedOutputStream`

Backup files are stored in:

```text id="n9c6x7"
data/backup/
```

---

## File Management

The `File` class is used to:

* Create directories automatically
* Create files automatically
* Display file properties:

  * file name
  * file path
  * file size
  * last modified date

---

# System Architecture

The project follows a modular architecture where each class has a specific responsibility.

| Class                  | Responsibility             |
| ---------------------- | -------------------------- |
| `Student.java`         | Represents student objects |
| `StudentManager.java`  | Handles CRUD operations    |
| `FileHandler.java`     | Handles file operations    |
| `ReportGenerator.java` | Generates GPA reports      |
| `BackupManager.java`   | Creates backup files       |
| `Main.java`            | Runs the application       |

---

# OOP Concepts Used

## Encapsulation

Student data fields are private and accessed using getters and setters.

---

## Abstraction

Different functionalities are separated into independent classes.

---

## Modularity

The application is divided into multiple reusable components.

---

## Reusability

Methods and classes are reusable throughout the system.

---

# Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Java File I/O
* Streams
* Serialization
* Exception Handling

---

# Project Directory Structure

```text id="88ph7u"
StudentRecordManagement/
│
├── Student.java
├── StudentManager.java
├── FileHandler.java
├── ReportGenerator.java
├── BackupManager.java
├── Main.java
│
├── data/
│   ├── students.txt
│   ├── students.dat
│   ├── students.ser
│
├── backup/
│   └── students_backup.ser
│
└── README.md
```

---

# How to Compile

Run the following command inside the project directory:

```bash id="gxtd7v"
javac *.java
```

---

# How to Run

Execute the application using:

```bash id="53j5mf"
java Main
```

---

# Sample Menu

```text id="jlwmdu"
===== STUDENT RECORD SYSTEM =====

1. Add Student
2. Search Student
3. Update Student
4. Delete Student
5. Display All Students
6. Save Files
7. Generate Report
8. Show File Properties
9. Exit
```

---

# Example Report Output

```text id="q5dx4n"
===== REPORT =====

Total Students: 5
Highest GPA: 3.95
Lowest GPA: 2.70
Average GPA: 3.41
```

---

# Exception Handling

The system implements proper exception handling to manage:

* invalid input
* file errors
* serialization errors
* missing files
* input mismatch exceptions

This improves reliability and prevents unexpected application crashes.

---

# Conclusion

The Student Record Management System demonstrates practical implementation of Java programming concepts through a complete and functional application. The project combines OOP principles, File Handling, Streams, Serialization, Reporting, and Exception Handling to provide a structured and maintainable student management solution suitable for academic and professional learning purposes.
