/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

import static MIUQuestions.Porcupine.isPrime;

/**
 *
 * @author subij
 */
public class LargestPrrimeFactor {
    
 
    public static void main(String[] args){
        System.out.println(largestPrimeFactor(20));
    }
    
    static int largestPrimeFactor(int n){
        
        int largestPrime =0;
        if(n <=1 ) return 0;
        
        for(int i=2; i<=n; i++){
            
            if(n%i == 0){
                
                if(isPrime(i)==1){
                    
                        largestPrime = i;
                }
            }
        }
        return largestPrime;
    }
}  

