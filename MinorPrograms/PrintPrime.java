/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MinorPrograms;

import java.util.Scanner;

/**
 *
 * @author subij
 */
public class PrintPrime {
     public static void main(String[] args){
      
         int flag = 0;
         int i,j;
         int count = 0;
         
         for(i = 1 ; i<=100 ; i++){
             
             for(j=2; j<=i-1; j++){
                 if(i%j==0){
                     flag = flag + 1;
                 }
             }
             if(flag == 0){
                 System.out.print(i + " " );
                 count++;
             }
             else
                 flag = 0;
         }
         System.out.println("");
         System.out.println(" The total number of prime numbers in between 1 and 100 is: " + count);
        
     }
}
