/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class Trivalent {
    
    public static void main(String[] args) {
        System.out.println(isTrivalent(new int[]{22, 19, 10, 10, 19, 22, 22, 10}));
        System.out.println(isTrivalent(new int[]{1, 2, 2, 2, 2, 2, 2}));
        System.out.println(isTrivalent(new int[]{2, 2, 3, 3, 3, 3, 2, 41, 65}));
        System.out.println(isTrivalent(new int[]{-1, 0, 1, 0, 0, 0}));
        System.out.println(isTrivalent(new int[]{}));
        System.out.println(isTrivalent(new int[]{2147483647, -1, -1, -2147483648}));
    }
    
    static int isTrivalent(int[] a){
        
        int[] temp = new int[a.length];
        for(int i=0; i<temp.length; i++){
            temp[i] = Integer.MIN_VALUE;
        }
        
        int tricount =0;
        
        for(int i=0; i<a.length; i++){
            boolean flag = false;
            
            for(int k=0; k<tricount ;k++){
                if(temp[k] == a[i]){
                    flag = true;
                    break;
                }else
                    flag = false;
            }
            if(!flag){
                temp[tricount] = a[i];
                tricount++;
            }
        }
        
        if(tricount !=3 ) return 0;
        else
        return 1;
    }
    
}
