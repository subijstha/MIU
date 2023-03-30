/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class MinMaxDisjoint {
    public static void main(String[] args){
        System.out.println(isMinMaxDisjoint(new int[] {18,-1,3,4,0}));
    }
    
    static int isMinMaxDisjoint(int[] a){
        if(a.length <= 2 ) return 0;
        
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        
        for(int anA : a){
            if(anA<min){
                min = anA;
            }
            
            if(anA > max){
                max = anA;
            }
        }
        
        if(min == max ) return 0;
        
         int minCount =0 , maxCount = 0 ;
        
        for(int i=0;i<=a.length-1;i++){
            if((a[i] == min && a[i+1] == max) || (a[i] == max && a[i+1] == min)){
                return 0;
            }else {
                if(a[i] == min ) minCount++;
                if(a[i] == max) maxCount++;
                       
            }
            if(minCount > 1 || maxCount >  1)
                return 0;
            
        }
        
        return 1;
    }
}
