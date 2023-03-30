/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;
import java.util.Arrays;


/**
 *
 * @author subij
 */
public class EncodeNumberr {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(encodeNumber(6936)));
        System.out.println(Arrays.toString(encodeNumber(2)));
        System.out.println(Arrays.toString(encodeNumber(6)));
        System.out.println(Arrays.toString(encodeNumber(14)));
        System.out.println(Arrays.toString(encodeNumber(24)));
        System.out.println(Arrays.toString(encodeNumber(1200)));
        System.out.println(Arrays.toString(encodeNumber(1)));
        System.out.println(Arrays.toString(encodeNumber(-18)));
    }
    
    static int[] encodeNumber(int n){
        if(n<=1) return null;
        
        int size=0, temp = n;
        
        
        for(int i=2; i<=temp;  ){
            if(isPrime(i) && temp%i ==0){
                size++;
                temp /= i;
                
            }else
                i++;
        }
        
        int[] arrayToReturn = new int[size];
        
         temp = n;
        
        for(int i=0, j=2; i<size && j<=temp;){
            
                if(isPrime(j) && temp%j==0){
                    arrayToReturn[i] = j;
                    i++;
                   temp /= j;
                }else j++;
            
        }
        
        
        return arrayToReturn;
    }
    
    static boolean isPrime(int n){
        for(int i =2 ; i<n ; i++){
            if(n%i ==0){
               return false;
            }
        }
        return true;
    }
}
