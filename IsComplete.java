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
public class IsComplete {
    public static void main(String[] args){
        
         System.out.println(isComplete(new int[]{2,3,2,4,11,6,10,9,8}));
        System.out.println(isComplete(new int[]{2,3,3,6}));
        System.out.println(isComplete(new int[]{2, -3,4,3}));
        System.out.println(isComplete(new int[]{2, 6, 3, 4}));
    }
   /* static int isComplete(int[] a){
        int count =0;
        
        for(int i=0; i<a.length; i++){
            
            if(a[i]%2 == 0){
            count++;
            }
        }
        
        int[] even = new int[count];
        int maxEven =0;
        int j =0;
        for(int i=0; i< a.length; i++){
            if(a[i]<=0) return 0;
            
            
            if(a[i]%2 ==0){   
                
                even[j] = a[i];
                
                if(a[i] > maxEven){
                    maxEven = a[i];
                }
                
                j++;
            }
            
            
        }
        
    }
            
            j =2;
            while(j<maxEven){
                
                boolean flag = false;
                for(int i=0; i<even.length; i++){
                    if(even[i] == j){
                        flag = true;
                        break;
                    }
                    
                }
                if(!flag) return 0;
                j += 2;
                
            }
        return 1;
        
    }*/
    static int isComplete(int[] a){
        
        

        int maxEven =0;
        
        for(int i=0; i< a.length; i++){
            if(a[i]<=0) return 0;
            if(a[i]%2 ==0){   
 
                if(a[i] > maxEven){
                    maxEven = a[i];
                } 
            }
        }
        
        for(int j=2; j<maxEven; j+=2){
            boolean flag = false;
            for(int anA : a){
                
                    if(anA == j)
                        flag = true;      
                
            }
            if(!flag ) return 0;
        }    
        return 1;
        
    }
}
