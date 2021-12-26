/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package name;

import java.util.Scanner;

/**
 *
 * @author Caesar
 */
public class Name {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
System.out.println("Enter three first name");
        
       System.out.print("Enter Name:");
       String name1 = scan.nextLine();
       
       System.out.print("Enter Name:");
       String name2 = scan.nextLine();
       
       System.out.print("Enter Name:");
       String name3 = scan.nextLine();
       		
    System.out.println("1."+name1 + " " + name2);
    System.out.println("2."+name1 + " " + name3);
    System.out.println("3."+name2 + " " + name1);
    System.out.println("4."+name2 + " " + name3);
    System.out.println("5."+name3 + " " + name1);
    System.out.println("6."+name3 + " " + name2);
                        
    System.out.println("Enter 1-6 to select a name");
    System.out.print("Enter:");
    int name_select = scan.nextInt();
  
    if (name_select==1){
                        
      System.out.print("The initials for " + name1 + " " + name2 + " " + "is ");    
      System.out.print(name1.charAt(0));
      System.out.println(name2.charAt(0) + ".");
      System.out.println( "Suggested name: " + name1.toLowerCase() + "_" + name2.toLowerCase());
                        
 }
    else if (name_select==2){
      System.out.print("The initials for " + name1 + " " + name3 + " " + "is ");    
      System.out.print(name1.charAt(0));
      System.out.println(name3.charAt(0) + ".");
      System.out.println( "Suggested name: " + name1.toLowerCase() + "_" + name3.toLowerCase());                
                       
                        }
    else if (name_select==3){
        
      System.out.print("The initials for " + name2 + " " + name1 + " " + "is ");    
      System.out.print(name2.charAt(0));
      System.out.println(name1.charAt(0) + ".");
      System.out.println( "Suggested name: " + name2.toLowerCase() + "_" + name1.toLowerCase());
    
    
    }
             
     else if (name_select==4){
     
      System.out.print("The initials for " + name2 + " " + name3 + " " + "is ");    
      System.out.print(name2.charAt(0));
      System.out.println(name3.charAt(0) + ".");
      System.out.println( "Suggested name: " + name2.toLowerCase() + "_" + name3.toLowerCase());
    
    
    }
    else if (name_select==5){
       
      System.out.print("The initials for " + name3 + " " + name1 + " " + "is ");    
      System.out.print(name3.charAt(0));
      System.out.println(name1.charAt(0) + ".");
      System.out.println( "Suggested name: " + name3.toLowerCase() + "_" + name1.toLowerCase()); 
    
    
    }
     else if (name_select==6){
         
      System.out.print("The initials for " + name3 + " " + name2 + " " + "is ");    
      System.out.print(name3.charAt(0));
      System.out.println(name2.charAt(0) + ".");
      System.out.println( "Suggested name: " + name3.toLowerCase() + "_" + name2.toLowerCase());
    
    
    }
    
     else {
         
         System.out.println("Input Error!!!!");
         
         
     }}

    
    
   } 
 
        
        
        
       
    
    

