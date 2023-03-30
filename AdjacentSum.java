/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class AdjacentSum {
    
    public static void main(String[] args) {
        System.out.println(largestAdjacentSum(new int[]{1, 2, 3, 4}));
        System.out.println(largestAdjacentSum(new int[]{18, -12, 9, -10}));
        System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,1,1,1,1}));
        System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,2,1,1,1}));
    }
    
    static int largestAdjacentSum(int[] a){
        int largeSum = 0;
        
        
        
        
        for(int i=0; i<a.length-1 ; i++){
           if(a[i]+a[i+1]>largeSum){
               largeSum = a[i]+a[i+1];
           }
        }
        
        
        return largeSum;
    }
}
