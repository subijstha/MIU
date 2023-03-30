/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pattern;

/**
 *
 * @author subij
 */
public class Pattern2 {
    public static void main(String[] arg){
        for(int i = 0; i<5; i++){
            System.out.print(" ");
            
            for(int j=2*(5-i);j>=0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print( "* ");
            }
            System.out.println();
        }
       
    }
}
