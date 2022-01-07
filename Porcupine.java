/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class Porcupine {
    public static void main(String[] args){
        int result = findPorcupineNumber(2);
        System.out.println(result);
        
         result = findPorcupineNumber(138);
        System.out.println(result);
        
         result = findPorcupineNumber(139);
        System.out.println(result);
    }
    
    static int findPorcupineNumber(int n){
        
        int porcupine = 0;
        int max = Integer.MAX_VALUE;
        boolean isPorcupine = false;
        n++;
        while(n<max){
            if(isPorcupine){
                if(isPrime(n)==1){
                    if(n%10 == 9){
                        break;
                    }else{
                        isPorcupine = false;
                    }
                }
            }else{
                if(isPrime(n) ==1 ){
                    if(n%10 == 9){
                        isPorcupine = true;
                        porcupine = n;
                    }
                }
                
            }
            
            n++;
        }
        return porcupine;
    }
    
    static int isPrime(int number){
        int isPrime = 1;
        if(number >1 ){
            for (int i=2 ; i<= number/2 ; i++){
                if(number % i == 0){
                    isPrime = 0 ;
                    break;
                }
            }
           
         }
       return isPrime;
    }
}