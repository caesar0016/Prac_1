/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Caesar
 */
public class Cinema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yy");
        Date date = new Date();
        
        int tix2 = 150;
       
        System.out.println("Welcome to Cinema Reservation");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        
        System.out.println(dtf.format(now));  
        System.out.println("Menu:");
        System.out.println("1. Book Movies \n2. Exit");
        System.out.print("Choice:");
        int num1 = scan.nextInt();
        
        int min = 0001;
        int max = 9999;
        int b = (int)(Math.random()*(max-min+1)+min);
        
        if (num1==1) {
            
            System.out.println("Movies Schedule:");
            System.out.println(dtf.format(now));  
            
            String list_1 [] = {"1. Spider-Man", "2. Eternals", "3. Shrek" };
                
            }
            
        else if(num1==2){
    
            System.out.println("Menu:");
            System.out.println("Enter no of Tickets:");
            int tix = scan.nextInt();
            
            double formula = tix*tix2;
            
            for (int i = 1; i<=tix; i++){
            
                System.out.println("Ticket No: " + b  );
                System.out.println("Serial No:" + Math.random());
                System.out.println("--------------------------");
                
           
            }
            System.out.println("--------------------------");
            System.out.println("Total: " + formula);
            
    
    }
        
        
        }
        
        
        
        }
        
        
        
        
        
        
    
    

//time
//serial number
//20 slots