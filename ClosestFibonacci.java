/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class ClosestFibonacci {
    public static void main(String[] args){
        System.out.println(closestFibonacci(13));
        System.out.println(closestFibonacci(33));
        System.out.println(closestFibonacci(34));
        System.out.println(closestFibonacci(1));
    }
    static int closestFibonacci(int n){
        if(n<1)  return 0;
        if(n==1 || n==2) return 1;
        int first =1;
        int second =1;
        int term =0;
        while(n>2){
            
            term = first + second;
            if(term > n) return second;
            
            first = second;
            second = term;
            
        }
       
        
        return 0;
    }
}
