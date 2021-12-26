/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Caesar
 */
public class Practice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       System.out.println("Enter first name");
       String name1 = scan.nextLine();
       
       System.out.println("Enter first name");
       String name2 = scan.nextLine();
       
       System.out.println(name1.toLowerCase() + "_" + name2.toLowerCase()); 
       
        
        
    }


}