/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class OneBalanced {
    
      public static void main(String[] args) {
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1}));
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1, 0}));
        System.out.println(isOneBalanced(new int[]{1, 1, 2, 3, 1, -18, 26, 1}));
        System.out.println(isOneBalanced(new int[]{}));
        System.out.println(isOneBalanced(new int[]{3, 4, 1, 1}));
        System.out.println(isOneBalanced(new int[]{1, 1, 3, 4}));
        System.out.println(isOneBalanced(new int[]{3, 3, 3, 3, 3, 3}));
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 1, 1, 1}));
    }
      
    static int isOneBalanced(int[] a){
       if(a.length == 0) return 1;
        
      //  if(a[a.length-1] ==0) return 0;
        
        
        
        int count1 =0;
        int countNon1=0;
        
        boolean non1start = false;  
        boolean non1end = false;
        
        for(int i=0; i<a.length; i++){
            if(a[i] == 1){
                
                if(non1start) 
                    non1end = true;
                count1++;
                
            }else{
                if(non1end) return 0;
                non1start = true;
                countNon1++;
            }
                
        }
        if(count1 != countNon1) return 0;
        
        return 1;
    }
}
