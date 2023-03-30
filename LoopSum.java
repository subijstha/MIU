/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class LoopSum {
    public static void main(String[] args) {
        System.out.println(loopSum(new int[]{1, 2, 3}, 2));
        System.out.println(loopSum(new int[]{-1, 2, -1}, 7));
        System.out.println(loopSum(new int[]{1, 4, 5, 6}, 4));
        System.out.println(loopSum(new int[]{3}, 10));
    }
    
    static int loopSum(int[] a , int n){
        int index =0;
        int sum =0;
        if(n>0){
        for(int i=1; i<=n; i++){
            if(index >= a.length)
                index=0;
            
            sum = sum+ a[index];
            index++;
        }
        }
        return sum;
    }
    /*static int loopSum(int[]a , int n){
       int sum=0;
       int index =0;
       for(int i=0; i<a.length && index<n ; i++){
           sum += a[i];
           
           if(i == a.length-1 && index != n-1)
               i=-1;
       }
       return sum;
    }*/
}
