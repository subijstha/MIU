/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class sumSafe {
    public static void main(String[] args){
        System.out.println(sumSafe(new int[]{5,-5,0} ));
         System.out.println(sumSafe(new int[]{5, -2, 1}  ));
         
    }
    
    static int sumSafe(int[] a){
        int safe =1;
        
        for(int i =0; i<a.length-1 ; i++){
            int sum = 0;
            for(int j=0; j<a.length; j++){
                if(i!=j){
                    sum = a[i]+a[j];
                    
                     for(int k=0; k<a.length; k++){
                        if(  sum == a[k]){
                        safe = 0;
                        break;
                        }
                    }
                }
                
            }
            
        }
        return safe;
    }
}
