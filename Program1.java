/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

import java.util.Scanner;

/**
 *
 * @author subij
 */
public class Program1 {
    
        
    static int nextPerfectSquare(int x){
        int y = 0;
        
        if(x==0){
            return 1;
        }
        
        if(x<=0){
            return 0;
        }
        for(int i=1; i<=x; i++){
            
             if(i*i > x ){
                y = i*i;
            break;
           
            }
        }
        return y;
            
       
        
    }
    
    public static void main(String[] args){
        int a,z,y;
        
        y = nextPerfectSquare(8);
        a = nextPerfectSquare(36);
        z = nextPerfectSquare(-5);
        
        System.out.println(y + " is next perfect square" );
        System.out.println(a + " is next perfect square" );
        System.out.println(z + " is next perfect square" );
        
        
    }
    
}
