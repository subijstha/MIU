/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIUQuestions;

/**
 *
 * @author subij
 */
public class Anagrams {
    
      public static void main(String[] args) {
        System.out.println(areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'i', 't', 's'}));
        System.out.println(areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'i', 'd', 's'}));
        System.out.println(areAnagrams(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 't'}));
        System.out.println(areAnagrams(new char[]{'b', 'o', 'g'}, new char[]{'b', 'o', 'o'}));
        System.out.println(areAnagrams(new char[]{}, new char[]{}));
        System.out.println(areAnagrams(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 'g'}));
    }
    static int areAnagrams(char[] a1, char[] a2){
        
        int isAnagram =0;
        
        if(a1.length != a2.length)
            return 0;
        
        char[] a1C = new char[a1.length];
        char[] a2C = new char[a2.length];
        
        for(int i=0; i<a1.length ; i++){
            a1C[i] = a1[i];
            a2C[i] = a2[i];
        }
        
        for(int i=0; i< a1C.length; i++){
            for(int j=0; j<a2C.length;j++){
                if(a1C[i] == a2C[j]){
                    a1C[i] =' ';
                    a2C[j] = ' ';
                    
                }
            }
        }
        
        for(int i=0; i<a1C.length; i++){
            if(a1C[i] != ' ' || a2C[i] != ' ')
                return 0;
        }
            return 1;
        }
}
