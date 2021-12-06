/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skecth;

import java.util.Scanner;



/**
 *
 * @author Caesar
 */
public class Skecth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner scan = new Scanner (System.in);
        
        
        System.out.print("Enter Name: ");
        String name1 = scan.next();
        
        System.out.println("Enter F or P");
        String age1 = scan.next();
        
        
        try {
        
            switch (age1){
        
            case "f":
                    case "F":
                System.out.println("Enter Basic Pay: ");
                double basic = scan.nextDouble();
                System.out.println("Basic Pay: " + basic);
                
                
                break;
        
            case "p":
            case "P":
                System.out.println("boo");
                break;
                
            default:
                System.out.println("nahhhh");
        
        
        
        
        }
        
        }
        
        
        catch (Exception e){
        
            System.out.println("Error Input!");
            
        }
        
        
        
        
        
}
}