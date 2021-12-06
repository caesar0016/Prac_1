/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grosspaycalculator;

import java.util.Scanner;

/**
 *
 * @author Caesar
 */
public class GrossPayCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter First name: ");
        String name1 = scan.next();
        
        System.out.print("Enter Last Name: ");
        String name2 = scan.next();
        
        System.out.println("Press (F) if full time or press (P) if part time");
        String job = scan.next();
        
        
        try {  // FullTime
         if(job.equals("F") || job.equals ("f")){
        
        System.out.println("_____Full Time_____");     
        
        System.out.print("");
        System.out.print("Basic Pay: ");
        double salary1 = scan.nextDouble();
       
        System.out.println("______________________________");
        
        System.out.println("Name: " + "" + name1 + " " +name2);
       
        System.out.println("Basic Pay: " + "" + salary1);
        System.out.println("______________________________");
        System.out.println("Grosspay: " + "" + salary1);
        

        
        }
        
        else if (job.equals("P")|| job.equals("p")){
        
        System.out.println("_____Part Time_____");   //part time

        System.out.print("Enter rate per hour: ");
        double rate = scan.nextDouble();
        
        System.out.print("Enter the no. of hours worked: ");
        double hours = scan.nextDouble();
        
        System.out.print("Enter the no. of  overtime: ");
        double time = scan.nextDouble();
        
        double formula1 = time * (rate * 1.25);   //the formula of part time
        double formula2 = rate*hours;
        
        System.out.println("______________________________");   
        System.out.println("Employee Name: " + name1 + " " + name2);
        System.out.println("Basic Pay: " + formula2);
        System.out.println("Overtime Pay:" + formula1);
        
        System.out.println("______________________________");
        System.out.println("Gross Pay:" + (formula1+formula2));
        
        
        }
        
        } 
        catch (Exception e){
                
                System.out.println("Error Input!!");
                
                }
      
    }   
    
    
}
