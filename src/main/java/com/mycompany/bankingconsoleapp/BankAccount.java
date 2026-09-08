package com.mycompany.bankingconsoleapp;

public class BankAccount {
    private String name;
    private String surname;
    private double balance;

    public BankAccount(String name, String surname, double initialBalance) {
        this.name = name;
        this.surname = surname;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be greater than zero.");
        } else {
            this.balance += amount;
            System.out.printf("Successfully deposited: R %.2f\n", amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be a positive number.");
        } else if (amount > this.balance) {
            System.out.println("Error: Insufficient funds available to fulfill withdrawal request.");
        } else {
            this.balance -= amount;
            System.out.printf("Successfully withdrew: R %.2f\n", amount);
        }
    }

    public void viewBalance() {
        System.out.println("\n-----------------------------------------");
        System.out.println("ACCOUNT BALANCE STATEMENT");
        System.out.println("-----------------------------------------");
        System.out.println("Account Holder: " + this.name + " " + this.surname);
        System.out.printf("Current Balance: R %.2f\n", this.balance);
        System.out.println("-----------------------------------------");
    }

    public String getName() { return name; }
    public String getSurname() { return surname; }
    public double getBalance() { return balance; }
}
