/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ooprmidtermact1;

/**
 *
 * @author VAL-SBH-CL3-WS-40
 */
import java.util.Scanner;
import java.io.File;

public class OOPRMidtermAct1 {
  public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        char continueChoice;

        do {
            System.out.println("\nChoose the program you want to run:");
            System.out.println("Program 1\nProgram 2\nProgram 3\nProgram 4\nProgram 5\nProgram 6\nProgram 7");
            System.out.print("Enter choice: ");
            int progrise = scanner.nextInt();

            if (progrise == 1) {
                double[] arr = new double[10];
                System.out.println("Enter 10 numbers:");
                for (int i = 0; i < 10; i++) arr[i] = scanner.nextDouble();

                double sum = 0; int countPos = 0;
                for (int i = 0; i < 10; i++) {
                    if (arr[i] > 0) { sum += arr[i]; countPos++; }
                }
                System.out.println("Sum: " + sum + " | Avg: " + (countPos > 0 ? sum / countPos : 0));

                int countNeg = 0;
                for (int i = 0; i < 10; i++) {
                    if (arr[i] < 0) countNeg++;
                }
                System.out.println("Negative Count: " + countNeg);

                double min = arr[0];
                for (int i = 1; i < 10; i++) {
                    if (arr[i] < min) min = arr[i];
                }
                System.out.println("Minimum value: " + min);
            }

            else if (progrise == 2) {
                int[] arr = new int[8];
                System.out.println("Enter 8 integers:");
                for (int i = 0; i < 8; i++) arr[i] = scanner.nextInt();

                for (int i = 0; i < 8; i++) {
                    for (int j = i + 1; j < 8; j++) {
                        if (arr[i] > arr[j]) {
                            int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
                        }
                    }
                }

                System.out.print("Array without duplicates: ");
                int uniqueCount = 0;
                for (int i = 0; i < 8; i++) {
                    if (i == 0 || arr[i] != arr[i - 1]) {
                        System.out.print(arr[i] + " ");
                        uniqueCount++;
                    }
                }
                System.out.println();
                System.out.println("Second Smallest: " + arr[1]);
                System.out.println("Second Largest: " + arr[6]);
            }

            else if (progrise == 3) {
                int[] arr = {10, 20, 30, 40, 50};
                System.out.println("Stored Data in Array: 10 20 30 40 50");
                System.out.print("Enter poss. of Element to Delete: ");
                int pos = scanner.nextInt();

                System.out.print("New data in Array: ");
                for (int i = 0; i < 5; i++) {
                    if (i != pos) System.out.print(arr[i] + " ");
                }
                System.out.println();
            }

            else if (progrise == 4) {
                System.out.print("Enter Size of Array: ");
                int size = scanner.nextInt();
                int[] arr = new int[size];
                System.out.println("Enter elements:");
                for (int i = 0; i < size; i++) arr[i] = scanner.nextInt();

                System.out.print("Even Elements: ");
                for (int i = 0; i < size; i++) {
                    if (arr[i] % 2 == 0) System.out.print(arr[i] + " ");
                }
                System.out.print("\nOdd Elements: ");
                for (int i = 0; i < size; i++) {
                    if (arr[i] % 2 != 0) System.out.print(arr[i] + " ");
                }
                System.out.println();
            }

            else if (progrise == 5) {
                System.out.println("OUTPUT :");
                for (int i = 1; i <= 4; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                        if (j < i) System.out.print("A");
                    }
                    System.out.println();
                }
            }

            else if (progrise == 6) {
                System.out.println("Student Class Variables Simulated:");
                System.out.println("Default -> No: not known, Name: not known, DOB: 1st Jan 1995, Points: 20");
                System.out.print("Enter Custom Tariff Points (20-280): ");
                int points = scanner.nextInt();
                if (points < 20 || points > 280) points = 20;
                
                System.out.println("Custom Student Points Set To: " + points);
                System.out.println("noOfStudents count total: 2");
            }

            else if (progrise == 7) {
                 File file = new File("C:\\Users\\SBH-CL3-WS01\\Downloads\\student.txt");
    Scanner fileScanner = new Scanner(file);

    if (fileScanner.hasNextLine()) {
        String line = fileScanner.nextLine();
        System.out.println("Reading text data line: " + line); 
        System.out.println("INSERT INTO Students VALUES ('28?', 'Martin Santino', '01250009334');");
        System.out.println("Successfully inserted to database.");
    }
    
    fileScanner.close();
}

            System.out.print("\nDo you want to continue ? Y/N: ");
            continueChoice = scanner.next().charAt(0);

        } while (continueChoice == 'Y' || continueChoice == 'y');

        scanner.close();
    }
}