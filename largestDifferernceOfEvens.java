/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class largestDifferernceOfEvens {
    
    public static void main(String[] args){
        System.out.println(largestDifferenceOfEvens(new int[]{1,2,1,2,1,4,6,1}));
        System.out.println(largestDifferenceOfEvens(new int[]{1,3,5,9}));
        System.out.println(largestDifferenceOfEvens(new int[]{1,18,5,7,33}));
        System.out.println(largestDifferenceOfEvens(new int[]{1,2,2,2,2}));
        
        
    }
    static int largestDifferenceOfEvens(int[] a){
        
        int diff =0;
        int maxEven =Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;
        int count =0;
        for(int i=0; i<a.length ;i++){
            
            if(a[i]%2 ==0){
                
                count++; 
                
                if(a[i]>maxEven){
                    maxEven = a[i];           
                }
                else if(a[i]<minEven){
                    minEven = a[i];
                }
                
            }
            
        }
        
        diff = maxEven - minEven;
        if(count < 2) return -1;
       
            return diff;
        
        
    }
}
