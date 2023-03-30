/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class DecodeArray {
      public static void main(String[] args) {
        System.out.println(decodeArray(new int[]{2, -3, -2, 6, 9, 18}));
        System.out.println(decodeArray(new int[]{0, -3, 0, -4, 0}));
        System.out.println(decodeArray(new int[]{-1, 5, 8, 17, 15}));
        System.out.println(decodeArray(new int[]{1, 5, 8, 17, 15}));
        System.out.println(decodeArray(new int[]{111, 115, 118, 127, 125}));
        System.out.println(decodeArray(new int[]{1, 1}));
        
      }
      
      static int decodeArray(int[] a){
          
       /*   int sum = 0;

        for (int i = a.length - 1; i > 0; i--) {
            int digit = Math.abs(a[i]-a[i-1]);   //(a[i] - a[i - 1]) > 0 ? (a[i] - a[i - 1]) : -(a[i] - a[i - 1]);

            for (int j = i; j < a.length - 1; j++) {
                digit *= 10;
            }
            sum += digit;
        }
        if (a[0] < 0) return -sum;
        return sum;*/
       
       int sum=0;
       for(int i=0; i<a.length-1 ; i++){
           int diff = a[i] - a[i+1];
           diff = diff >0 ? diff : -diff;
           sum = sum * 10 + diff;
       }
       
       return sum;
      }
      
      
      
}
