/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class OddValent {
    
    public static void main(String[] args){
        System.out.println(isOddValent(new int[]{ 1,2,3,4,5}));
        System.out.println(isOddValent(new int[]{ 9,3,4,9,1}));
        System.out.println(isOddValent(new int[]{ 3,3,3,3,3}));
        System.out.println(isOddValent(new int[]{ 8,8,8,4,4,7,2}));
        System.out.println(isOddValent(new int[]{ 2,2,2,4,4}));
    }
    static int isOddValent(int[] a){
        int oddcount =0;
        int equalcount =0;
        for(int i=0; i<a.length; i++){
            if(a[i] % 2 != 0)
                oddcount++;
            
            for(int j=i+1; j<a.length; j++){
                if(a[i] == a[j])
                    equalcount++;
            }
            
           
        }
        
        if(oddcount ==0 || equalcount == 0) return 0;
        
        return 1;
    }
}
