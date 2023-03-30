/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class ConcatenatedSum {
    public static void main(String[] args){
        System.out.println(checkConcatenatedSum(198,2));
        System.out.println(checkConcatenatedSum(198,3));
        System.out.println(checkConcatenatedSum(2997,3));
        System.out.println(checkConcatenatedSum(2997,2));
        System.out.println(checkConcatenatedSum(13332,4));
       System.out.println(checkConcatenatedSum(9,1)); 
    }
    
    static int checkConcatenatedSum(int n, int catlen){
        
        int sum =0;
        int number =n;
        
        while(number>0){
            
            int digit = number%10;
            
            int concat =0;
            
            for(int i =0; i<catlen; i++){
                concat = concat*10 + digit;
                
            }
            sum += concat;
            
            number /= 10;
            
            
        }
        
        if(sum != n)
           return 0;
        
        return 1;
    }
}
