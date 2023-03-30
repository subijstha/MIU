/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class CompleteEvenOdd {
     public static void main(String[] args) {
        

        System.out.println();
        System.out.println(isComplete(new int[]{-5, 6, 2, 3, 2, 4, 5, 11, 8, 7}));
        System.out.println(isComplete(new int[]{5, 7, 9, 13}));
        System.out.println(isComplete(new int[]{2, 2}));
        System.out.println(isComplete(new int[]{2, 6, 3, 4}));
        System.out.println(isComplete(new int[]{2, 6, 3, 4 , 5}));
    }
    
    
    static int isComplete(int[] a){
        int minEven = Integer.MAX_VALUE;
        int maxEven = Integer.MIN_VALUE;
        boolean evenFlag = false;
        
        for(int i=0; i<a.length; i++){
            if(a[i] % 2 == 0){
                evenFlag = true;
                
                if(a[i] < minEven)
                    minEven = a[i];
                if(a[i] > maxEven)
                    maxEven = a[i];
                
            }
        }
        
        if(!evenFlag)  return 0;
        
        if(minEven == maxEven) return 0;
        
        int index = minEven;
        
        
        while(index < maxEven){
            boolean flag = false;
            
            for(int i =0; i<a.length; i++){
                if(index == a[i]){
                    flag = true;
                    break;
                }
                
            }
            if(!flag)  return 0;
            
            index++;
        }
        return 1;
    }
}
