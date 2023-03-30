/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class Twinoid {
    public static void main(String[] args){
        System.out.println(isTwinoid(new int[] {2,3,4,9 }));
        System.out.println(isTwinoid(new int[]{3,3,2,4,6}));
 
    }
    
    static int isTwinoid(int[] a){
        int count =0;
        for(int i=0; i<a.length; i++){
            if(isPrime(a[i])) count++;
        }
        if(count ==2){
            for(int j=0; j<a.length; j++){
                if(isPrime(a[j]) && isPrime(a[j+1]))  return 1;
            }
        }
        return 0;
    }
    
    static boolean isPrime(int n){
        if(n<2)  return false;
        for(int j = 2; j<n ; j++){
            if(n%j ==0)
                return false;
        }
        
        return true;
    }
}
