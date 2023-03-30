/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class railroad {
    public static void main(String[] args){
        
        
        System.out.println(isRailroadTie(new int[]{1,2,0,3,-18,0,2,2}));
         System.out.println(isRailroadTie(new int[]{1, 2, 3, 0, 2, 2}));
        System.out.println(isRailroadTie(new int[]{0, 1, 2, 0, 3, 4}));
        System.out.println(isRailroadTie(new int[]{1, 2, 0, 0, 3, 4}));
        System.out.println(isRailroadTie(new int[]{1}));
        System.out.println(isRailroadTie(new int[]{}));
        System.out.println(isRailroadTie(new int[]{0}));
        System.out.println(isRailroadTie(new int[]{1, 2}));
        System.out.println(isRailroadTie(new int[]{1, 2, 0, 1, 2, 0, 1, 2}));
        System.out.println(isRailroadTie(new int[]{3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3}));
        System.out.println(isRailroadTie(new int[]{0, 0, 0, 0}));
        System.out.println(isRailroadTie(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(isRailroadTie(new int[]{1, 3, 0, 3, 5, 0}));
    }
    
    static int isRailroadTie(int[] a){
        //int isRailroad = 1;
        
        if(a.length <= 1 || a[a.length-1] == 0 || a[0]==0)
            return 0;
          
        
        for(int i = 1; i<a.length-1; i++){
            
            
            if(a[i] != 0){
                //int x = isZero(a[i-1]);
                //int y = isZero(a[i+1]);
                
                if((a[i+1] == 0  && a[i-1] == 0) || (a[i+1] != 0 && a[i-1] != 0)){
                    return 0;
                    
                }
                
                
               
            }else if(a[i] ==0){
                
                
                if( a[i+1] == 0 || a[i-1] == 0 ){
                    return 0;
                    
                }
            }      
        }
        return 1;
    }
    
    
}
