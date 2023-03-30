/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author subij
 */
public class EncodeNumber {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(encodeNumber(6936)));
        System.out.println(Arrays.toString(encodeNumber(2)));
        System.out.println(Arrays.toString(encodeNumber(6)));
        System.out.println(Arrays.toString(encodeNumber(14)));
        System.out.println(Arrays.toString(encodeNumber(24)));
        System.out.println(Arrays.toString(encodeNumber(1200)));
        System.out.println(Arrays.toString(encodeNumber(1)));
        System.out.println(Arrays.toString(encodeNumber(-18)));
    }

    static int[] encodeNumber(int n){
        if(n<=1) return null;
        
        List<Integer> primeFactors = new ArrayList<>();
        for(int i =2 ; i<n ; i++){
            while(n%i==0){
                primeFactors.add(i);
                n=n/i;
            }
        }
        
        if(n>1) primeFactors.add(n);
        int[] arrayToReturn = new int[primeFactors.size()];
        for(int i=0; i<primeFactors.size(); i++){
            arrayToReturn[i] = primeFactors.get(i);
        }
        return arrayToReturn;
    }
}
