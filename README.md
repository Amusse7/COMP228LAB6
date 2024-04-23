# COMP228 - LAB6 ASSIGNMENT README FILE 🚀

## Description
This repository contains a Java application designed to handle multiple ATM transactions concurrently. The application implements functionalities for withdrawals and deposits, ensuring thread safety through synchronization. It utilizes the Java Runnable interface to create Transaction objects that perform operations on an Account class.

## Features
- **Thread Safety:** Utilizes synchronization to ensure safe concurrent execution of ATM transactions.
- **Account Management:** Implements an Account class with deposit and withdraw operations.
- **Transaction Handling:** Utilizes the Runnable interface to create Transaction objects that execute deposit and withdraw operations.
- **Multi-threading:** Uses ExecutorService and ArrayList to manage and execute multiple Transaction objects concurrently.
- **Results Display:** Provides a mechanism to display the results of the executed transactions.

## Prerequisites
- Java Development Kit (JDK)

## Usage
1. Clone the repository to your local machine.
2. Compile the Java source files.
3. Run the AccountTest class to execute multiple ATM transactions concurrently.
4. Monitor the console output to view the results of the executed transactions.

## Files Included
- **README.md:** Provides an overview of the project and instructions for usage.
- **Java Source Code:** Contains the source code for the Java application, including classes for Account, Transaction, and AccountTest.
- **Other necessary files:** Any additional files required for the proper functioning of the application.

## Author
Abdulkadir Musse

