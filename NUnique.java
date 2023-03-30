/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class NUnique {
    
       public static void main(String[] args){
           int result = isNUnique(new int[]{2,7,3,4},5);
           System.out.println(result);
           
           result = isNUnique(new int[]{7, 3, 3, 2, 4},6);
           System.out.println(result);
           
           result = isNUnique(new int[]{7, 3, 3, 2, 4},10);
           System.out.println(result);
           
           result = isNUnique(new int[]{7, 3, 3, 2, 4},11);
           System.out.println(result);
           
            result = isNUnique(new int[]{7, 3, 3, 2, 4},8);
           System.out.println(result);
           
            result = isNUnique(new int[]{7, 3, 3, 2, 4},4);
           System.out.println(result);
           
            result = isNUnique(new int[]{},11);
           System.out.println(result);
       }
    
       static int isNUnique(int[ ] a, int n){
           int isNUnique = 0;
           int count =0;
           for(int i =0; i<a.length-1;i++){
               
               for(int j=i+1; j<a.length;j++){
                   if(a[i]+a[j]==n){
                       count++;        
                   }    
                   
               }
               
           }
            if(count ==1){
                       isNUnique =1;
            }
           return isNUnique;
       }
}
