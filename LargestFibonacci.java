/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class LargestFibonacci {
    
    public static void main(String[] args){
        System.out.println(closestFibonacci(13));
        System.out.println(closestFibonacci(33));
        System.out.println(closestFibonacci(34));
        System.out.println(closestFibonacci(2));
    }
    static int closestFibonacci(int n){
        
        if(n<1) return 0;
        
        int first =1;
        int second = 1;
        int term =0;
        int value =0;
        while(true){
            term = first + second;
            if(term > n){
                 value = second;
                 break;
            }
            first = second;
            second =term;
        }
        
        return value;
        
    }
}
