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
public class Fill {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fill(new int[]{1, 2, 3, 5, 9, 12, -2, -1}, 3, 10)));
        System.out.println(Arrays.toString(fill(new int[]{4, 2, -3, 12}, 1, 5)));
        System.out.println(Arrays.toString(fill(new int[]{2, 6, 9, 0, -3}, 0, 4)));
    }

    static int[] fill(int[] a,int k, int n){
        if(n<1 || k<1) return null;
        
        int[] arr2 = new int[n];
        int index1 =0, index2=0;
        
        for(int i=1 ; i<=n; i++){
            if(index1 >=k){
                index1 =0;
            }
            
            arr2[index2] = a[index1];
            index1++;
            index2++;
        }
       return arr2;
    }
}
