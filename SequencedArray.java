/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class SequencedArray {
    
    public static void main(String[] args){
        
         System.out.println(isSequencedArray(new int[]{2, 2, 3, 4, 4, 4, 5}, 2, 5));
        System.out.println(isSequencedArray(new int[]{2, 2, 3, 5, 5, 5}, 2, 5));
        System.out.println(isSequencedArray(new int[]{0, 2, 2, 3, 3}, 2, 3));
        System.out.println(isSequencedArray(new int[]{1, 1, 3, 2, 2, 4}, 1, 4));
        System.out.println(isSequencedArray(new int[]{1, 2, 3, 4, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{1, 3, 4, 2, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{-5, -5, -4, -4, -4, -3, -3, -2, -2, -2}, -5, -2));
        System.out.println(isSequencedArray(new int[]{0, 1, 2, 3, 4, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{1, 2, 3, 4}, 1, 5));
        System.out.println(isSequencedArray(new int[]{1, 2, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{5, 4, 3, 2, 1}, 1, 5));
    }
    static int isSequencedArray(int[] a, int m , int n){
        if(a[a.length-1] != n || a[0]!=m)
            return 0;
        for(int i =0; i<a.length-1 ; i++){
            if((a[i] > a[i+1]) )
                return 0;
            
            if(a[i+1]-a[i] !=0 && (a[i+1]-a[i] !=1 ))
                return 0;
                
        }
        return 1;
    }
}
