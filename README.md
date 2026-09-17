# 🏦 Standalone Banking Console Application

An interactive, object-oriented Java console application developed as an independent programming exercise. The application simulates standard banking operations, enforcing proper data encapsulation, validation checks, and robust error handling to prevent runtime crashes.

---

## ✨ Features Implemented
* **Strict Data Encapsulation:** Account balances, customer first names, and surnames are declared as private fields with accessible getter methods.
* **Transaction Math & Boundaries:** Enforces positive value boundaries on deposit fields and includes insufficient fund checks to reject invalid withdrawals.
* **Graceful Crash Protection:** Utilizes robust `try-catch` structures inside execution loop tokens to intercept input parsing mismatches (e.g., entering text letters instead of numeric digits) without breaking terminal cycles.
* **Monetary Precision Layout:** Formats all statement balances to two decimal places matching standard South African Rand (`R`) requirements.

---

## 🛠️ Project Structure
* **`BankAccount.java`**: The blueprint class defining internal account status attributes, constructor methods, validation parameters, and transaction functions.
* **`BankingConsoleApp.java`**: The main executive driver program handling the scanner cache streams, interactive selections menu loop routing, and exception block guards.

---


