/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ooprweek9assignment2;

/**
 *
 * @author VAL-SBH-CL3-WS-46
 */
import java.util.Scanner;
public class OOPRWeek9Assignment2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            
            System.out.print("[ Enter a number from 1-10: ]");
            int number = scanner.nextInt();

      
            if (number == 1) {
                System.out.println("--One--");
            } else if (number == 2) {
                System.out.println("--Two--");
            } else if (number == 3) {
                System.out.println("--Three--");
            } else if (number == 4) {
                System.out.println("--Four--");
            } else if (number == 5) {
                System.out.println("--Five--");
            } else if (number == 6) {
                System.out.println("--Six--");
            } else if (number == 7) {
                System.out.println("--Seven--");
            } else if (number == 8) {
                System.out.println("--Eight--");
            } else if (number == 9) {
                System.out.println("--Nine--");
            } else if (number == 10) {
                System.out.println("--Ten--");
            } else {
                System.out.println("Invalid Number :(");
            }

          
            System.out.print("Again? y/n: ");
            choice = scanner.next().charAt(0);
            System.out.println(); 

        } while (choice != 'n' && choice != 'N'); 

        System.out.println("Exiting");
        scanner.close();
    }
}
