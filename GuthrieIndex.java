/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class GuthrieIndex {
    public static void main(String[] args){
        int result = guthrieIndex(1);
        System.out.println(result);
        result = guthrieIndex(2);
        System.out.println(result);
        result = guthrieIndex(3);
        System.out.println(result);
        result = guthrieIndex(4);
        System.out.println(result);
        result = guthrieIndex(42);
        System.out.println(result);
        
    }
    
    static int guthrieIndex(int n){
        /*int index = 0;
        int value = Integer.SIZE;
        if(n>1){
            while(n<value && n!=1){
                if(n%2 ==0){
                    n = n/2;
                }else{
                    n =( n*3 )+ 1 ;
                    
                }
                index++;
            }
        }
      
       
        
        
        return index;*/
        
        int count =0;
        while(n>1 && n<Integer.SIZE){
            if(n%2 ==0){
                n=n/2;
            }else
                n =(3*n) +1;
            
            count++;
        }
        return count;
    }
}
