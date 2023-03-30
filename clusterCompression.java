/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author subij
 */
public class clusterCompression {
    
     public static void main(String[] args) {
        System.out.println(Arrays.toString(clusterCompression(new int[]{3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{0, 0, 0, 2, 0, 2, 0, 2, 0, 0})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{18})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{-5, -5, -5, -5, -5})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{8, 8, 6, 6, -2, -2, -2})));
    }
    
    static int[] clusterCompression(int[] a){
        
        
        List<Integer> arrayToReturn =  new ArrayList<>();
        int size =1;
        if(a.length ==0)
           return new int[] {};
       // if(a.length == 1)
          //  return new int[] {a[0]};
        
        int index =1;
        for(int i=0; i<a.length-1; i++){
                if(a[i] != a[i+1]){
                    size++;
                    arrayToReturn.add(a[i]);
                    index++;
                }  
         }
        
         int[] array = new int[size]; 
        
        if(index == 1){
            array[0] = a[0];
            return array;
                    
        }
           
        for(int i=0;i<size-1; i++){
            array[i] = arrayToReturn.get(i);
        }
        
        return array;
    }
    
}
