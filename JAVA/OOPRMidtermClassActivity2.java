/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ooprmidtermclassactivity2;

/**
 *
 * @author VAL-SBH-CL3-WS-48
 */

import java.util.Scanner; //scanner
import java.time.LocalDate; //use current date
import java.time.temporal.ChronoUnit; //measuring tape
import java.time.format.DateTimeFormatter; // date formatting
import java.time.format.DateTimeParseException; //turn text to dates
import java.util.InputMismatchException; //wrong inputs tee heee

public class OOPRMidtermClassActivity2 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("==WELCOME TO THE LIBRARY== (please be quiet)");

        String Name = ""; 

        while (true) { //makes it a loop
            System.out.println("Enter your name: ");
            Name = scanner.nextLine();

            if (Name.matches("^[a-zA-Z ]+$")) { //only letters
                break; 
            } else {
                System.out.println("Nice try genius, names can only contain letters >;p ");
            }
        } 

        try {
            System.out.println("Welcome " + Name); 
            
            System.out.println("Enter your book's name: ");
            String book = scanner.nextLine();

            int TotalPages = 0;
            while (true) {
                System.out.println("Enter your books total pages: ");
                String input = scanner.nextLine();
                try {
                    TotalPages = Integer.parseInt(input);
                    if (TotalPages > 0) {
                        break; 
                    } else {
                        System.out.println("A book must have at least 1 page, smart guy.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("That is not a valid page number. Numbers only!");
                }
            }

            int PagesRead = 0;
            while (true) {
                System.out.println("Enter total pages read: ");
                String input = scanner.nextLine();
                try {
                    PagesRead = Integer.parseInt(input);
                    if (PagesRead < 0) {
                        System.out.println("You can't read negative pages!");
                    } else if (PagesRead > TotalPages) {
                        System.out.println("Nice try, you can't read more pages than the book actually has!");
                    } else {
                        break; // Valid progress amount! Exit loop.
                    }
                } catch (NumberFormatException e) {
                    System.out.println("That is not a valid page number. Numbers only!");
                }
            }
            
            double percentComplete = ((double) PagesRead / TotalPages) * 100;

            System.out.println("Enter the Date issued (YYYY-MM-DD) example(2007-03-28): ");
            String issuedInput = scanner.nextLine(); 
            LocalDate dateIssued = LocalDate.parse(issuedInput, formatter);

            System.out.println("Enter the Date due (YYYY-MM-DD) example(2007-03-28): "); 
            String DueInput = scanner.nextLine(); 
            LocalDate dateDue = LocalDate.parse(DueInput, formatter);

            LocalDate today = LocalDate.now(); 

            long daysLeft = ChronoUnit.DAYS.between(today, dateDue);

            System.out.println("\n[----- Library -------]");
            System.out.println("Book: " + book);
            System.out.println("Current Date: " + today);
            System.out.println("Date Issued: " + dateIssued);
            System.out.println("Date Due: " + dateDue);
            System.out.printf("Book complete percentage: %.1f%%\n", percentComplete); 
            System.out.println("[----------------------]");

            if (daysLeft > 0) {
                System.out.println("You still have " + daysLeft + " days remaining."); 
            }
            else if (daysLeft == 0) {
                System.out.println("Your book is due today please bring it back or i will find you."); 
            }
            else {
                long daysOverdue = Math.abs(daysLeft);
                System.out.println("Your book is overdue by " + daysOverdue + " days... run."); 
            }

        }
        catch (DateTimeParseException e) {
            System.out.println("Nice try, that's an invalid date. No error for you!"); 
        }
        finally {
            scanner.close();
        }    
    }
}
