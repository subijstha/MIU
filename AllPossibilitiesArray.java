/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class AllPossibilitiesArray {
    
     public static void main(String[] args) {
        System.out.println(isAllPossibilities(new int[]{1, 2, 0, 3}));
        System.out.println(isAllPossibilities(new int[]{3, 2, 1, 0}));
        System.out.println(isAllPossibilities(new int[]{1, 2, 4, 3}));
        System.out.println(isAllPossibilities(new int[]{0, 2, 3}));
        System.out.println(isAllPossibilities(new int[]{0}));
        System.out.println(isAllPossibilities(new int[]{}));
    }
    
    static int isAllPossibilities(int[] a){
        
    /*
        int[] temp = new int[a.length];
        
        for(int i=0; i<temp.length; i++){
            temp[i] = i;
        }
        
        boolean flag = false;
        
        for(int i=0; i<a.length; i++){
            flag = false;
            for(int j=0; j<temp.length; j++){
                if(a[i] == temp[j]){
                    flag = true;
                    break;
                }
            }
            
            if(!flag)
                return 0;
            
        }
        return 1;
    }*/
    if(a.length < 1 ) return 0;
    boolean flag= false;
    for(int i=0; i<a.length ; i++){
        
         flag = false;
        
        for(int j =0; j<a.length; j++){
            if(a[i] == j){
                flag = true;
                break;}
        }
        
        if(!flag) return 0;
    }
 return 1;       
}
}
    

