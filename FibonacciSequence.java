/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class FibonacciSequence {
     public static void main(String[] args){
        System.out.println(isFibonacci(13));
        System.out.println(isFibonacci(33));
        System.out.println(isFibonacci(34));
        System.out.println(isFibonacci(1));
    }
    
    static int isFibonacci(int n){
        if(n==1) return 1;
        if(n==0) return 0;
        
        int first = 1;
        int second =1;
        int term  =0;
        while(term<n){
            term = first + second;
            first = second;
            second = term;
            
            if(term == n) return 1;
        }
        
       return 0;
    }
}
