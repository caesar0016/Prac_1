/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package favoritesong.java;

import java.util.Scanner;

/**
 *
 * @author Caesar
 */
public class FavoriteSongJava {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args){
    Scanner Grade_1 = new Scanner(System.in);
    System.out.println("Enter your Grade");
    int Grade = Grade_1.nextInt();
    System.out.println(Grade)
            
    if (Grade>=95 && Grade <=100){
        System.out.println("S");
        
           else if (Grade>=90 && Grade <=94){
        System.out.println("A");
        
        else if (Grade>=80 && Grade <=90){
        System.out.println("B");
        
           else  if (Grade>=70 && Grade <=80){
        System.out.println("C");
        
           else if (Grade>=60 && Grade <=70){
        System.out.println("E");
        
                else if (Grade>=50 && Grade <=60){
        System.out.println("E");
    }
    }
}