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
public class filterArray {
    
    public static void main(String[] args){
    System.out.println(Arrays.toString(filterArray(new int[]{8, 4, 9, 0, 3, 1, 2}, 88)));
        System.out.println(Arrays.toString(filterArray(new int[]{18}, 3)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 0)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 1)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 2)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 3)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 4)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9, 5}, 3)));
        System.out.println(Arrays.toString(filterArray(new int[]{0, 9, 12, 18, -6}, 11)));
        
    }
    
    static int[] filterArray(int[] a, int n){
        int arraysize =0;
        
        for(int number = n; number>0; number /= 2){
            if(number %2 ==1)
                arraysize++;
        }
        
        int[] array = new int[arraysize];
        int[] binarytemp = new int[1000];
        int[] binary = new int[1000];
        int i =0;
        for(int number = n ; number>0; number /=2){
            
            binarytemp[i] = n%2;
            i++;
        } 
        int index =0;
        for(int j=i-1;j>=0; j--){
            
            binary[index] = binarytemp[j];
            index++;
            } 
        int arrayIndex = 0;
        for( i=0; i<index; i++){
             if(arrayIndex >= a.length)
                    return null;
            if(binary[i] == 1){
                
                array[arrayIndex] = a[i];
               
                arrayIndex++;
            }
            
        }
        return array;
    }
}
