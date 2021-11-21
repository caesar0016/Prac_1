/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package print.name;

import java.util.Scanner;

/**
 *
 * @author Caesar
 */
public class PrintName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner prac_1 = new Scanner(System.in);
    
    System.out.print("Enter the base attack speed: ");
    double speed = prac_1.nextDouble();
    
    System.out.print("Enter the bonus attack speed%: ");
    double speed_1 = prac_1.nextDouble();
    
    System.out.print("Enter level:");
    int level = prac_1.nextInt();
    
    double prod = speed * ( 1 + ( speed_1 / 100) * (level -1));
     
    System.out.printf("Character's current attack speed: " + "%.3f", prod);
    System.out.println();
    
    
    
      }
    }
    
