/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pattern;

import java.util.Scanner;

/**
 *
 * @author subij
 */
public class Pattern4 {
    
    public void pattern(){
        
        int i,j,row;
        System.out.print("Enter the number of rows: ");
        Scanner s = new Scanner(System.in);
        row = s.nextInt();
        
        for(i=0; i<row; i++){
            System.out.print(" ");
            
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
         System.out.println();   
        }
         for(i=row-1;i>=0;i--){
             System.out.print(" ");
             
             for(j=0;j<=i-1;j++){
                 System.out.print("* ");
             }
             System.out.println();
         
        }
         s.close();
        
    }
    
    public static void main(String[] args){
        Pattern4 pat = new Pattern4();
        pat.pattern();
    }
    
}


