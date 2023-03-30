/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class FactorialPrime {
    
    public static void main(String[] args){
        System.out.println(isFactorialPrime(2));
        System.out.println(isFactorialPrime(3));
        System.out.println(isFactorialPrime(7));
        System.out.println(isFactorialPrime(8));
        System.out.println(isFactorialPrime(11));
    }
    
    static int isFactorialPrime(int n){
        
        if (n<1) return 0;
        
        if(isPrime(n)){
          for(int i=0; i<n ; i++){
              if((fact(i) + 1 )== n ){
                  return 1;
              }
          }
        }
        return 0;
    }
    
    static boolean isPrime(int a){
        for(int i=2; i<a/2 ; i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
    
    static int fact(int a){
       int fact = 1;
       
       if(a == 0)
           return 1;
       if(a>0)
          return a* fact(a-1) ;
                 
    }
}
