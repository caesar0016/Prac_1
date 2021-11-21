/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;



/**
 *
 * @author Caesar
 */
public class JavaApplication5 {

public static void main(String[] args){
    
    Scanner class_0 = new Scanner(System.in); 
    
    System.out.println("Welcome to Class Calculation!");
    System.out.print("Enter number of Males: ");
    int Males = class_0.nextInt();
    
    System.out.print("Enter number of Females: ");
    float Females = class_0.nextInt();
    float product_1 = (Males+Females); 
    
    System.out.println("Total Students: " + "" + product_1); //total 1
  
    float percent_1 = (float) (Males*100/product_1); //formula
    float percent_2 = (float) (Females*100/product_1);
    
    System.out.println("_____________________________________");
    
    System.out.println("");
    
    System.out.printf("Percentage of Males: " + "%.2f", percent_1 );
    System.out.print("%");
    System.out.println("");
    
    System.out.printf("Percentage of Females: " + "%.2f", percent_2);
    System.out.print("%");
    System.out.println("");
    
    System.out.println("Total Percentage: " + "" + (percent_1 + percent_2) + "%"); //total 2
    
    
    
}   
}
  