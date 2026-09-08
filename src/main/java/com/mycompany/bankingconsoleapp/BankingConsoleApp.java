package com.mycompany.bankingconsoleapp;

import java.util.Scanner;
import java.util.InputMismatchException;

public class BankingConsoleApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=========================================");
        System.out.println("     ROSEBANK INTERNATIONAL BANKING      ");
        System.out.println("=========================================");
        
        // Initial configuration: Gather setup parameters
        System.out.print("Enter Customer First Name: ");
        String firstName = input.nextLine();
        
        System.out.print("Enter Customer Surname:    ");
        String lastName = input.nextLine();
        
        double openingBalance = 0.0;
        boolean validBalance = false;
        
        // Validation loop guarding initial double parameters
        while (!validBalance) {
            try {
                System.out.print("Enter Account Opening Balance: R ");
                openingBalance = input.nextDouble();
                if (openingBalance < 0) {
                    System.out.println("Opening balance cannot be negative.");
                } else {
                    validBalance = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid numeric input layout. Please re-enter a valid amount.");
                input.next(); // Clear the junk characters from scanner cache stream buffer
            }
        }

        // Initialize the encapsulated object tracking reference variables
        BankAccount userAccount = new BankAccount(firstName, lastName, openingBalance);
        
        int choice = 0;
        
        // Master loop displaying interactive selections until Exit code 4 is chosen
        while (choice != 4) {
            System.out.println("\n===== BANKING MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            try {
                choice = input.nextInt();
                
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: R ");
                        double depAmt = input.nextDouble();
                        userAccount.deposit(depAmt);
                        break;
                        
                    case 2:
                        System.out.print("Enter amount to withdraw: R ");
                        double withAmt = input.nextDouble();
                        userAccount.withdraw(withAmt);
                        break;
                        
                    case 3:
                        userAccount.viewBalance();
                        break;
                        
                    case 4:
                        System.out.println("\nThank you for banking with Rosebank International. Goodbye!");
                        break;
                        
                    default:
                        System.out.println("Invalid structural option selected. Choose a number between 1 and 4.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input parsing error: Please choose a valid numeric option from the menu.");
                input.next(); // Flush out mismatching tokens to protect looping cycles from crashing
                choice = 0;   // Force value reset to safely preserve looping context states
            }
        }
        
        input.close();
    }
}

