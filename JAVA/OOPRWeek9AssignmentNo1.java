/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ooprweek9assignmentno1;

/**
 *
 * @author VAL-SBH-CL3-WS-46
 */

import java.util.Scanner;
public class OOPRWeek9AssignmentNo1 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print("[--( LoOOooOooOp in Programming )--]\n");
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("\nChoose which loop to use:");
        System.out.println("[1] For Loop");
        System.out.println("[2] While Loop");
        System.out.println("[3] Do-While Loop");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();
        System.out.println();
        
        switch (choice) {
            case 1 -> {
                System.out.println("--- Using For Loop ---");
                for (int i = 0; i < 5; i++) {
                    System.out.println(name);
                }
            }
                
            case 2 -> {
                System.out.println("--- Using While Loop ---");
                int w = 0;
                while (w < 5) {
                    System.out.println(name);
                    w++;
                }
            }
                
            case 3 -> {
                System.out.println("--- Using Do-While Loop ---");
                int dw = 0;
                do {
                    System.out.println(name);
                    dw++;
                } while (dw < 5);
            }
                
            default -> System.out.println("Invalid choice Please run the program again and select 1, 2, or 3.");
        }
        
        scanner.close();
    }
}
        
        
   
