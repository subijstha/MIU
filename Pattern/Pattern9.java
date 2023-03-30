/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pattern;

/**
 *
 * @author subij
 */
public class Pattern9 {
    
    public static void main(String[] args){
        
        int i,j,row = 10;
        
        for(i=1 ; i<row ; i++){
            
            System.out.print(" ");
            
            for(j = 1 ; j <= i ; j++){
                
                System.out.print(--row + " ");
            }
            row = 10;
            
            System.out.println();
        }
     
        
    }
}
