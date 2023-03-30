/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class OnionArray {
    
    
    public static void main(String[] args) {
        System.out.println(isOnionArray(new int[]{1, 2, 19, 4, 5}));
        System.out.println(isOnionArray(new int[]{1, 2, 3, 4, 15}));
    }
    
   static int isOnionArray(int[] a){
        if(a.length ==1 || a.length == 0){
            return 1;
        }
        
         for (int j = 0, k = a.length - 1; j < k; j++, k--) {
                    
             if(j>=0 && k>= 0){
                if(j+k+1 == a.length){ 
                 
                    if(a[j] + a[k] > 10 )
                        return 0;
                
                    }
                }
                     
         }
        return 1;
    }
    
    
    
    /*
    static int isOnionArray(int[] a){
        if(a.length ==1 || a.length == 0)
            return 1;
        
            
           
            int upindex =0;
            
            if(a.length % 2 == 0 )
                upindex = a.length/2 -1;
            else
                upindex = a.length/2;
            
            for(int i =0; i<= upindex; i++){
                
                int j= 0;
                int k = a.length-1;
            
                if(j>=0 && k>=0 && (j+k+1 == a.length)&& j!=k){
                    if((a[j] + a[k] )<= 10){
                        return 1;
                    }
                    
                }
                
                j++;
                k--;
            }
                
           
                   
        return 0;
    }

*/
}
