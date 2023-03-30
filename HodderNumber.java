/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class HodderNumber {
    
    public static void main(String[] args){
           System.out.println(isHolderNumber(3));
        System.out.println(isHolderNumber(7));
        System.out.println(isHolderNumber(31));
        System.out.println(isHolderNumber(127));
    }
    static int isHolderNumber(int n){
            
        if(isPrime(n)){
            int product =1;
            int temp =0;
            
            while(temp<n){
                product *= 2;
                temp = product -1;
            }
            
            if(temp ==n)return 1;
         
            else return 0;
           }
        
        
        return 0;
    }
    static boolean isPrime(int n){
        for(int i=2; i<n/2 ; i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
   
}
