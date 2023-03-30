/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

import static java.lang.Math.sqrt;
import java.util.ArrayList;

/**
 *
 * @author subij
 */
public class CheckFibo {
    public static void main(String[] args){
        int result = checkFibo(13);
        System.out.println(result);
        
        result = checkFibo(34);
        System.out.println(result);
         result = checkFibo(500);
        System.out.println(result);
    }
    static int checkFibo(int n){
       /* int isFibo = 0;
        int[] store = new int[n];
        store[0]=0;
        store[1]=1;
        if(n>=0){
            for(int i=2;i<n;i++){
                  
                store[i] = store[i-1] + store [i-2];
            }
            
            for(int i =0; i<store.length; i++){
                if(n == store[i]){
                    isFibo = 1;
                    break;
                }
            }
        }
        
        return isFibo;
    }*/
       
        int isFibo = 0;
        
        int formula1 = (5*n*n + 4);
        int formula2 = (5 *n*n -4);
        
        int s= (int) sqrt(formula1);
        int t= (int) sqrt(formula2);
        
        if(s == sqrt(formula1) || t == sqrt(formula2)){
            isFibo = 1;
        }
        else 
            isFibo = 0;
       /* 
        if(isPerfectSquare(formula1) || isPerfectSquare(formula2)){
            return 1;
        } else{
            return 0;
        }
    */
       return isFibo;
    }
    
   /*boolean isPerfectSquare(int x){
        int s = (int) sqrt(x);
        return(s*s==x);
    }*/
    
}
