/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class PrimeHappy {
    
    public static void main(String[] args){
       
         System.out.println(isPrimeHappy(5));
          System.out.println(isPrimeHappy(25));
           System.out.println(isPrimeHappy(32));
            System.out.println(isPrimeHappy(8));
            
         System.out.println(isPrimeHappy(29));
    }
    static int isPrimeHappy(int n){
        int sum =0;
        
        
        for(int i=2; i<n ; i++){
            if(isPrime(i)){
                sum += i;
            }
        }
        if(sum % n == 0)
            return 1;
        
        return 0;
    }
    
    static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    
}
