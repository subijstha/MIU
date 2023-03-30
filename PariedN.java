/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class PariedN {
       public static void main(String[] args) {
        System.out.println(isPairedN(new int[] {1, 4, 1, 4, 5, 6}, 5));
        System.out.println(isPairedN(new int[] {1, 4, 1, 4, 5, 6}, 6));
        System.out.println(isPairedN(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8}, 6));
        System.out.println(isPairedN(new int[] {1, 4, 1}, 5));
        System.out.println(isPairedN(new int[] {8, 8, 8, 8, 7, 7, 7}, 15));
        System.out.println(isPairedN(new int[] {8, -8, 8, 8, 7, 7, -7}, -15));
        System.out.println(isPairedN(new int[] {3}, 3));
        System.out.println(isPairedN(new int[] {}, 0));
    }
    static int isPairedN(int[] a, int n){
        
        if(a.length <= 1 || a.length<n || n<0)
            return 0;
        for(int i=0; i<a.length ; i++){
            for(int j=0; j<a.length; j++){
                if(i != j){
                   if( (i+j == n) && a[i] +a[j] ==n )
                       return 1;
                }
                 
            } 
        }
        
     return 0;   
    }
    
}
