/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class DecodeArray010101 {
    
     public static void main(String[] args) {
        System.out.println(decodeArray(new int[]{2, -3, -2, 6, 9, 18}));
        System.out.println(decodeArray(new int[]{0, -3, 0, -4, 0}));
        System.out.println(decodeArray(new int[]{-1, 5, 8, 17, 15}));
        System.out.println(decodeArray(new int[]{1, 5, 8, 17, 15}));
        System.out.println(decodeArray(new int[]{111, 115, 118, 127, 125}));
        System.out.println(decodeArray(new int[]{1, 1}));
        
      }
    
   
    static int decodeArray(int[]  a){
      /*    String res = "";
        for (int i = 1; i < a.length; i++) {
            res += Math.abs(a[i - 1] - a[i]);
        }
        if (a[0] < 0) {
            res = "-" + res;
        }
        return Integer.valueOf(res);
    }*/
     
     int num =0, sum=0;
     
     for(int i=0; i<a.length-1; i++){
         num = Math.abs(a[i]-a[i+1]);
         sum += num;
         
         if(i!=a.length-2)
             sum=  sum*10;
         
     }
     if(a[0]<0)
         sum=sum*(-1);
    
     return sum;
            }
}
