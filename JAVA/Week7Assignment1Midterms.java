/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week7assignment1midterms;

/**
 *
 * @author VAL-SBH-CL3-WS-48
 */
import java.util.Scanner;

public class Week7Assignment1Midterms {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int N = scanner.nextInt();

        if (N % 2 == 0) {
          System.out.println("-------------------");
          System.out.println("Its an Even number");
        }
         else {
            System.out.println("-------------------");
            System.out.println("Its an Odd number");
        }
     scanner.close();
            
        }
    }