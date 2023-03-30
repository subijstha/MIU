/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class Holllow {
    public static void main(String[] args){
        System.out.println(isHollow(new int[]{1,2,0,0,0,3,4}));
        System.out.println(isHollow(new int[]{3,1,2,0,0,0,0,1,2,3}));
        System.out.println(isHollow(new int[]{1,2,0,0,3,4}));
        System.out.println(isHollow(new int[]{1,2,0,0,0,3,4,5}));
        System.out.println(isHollow(new int[]{3,8,3,0,0,0,3,3}));
        System.out.println(isHollow(new int[]{1,2,0,0,0,0,3,4,0}));
        System.out.println(isHollow(new int[]{0,12,3,0,0,0,34,2}));
        System.out.println(isHollow(new int[]{0,0,0}));
        
        
    }
    /*
    static int isHollow(int[] a){
        int countleft=0;
        int countright=0;
        int mid0=0;
        for(int i=0; i<a.length; i++){
            if(a[i] != 0 ){
                if(mid0 ==0)
                    countleft++;
                else
                    countright++;
            
            }else if(a[i] ==0 && countright ==0){
                mid0++;
            }else{
                return 0;
            }
        }
        
        if(countleft != countright || mid0 < 3 )
            return 0;
                
         return 1;
    }*/


    static int isHollow(int[] a){
        int i=0;
        int countleft=0;
        int countright =0;
        int mid0=0;
        for( i=0; i<a.length;){
            
            if(a[i] ==0 && mid0 ==0)
                break;
            if(a[i] != 0)
                countleft++;
            
            i++;
            
        }
        
        for(i =i; i<a.length;){
            if(a[i] ==0 )
                mid0++;
            else if(a[i] != 0)
                break;
            i++;
        }
        if(mid0 <3 ) return 0;
        
        
        for(i=i ; i<a.length;){
            if(a[i] != 0 && mid0 != 0)
                countright++;
            
            else if(a[i] ==0 && mid0 !=0) return 0;
             i++;
            
        }
        
        if(countleft != countright)
            return 0;
        
        return 1;
    }
    
}