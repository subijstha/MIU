/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

import java.lang.reflect.Array;

/**
 *
 * @author subij
 */
public class BalancedArray {
    
    public static void main(String[] args) {
        System.out.println(isBalanced(new int[]{-2, 3, 2, -3}));
        System.out.println(isBalanced(new int[]{-2, 2, 2, 2}));
        System.out.println(isBalanced(new int[]{-5, 2, -2}));

        System.out.println();
       
    }
    
    static int isBalanced(int[] a){
        
      /*  for(int i=0; i<a.length; i++){
            int c = a[i];
            for(int j= 0; j<a.length; j++){
                int index;
                index = Array.getInt(a, (-1)*c);
                if(index<0) return 0;
            }
        } */
     
      
        for(int i =0 ;i<a.length-1 ; i++){
            boolean flag = false;
            for(int j=0;j<a.length ;j++ ){
                if (i != j){
                    if(a[i] == -a[j]) {
                        flag = true;
                        break;
                    }
                }
            }
            if(!flag ) return 0;
            
        }
        
        
        return 1;
    }
}
