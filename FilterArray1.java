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
public class FilterArray1 {
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
        int size = 0;
        
        for(int number = n; number>0 ; number/=2){
         if( number %2 == 1)
             size++;
        }
        
        int[] array = new int[size];
        int i = 0;
        int index = 0;
        
        for(int number = n ; number> 0; number /= 2){
            if(number %2 ==1){
                if(index>= a.length)
                    return null;
                array[i] = a[index];
                i++;
            }
            index++;
        }
        return array;
    }
}
