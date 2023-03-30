/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;
import java.util.Arrays;
/**
 *
 * @author subij
 */
public class EncodeArray {
      public static void main(String[] args) {
        System.out.println(Arrays.toString(encodeArray(0)));
        System.out.println(Arrays.toString(encodeArray(1)));
        System.out.println(Arrays.toString(encodeArray(-1)));
        System.out.println(Arrays.toString(encodeArray(100001)));
        System.out.println(Arrays.toString(encodeArray(99291)));
    }
      
   
      
      
    static int[] encodeArray(int n) {
        if (n == 0)
            return new int[]{1};
        int numSize =0;
        int size = 0;
        int nCopy = n < 0 ? -n : n;

        while (nCopy > 0) {
            int digit = nCopy % 10;
            nCopy /= 10;
            size += digit + 1;
            numSize++;
        }
        if(n<0) size = size+1;
        int[] result = new int[size];
        int [] digitArray = new int[numSize]; 
        
        nCopy = n < 0 ? -n : n;
        for (int i = 0; i < size; i++) {
            if (i == 0 && n < 0) {
                result[i] = -1;
                i++;
            }
            int z = 0;
            while (nCopy > 0) {
                int digit = nCopy % 10;
                nCopy /= 10;
                digitArray[z] = digit;
                z++;
                
            }
            int index = digitArray.length-1;
            while(index >=0){
                for (int k = 0 ; k < digitArray[index] ; k++) {
                    result[i] = 0;
                    i++;
                }
                result[i] = 1;
                i++;
                index--;
            }
        }
        return result;
    }
}
