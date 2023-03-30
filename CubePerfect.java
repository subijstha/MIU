/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class CubePerfect {
     public static void main(String[] args) {
        System.out.println(isCubePerfect(new int[]{1, 1, 1, 1}));
        System.out.println(isCubePerfect(new int[]{64}));
        System.out.println(isCubePerfect(new int[]{63}));
        System.out.println(isCubePerfect(new int[]{-1, 0, 1}));
        System.out.println(isCubePerfect(new int[]{}));
        System.out.println(isCubePerfect(new int[]{3, 7, 21, 36}));
    }
     
     /*static int isCubePerfect(int[] a) {
        if (a.length == 0)
            return 1;

        for (int anA : a) {

            anA = anA > 0 ? anA : -anA;
            int number = 1;
            int cube = 0;
            while (cube < anA) {
                cube = number * number * number;
                number++;
            }
            if (cube != anA)
                return 0;
        }
        return 1;
    */

    static int isCubePerfect(int[] a){
        if(a.length ==0) return 1;
        
        for(int i=0; i<a.length; i++){
            if(!cube(a[i]))
                return 0;
        }
        return 1;
    }
    
    

    
    static boolean cube(int n){
        n =n>0 ? n:-n;
        
        for(int i=0; i<=n; i++){
            if(i*i*i == n){
                return true;
            }
        }
        return false;
    }
}
