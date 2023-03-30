/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class IsLegalNumber {
    public static void main(String[] args){
        int result = isLegalNumber(new int[]{3,2,1},4);
        System.out.println(result);
        
         result = isLegalNumber(new int[]{3,7,1},7);
        System.out.println(result);
        
        result = isLegalNumber(new int[]{-3,2,1},7);
        System.out.println(result);
    }
    
    static int isLegalNumber(int[] a, int base){
        int isLegal =1;
        
        for(int i=0; i<a.length; i++){
            if(a[i]>=base || a[i]<0){
                isLegal =0;
                break;
            }
        }
        
        return isLegal;
    }
}
