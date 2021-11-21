/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author Caesar
 */
import java.util.Scanner;  // Import the Scanner class

/**
 *
 * @author Caesar
 */
public class JavaApplication6 {
  public static void main(String[] args) {
    Scanner trip = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter name");

    String Name = trip.nextLine();  // Read user input
    System.out.println("Hello! " + Name);  // Output user input
    
   
    System.out.println("Enter Age");
    int Age = trip.nextInt();
    
    System.out.println("Input your savings");
    int savings = trip.nextInt();
    System.out.println("Your savings is" + " " + savings);
    
  
  }
}