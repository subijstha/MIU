/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class ConvertToBase10 {
    public static void main(String[] args){
        int result = convertToBase10(new int[]{3,2,1},4);
        System.out.println(result);
        
         result = convertToBase10(new int[]{1, 0, 1, 1}, 2);
        System.out.println(result);
        
        result = convertToBase10(new int[]{1, 1, 2}, 3);
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
    
    static int convertToBase10(int[] a, int base){
        int converted=0;
        
        if(ConvertToBase10.isLegalNumber(a, base)==1){
            for(int i =a.length-1 ; i>=0;i--){
                int baseProd =1;
                int count=0;
                for(int j=1 ; j<=;j++){
                    if(count == 0 ){
                        baseProd =1;
                    }else
                    baseProd = base * baseProd;
                }
                converted += a[i]*baseProd;
            }
            return converted;
        }
        return -1;
        
        
    }
    
    /*
    
    static int convertToBase10(int[] a, int base){
        
        if(ConvertToBase10.isLegalNumber(a, base) ==1){
        int sum=0;
        int prod =1;
        int index =1;
        
        for(int i =a.length-1; i>=0; i--){
            prod = index;
            index = index * base;
            
            sum += prod *a[i];
        }
        
        return sum;
        }
        
        return -1;
    }*/
}
