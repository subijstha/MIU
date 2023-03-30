/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;
import java.util.Arrays;

/**
 *
 * @author subij
 */
public class PairWiseSum {
    
    public static void main(String[] args){
     System.out.println(Arrays.toString(pairwiseSum(new int[]{2,1,18,-5})));   
     System.out.println(Arrays.toString(pairwiseSum(new int[]{2,1,18,-5})));
     System.out.println(Arrays.toString(pairwiseSum(new int[]{2,1,18,-5})));
     System.out.println(Arrays.toString(pairwiseSum(new int[]{2,1,18,-5,-5,-15,0,0,1,-1})));
     System.out.println(Arrays.toString(pairwiseSum(new int[]{2,1,18})));
     System.out.println(Arrays.toString(pairwiseSum(new int[]{})));
     
     
    }
    
    /*
    static int[] pairwiseSum(int[] a){
        if(a.length ==0 || a.length%2 ==1)
            return null;
        int[] res = new int[a.length/2];
        int index =0;
        for(int i=0; i<a.length-1; i = i+2){
            res[index] = a[i]+ a[i+1];
            index++;
        }
        return res;
    }*/
    
    static int[] pairwiseSum(int[] a){
        int[] array = new int[] {};
         if(a.length <0 || a.length%2 ==1)
             return array;
         
         int l = a.length/2;
         array = new int[l];
         int i=0;
         
         for(int j=0; j<l; j++){
             array[j] = a[i] + a[i+1];
             i += 2;
         }
         return array;
    }
}
