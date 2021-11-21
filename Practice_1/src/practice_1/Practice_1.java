/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_1;

import java.util.Scanner;

/**
 *
 * @author Caesar
 */
public class Practice_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner prac_1 = new Scanner(System.in);
        System.out.print("Enter number:");
        
        int pass_1 = prac_1.nextInt();
        
        if ( pass_1 >= 90 && pass_1 <=100 ){
            System.out.println("Class S");
       
        }   else if ( pass_1 >= 85 && pass_1 <=89 ){
            System.out.println("Class A");
        
        }   else if ( pass_1 >= 80 && pass_1 <= 84 ){
            System.out.println("Class B");
        
        }   else if (pass_1 >= 75 && pass_1 <= 79 ){
            System.out.println("Class C");
            
        }   else if (pass_1 >= 1 && pass_1 <= 74){
            System.out.println("Class F");
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
       }


        
          
