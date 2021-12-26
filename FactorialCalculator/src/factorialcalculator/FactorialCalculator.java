/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialcalculator;

import java.util.Scanner;

/**
 *
 * @author Caesar
 */
public class FactorialCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to program!!!");
    
        
        for (int a = 1; a <=5; a++){ //5 is how many times the factorial will run
            
            System.out.println("");
            System.out.print("Enter Positive Integer: ");
        
        int pos1 = scan.nextInt();
       
        
        if (pos1<0){ //checking if the number is negative
        System.out.println("Error Input!!! Program Stop...");
       break;
             
}
        if (pos1>1){ //pos1 is the user input
        int n=pos1,fact=1;
 
	        for(int i=1;i<=n;i++)
	  	  {
 
	    	   fact=fact*i;
 	 	  }
              
 	        System.out.println("The Factorial of " + pos1 + " = " + fact);
                System.out.print(pos1 + "!= ");
                System.out.print("1");
                
                for (int b = 2; b<=pos1; b++){
                System.out.print(" x "+b);
       
        
        
    
        }
        
        }
        }
    }
    
    }
    

