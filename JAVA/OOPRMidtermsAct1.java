/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ooprmidtermsact1;

/**
 *
 * @author VAL-SBH-CL3-WS-46
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class OOPRMidtermsAct1 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            char continueChoice;
            
            //choose programn
            do {
                System.out.println("\nChoose the program you want to run:");
                System.out.println("Program 1\nProgram 2\nProgram 3\nProgram 4\nProgram 5\nProgram 6\nProgram 7");
                System.out.print("Enter choice: ");
                int progrise = scanner.nextInt();
                
                // sum average and minimum
                if (progrise == 1) {
                    
                    int totalNumbers = 10;
                    //input numbers
                    double[] arr = new double[totalNumbers];
                    System.out.println("Enter " + totalNumbers + " numbers:");
                    for (int i = 0; i < totalNumbers; i++) {
                        arr[i] = scanner.nextDouble(); 
                    }
                    
                    double sum = 0;
                    int countPos = 0;
                    for (int i = 0; i < totalNumbers; i++) {
                        if (arr[i] > 0) {
                            sum += arr[i];
                            countPos++;
                        }
                    }
                    System.out.println("Sum: " + sum + " | Avg: " + (countPos > 0 ? sum / countPos : 0));
                    
                    int countNeg = 0;
                    for (int i = 0; i < totalNumbers; i++) {
                        if (arr[i] < 0) {
                            countNeg++;
                        }
                    }
                    System.out.println("Negative Count: " + countNeg);
                    
                    double min = arr[0];
                    for (int i = 1; i < totalNumbers; i++) {
                        if (arr[i] < min) {
                            min = arr[i];
                        }
                    }
                    System.out.println("Minimum value: " + min);
                }
                //get the second smallest and biggest number
                else if (progrise == 2) {
                    
                    int totalElements = 8;
                    
                    int smallestPos = 1; // second smallest number
                    int largestPos = 6;  // second largest
                    
                    //enter elements
                    int[] arr = new int[totalElements];
                    System.out.println("Enter " + totalElements + " integers:");
                    for (int i = 0; i < totalElements; i++) {
                        arr[i] = scanner.nextInt();
                    }
                    // bubble sort
                    for (int i = 0; i < totalElements; i++) {
                        for (int j = i + 1; j < totalElements; j++) {
                            if (arr[i] > arr[j]) {
                                int temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                            }
                        }
                    }

                    System.out.print("Array without duplicates: ");
                    int uniqueCount = 0;
                    for (int i = 0; i < totalElements; i++) {
                        if (i == 0 || arr[i] != arr[i - 1]) {
                            System.out.print(arr[i] + " ");
                            uniqueCount++;
                        }
                    }
                    System.out.println();
                    System.out.println("Second Smallest: " + arr[smallestPos]);
                    System.out.println("Second Largest: " + arr[largestPos]);
                }
                //deleting an number
                else if (progrise == 3) {
                    
                    int[] arr = {10, 20, 30, 40, 50};
                    String displayedText = "10 20 30 40 50";
                    //inputs position
                    System.out.println("Data in the Array: " + displayedText);
                    System.out.print("Enter position of the number to Delete: ");
                    int pos = scanner.nextInt();
                    
                    System.out.print("New data in Array: ");
                    for (int i = 0; i < arr.length; i++) {
                        if (i != pos) {
                            System.out.print(arr[i] + " ");
                        }
                    }
                    System.out.println();
                }
                //odd and even separade
                else if (progrise == 4) {
                    System.out.print("Enter Size of Array: ");
                    int size = scanner.nextInt();
                    int[] arr = new int[size];
                    System.out.println("Enter elements:");
                    for (int i = 0; i < size; i++) {
                        arr[i] = scanner.nextInt();
                    }
                    
                    System.out.print("Even Elements: ");
                    for (int i = 0; i < size; i++) {
                        if (arr[i] % 2 == 0) {
                            System.out.print(arr[i] + " ");
                        }
                    }
                    System.out.print("\nOdd Elements: ");
                    for (int i = 0; i < size; i++) {
                        if (arr[i] % 2 != 0) {
                            System.out.print(arr[i] + " ");
                        }
                    }
                    System.out.println();
                }
                //makes A Staircase literally
                else if (progrise == 5) {
                
                    int maxRows = 4;
                    String mainSymbol = "*";
                    String middleSymbol = "A";
                    
                    System.out.println("OUTPUT :");
                    for (int i = 1; i <= maxRows; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(mainSymbol);
                            if (j < i) {
                                System.out.print(middleSymbol);
                            }
                        }
                        System.out.println();
                    }
                }
                //student variable simulate
                else if (progrise == 6) {
                    
                    int minAllowed = 20;
                    int maxAllowed = 280;
                    int backupValue = 20;
                    
                    System.out.println("Student Class Variables Simulated:");
                    System.out.println("Default -> No: not known, Name: not known, DOB: 1st Jan 1995, Points: " + backupValue);
                    System.out.print("Enter Custom Tariff Points (" + minAllowed + "-" + maxAllowed + "): ");
                    
                    int points = scanner.nextInt();
                    if (points < minAllowed || points > maxAllowed) {
                        points = backupValue;
                    }
                    
                    System.out.println("Custom Student Points Set To: " + points);
                    System.out.println("noOfStudents count total: 2");
                }
                
                else if (progrise == 7) {
                    //tells what file to look into
                    File file = new File("data.txt");

                    //looks at the file
                    try (Scanner fileScanner = new Scanner(file)) {
                        String line = fileScanner.nextLine();
                        
                        //print the data text
                        System.out.println(" " + line);
                    }
                    //if its nothing because it keeps on crashing without 
                    catch(FileNotFoundException e){System.out.println("not found");}
}

                System.out.print("\nDo you want to continue ? Y/N: ");
                continueChoice = scanner.next().charAt(0);
                
            } while (continueChoice == 'Y' || continueChoice == 'y');
        }
    }
}

