 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes2;


import java.util.Scanner;

/**
 *
 * @author Caesar
 */
public class Tes2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
   System.out.print("Enter 1 or 2:");
   int num1 = scan.nextInt();
   
       if (num1==1){
       
       System.out.println("Enter 2 or 3");
       int num2 = scan.nextInt();
       
       if (num2==2){
       
       System.out.println("number 4");
       
       }
       else if(num2==3){
       
       System.out.println("number4");
       
       }
       
       }
       else if (num1==2){
    
           System.out.println("Number 2");
    
    }
       else {
       
       System.out.println("Input Error");
       
       }
       
       }
   }
    
 
    
    

