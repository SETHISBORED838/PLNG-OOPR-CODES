/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week7assignment2midterms;

/**
 *
 * @author VAL-SBH-CL3-WS-48
 */
import java.util.Scanner;

public class Week7Assignment2Midterms {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a letter");
        char Letter = scanner.next().charAt(0);

        if (Letter == 'a' || Letter == 'e' || Letter == 'i' || Letter == 'o' || Letter == 'u') {
          System.out.println("-------------------");
          System.out.println("Its a Vowel");
        }
         else {
            System.out.println("-------------------");
            System.out.println("Its a Cosonant");
        }
     scanner.close();
            
        }
    }


