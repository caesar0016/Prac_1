/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savings_system;

import java.util.Scanner;

/**
 *
 * @author Caesar
 */
public class Savings_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Zavings = new Scanner(System.in);
    System.out.print("Enter Name: ");
    String Name = Zavings.nextLine();
    System.out.println("Hello! " + Name ); 
    
    
    System.out.print("Pls Enter your daily savings:");
    double savings = Zavings.nextDouble();
    
    int week = 7;
    int month = 31;
    int year = 365;
    
    double product_1 = (double) (savings*week);   
    double product_2 = (double)(savings*month);
    double product_3 = (double) (savings*year);
    
    System.out.println("Your savings per week:" + product_1 );
    System.out.println("Your savings per month:" + product_2);
    System.out.println("Your savings per year:" + product_3);
    
    System.out.println("Thank you for using savings system...");
    
    System.out.print("Enter netpay:");
    int netpay = Zavings.nextInt();
    System.out.println("your savings " + "" + netpay);
    
    
    
    }
    
}
