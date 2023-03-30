/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class Henry {
    public static void main(String[] args){
        int result = henry(1,3);
        System.out.println(result);
        
        result = henry(1,4);
        System.out.println(result);
    }
    
    static int henry(int i, int j){
        int perfectSum = 0;
        int count = 0;
        int max = Integer.MAX_VALUE;
        
        for(int number=1; number<max ; number++){
            int sum =0;
            
            for(int a=1; a< number;a++){
                if(number%a == 0){
                    sum += a;
                    
                }    
            }   
            if(sum == number){
                count++;
                
                if(count == i ){
                   perfectSum += sum;
                }else if(count == j){
                   perfectSum += sum;
                   break;
                }
            }
            
        }
        
        return perfectSum;
    }
}
