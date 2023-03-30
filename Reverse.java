/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class Reverse {
   public static void main(String[] args){
       System.out.println(isReverse (-1234));
   } 
   
   static int isReverse(int n){
       int sign =1 ;
       
       if ( n == 0) return 0;
       
       if(n<0){
           n = -n;
           sign = -1;
       }
      
       
       int temp= 0;
       
       int reverse =0;
       while(n!=0){
           temp = n % 10;
           n /= 10;
           
           reverse = reverse * 10 + temp;
           
           
       }
       return sign * reverse;
       
   }
   
}


