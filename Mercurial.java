/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class Mercurial {
     public static void main(String[] args) {
        System.out.println(isMercurial(new int[]{1, 2, 10, 3, 15, 1, 2, 2}));
        System.out.println(isMercurial(new int[]{5, 2, 10, 3, 15, 1, 2, 2}));
        System.out.println(isMercurial(new int[]{1, 2, 10, 3, 15, 16, 2, 2}));
        System.out.println(isMercurial(new int[]{3, 2, 18, 1, 0, 3, -11, 1, 3}));
        System.out.println(isMercurial(new int[]{2, 3, 1, 1, 18}));
        System.out.println(isMercurial(new int[]{8, 2, 1, 1, 18, 3, 5}));
        System.out.println(isMercurial(new int[]{3, 3, 3, 3, 3, 3}));
        System.out.println(isMercurial(new int[]{1}));
        System.out.println(isMercurial(new int[]{}));
    }
     
    static int isMercurial(int[] a){
     
        boolean prevOccur1 = false;
        
        int index1 = -1;
        int index3 = -1;
        
        for(int i=0; i<a.length; i++){
            if(a[i] == 1){
                index1 = i;
            }
            
            if(a[i] == 3 ){
                index3 = i;
            }
            
            if(index1 != -1 && index3 > index1)
                prevOccur1 = true;
            
            if(prevOccur1 && a[i] == 1) return 0;
          
            
        
        }
        
        return 1;
    }
}